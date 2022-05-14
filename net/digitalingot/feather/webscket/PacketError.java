package net.digitalingot.feather.webscket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.hE;
import net.digitalingot.feather.redstone.RedstoneAuthentication;
import org.jetbrains.annotations.NotNull;

public class PacketError extends ChannelInboundHandlerAdapter {
   @NotNull
   private final RedstoneAuthentication a;

   public PacketError(@NotNull RedstoneAuthentication var1) {
      this.a = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      hE.n.d var3 = (hE.n.d)var2;
      if (var3.a().a() != hE.n.c.d.AUTHENTICATION_SUCCESS) {
         FeatherLogger.a.error("received packet type {} while still unauthenticated", new Object[]{var3.a()});
      } else {
         this.a.authenticate();
      }
   }
}
