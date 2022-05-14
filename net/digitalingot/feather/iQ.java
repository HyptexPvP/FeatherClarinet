package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public class iQ {
   public static class a extends ChannelInboundHandlerAdapter {
      public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
         FeatherLogger.a.error("Error during an inbound netty operation", var2);
      }
   }

   public static class b extends ChannelOutboundHandlerAdapter {
      public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
         FeatherLogger.a.error("Error during an outbound netty operation", var2);
      }
   }
}
