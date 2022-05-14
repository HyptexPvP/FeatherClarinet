package net.digitalingot.feather.peertopeer;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.Locale;
import java.util.UUID;
import net.digitalingot.feather.e;
import net.digitalingot.feather.h;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.AcceptP2PJoin;
import net.digitalingot.feather.browserEvent.BrowserCall;
import net.digitalingot.feather.browserEvent.RequestP2PJoin;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class BrowserTest extends h {
   public BrowserTest() {
      super("feathertest", Collections.emptyList());
   }

   @Override
   public void a(@NotNull String[] var1) {
      String var2 = var1[0].toLowerCase(Locale.ROOT);
      String var3 = var1[1];
      Browser var4 = e.c().a();
      if (var2.equalsIgnoreCase("request")) {
         RequestP2PJoin var5 = new RequestP2PJoin(1, UUID.fromString(var3));
         JsonElement var6 = new Gson().toJsonTree(var5);
         var4.a(new BrowserCall(1, BrowserEvents.REQUEST_P2P_JOIN, var6, null, null), Browser.b.FRONTEND);
      } else if (var2.equalsIgnoreCase("accept")) {
         AcceptP2PJoin var7 = new AcceptP2PJoin(UUID.fromString(var3), 25565);
         JsonElement var8 = new Gson().toJsonTree(var7);
         var4.a(new BrowserCall(1, BrowserEvents.ACCEPT_P2P_JOIN, var8, null, null), Browser.b.FRONTEND);
      }

   }
}
