package net.digitalingot.feather.config;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class ModProfileConfig implements BrowserEvent {
   @SerializedName("mods")
   @NotNull
   private final Map<ModsConfig, ModConponmentConfig> a;

   public ModProfileConfig(@NotNull Map<ModsConfig, ModConponmentConfig> var1) {
      this.a = var1;
   }

   @NotNull
   public Map<ModsConfig, ModConponmentConfig> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_MOD_PROFILE;
   }
}
