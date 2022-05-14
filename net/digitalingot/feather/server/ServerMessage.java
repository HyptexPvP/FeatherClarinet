package net.digitalingot.feather.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandler.Sharable;
import net.digitalingot.feather.ia;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.FMLEmbeddedChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServerMessage {
   @Nullable
   private static FMLEmbeddedChannel a;

   static void a(@NotNull String var0, @NotNull ia var1) {
      if (!NetworkRegistry.INSTANCE.hasChannel(var0, Side.CLIENT)) {
         a = (FMLEmbeddedChannel)NetworkRegistry.INSTANCE.newChannel(var0, new ChannelHandler[]{new ServerMessage.a(var1)}).get(Side.CLIENT);
      }

   }

   static void a(@NotNull String var0, byte[] var1) {
      if (a == null) {
         throw new IllegalStateException("Channel not yet registered");
      } else {
         a.writeAndFlush(new FMLProxyPacket(new PacketBuffer(Unpooled.wrappedBuffer(var1)), var0));
      }
   }

   @Sharable
   static class a extends ChannelInboundHandlerAdapter {
      @NotNull
      private final ia a;

      private a(@NotNull ia var1) {
         this.a = var1;
      }

      public void channelRead(ChannelHandlerContext var1, Object var2) {
         ByteBuf var3 = ((FMLProxyPacket)var2).payload();
         int var4 = var3.readableBytes();
         byte[] var5 = new byte[var4];
         var3.readBytes(var5);
         this.a.onMessage(var5);
      }
   }
}
