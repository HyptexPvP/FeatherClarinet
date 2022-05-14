package net.digitalingot.feather.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;

public class Quickplay {
   private static long a;
   private static Quickplay.a b;

   @NotNull
   public static Quickplay.a a() {
      long var0 = System.currentTimeMillis();
      if (var0 - a > 1000L) {
         a = var0;
         b = b();
      }

      return b;
   }

   @NotNull
   private static Quickplay.a b() {
      EntityPlayerSP var0 = Minecraft.func_71410_x().field_71439_g;
      if (var0 == null) {
         return Quickplay.a.LOBBY;
      } else {
         Scoreboard var1 = var0.func_96123_co();
         ScoreObjective var2 = var1.func_96539_a(1);
         if (var2 == null) {
            return Quickplay.a.LOBBY;
         } else if (var2.func_96678_d() == null) {
            return Quickplay.a.LOBBY;
         } else {
            String var3 = var2.func_96678_d().trim();
            return Quickplay.a.fromScoreboardName(var3);
         }
      }
   }

   public static enum a {
      SKYBLOCK("Skyblock"),
      SKYWARS("Skywars"),
      BLITZ_SG("Survival Games"),
      CRAZY_WALLS("Crazy Walls"),
      COPS_AND_CRIMS("Cops and Crims"),
      THE_WALLS("The Walls"),
      MEGA_WALLS("Mega Walls"),
      UHC_CHAMPIONS("UHC Champions"),
      MURDER_MYSTERY("Murder Mystery"),
      HOUSING("Housing"),
      THE_HYPIXEL_PIT("The Hypixel Pit"),
      ARCADE_GAMES("Arcade Games"),
      CREEPER_ATTACK("Creeper Attack"),
      FARM_HUNT("Farm Hunt"),
      PARTY_GAMES("Party Games"),
      ZOMBIES("Zombies"),
      HIDE_AND_SEEK("Hide and Seek"),
      HYPIXEL_SAYS("Hypixel Says"),
      MINI_WALLS("Mini Walls"),
      BLOCKING_DEAD("Blocking Dead"),
      THROW_OUT("Throw Out"),
      GALAXY_WARS("Galaxy Wars"),
      ENDER_SPLEEF("Ender Spleef"),
      DRAGON_WARS("Dragon Wars"),
      CAPTURE_THE_WOOL("Capture The Wool"),
      PIXEL_PAINTERS("Pixel Painters"),
      BOUNTY_HUNTERS("Bounty Hunters"),
      FOOTBALL("Football"),
      HOLE_IN_THE_WALL("Hole In The Wall"),
      DUELS("Duels"),
      THE_TNT_GAMES("The TNT Games"),
      SMASH_HEROES("Smash Heroes"),
      WARLORDS("Warlords"),
      SPEED_UHC("Speed UHC"),
      BEDWARS("Bedwars", "Bed Wars"),
      LOBBY("Lobby", "Hypixel");

      @NotNull
      private final String displayName;
      @NotNull
      private final String scoreboardName;

      @NotNull
      public static Quickplay.a fromScoreboardName(@NotNull String var0) {
         for(Quickplay.a var4 : values()) {
            if (var0.equalsIgnoreCase(var4.getScoreboardName())) {
               return var4;
            }
         }

         return LOBBY;
      }

      private a(@NotNull String var3) {
         this.displayName = var3;
         this.scoreboardName = var3;
      }

      private a(@NotNull String var3, @NotNull String var4) {
         this.displayName = var3;
         this.scoreboardName = var4;
      }

      @NotNull
      public String getDisplayName() {
         return this.displayName;
      }

      @NotNull
      public String getScoreboardName() {
         return this.scoreboardName;
      }
   }
}
