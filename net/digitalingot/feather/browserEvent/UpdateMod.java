package net.digitalingot.feather.browserEvent;

import java.util.Map;
import java.util.function.Consumer;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ClientPreferences;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.config.FavoriteMods;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class UpdateMod implements GuiBrowser<UpdateModSettings, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final ClientPreferences a;

   public UpdateMod(@NotNull ClientPreferences var1) {
      this.a = var1;
   }

   public void a(UpdateModSettings var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      ModsConfig var4 = var1.b();
      ConfigManager var5 = e.c().b();
      Mod var6 = var5.a(var4);
      HUD var7 = var6.k();
      if (var1.c() != null) {
         var7.g = var1.c();
      }

      if (var1.d() != null) {
         FavoriteMods var8 = this.a.b().a();
         var7.h = var1.d();
         if (var1.d()) {
            var8.c().remove(var1.b().getSlug());
         } else {
            var8.c().add(var1.b().getSlug());
         }

         this.a.a();
      }

      Map var9 = var1.e();
      if (var9 != null) {
         var5.a(var6, var9);
      }

      var5.d(var6);
      var2.accept(new SelectModProfileEvent("success"));
   }
}
