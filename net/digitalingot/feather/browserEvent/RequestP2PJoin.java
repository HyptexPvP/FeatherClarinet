package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class RequestP2PJoin implements BrowserEvent {
   @SerializedName("id")
   private final int a;
   @SerializedName("target")
   @NotNull
   private final UUID b;

   public RequestP2PJoin(int var1, @NotNull UUID var2) {
      this.a = var1;
      this.b = var2;
   }

   public int b() {
      return this.a;
   }

   @NotNull
   public UUID c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.REQUEST_P2P_JOIN;
   }
}
