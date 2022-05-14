package net.digitalingot.feather;

import io.netty.channel.Channel;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import net.digitalingot.feather.browserEvent.PeerToPeerEvent;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.redstone.RedstoneManager;
import org.capnproto.MessageBuilder;
import org.capnproto.Void;
import org.capnproto.Data.Reader;
import org.capnproto.DataList.Builder;
import org.jetbrains.annotations.NotNull;

public class ht extends hu {
   @NotNull
   private List<UUID> c = new ArrayList();

   ht(@NotNull Channel var1, @NotNull RedstoneManager var2) {
      super(var1, var2);
   }

   public void a(Consumer<hF.f.e.a> var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.f.e.a var3 = this.a(var2).h().c().e();
      var1.accept(var3);
      this.b(var2);
   }

   public void a(@NotNull String var1, short var2) {
      MessageBuilder var3 = new MessageBuilder();
      hF.f.d.a var4 = this.a(var3).h().c().h();
      var4.a(var1);
      var4.a(var2);
      this.b(var3);
   }

   public void a() {
      MessageBuilder var1 = new MessageBuilder();
      this.a(var1).h().c().a(Void.VOID);
      this.b(var1);
   }

   public void b() {
      MessageBuilder var1 = new MessageBuilder();
      this.a(var1).k().c().a(Void.VOID);
      this.c.clear();
      this.b(var1);
   }

   public void a(@NotNull List<UUID> var1, @NotNull Set<UUID> var2) {
      ArrayList var3 = new ArrayList(var1);
      var3.removeAll(this.c);
      ArrayList var4 = new ArrayList(this.c);
      var4.removeAll(var1);
      if (!var4.isEmpty() || !var3.isEmpty()) {
         if (!var3.isEmpty()) {
            ArrayList var5 = new ArrayList(var3);
            var5.removeAll(var2);
            if (!var2.isEmpty()) {
               this.b(var5);
            }
         }

         MessageBuilder var14 = new MessageBuilder();
         hF.q.c.a var6 = this.a(var14);
         hF.p.a var7 = var6.k();
         hF.p.e.a var8 = var7.c();
         hF.p.c.a var9 = var8.e();
         Builder var10 = var9.a(var3.size());

         for(int var11 = 0; var11 < var3.size(); ++var11) {
            UUID var12 = (UUID)var3.get(var11);
            var10.set(var11, new Reader(in.a(var12)));
         }

         Builder var15 = var9.b(var4.size());

         for(int var16 = 0; var16 < var4.size(); ++var16) {
            UUID var13 = (UUID)var4.get(var16);
            var15.set(var16, new Reader(in.a(var13)));
         }

         this.c = var1;
         this.b(var14);
      }
   }

   public void a(@NotNull Set<UUID> var1) {
      this.b.b().keySet().removeIf(var1x -> !var1.contains(var1x));
      var1.removeAll(this.b.b().keySet());
      if (!var1.isEmpty()) {
         MessageBuilder var2 = new MessageBuilder();
         hF.q.c.a var3 = this.a(var2);
         hF.a.a var4 = var3.n();
         Builder var5 = var4.a(var1.size());
         int var6 = 0;

         for(UUID var8 : var1) {
            var5.set(var6, new Reader(in.a(var8)));
            ++var6;
         }

         this.b(var2);
      }
   }

   public void a(@NotNull List<Cosmetic> var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.c.a var4 = var3.t();
      org.capnproto.TextList.Builder var5 = var4.a(var1.size());

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         Cosmetic var7 = (Cosmetic)var1.get(var6);
         String var8 = var7.b();
         var5.set(var6, new org.capnproto.Text.Reader(var8));
      }

      this.b(var2);
   }

   public void b(@NotNull List<UUID> var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.b.a var4 = var3.q();
      Builder var5 = var4.a(var1.size());

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         UUID var7 = (UUID)var1.get(var6);
         var5.set(var6, new Reader(in.a(var7)));
      }

      this.b(var2);
   }

   public void a(@NotNull t var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.d.a var4 = var3.w();
      var4.a(var1.a());
      this.b(var2);
   }

   public void c() {
      MessageBuilder var1 = new MessageBuilder();
      hF.q.c.a var2 = this.a(var1);
      var2.z();
      this.b(var1);
   }

   public void a(@NotNull UUID var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.m.a var4 = var3.C();
      var4.a(in.a(var1));
      this.b(var2);
   }

   public void b(@NotNull UUID var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.j.a var4 = var3.F();
      var4.a(in.a(var1));
      this.b(var2);
   }

   public void a(int var1, boolean var2) {
      MessageBuilder var3 = new MessageBuilder();
      hF.q.c.a var4 = this.a(var3);
      hF.k.a var5 = var4.I();
      var5.a(var1);
      var5.a(var2);
      this.b(var3);
   }

   public void d() {
      MessageBuilder var1 = new MessageBuilder();
      hF.q.c.a var2 = this.a(var1);
      var2.L().c().a(Void.VOID);
      this.b(var1);
   }

   public void c(@NotNull UUID var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      var3.L().c().a(in.a(var1));
      this.b(var2);
   }

   public void a(@NotNull hG.b var1) {
      MessageBuilder var2 = new MessageBuilder();
      hF.q.c.a var3 = this.a(var2);
      hF.n.a var4 = var3.O();
      hF.n.d.a var5 = var4.c();
      var5.a(var1);
      this.b(var2);
   }

   public void a(@NotNull UUID var1, @NotNull PeerToPeerEvent.a var2) {
      MessageBuilder var3 = new MessageBuilder();
      hF.q.c.a var4 = this.a(var3);
      hF.h.a var5 = var4.R();
      hG.a.a var6 = var5.e();
      this.a(var6, var2);
      var5.a(in.a(var1));
      this.b(var3);
   }

   public void b(@NotNull UUID var1, @NotNull PeerToPeerEvent.a var2) {
      MessageBuilder var3 = new MessageBuilder();
      hF.q.c.a var4 = this.a(var3);
      hF.g.a var5 = var4.U();
      hG.a.a var6 = var5.e();
      this.a(var6, var2);
      var5.a(in.a(var1));
      this.b(var3);
   }

   private void a(@NotNull hG.a.a var1, @NotNull PeerToPeerEvent.a var2) {
      InetSocketAddress var3 = var2.a();
      String var4 = var3.getAddress().getHostAddress() + ":" + var3.getPort();
      var1.a(var4);
      var1.a(var2.b());
   }
}
