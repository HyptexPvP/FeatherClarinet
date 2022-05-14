package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.da;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.e;
import net.digitalingot.feather.et;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;

public class ResetSideBarSettings implements GuiBrowser<da, SelectModProfileEvent, BrowserNotification> {
   public void a(da var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ConfigManager var4 = e.c().b();

      for(ModsConfig var6 : var1.b()) {
         Mod var7 = var4.a(var6);
         dn var8 = var7.l().b();
         if (!var8.e().a().isEmpty()) {
            var4.a(var7);
         }
      }

      et.a(var4);
      var2.accept(new SelectModProfileEvent("success"));
   }
}
