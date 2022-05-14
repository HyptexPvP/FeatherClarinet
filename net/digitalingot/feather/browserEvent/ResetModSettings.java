package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class ResetModSettings implements BrowserEvent {
   @SerializedName("mods")
   @NotNull
   private final List<ModsConfig> a;

   public ResetModSettings(@NotNull List<ModsConfig> var1) {
      this.a = var1;
   }

   @NotNull
   public List<ModsConfig> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.RESET_MOD_SETTINGS;
   }
}
