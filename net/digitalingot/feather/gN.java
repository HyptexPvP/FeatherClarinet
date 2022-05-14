package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.UUID;
import net.digitalingot.feather.voice.Proximity;
import net.digitalingot.feather.voice.Voice;
import org.jetbrains.annotations.NotNull;

public class gN extends ChannelInboundHandlerAdapter {
   @NotNull
   private final Voice a;

   public gN(@NotNull Voice var1) {
      this.a = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      Proximity.b.c var3 = (Proximity.b.c)var2;
      UUID var4 = in.a(var3.b().toArray());
      long var5 = var3.d();
      byte[] var7;
      if (var3.e()) {
         var7 = var3.f().toArray();
      } else {
         var7 = new byte[0];
      }

      gT.c var8 = var3.c();
      this.a.i().a(var4, var5, var7, var8);
   }
}
