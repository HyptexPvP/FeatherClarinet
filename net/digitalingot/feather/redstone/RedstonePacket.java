package net.digitalingot.feather.redstone;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.hE;
import net.digitalingot.feather.hG;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.in;
import net.digitalingot.feather.browserEvent.PeerToPeerEvent;
import net.digitalingot.feather.cosmetic.CosmeticPlayer;
import org.capnproto.StructList.Reader;
import org.jetbrains.annotations.NotNull;

public class RedstonePacket extends ChannelInboundHandlerAdapter {
   @NotNull
   private final ht b;

   public RedstonePacket(@NotNull ht var1) {
      this.b = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      hE.n.d var3 = (hE.n.d)var2;
      hE.n.c.c var4 = var3.a();
      switch(var4.a()) {
         case AUTHENTICATION_SUCCESS:
            FeatherLogger.a.error("Received authentication successful packet on Redstone while already authenticated.");
            break;
         case SOFT_ERROR:
            hE.m.c var5 = var4.f();
            String var6 = var5.b().toString();
            this.b.e().d().a(var6);
            break;
         case EMOTE_UPDATE:
            hE.d.c var22 = var4.i();
            UUID var27 = in.a(var22.b().toArray());
            String var32 = var22.d().toString();
            this.b.e().e().a(var27, var32);
            break;
         case OPTION_REFRESH_PROMPT:
            hE.e.c var21 = var4.l();
            UUID var26 = in.a(var21.b().toArray());
            ht var31 = this.b.e().c();

            assert var31 != null;

            HashSet var36 = new HashSet(1);
            var36.add(var26);
            var31.a(var36);
            break;
         case BULK_OPTION_RESPONSE:
            hE.a.d var20 = var4.o();

            for(hE.a.c.e var35 : var20.b()) {
               UUID var39 = in.a(var35.b().toArray());
               hE.a.c.b.c var42 = var35.c();
               this.b.e().b().put(var39, var42);
            }
            break;
         case COSMETIC_SET:
            hE.c.d var19 = var4.r();
            Reader var24 = var19.b();
            ArrayList var29 = new ArrayList(var24.size());

            for(hE.c.b.c var38 : var24) {
               UUID var41 = in.a(var38.b().toArray());
               org.capnproto.TextList.Reader var44 = var38.d();
               ArrayList var46 = new ArrayList(var44.size());

               for(org.capnproto.Text.Reader var52 : var44) {
                  var46.add(var52.toString());
               }

               var29.add(new CosmeticPlayer(var41, var46));
            }

            this.b.e().e().a(var29);
            break;
         case COSMETIC_OWNED:
            hE.b.c var18 = var4.u();
            org.capnproto.TextList.Reader var23 = var18.b();
            ArrayList var28 = new ArrayList(var23.size());

            for(org.capnproto.Text.Reader var37 : var23) {
               var28.add(var37.toString());
            }

            this.b.e().e().b(var28);
            break;
         case PARTY_INFO:
            hE.h.c var7 = var4.x();
            UUID var8 = in.a(var7.b().toArray());
            hG.b var9 = var7.e();
            org.capnproto.DataList.Reader var10 = var7.d();
            ArrayList var11 = new ArrayList(var10.size());

            for(org.capnproto.Data.Reader var43 : var10) {
               UUID var45 = in.a(var43.toArray());
               var11.add(var45);
            }

            this.b.e().f().a(var8, var11, var9);
            break;
         case PARTY_INVITE:
            hE.i.c var12 = var4.A();
            int var13 = var12.a();
            UUID var14 = in.a(var12.c().toArray());
            this.b.e().f().a(var13, var14);
            break;
         case PARTY_INVITE_DENIED:
            hE.j.c var48 = var4.D();
            UUID var51 = in.a(var48.b().toArray());
            this.b.e().f().a(var51);
            break;
         case PARTY_LEAVE:
            this.b.e().f().a();
            break;
         case P2P_JOIN_REQUEST:
            hE.g.c var47 = var4.J();
            UUID var50 = in.a(var47.b().toArray());
            PeerToPeerEvent.a var53 = this.a(var47.d());
            this.b.e().g().a(var50, var53);
            break;
         case P2P_JOIN_ACCEPTED:
            hE.f.c var15 = var4.M();
            UUID var16 = in.a(var15.b().toArray());
            PeerToPeerEvent.a var17 = this.a(var15.d());
            this.b.e().g().b(var16, var17);
      }

   }

   private PeerToPeerEvent.a a(@NotNull hG.a.c var1) {
      String var2 = var1.b().toString();
      String[] var3 = var2.split(":", 2);
      String var4 = var3[0];
      int var5 = Integer.parseInt(var3[1]);
      InetSocketAddress var6 = new InetSocketAddress(var4, var5);
      byte[] var7 = var1.d().toArray();
      return new PeerToPeerEvent.a(var6, var7);
   }
}
