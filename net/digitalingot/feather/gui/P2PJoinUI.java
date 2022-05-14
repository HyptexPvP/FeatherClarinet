package net.digitalingot.feather.gui;

import java.util.function.Consumer;
import net.digitalingot.feather.e;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.browserEvent.AcceptP2PJoin;
import net.digitalingot.feather.browserEvent.CallBack;
import net.digitalingot.feather.browserEvent.PeerToPeerEvent;
import net.digitalingot.feather.browserEvent.PrepareP2PEvent;
import net.digitalingot.feather.browserEvent.RequestP2PJoin;
import net.digitalingot.feather.peertopeer.P2PManager;
import net.digitalingot.feather.redstone.RedstoneManager;
import org.jetbrains.annotations.NotNull;

public class P2PJoinUI {
   public static class a implements GuiBrowser<AcceptP2PJoin, CallBack, BrowserNotification> {
      @NotNull
      private final P2PManager a;

      public a(@NotNull P2PManager var1) {
         this.a = var1;
      }

      public void a(AcceptP2PJoin var1, Consumer<CallBack> var2, Consumer<BrowserNotification> var3) {
         P2PManager.a var4 = new P2PManager.a(System.currentTimeMillis(), var1.c());
         this.a.d().put(var1.b(), var4);
      }
   }

   public static class b implements GuiBrowser<RequestP2PJoin, CallBack, BrowserNotification> {
      @NotNull
      private final P2PManager a;

      public b(@NotNull P2PManager var1) {
         this.a = var1;
      }

      public void a(final RequestP2PJoin var1, Consumer<CallBack> var2, Consumer<BrowserNotification> var3) {
         P2PManager.b var4 = new P2PManager.b(var1.b(), System.currentTimeMillis());
         this.a.c().put(var1.c(), var4);
         RedstoneManager var5 = this.a.e();
         final ht var6 = var5 != null ? var5.c() : null;
         if (var6 == null) {
            var3.accept(new BrowserNotification("redstone connection not established"));
         } else {
            Browser var7 = e.c().a();
            var7.a(new PrepareP2PEvent(), new Consumer<PeerToPeerEvent>() {
               public void a(PeerToPeerEvent var1x) {
                  PeerToPeerEvent.a var2 = var1x.c();
                  var6.a(var1.c(), var2);
               }
            }, var3);
         }
      }
   }
}
