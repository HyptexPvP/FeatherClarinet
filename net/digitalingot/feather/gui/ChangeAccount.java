package net.digitalingot.feather.gui;

import com.google.gson.annotations.SerializedName;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.browserEvent.AccountSwitchDetailEvent;
import net.digitalingot.feather.browserEvent.CallBack;
import net.digitalingot.feather.browserEvent.ChangeAccountEvent;
import net.digitalingot.feather.browserEvent.LoadAccountListEvent;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mixin.core.IMixinMinecraft;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.mods.VoiceMod;
import net.digitalingot.feather.util.Account;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;

public class ChangeAccount {
   @NotNull
   private List<ChangeAccount.a> changeAccount = new ArrayList();

   private ChangeAccount() {
   }

   public static ChangeAccount a() {
      final ChangeAccount var0 = new ChangeAccount();
      final Browser var1 = e.c().a();
      var1.a(
         new AccountSwitchDetailEvent(),
         new Consumer<CallBack>() {
            public void a(CallBack var1x) {
               var0.changeAccount = var1x.b();
               var1.b(
                  new LoadAccountListEvent(
                     Minecraft.func_71410_x().func_110432_I().func_148256_e().getId(),
                     (List<LoadAccountListEvent.a>)var0.changeAccount.stream().map(LoadAccountListEvent.a::a).collect(Collectors.toList())
                  )
               );
            }
         },
         null
      );
      if (System.getenv("FEATHER_TEST") != null) {
         GameProfile var2 = Minecraft.func_71410_x().func_110432_I().func_148256_e();
         var0.changeAccount.add(new ChangeAccount.a("support@feathermc.com", var2.getId(), var2.getName(), ""));
         var1.b(
            new LoadAccountListEvent(
               var2.getId(), (List<LoadAccountListEvent.a>)var0.changeAccount.stream().map(LoadAccountListEvent.a::a).collect(Collectors.toList())
            )
         );
      }

      var1.a(BrowserEvents.CHANGE_ACCOUNT, new ChangeAccount.b(var0));
      return var0;
   }

   public void a(UUID var1) {
      FeatherLogger.a.info("Changing account to " + var1 + "...");
      ChangeAccount.a var2 = (ChangeAccount.a)this.changeAccount
         .stream()
         .filter(var1x -> var1x.b().equals(var1))
         .findFirst()
         .orElseThrow(IllegalArgumentException::new);
      Minecraft var3 = Minecraft.func_71410_x();
      ((IMixinMinecraft)var3).setSession(new Session(var2.c(), var2.b().toString(), var2.d(), "mojang"));
      ConfigManager var4 = e.c().b();
      CoreMod var5 = var4.b(CoreMod.class);
      Account var6 = var5.b();
      if (var6 != null) {
         var6.getCoreAPI().a();
      }

      if (var5.a() != null) {
         var5.a().a().a();
      }

      VoiceMod var7 = var4.b(VoiceMod.class);
      if (var7.m() && var7.a() != null) {
         var7.a().a();
      }

   }

   public static class a {
      @SerializedName("email")
      private final String a;
      @SerializedName("uuid")
      private final UUID b;
      @SerializedName("name")
      private final String c;
      @SerializedName("authToken")
      private final String d;

      public a(String var1, UUID var2, String var3, String var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
      }

      public String a() {
         return this.a;
      }

      public UUID b() {
         return this.b;
      }

      public String c() {
         return this.c;
      }

      public String d() {
         return this.d;
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            ChangeAccount.a var2 = (ChangeAccount.a)var1;
            return Objects.equals(this.a, var2.a) && Objects.equals(this.b, var2.b) && Objects.equals(this.c, var2.c) && Objects.equals(this.d, var2.d);
         } else {
            return false;
         }
      }

      public int hashCode() {
         return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
      }
   }

   public static class b implements GuiBrowser<ChangeAccountEvent, CallBack, BrowserNotification> {
      @NotNull
      private final ChangeAccount a;

      b(@NotNull ChangeAccount var1) {
         this.a = var1;
      }

      public void a(ChangeAccountEvent var1, Consumer<CallBack> var2, Consumer<BrowserNotification> var3) {
         UUID var4 = var1.b();
         this.a.a(var4);
      }
   }
}
