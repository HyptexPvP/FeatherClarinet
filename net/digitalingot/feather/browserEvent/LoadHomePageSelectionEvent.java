package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.util.FeatherAssets;
import net.digitalingot.feather.util.FeatherBrowserButtons;
import org.jetbrains.annotations.NotNull;

public class LoadHomePageSelectionEvent implements BrowserEvent {
   @SerializedName("main")
   private final List<FeatherBrowserButtons> a;
   @SerializedName("header")
   private final List<FeatherAssets> b;

   public LoadHomePageSelectionEvent(@NotNull List<FeatherBrowserButtons> var1, @NotNull List<FeatherAssets> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public List<FeatherBrowserButtons> b() {
      return this.a;
   }

   @NotNull
   public List<FeatherAssets> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_HOMEPAGE_SELECTIONS;
   }
}
