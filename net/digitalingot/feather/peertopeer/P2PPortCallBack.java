package net.digitalingot.feather.peertopeer;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class P2PPortCallBack implements BrowserEvent {
   @SerializedName("client_port")
   @Nullable
   private final Integer a;

   public P2PPortCallBack(@Nullable Integer var1) {
      this.a = var1;
   }

   @Nullable
   public Integer b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CALLBACK;
   }
}
