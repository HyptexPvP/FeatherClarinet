package net.digitalingot.feather.util;

import java.util.function.Consumer;
import net.digitalingot.feather.eO;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.browserEvent.CreateUpdateMacro;
import net.digitalingot.feather.browserEvent.SelectModProfileEvent;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.mods.AutoText;
import org.jetbrains.annotations.NotNull;

public class Macro implements GuiBrowser<CreateUpdateMacro, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final AutoText a;

   public Macro(@NotNull AutoText var1) {
      this.a = var1;
   }

   public void a(CreateUpdateMacro var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      eO var4 = var1.c();
      if (var1.b() != null) {
         eO var5 = (eO)this.a.a().stream().filter(var1x -> var1x.b().equals(var1.b())).findAny().orElse(null);
         if (var5 == null) {
            throw new IllegalArgumentException("Macro not found");
         }

         var5.a(var4.b());
         var5.b(var4.c());
         var5.a(var4.d());
      } else {
         this.a.a(var4);
      }

      var2.accept(new SelectModProfileEvent("success"));
   }
}
