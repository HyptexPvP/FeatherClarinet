package net.digitalingot.feather;

import io.netty.channel.Channel;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class gH {
   @NotNull
   protected final Channel a;

   public gH(@NotNull Channel var1) {
      this.a = var1;
   }

   protected void a(MessageBuilder var1) {
      this.a.eventLoop().submit(() -> this.a.writeAndFlush(var1));
   }

   @NotNull
   public Channel c() {
      return this.a;
   }
}
