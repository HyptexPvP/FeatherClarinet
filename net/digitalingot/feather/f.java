package net.digitalingot.feather;

import java.io.File;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.config.ClientPreferences;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.util.CurrentServer;
import org.jetbrains.annotations.NotNull;

public interface f {
   @NotNull
   Browser a();

   @NotNull
   ConfigManager b();

   @NotNull
   ClientPreferences c();

   @NotNull
   File d();

   @NotNull
   File e();

   @NotNull
   String f();

   void a(@NotNull CurrentServer var1);

   @NotNull
   CurrentServer g();
}
