package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.capnproto.MessageReader;

public class gK extends ChannelInboundHandlerAdapter {
   public void channelRead(ChannelHandlerContext var1, Object var2) {
      MessageReader var3 = (MessageReader)var2;
      gQ.c.d var4 = (gQ.c.d)var3.getRoot(gQ.c.b);
      var1.fireChannelRead(var4);
   }
}
