package net.digitalingot.feather.browserEvent;

import java.util.Optional;
import java.util.function.Consumer;
import net.digitalingot.feather.de;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.mods.Waypoints;
import org.jetbrains.annotations.NotNull;

public class WaypointEvent implements GuiBrowser<de, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final Waypoints a;

   public WaypointEvent(@NotNull Waypoints var1) {
      this.a = var1;
   }

   public void a(de var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      String var4 = var1.b();
      Optional var5 = this.a.d().stream().filter(var1x -> var1x.a().equals(var4)).findAny();
      if (!var5.isPresent()) {
         var3.accept(new BrowserNotification("Waypoint not found"));
      } else {
         this.a.b((WaypointConfig)var5.get());
         var2.accept(new SelectModProfileEvent("success"));
      }
   }
}
