package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class LoadWaypoints implements BrowserEvent {
   @SerializedName("waypoints")
   @NotNull
   private final List<WaypointConfig> a;

   public LoadWaypoints(@NotNull List<WaypointConfig> var1) {
      this.a = var1;
   }

   @NotNull
   public List<WaypointConfig> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_WAYPOINTS;
   }
}
