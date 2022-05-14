package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.event.SelectEvent;
import net.digitalingot.feather.gui.GuiBrowser;

public class DoHUDSelection implements GuiBrowser<DoHUDSelection, SelectModProfileEvent, BrowserNotification> {
   public void a(DoHUDSelection var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      SelectEvent.a.a().select(var1.b());
   }
}
