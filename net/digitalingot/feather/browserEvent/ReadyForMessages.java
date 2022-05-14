package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.browser.BrowserJavascript;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.gui.GuiBrowser;

public class ReadyForMessages implements GuiBrowser<ReadyForMessageEvent, SelectModProfileEvent, BrowserNotification> {
   public void a(ReadyForMessageEvent var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      BrowserJavascript.a();
   }
}
