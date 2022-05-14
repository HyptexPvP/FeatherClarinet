package net.digitalingot.feather.gui;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import net.digitalingot.feather.mods.ModConfigValueAnnotation;

public abstract class HUD {
   @ModConfigAnnotation(
      a = "hudSelection",
      b = "Hud Selection",
      c = "true",
      e = @ModConfigValueAnnotation(
   a = -2
)
   )
   public boolean f;
   @ModConfigAnnotation(
      a = "enabled",
      b = "Enabled",
      e = @ModConfigValueAnnotation(
   a = -10
)
   )
   public transient boolean g;
   @SerializedName("favorite")
   public transient boolean h;

   public boolean j() {
      return this.g;
   }

   public boolean k() {
      return this.h;
   }
}
