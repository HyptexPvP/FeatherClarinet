package net.digitalingot.feather.mods;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum ModsConfig {
   @SerializedName("core")
   CORE(true),
   @SerializedName("chatOptions")
   CHAT_OPTIONS(true),
   @SerializedName("autoText")
   AUTO_TEXT(false),
   @SerializedName("crosshair")
   CROSSHAIR(false),
   @SerializedName("cps")
   CPS(false),
   @SerializedName("armorStatus")
   ARMOR_STATUS(false),
   @SerializedName("bossBar")
   BOSS_BAR(false),
   @SerializedName("comboDisplay")
   COMBO_DISPLAY(false),
   @SerializedName("coordinates")
   COORDINATES(false),
   @SerializedName("direction")
   DIRECTION(false),
   @SerializedName("fps")
   FPS(false),
   @SerializedName("itemCounter")
   ITEM_COUNTER(false),
   @SerializedName("itemInfo")
   ITEM_INFO(false),
   @SerializedName("keystrokes")
   KEYSTROKES(false),
   @SerializedName("ping")
   PING(false),
   @SerializedName("potionEffects")
   POTION_EFFECTS(false),
   @SerializedName("reachDisplay")
   REACH_DISPLAY(false),
   @SerializedName("scoreboard")
   SCOREBOARD(false),
   @SerializedName("time")
   TIME(false),
   @SerializedName("toggleSprint")
   TOGGLE_SPRINT(false),
   @SerializedName("hypixel")
   HYPIXEL(false),
   @SerializedName("motionBlur")
   MOTION_BLUR(false),
   @SerializedName("saturation")
   SATURATION(false),
   @SerializedName("waypoints")
   WAYPOINTS(false),
   @SerializedName("animations")
   ANIMATIONS(false),
   @SerializedName("discordRP")
   DISCORD(false),
   @SerializedName("blockOverlay")
   BLOCK_OVERLAY(false),
   @SerializedName("clearWater")
   CLEAR_WATER(false),
   @SerializedName("fovChanger")
   FOV_CHANGER(false),
   @SerializedName("glint")
   GLINT(false),
   @SerializedName("hitbox")
   HITBOX(false),
   @SerializedName("itemPhysic")
   ITEM_PHYSIC(false),
   @SerializedName("oofMod")
   OOF_MOD(false),
   @SerializedName("particles")
   PARTICLES(false),
   @SerializedName("perspective")
   PERSPECTIVE(false),
   @SerializedName("voice")
   VOICE(false),
   @SerializedName("timeChanger")
   TIME_CHANGER(false),
   @SerializedName("nickHider")
   NICK_HIDER(false),
   @SerializedName("screenshot")
   SCREENSHOT(false),
   @SerializedName("weatherchanger")
   WEATHER_CHANGER(false);

   private final String slug;
   private final boolean core;

   @Nullable
   public static ModsConfig fromSlug(@NotNull String var0) {
      for(ModsConfig var4 : values()) {
         if (var4.getSlug().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   private ModsConfig(boolean var3) {
      try {
         Field var4 = this.getClass().getDeclaredField(this.name());
         this.slug = ((SerializedName)var4.getDeclaredAnnotation(SerializedName.class)).value();
      } catch (NoSuchFieldException var5) {
         throw new IllegalStateException("Enum \"" + this.name() + "\" in \"" + this.getClass().getName() + "\" not annotated with @SerializedName");
      }

      this.core = var3;
   }

   @NotNull
   public String getSlug() {
      return this.slug;
   }

   public boolean isCore() {
      return this.core;
   }
}
