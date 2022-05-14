package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufHolder;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import org.jetbrains.annotations.NotNull;

public class iR extends ChannelDuplexHandler {
   @NotNull
   private ByteBuf a = ByteBufAllocator.DEFAULT.buffer(65536);
   private int b = 0;

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) {
      ByteBuf var4 = (ByteBuf)var2;

      try {
         ByteBuf var5 = ByteBufAllocator.DEFAULT.buffer(65536);
         int var6 = var4.readableBytes();
         var5.writeShort(var6);
         var5.writeBytes(var4);
         super.write(var1, var5, var3);
      } finally {
         var4.release();
      }

   }

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

      if (this.b != 0) {
         this.a.writeBytes(var3);
         var3.release();
         if (this.a.readableBytes() >= this.b) {
            super.channelRead(var1, this.a);
            this.a = ByteBufAllocator.DEFAULT.buffer(65536);
            this.b = 0;
         }

      } else {
         int var4 = var3.readShort() & '\uffff';
         if (var3.readableBytes() < var4) {
            this.b = var4;
            this.a.writeBytes(var3);
            var3.release();
         } else {
            super.channelRead(var1, var3);
         }
      }
   }
}
