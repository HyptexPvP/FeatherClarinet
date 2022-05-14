package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PunchHoleEvent implements BrowserEvent {
   @SerializedName("id")
   private final int a;
   @SerializedName("server_port")
   @Nullable
   private final Integer b;
   @SerializedName("peer")
   @NotNull
   private final InetSocketAddress c;
   @SerializedName("peer_enc_pk")
   private final byte[] d;

   public PunchHoleEvent(int var1, @Nullable Integer var2, @NotNull InetSocketAddress var3, byte[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public int b() {
      return this.a;
   }

   @Nullable
   public Integer c() {
      return this.b;
   }

   @NotNull
   public SocketAddress d() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.PUNCH_HOLE;
   }
}
