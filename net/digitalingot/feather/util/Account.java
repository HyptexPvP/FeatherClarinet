package net.digitalingot.feather.util;

import com.google.gson.Gson;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import net.digitalingot.feather.FeatherDRM;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.l;
import net.digitalingot.feather.o;
import net.digitalingot.feather.browserEvent.ChannelCallBackEvent;
import net.digitalingot.feather.http.HTTPURL;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Account implements Closeable {
   @NotNull
   public static final Gson searchAccount = new Gson();
   @NotNull
   private final CoreAPI coreAPI;
   @NotNull
   private final Map<UUID, String> CoreAuthenticate = new HashMap();
   @NotNull
   private final Map<String, UUID> d = new TreeMap(String.CASE_INSENSITIVE_ORDER);

   public Account() {
      this.coreAPI = new CoreAPI(this);
      this.CoreAuthentication();
   }

   @Nullable
   public String a(@NotNull UUID var1) {
      return (String)this.a(var1).values().stream().findAny().orElse(null);
   }

   @NotNull
   public Map<UUID, String> a(@NotNull UUID... var1) {
      ArrayList var2 = new ArrayList();
      HashMap var3 = new HashMap(var1.length);

      for(UUID var7 : var1) {
         String var8 = (String)this.CoreAuthenticate.get(var7);
         if (var8 != null) {
            var3.put(var7, var8);
         } else {
            var2.add(var7);
         }
      }

      if (!var2.isEmpty()) {
         AccountSwitcher var10 = new AccountSwitcher(null, var2, null);

         MCAccountUtil var11;
         try {
            var11 = this.searchAccount(MCAccountUtil.class, HTTPURL.ACCOUNT_SEARCH, var10);
         } catch (IOException var9) {
            FeatherLogger.a.error("Error while making an account search request", var9);
            return new HashMap();
         }

         for(MCAccountUtil.a var13 : var11.b()) {
            this.a(var13);
            var3.put(var13.b(), var13.c());
         }
      }

      return var3;
   }

   @Nullable
   public UUID addAccount(@NotNull String var1) {
      return (UUID)this.addAccount(var1).values().stream().findAny().orElse(null);
   }

   @NotNull
   public Map<String, UUID> addAccount(@NotNull String... var1) {
      ArrayList var2 = new ArrayList();
      HashMap var3 = new HashMap(var1.length);

      for(String var7 : var1) {
         UUID var8 = (UUID)this.d.get(var7);
         if (var8 != null) {
            var3.put(var7, var8);
         } else {
            var2.add(var7);
         }
      }

      if (!var2.isEmpty()) {
         AccountSwitcher var10 = new AccountSwitcher(null, null, var2);

         MCAccountUtil var11;
         try {
            var11 = this.searchAccount(MCAccountUtil.class, HTTPURL.ACCOUNT_SEARCH, var10);
         } catch (IOException var9) {
            FeatherLogger.a.error("Error while making an account search request", var9);
            return new HashMap();
         }

         for(MCAccountUtil.a var13 : var11.b()) {
            this.a(var13);
            var3.put(var13.c(), var13.b());
         }
      }

      return var3;
   }

   private void a(@NotNull MCAccountUtil.a var1) {
      this.CoreAuthenticate.put(var1.b(), var1.c());
      this.d.put(var1.c(), var1.b());
   }

   @NotNull
   String a() {
      o var1 = this.a(o.class, HTTPURL.UPDATE_TOKEN);
      return var1.b();
   }

   @NotNull
   String b() {
      return this.a(String.class, HTTPURL.AUTH_TOKEN);
   }

   public void CoreAuthentication() {
      String var1 = this.a(String.class, HTTPURL.SERVER_ID);
      Minecraft var2 = Minecraft.func_71410_x();
      MinecraftSessionService var3 = var2.func_152347_ac();
      if (var3 == null) {
         throw new l("session service not available");
      } else {
         Session var4 = var2.func_110432_I();
         if (var4 == null) {
            throw new l("session not available");
         } else {
            try {
               var3.joinServer(var4.func_148256_e(), var4.func_148254_d(), var1);
            } catch (AuthenticationException var6) {
               throw new l(var6);
            }

            this.sendRequest(HTTPURL.HAS_JOINED, var4.func_111285_a(), var1);
            if (FeatherDRM.b() != ChannelCallBackEvent.a.IDE) {
               this.d();
            }

            FeatherLogger.a.info("Authenticated with core backend");
         }
      }
   }

   void d() {
   }

   @NotNull
   private <T> T a(@NotNull Class<T> var1, @NotNull HTTPURL var2, @NotNull String... var3) {
      return this.searchAccount(var1, var2, null, var3);
   }

   @NotNull
   private <T> T searchAccount(@NotNull Class<T> var1, @NotNull HTTPURL var2, @Nullable Object var3, @NotNull String... var4) {
      String var5 = this.sendRequest(var2, var3, var4);
      return (T)searchAccount.fromJson(var5, var1);
   }

   @NotNull
   private String sendRequest(@NotNull HTTPURL var1, @NotNull String... var2) {
      return this.sendRequest(var1, null, var2);
   }

   @NotNull
   private String sendRequest(@NotNull HTTPURL var1, @Nullable Object var2, @NotNull String... var3) {
      URL var4 = var1.get(var3);
      HttpsURLConnection var5 = (HttpsURLConnection)var4.openConnection();
      var5.setRequestMethod(var1.getMethod().name());
      var5.setRequestProperty("User-Agent", "Feather Client");
      if (var1 != HTTPURL.SERVER_ID && var1 != HTTPURL.HAS_JOINED) {
         String var6 = this.coreAPI.b();
         if (var6 != null) {
            var5.setRequestProperty("Authorization", var6);
         }
      }

      var5.connect();
      if (var2 != null) {
         String var12 = searchAccount.toJson(var2);
         var5.setDoOutput(true);
         var5.setRequestProperty("Content-Type", "application/json");
         OutputStream var7 = var5.getOutputStream();

         try {
            var7.write(var12.getBytes(StandardCharsets.UTF_8));
            var7.flush();
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }

      String var13 = var5.getHeaderField("Authorization");
      if (var13 != null) {
         this.coreAPI.authenticated(var13);
      }

      return hP.a(var5.getInputStream()).c();
   }

   public void close() {
      this.coreAPI.close();
   }

   @NotNull
   public CoreAPI getCoreAPI() {
      return this.coreAPI;
   }
}
