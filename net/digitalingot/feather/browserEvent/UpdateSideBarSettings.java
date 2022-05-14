package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.db;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;

public class UpdateSideBarSettings implements GuiBrowser<db, SelectModProfileEvent, BrowserNotification> {
   public void a(db var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ModsConfig var4 = var1.b();
      ConfigManager var5 = e.c().b();
      Mod var6 = var5.a(var4);
      var5.a(var6, var1.c());
      var5.d(var6);
      var2.accept(new SelectModProfileEvent("success"));
   }
}
