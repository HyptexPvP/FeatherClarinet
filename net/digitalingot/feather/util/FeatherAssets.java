package net.digitalingot.feather.util;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum FeatherAssets {
   MC_SETTINGS("MC Settings", "mcSettings", "https://assets.feathercdn.net/game/homepageicons/settings.svg"),
   REALMS("Minecraft Realms", "mcRealms", "https://assets.feathercdn.net/game/homepageicons/realms.svg"),
   REPLAY_MOD("Replay Mod", "replayMod", "https://assets.feathercdn.net/game/homepageicons/replaymod.svg");

   @SerializedName("name")
   @NotNull
   private final String name;
   @SerializedName("slug")
   @NotNull
   private final String slug;
   @SerializedName("icon")
   @NotNull
   private final String icon;

   private FeatherAssets(@NotNull String var3, @NotNull String var4, @NotNull String var5) {
      this.name = var3;
      this.slug = var4;
      this.icon = var5;
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   @NotNull
   public String getSlug() {
      return this.slug;
   }

   @NotNull
   public String getIcon() {
      return this.icon;
   }
}
