package net.digitalingot.feather.browserEvent;

import java.nio.file.Files;
import java.util.function.Consumer;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.profile.Profile;
import net.digitalingot.feather.profile.ProfileManager;

public class CloneProfile implements GuiBrowser<CloneModProfile, SelectModProfileEvent, BrowserNotification> {
   public void a(CloneModProfile var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ConfigManager var4 = e.c().b();
      ProfileManager var5 = var4.getProfiler().d();
      Profile var6 = new Profile(var5, var1.b());
      Profile var7 = new Profile(var5, var1.c());
      if (var7.b().exists()) {
         throw new IllegalArgumentException("Profile already exists");
      } else {
         Files.copy(var6.b().toPath(), var7.b().toPath());
         var2.accept(new SelectModProfileEvent("success"));
      }
   }
}
