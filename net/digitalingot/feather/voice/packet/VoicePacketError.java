package net.digitalingot.feather.voice.packet;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.gG;
import net.digitalingot.feather.gQ;
import org.jetbrains.annotations.NotNull;

public class VoicePacketError extends ChannelInboundHandlerAdapter {
   @NotNull
   private final gG a;

   public VoicePacketError(@NotNull gG var1) {
      this.a = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      gQ.c.d var3 = (gQ.c.d)var2;
      if (var3.a().a() == gQ.c.c.d.AUTH_SUCCESSFUL) {
         FeatherLogger.a.error("Received authentication successful packet on voice control while already authenticated.");
      }

   }
}
