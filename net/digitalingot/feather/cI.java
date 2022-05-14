package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class cI implements BrowserEvent {
   @SerializedName("profile")
   @NotNull
   private final String a;

   public cI(@NotNull String var1) {
      this.a = var1;
   }

   @NotNull
   public String b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.SELECT_MOD_PROFILE;
   }
}
