package net.digitalingot.feather;

import io.netty.channel.Channel;
import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.voice.Voice;
import org.capnproto.MessageBuilder;
import org.capnproto.Data.Reader;
import org.capnproto.DataList.Builder;
import org.jetbrains.annotations.NotNull;

public class gG extends gH {
   @NotNull
   private final Voice b;
   private final int c;

   public gG(@NotNull Voice var1, @NotNull Channel var2, int var3) {
      super(var2);
      this.b = var1;
      this.c = var3;
   }

   public void a() {
      gv var1 = this.b.f();
      MessageBuilder var2 = new MessageBuilder();
      gR.d.a var3 = (gR.d.a)var2.initRoot(gR.d.b);
      gR.b.a var4 = var3.c().h();
      var4.a(var1.d());
      List var5 = var1.e();
      Builder var6 = var4.a(var5.size());

      for(int var7 = 0; var7 < var5.size(); ++var7) {
         UUID var8 = (UUID)var5.get(var7);
         var6.set(var7, new Reader(in.a(var8)));
      }

      this.a(var2);
   }

   public int b() {
      return this.c;
   }
}
