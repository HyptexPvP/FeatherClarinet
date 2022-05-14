package net.digitalingot.feather;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import net.digitalingot.feather.voice.Proximity;
import org.capnproto.MessageReader;

public class gO extends ChannelDuplexHandler {
   public void channelRead(ChannelHandlerContext var1, Object var2) {
      MessageReader var3 = (MessageReader)var2;
      Proximity.b.c var4 = (Proximity.b.c)var3.getRoot(Proximity.b.b);
      var1.fireChannelRead(var4);
   }
}
