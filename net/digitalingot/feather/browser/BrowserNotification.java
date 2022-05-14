package net.digitalingot.feather.browser;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class BrowserNotification implements BrowserEvent {
   @SerializedName("msg")
   @NotNull
   private final String a;

   public BrowserNotification(@NotNull String var1) {
      this.a = var1;
   }

   @NotNull
   public String b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CALLBACK;
   }
}
