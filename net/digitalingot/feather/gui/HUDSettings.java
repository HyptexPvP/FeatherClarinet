package net.digitalingot.feather.gui;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class HUDSettings {
   @SerializedName("settings")
   @NotNull
   private final HUD a;

   public HUDSettings(@NotNull HUD var1) {
      this.a = var1;
   }

   @NotNull
   public HUD a() {
      return this.a;
   }
}
