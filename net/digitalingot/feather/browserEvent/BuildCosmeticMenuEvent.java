package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.gui.ModSettingsUI;
import org.jetbrains.annotations.NotNull;

public class BuildCosmeticMenuEvent implements BrowserEvent {
   @SerializedName("categories")
   @NotNull
   private final Cosmetic.a[] a = Cosmetic.a.values();
   @SerializedName("cosmetics")
   @NotNull
   private final List<ModSettingsUI> b;

   public BuildCosmeticMenuEvent(@NotNull List<ModSettingsUI> var1) {
      this.b = var1;
   }

   @NotNull
   public Cosmetic.a[] b() {
      return this.a;
   }

   @NotNull
   public List<ModSettingsUI> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.BUILD_COSMETICS_MENU;
   }
}
