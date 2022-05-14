package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.gui.HUDSettings;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class LoadSideBarModConfigEvent implements BrowserEvent {
   @SerializedName("sidebar")
   @NotNull
   private final Map<ModsConfig, HUDSettings> a;

   public LoadSideBarModConfigEvent(@NotNull Map<ModsConfig, HUDSettings> var1) {
      this.a = var1;
   }

   @NotNull
   public Map<ModsConfig, HUDSettings> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_SIDEBAR_SETTINGS;
   }
}
