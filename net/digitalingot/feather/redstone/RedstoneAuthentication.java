package net.digitalingot.feather.redstone;

import io.netty.channel.Channel;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.hF;
import net.digitalingot.feather.hr;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.hu;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class RedstoneAuthentication extends hu {
   public RedstoneAuthentication(@NotNull Channel var1, @NotNull RedstoneManager var2) {
      super(var1, var2);
   }

   public void a(@NotNull String var1) {
      FeatherLogger.a.info("Authenticating with Redstone...");
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.e.a var4 = var3.e();
      var4.a(var1);
      this.b(var2);
   }

   public void authenticate() {
      FeatherLogger.a.info("Authenticated with Redstone");
      ht var1 = new ht(this.a, this.b);
      this.b.a(var1);
      this.a.pipeline().replace("unauthenticatedHandler", "authenticatedHandler", new RedstonePacket(var1));
      hr.a(var1);
   }
}
