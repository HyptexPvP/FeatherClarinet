package net.digitalingot.feather.voice;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.gQ;
import org.jetbrains.annotations.NotNull;

public class VoiceError extends ChannelInboundHandlerAdapter {
   @NotNull
   private final VoiceAuthenticator voiceAuth;

   public VoiceError(@NotNull VoiceAuthenticator var1) {
      this.voiceAuth = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      gQ.c.d var3 = (gQ.c.d)var2;
      if (var3.a().a() != gQ.c.c.d.AUTH_SUCCESSFUL) {
         FeatherLogger.a.error("received packet type {} while still unauthenticated", new Object[]{var3.a()});
      } else {
         gQ.a.c var4 = var3.a().d();
         int var5 = var4.a();
         this.voiceAuth.onAuthentication(var5);
      }
   }
}
