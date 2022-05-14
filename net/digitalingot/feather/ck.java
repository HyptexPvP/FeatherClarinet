package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum ck {
   HUD_EDITOR("hudEditor");

   @SerializedName("slug")
   @NotNull
   private final String slug;

   private ck(@NotNull String var3) {
      this.slug = var3;
   }

   @NotNull
   public String getSlug() {
      return this.slug;
   }
}
