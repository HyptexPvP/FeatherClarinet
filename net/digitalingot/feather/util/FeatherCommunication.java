package net.digitalingot.feather.util;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import java.nio.charset.StandardCharsets;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.e;
import net.digitalingot.feather.iQ;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.BrowserCall;
import org.jetbrains.annotations.NotNull;

public class FeatherCommunication {
   @NotNull
   private final NioEventLoopGroup a = new NioEventLoopGroup(1);
   @NotNull
   private final Channel b = this.a();

   @NotNull
   private Channel a() {
      Bootstrap var1 = new Bootstrap();
      var1.group(this.a);
      var1.channel(NioDatagramChannel.class);
      int var2 = Integer.parseInt(SystemUtil.a("FEATHER_MESSAGING_RUST_PORT", "1001"));
      int var3 = Integer.parseInt(SystemUtil.a("FEATHER_MESSAGING_PORT_JAVA", "1000"));
      var1.remoteAddress("127.0.0.1", var2);
      var1.localAddress("127.0.0.1", var3);
      var1.handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel var1) {
            ChannelPipeline var2 = var1.pipeline();
            var2.addLast("packetProcessor", new FeatherCommunication.a());
            var2.addLast("inboundExceptionHandler", new iQ.a());
            var2.addLast("outboundExceptionHandler", new iQ.b());
         }
      });
      ChannelFuture var4 = var1.connect();
      FeatherLogger.a.info("Initialized rust channel communication. Listening on {} and sending messages to {}.", new Object[]{var3, var2});
      return var4.channel();
   }

   public void a(@NotNull String var1) {
      FeatherLogger.a.debug("Sending a message to rust side: {}", new Object[]{var1});
      this.b.writeAndFlush(Unpooled.wrappedBuffer(var1.getBytes(StandardCharsets.UTF_8)));
   }

   public static class a extends ChannelDuplexHandler {
      public void channelRead(ChannelHandlerContext var1, Object var2) {
         ByteBuf var3;
         if (var2 instanceof ByteBuf) {
            var3 = (ByteBuf)var2;
         } else {
            if (!(var2 instanceof ByteBufHolder)) {
               throw new IllegalArgumentException("Don't know how to cast " + var2.getClass() + " to ByteBuf");
            }

            var3 = ((ByteBufHolder)var2).content();
         }

         try {
            int var4 = var3.readableBytes();
            byte[] var5 = new byte[var4];
            var3.readBytes(var5);
            String var6 = new String(var5, StandardCharsets.UTF_8);
            FeatherLogger.a.debug("Received a message from rust side: {}", new Object[]{var6});
            BrowserCall var7 = (BrowserCall)Browser.a.fromJson(var6, BrowserCall.class);
            e.c().a().a(var7, Browser.b.RUST_LAUNCHER);
         } finally {
            var3.release();
         }

      }
   }
}
