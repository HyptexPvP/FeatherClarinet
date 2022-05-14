package net.digitalingot.feather.config;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.newProfileEvent;
import org.jetbrains.annotations.NotNull;

public class ColorPicker {
   @SerializedName("updateClientPreferences")
   @NotNull
   private FavoriteMods a;
   @SerializedName("colorPickerPreferences")
   @NotNull
   private newProfileEvent b;

   public ColorPicker(@NotNull FavoriteMods var1, @NotNull newProfileEvent var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public FavoriteMods a() {
      return this.a;
   }

   public void a(@NotNull FavoriteMods var1) {
      this.a = var1;
   }

   @NotNull
   public newProfileEvent b() {
      return this.b;
   }

   public void a(@NotNull newProfileEvent var1) {
      this.b = var1;
   }
}
