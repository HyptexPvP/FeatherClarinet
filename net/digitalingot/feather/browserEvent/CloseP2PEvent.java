package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class CloseP2PEvent implements BrowserEvent {
   @SerializedName("id")
   private final int a;

   public CloseP2PEvent(int var1) {
      this.a = var1;
   }

   public int b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CLOSE_P2P;
   }
}
