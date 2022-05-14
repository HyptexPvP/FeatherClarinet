package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.GuiBrowser;

public class CreateModProfile implements GuiBrowser<CreateNewProfile, SelectModProfileEvent, BrowserNotification> {
   public void a(CreateNewProfile var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ConfigManager var4 = e.c().b();
      var4.getProfiler().d().b(var1.b());
      var2.accept(new SelectModProfileEvent("success"));
   }
}
