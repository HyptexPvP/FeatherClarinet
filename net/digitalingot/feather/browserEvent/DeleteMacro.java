package net.digitalingot.feather.browserEvent;

import java.util.Optional;
import java.util.function.Consumer;
import net.digitalingot.feather.eO;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.mods.AutoText;
import org.jetbrains.annotations.NotNull;

public class DeleteMacro implements GuiBrowser<DeleteMarco, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final AutoText a;

   public DeleteMacro(@NotNull AutoText var1) {
      this.a = var1;
   }

   public void a(DeleteMarco var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      String var4 = var1.b();
      Optional var5 = this.a.a().stream().filter(var1x -> var1x.b().equals(var4)).findAny();
      if (!var5.isPresent()) {
         var3.accept(new BrowserNotification("Macro not found"));
      } else {
         this.a.b((eO)var5.get());
         var2.accept(new SelectModProfileEvent("success"));
      }
   }
}
