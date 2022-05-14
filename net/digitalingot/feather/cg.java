package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.browserEvent.newProfileEvent;
import net.digitalingot.feather.config.FavoriteMods;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cg implements BrowserEvent {
   @SerializedName("colorPicker")
   @Nullable
   private final newProfileEvent a;
   @SerializedName("modMenu")
   @Nullable
   private final FavoriteMods b;

   public cg(@Nullable newProfileEvent var1, @Nullable FavoriteMods var2) {
      this.a = var1;
      this.b = var2;
   }

   @Nullable
   public newProfileEvent b() {
      return this.a;
   }

   @Nullable
   public FavoriteMods c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.UPDATE_CLIENT_PREFERENCES;
   }
}
