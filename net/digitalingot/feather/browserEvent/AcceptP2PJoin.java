package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class AcceptP2PJoin implements BrowserEvent {
   @SerializedName("origin")
   @NotNull
   private final UUID a;
   @SerializedName("serverPort")
   private final int b;

   public AcceptP2PJoin(@NotNull UUID var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public UUID b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.ACCEPT_P2P_JOIN;
   }
}
