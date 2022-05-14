package net.digitalingot.feather;

import io.netty.channel.Channel;
import java.util.Objects;
import net.digitalingot.feather.voice.Voice;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class gM {
   @NotNull
   private final Voice b;
   @NotNull
   private final Channel c;
   private final boolean d;
   private long e;

   public gM(@NotNull Voice var1, @NotNull Channel var2, boolean var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public void a(byte[] var1, @NotNull gT.c var2) {
      if (!this.d) {
         throw new IllegalArgumentException("sendSpeech() only allowed on the master connection");
      } else {
         MessageBuilder var3 = new MessageBuilder();
         gS.b.a var4 = (gS.b.a)var3.initRoot(gS.b.b);

         assert this.b.l() != null;

         var4.a(this.b.l().b());
         var4.a(var2);
         var4.a(++this.e);
         var4.a(var1);
         this.a(var3);
      }
   }

   public void a() {
      MessageBuilder var1 = new MessageBuilder();
      gS.b.a var2 = (gS.b.a)var1.initRoot(gS.b.b);

      assert this.b.l() != null;

      var2.a(this.b.l().b());
      this.a(var1);
   }

   private void a(MessageBuilder var1) {
      this.c.eventLoop().submit(() -> this.c.writeAndFlush(var1));
   }

   public boolean b() {
      return this.d;
   }

   @NotNull
   public Channel c() {
      return this.c;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         gM var2 = (gM)var1;
         return this.c.equals(var2.c);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.c});
   }
}
