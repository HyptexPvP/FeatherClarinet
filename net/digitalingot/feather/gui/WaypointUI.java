package net.digitalingot.feather.gui;

import java.util.function.Consumer;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.browserEvent.SelectModProfileEvent;
import net.digitalingot.feather.browserEvent.WayPointCreateUpdate;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.mods.Waypoints;
import org.jetbrains.annotations.NotNull;

public class WaypointUI implements GuiBrowser<WayPointCreateUpdate, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final Waypoints a;

   public WaypointUI(@NotNull Waypoints var1) {
      this.a = var1;
   }

   public void a(WayPointCreateUpdate var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      WaypointConfig var4 = var1.c();
      if (var1.b() != null) {
         WaypointConfig var5 = (WaypointConfig)this.a.d().stream().filter(var1x -> var1x.a().equals(var1.b())).findAny().orElse(null);
         if (var5 == null) {
            throw new IllegalArgumentException("Waypoint not found");
         }

         var5.a(var4.a());
         var5.a(var4.b());
         var5.a(var4.c());
         var5.a(var4.f());
         var5.b(this.a.c());
         var5.c(this.a.b());
      } else {
         var4.b(this.a.c());
         var4.c(this.a.b());
         this.a.a(var4);
      }

      var2.accept(new SelectModProfileEvent("success"));
   }
}
