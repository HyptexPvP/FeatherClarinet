package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.net.InetSocketAddress;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class PeerToPeerEvent implements BrowserEvent {
   @SerializedName("id")
   private final int a;
   @SerializedName("info")
   @NotNull
   private final PeerToPeerEvent.a b;

   public PeerToPeerEvent(int var1, @NotNull PeerToPeerEvent.a var2) {
      this.a = var1;
      this.b = var2;
   }

   public int b() {
      return this.a;
   }

   @NotNull
   public PeerToPeerEvent.a c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CALLBACK;
   }

   public static class a {
      @SerializedName("external_address")
      @NotNull
      private final InetSocketAddress a;
      @SerializedName("public_key")
      private final byte[] b;

      public a(@NotNull InetSocketAddress var1, byte[] var2) {
         this.a = var1;
         this.b = var2;
      }

      @NotNull
      public InetSocketAddress a() {
         return this.a;
      }

      public byte[] b() {
         return this.b;
      }
   }
}
