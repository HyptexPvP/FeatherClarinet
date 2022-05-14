package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.config.Config;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class LoadCosmeticSettingsEvent implements BrowserEvent {
   @SerializedName("settings")
   @NotNull
   private final Map<String, Config> a;
   @SerializedName("equipped")
   @NotNull
   private final Map<Cosmetic.a, String> b;

   public LoadCosmeticSettingsEvent(@NotNull Map<String, Config> var1, @NotNull Map<Cosmetic.a, String> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public Map<String, Config> b() {
      return this.a;
   }

   @NotNull
   public Map<Cosmetic.a, String> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_COSMETICS_SETTINGS;
   }
}
