package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class ResetCosmeticsSettingEvent implements BrowserEvent {
   @SerializedName("cosmetics")
   @NotNull
   private final List<String> a;

   public ResetCosmeticsSettingEvent(@NotNull List<String> var1) {
      this.a = var1;
   }

   @NotNull
   public List<String> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.RESET_COSMETICS_SETTINGS;
   }
}
