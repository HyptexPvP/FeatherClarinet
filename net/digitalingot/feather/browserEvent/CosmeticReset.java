package net.digitalingot.feather.browserEvent;

import com.google.gson.JsonElement;
import java.util.function.Consumer;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.Config;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.cosmetic.CosmeticAPI;
import net.digitalingot.feather.gui.GuiBrowser;
import org.jetbrains.annotations.NotNull;

public class CosmeticReset implements GuiBrowser<ResetCosmeticsSettingEvent, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final CosmeticAPI a;

   public CosmeticReset(@NotNull CosmeticAPI var1) {
      this.a = var1;
   }

   public void a(ResetCosmeticsSettingEvent var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      for(String var5 : var1.b()) {
         Cosmetic var6 = this.a.b(var5);
         if (var6 == null) {
            throw new IllegalArgumentException("Cosmetic with specified slug \"" + var5 + "\" not found");
         }

         JsonElement var7 = var6.f();
         if (var7 != null) {
            Config var8 = (Config)Browser.a.fromJson(var6.f(), Config.class);
            this.a.f().b().put(var5, var8);
         }
      }

      this.a.f().a();
      var2.accept(new SelectModProfileEvent("success"));
   }
}
