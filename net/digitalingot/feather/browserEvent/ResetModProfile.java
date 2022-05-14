package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import net.digitalingot.feather.settings.BuildModProfile;

public class ResetModProfile implements GuiBrowser<ResetModSettings, SelectModProfileEvent, BrowserNotification> {
   public void a(ResetModSettings var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ConfigManager var4 = e.c().b();

      for(ModsConfig var6 : var1.b()) {
         Mod var7 = var4.a(var6);
         dn var8 = var7.l().b();
         if (var8.e().a().isEmpty()) {
            var4.a(var7);
         }
      }

      BuildModProfile.a(var4);
      var2.accept(new SelectModProfileEvent("success"));
   }
}
