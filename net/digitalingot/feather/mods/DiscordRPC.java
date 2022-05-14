package net.digitalingot.feather.mods;

import de.jcm.discordgamesdk.Core;
import de.jcm.discordgamesdk.CreateParams;
import de.jcm.discordgamesdk.CreateParams.Flags;
import de.jcm.discordgamesdk.activity.Activity;
import de.jcm.discordgamesdk.activity.ActivityType;
import java.io.File;
import java.time.Instant;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.e;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.PlayerEvent;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.CurrentServer;
import net.digitalingot.feather.util.Quickplay;
import net.minecraft.client.Minecraft;
import net.minecraft.server.integrated.IntegratedServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FeatherModule(
   a = ModsConfig.DISCORD,
   b = @dn(
   a = "Discord",
   b = "https://assets.feathercdn.net/game/mods/discord.svg",
   c = "Share your current status on Discord",
   d = {}
)
)
public class DiscordRPC extends Mod<DiscordRPC.a> {
   private final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new ArrayBlockingQueue(10));
   private CreateParams c;
   private Core d;
   private long e;

   @Override
   public void f() {
      this.a.submit(() -> {
         String var0 = System.getProperty("java.library.path");

         for(String var4 : var0.split("[;:]")) {
            File var5 = new File(var4, "discord_game_sdk.dll");
            if (var5.exists()) {
               Core.init(var5);
               return;
            }
         }

         FeatherLogger.a.error("Couldn't find discord api path! Tried those paths: " + var0);
      });
      Events.a.a(var1 -> {
         if (this.m()) {
            if (var1 == Events.c.START) {
               if (this.d != null) {
                  this.a.submit(() -> this.d.runCallbacks());
                  if (this.b()) {
                     long var2 = Instant.now().getEpochSecond();
                     if (var2 - this.e > 1L) {
                        this.e = var2;
                        this.c();
                     }
                  }

               }
            }
         }
      });
      PlayerEvent.a.a((var1, var2) -> {
         if (this.m()) {
            if (this.b()) {
               this.c();
            } else if (Minecraft.func_71410_x().func_147104_D() != null) {
               this.a("Multiplayer", this.b.b ? Minecraft.func_71410_x().func_147104_D().field_78845_b : null);
            } else {
               this.a("Singleplayer", this.b.a ? this.d() : null);
            }

         }
      });
      PlayerEvent.b.a((var1, var2) -> {
         if (this.m()) {
            this.a("Main Menu", null);
         }
      });
   }

   @Override
   public void g() {
      this.a.submit(() -> {
         this.c = new CreateParams();
         this.c.setClientID(903733444876582983L);
         this.c.setFlags(new Flags[]{Flags.NO_REQUIRE_DISCORD});
         this.d = new Core(this.c);
      });
      this.a();
   }

   private void a() {
      if (this.m()) {
         if (this.b()) {
            this.c();
         } else if (Minecraft.func_71410_x().func_71356_B()) {
            this.a("Singleplayer", this.b.a ? this.d() : null);
         } else if (Minecraft.func_71410_x().func_147104_D() != null) {
            this.a("Multiplayer", this.b.b ? Minecraft.func_71410_x().func_147104_D().field_78845_b : null);
         } else {
            this.a("Main Menu", null);
         }

      }
   }

   private boolean b() {
      return this.b.c && net.digitalingot.feather.e.c().g() == CurrentServer.HYPIXEL;
   }

   private void c() {
      Quickplay.a var1 = Quickplay.a();
      this.a("Hypixel", var1.getDisplayName());
   }

   private void a(@NotNull String var1, @Nullable String var2) {
      this.a.submit(() -> {
         if (this.d != null) {
            Activity var3 = new Activity();

            try {
               var3.setType(ActivityType.PLAYING);
               var3.setState(var1);
               if (var2 != null) {
                  var3.setDetails(var2);
               }

               var3.timestamps().setStart(Instant.now());
               var3.assets().setLargeImage("app_icon");
               var3.assets().setLargeText("Feather Client");
               this.d.activityManager().updateActivity(var3);
            } catch (Throwable var7) {
               try {
                  var3.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }

               throw var7;
            }

            var3.close();
         }
      });
   }

   private String d() {
      IntegratedServer var1 = Minecraft.func_71410_x().func_71401_C();
      return var1.func_71221_J();
   }

   @Override
   public void h() {
      if (this.c != null) {
         this.c.close();
      }

      if (this.d != null) {
         this.d.close();
      }

   }

   @dt(
      a = true
   )
   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "showWorld",
         b = "Show Singleplayer World",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public boolean a;
      @ModConfigAnnotation(
         a = "showServer",
         b = "Show Server",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
      @ModConfigAnnotation(
         a = "hypixelGamemode",
         b = "Show Hypixel Gamemodes",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean c;
   }
}
