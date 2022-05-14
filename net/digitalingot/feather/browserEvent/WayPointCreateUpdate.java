package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WayPointCreateUpdate implements BrowserEvent {
   @SerializedName("waypoint")
   @Nullable
   private final String a;
   @SerializedName("payload")
   @NotNull
   private final WaypointConfig b;

   public WayPointCreateUpdate(@Nullable String var1, @NotNull WaypointConfig var2) {
      this.a = var1;
      this.b = var2;
   }

   @Nullable
   public String b() {
      return this.a;
   }

   @NotNull
   public WaypointConfig c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CREATE_UPDATE_WAYPOINT;
   }
}
