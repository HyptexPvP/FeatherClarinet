package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.nio.ByteBuffer;
import org.capnproto.ArrayInputStream;
import org.capnproto.ArrayOutputStream;
import org.capnproto.MessageBuilder;
import org.capnproto.MessageReader;
import org.capnproto.SerializePacked;

public class iP extends ChannelDuplexHandler {
   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) {
      ByteBuffer var4 = ByteBuffer.allocate(65536);
      MessageBuilder var5 = (MessageBuilder)var2;
      ArrayOutputStream var6 = new ArrayOutputStream(var4);
      SerializePacked.write(var6, var5);
      int var7 = var6.getWriteBuffer().position();
      var4.limit(var7);
      ByteBuf var8 = Unpooled.wrappedBuffer(var4);
      var1.write(var8, var3);
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

      try {
         MessageReader var4 = SerializePacked.read(new ArrayInputStream(var3.nioBuffer()));
         var1.fireChannelRead(var4);
      } finally {
         var3.release();
      }

   }
}
