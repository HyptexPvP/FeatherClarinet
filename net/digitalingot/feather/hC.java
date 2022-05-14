package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.capnproto.MessageReader;

public class hC extends ChannelInboundHandlerAdapter {
   public void channelRead(ChannelHandlerContext var1, Object var2) {
      MessageReader var3 = (MessageReader)var2;
      hE.n.d var4 = (hE.n.d)var3.getRoot(hE.n.b);
      var1.fireChannelRead(var4);
   }
}
