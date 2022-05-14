package net.digitalingot.feather.voice;

import io.netty.channel.Channel;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.gG;
import net.digitalingot.feather.gH;
import net.digitalingot.feather.gR;
import net.digitalingot.feather.voice.packet.VoicePacketError;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class VoiceAuthenticator extends gH {
   @NotNull
   private final Voice b;

   public VoiceAuthenticator(@NotNull Channel var1, @NotNull Voice var2) {
      super(var1);
      this.b = var2;
   }

   public void authenticate(@NotNull String var1) {
      FeatherLogger.a.debug("Authenticating with voice backend...");
      MessageBuilder var2 = new MessageBuilder();
      gR.d.a var3 = (gR.d.a)var2.initRoot(gR.d.b);
      gR.a.a var4 = var3.c().e();
      var4.a(var1);
      this.a(var2);
   }

   public void onAuthentication(int var1) {
      FeatherLogger.a.info("Authenticated with voice backend");
      gG var2 = new gG(this.b, this.a, var1);
      this.b.a(var2);
      this.a.pipeline().replace("unauthenticatedHandler", "authenticatedHandler", new VoicePacketError(var2));
      this.b.e().schedule(this.b::b, 3L, TimeUnit.SECONDS);
      this.b.i().a();
      var2.a();
   }
}
