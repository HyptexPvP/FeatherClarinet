package net.digitalingot.feather.gui;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.util.ChromaColor;
import org.jetbrains.annotations.NotNull;

public class WaypointsMenu implements BrowserEvent {
   @SerializedName("create")
   private final boolean a;
   @SerializedName("nextFields")
   @NotNull
   private final WaypointsMenu.a b;

   public WaypointsMenu(boolean var1, @NotNull WaypointsMenu.a var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean b() {
      return this.a;
   }

   @NotNull
   public WaypointsMenu.a c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.OPEN_WAYPOINTS_MENU;
   }

   public static class a {
      @SerializedName("location")
      @NotNull
      private final WaypointConfig.a a;
      @SerializedName("color")
      @NotNull
      private final ChromaColor b;

      public a(@NotNull WaypointConfig.a var1, @NotNull ChromaColor var2) {
         this.a = var1;
         this.b = var2;
      }

      @NotNull
      public WaypointConfig.a a() {
         return this.a;
      }

      @NotNull
      public ChromaColor b() {
         return this.b;
      }
   }
}
