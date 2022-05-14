package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.profile.Profile;
import net.digitalingot.feather.profile.ProfileManager;

public class RenameModProfile implements GuiBrowser<renameProfileEvent, SelectModProfileEvent, BrowserNotification> {
   public void a(renameProfileEvent var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ConfigManager var4 = e.c().b();
      ProfileManager var5 = var4.getProfiler().d();
      Profile var6 = new Profile(var5, var1.b());
      Profile var7 = new Profile(var5, var1.c());
      var6.b().renameTo(var7.b());
      if (var5.b().a().equals(var1.b())) {
         var5.b(var1.c());
      }

      var2.accept(new SelectModProfileEvent("success"));
   }
}
