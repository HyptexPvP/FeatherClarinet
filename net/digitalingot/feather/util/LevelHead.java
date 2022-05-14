package net.digitalingot.feather.util;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.UUID;
import net.digitalingot.feather.gd;
import net.digitalingot.feather.webscket.WebsocketAuthentication;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.apache.commons.io.IOUtils;

public class LevelHead {
   private static final String b = "https://api.sk1er.club/levelheadv5/";
   public static final String a = "6.5";
   private static final String c = "Mozilla/4.76 (SK1ER LEVEL HEAD V6.5)";
   private static final String d = "https://api.sk1er.club/auth/";
   private static final int e = 204;

   static LevelHead.a a() {
      Session var0 = Minecraft.func_71410_x().func_110432_I();
      UUID var1 = var0.func_148256_e().getId();
      String var2 = var0.func_111285_a();
      String var3 = var0.func_148254_d();
      gd var4 = new gd(a("https://api.sk1er.club/auth/begin?uuid=" + var1 + "&mod=LEVEL_HEAD&ver=" + "6.5"));
      if (!var4.g("success")) {
         LevelHead.a var8 = new LevelHead.a();
         var8.a = "Error during begin: " + var4;
         return var8;
      } else {
         LevelHead.a var5 = new LevelHead.a();
         var5.b = var4.j("hash");
         int var6 = WebsocketAuthentication.joinServer(var3, a(var1), var5.b);
         if (var6 != 204) {
            var5.a = "Error during Mojang Auth (1) " + var6;
            return var5;
         } else {
            gd var7 = new gd(a("https://api.sk1er.club/auth/final?hash=" + var5.b + "&name=" + var2));
            if (var7.g("success")) {
               var5.c = true;
            } else {
               var5.a = "Error during  auth. Reason: " + var7.j("cause").trim();
            }

            return var5;
         }
      }
   }

   static gd a(UUID var0, String var1) {
      UUID var2 = Minecraft.func_71410_x().func_110432_I().func_148256_e().getId();
      String var3 = "https://api.sk1er.club/levelheadv5/" + a(var0) + "/LEVEL/" + a(var2) + "/" + "6.5" + "/" + var1 + "/ABOVE_HEAD";
      String var4 = a(var3);
      return new gd(var4);
   }

   private static String a(String var0) {
      try {
         URL var1 = new URL(var0);
         HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();

         String var4;
         try {
            var2.setRequestMethod("GET");
            var2.setUseCaches(true);
            var2.addRequestProperty("User-Agent", "Mozilla/4.76 (SK1ER LEVEL HEAD V6.5)");
            var2.setReadTimeout(15000);
            var2.setConnectTimeout(15000);
            var2.setDoOutput(true);
            InputStream var3 = var2.getInputStream();

            try {
               var4 = IOUtils.toString(var3, Charset.defaultCharset());
            } catch (Throwable var12) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var11) {
                     var12.addSuppressed(var11);
                  }
               }

               throw var12;
            }

            if (var3 != null) {
               var3.close();
            }
         } finally {
            var2.disconnect();
         }

         return var4;
      } catch (Exception var14) {
         var14.printStackTrace();
         return new gd().b("success", false).b("cause", "API_DOWN").toString();
      }
   }

   private static String a(UUID var0) {
      return var0.toString().replace("-", "");
   }

   static class a {
      private String a = null;
      private String b = "";
      private boolean c = false;

      public boolean a() {
         return this.a != null || !this.c;
      }

      public String b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }

      public boolean d() {
         return this.c;
      }
   }
}
