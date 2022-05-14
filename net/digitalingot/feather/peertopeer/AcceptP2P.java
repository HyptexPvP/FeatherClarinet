package net.digitalingot.feather.peertopeer;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.e;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.PeerToPeerEvent;
import net.digitalingot.feather.browserEvent.PrepareP2PEvent;
import net.digitalingot.feather.browserEvent.PunchHoleEvent;
import net.digitalingot.feather.redstone.RedstoneManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.util.ChatComponentText;
import org.jetbrains.annotations.NotNull;

public class AcceptP2P implements PeerToPeer {
   @NotNull
   private final P2PManager a;

   public AcceptP2P(@NotNull P2PManager var1) {
      this.a = var1;
   }

   @Override
   public void a(@NotNull final UUID var1, @NotNull final PeerToPeerEvent.a var2) {
      final P2PManager.a var3 = (P2PManager.a)this.a.d().remove(var1);
      if (var3 != null && var3.a() - TimeUnit.MINUTES.toMillis(10L) <= System.currentTimeMillis()) {
         final Browser var4 = e.c().a();
         var4.a(new PrepareP2PEvent(), new Consumer<PeerToPeerEvent>() {
            public void a(PeerToPeerEvent var1x) {
               RedstoneManager var2x = AcceptP2P.this.a.e();
               if (var2x != null) {
                  ht var3x = var2x.c();
                  if (var3x != null) {
                     final int var4x = var1x.b();
                     var3x.b(var1, var1x.c());
                     PunchHoleEvent var5 = new PunchHoleEvent(var4x, var3.b(), var2.a(), var2.b());
                     var4.a(var5, new Consumer<P2PPortCallBack>() {
                        public void a(P2PPortCallBack var1x) {
                           AcceptP2P.this.a.b().add(var4x);
                        }
                     }, null);
                  }
               }
            }
         }, null);
      } else {
         FeatherLogger.a.error("Received P2P Join Request from {} while it was never accepted or the request has timed out", new Object[]{var1});
      }
   }

   @Override
   public void b(@NotNull UUID var1, @NotNull PeerToPeerEvent.a var2) {
      final P2PManager.b var3 = (P2PManager.b)this.a.c().remove(var1);
      if (var3 != null && var3.b() - TimeUnit.MINUTES.toMillis(10L) <= System.currentTimeMillis()) {
         PunchHoleEvent var4 = new PunchHoleEvent(var3.a(), null, var2.a(), var2.b());
         e.c().a().a(var4, new Consumer<P2PPortCallBack>() {
            public void a(P2PPortCallBack var1) {
               Integer var2 = var1.b();
               if (var2 == null) {
                  throw new NullPointerException("Client port not expected to be null when accepting P2P Join without providing server port");
               } else {
                  AcceptP2P.this.a.b().add(var3.a());
                  FeatherLogger.a.info("Created local P2P tunnel - port to connect to: {}", new Object[]{var2});
                  Minecraft var3x = Minecraft.func_71410_x();
                  NetHandlerPlayClient var4 = var3x.func_147114_u();
                  if (var4 != null) {
                     var4.func_147298_b().func_150718_a(new ChatComponentText(""));
                  }

                  GuiConnecting var5 = new GuiConnecting(new GuiMainMenu(), var3x, "127.0.0.1", var2);
                  var3x.func_147108_a(var5);
               }
            }
         }, null);
      } else {
         FeatherLogger.a.error("Received P2P Join Accepted from {} while it was never requested or the request has timed out", new Object[]{var1});
      }
   }
}
