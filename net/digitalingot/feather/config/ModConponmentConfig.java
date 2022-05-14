package net.digitalingot.feather.config;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.gui.HUD;
import org.jetbrains.annotations.NotNull;

public class ModConponmentConfig {
   @SerializedName("enabled")
   private final boolean a;
   @SerializedName("favorite")
   private final boolean b;
   @SerializedName("settings")
   @NotNull
   private final HUD c;

   public ModConponmentConfig(@NotNull HUD var1) {
      this.a = var1.j();
      this.b = var1.k();
      this.c = var1;
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }

   @NotNull
   public HUD c() {
      return this.c;
   }
}
