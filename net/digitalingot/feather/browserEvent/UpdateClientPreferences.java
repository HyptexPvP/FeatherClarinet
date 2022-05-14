package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.cg;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.ClientPreferences;
import net.digitalingot.feather.config.FavoriteMods;
import net.digitalingot.feather.gui.GuiBrowser;
import org.jetbrains.annotations.NotNull;

public class UpdateClientPreferences implements GuiBrowser<cg, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final ClientPreferences a;

   public UpdateClientPreferences(@NotNull ClientPreferences var1) {
      this.a = var1;
   }

   public void a(cg var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      FavoriteMods var4 = var1.c();
      if (var4 != null) {
         FavoriteMods var5 = this.a.b().a();
         if (var4.a() != null) {
            var5.a(var4.a());
         }

         if (var4.b() != null) {
            var5.b(var4.b());
         }
      }

      newProfileEvent var7 = var1.b();
      if (var7 != null) {
         newProfileEvent var6 = this.a.b().b();
         if (var7.b() != null) {
            var6.b(var7.b());
         }

         if (var7.a() != null) {
            var6.a(var7.a());
         }
      }

      this.a.a();
      var2.accept(new SelectModProfileEvent("success"));
   }
}
