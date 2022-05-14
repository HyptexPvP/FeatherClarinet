package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import net.digitalingot.feather.redstone.RedstoneManager;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public abstract class hu {
   @NotNull
   protected final Channel a;
   @NotNull
   protected final RedstoneManager b;

   protected hu(@NotNull Channel var1, @NotNull RedstoneManager var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   protected hF.q.c.a a(MessageBuilder var1) {
      hF.q.a var2 = (hF.q.a)var1.initRoot(hF.q.b);
      return var2.c();
   }

   @NotNull
   public RedstoneManager e() {
      return this.b;
   }

   protected void b(MessageBuilder var1) {
      if (this.a.eventLoop().inEventLoop()) {
         this.a.writeAndFlush(var1).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.a.eventLoop().submit(() -> this.a.writeAndFlush(var1).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE));
      }

   }
}
