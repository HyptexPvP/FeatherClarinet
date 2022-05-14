package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class ce implements BrowserEvent {
   @SerializedName("keys")
   private final int[] a;
   @SerializedName("display")
   @NotNull
   private final String b;

   public ce(int[] var1, @NotNull String var2) {
      this.a = var1;
      this.b = var2;
   }

   public int[] b() {
      return this.a;
   }

   @NotNull
   public String c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CALLBACK;
   }
}
