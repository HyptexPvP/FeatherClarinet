package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class da implements BrowserEvent {
   @SerializedName("sidebar")
   @NotNull
   private final List<ModsConfig> a;

   public da(@NotNull List<ModsConfig> var1) {
      this.a = var1;
   }

   @NotNull
   public List<ModsConfig> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.RESET_SIDEBAR_SETTINGS;
   }
}
