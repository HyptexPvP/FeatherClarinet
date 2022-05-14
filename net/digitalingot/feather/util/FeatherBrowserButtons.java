package net.digitalingot.feather.util;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum FeatherBrowserButtons {
   SINGLEPLAYER("Singleplayer", "singleplayer"),
   MULTIPLAYER("Multiplayer", "multiplayer"),
   QUIT_GAME("Quit Game", "quitGame");

   @SerializedName("name")
   @NotNull
   private final String name;
   @SerializedName("slug")
   @NotNull
   private final String slug;

   private FeatherBrowserButtons(@NotNull String var3, @NotNull String var4) {
      this.name = var3;
      this.slug = var4;
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   @NotNull
   public String getSlug() {
      return this.slug;
   }
}
