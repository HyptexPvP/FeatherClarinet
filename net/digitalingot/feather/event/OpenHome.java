package net.digitalingot.feather.event;

import net.digitalingot.feather.e;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.browserEvent.OpenHomePage;
import net.digitalingot.feather.browserEvent.PageCloseEvent;

public class OpenHome {
   public static void a(boolean var0) {
      Object var1 = var0 ? new OpenHomePage() : new PageCloseEvent();
      e.c().a().b((BrowserEvent)var1);
   }
}
