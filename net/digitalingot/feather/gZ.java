package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.gui.WaypointsMenu;
import net.digitalingot.feather.mods.Waypoints;
import net.digitalingot.feather.util.ChromaColor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class gZ {
   public static void a(boolean var0, @NotNull Waypoints var1) {
      EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
      WaypointConfig.a var3 = new WaypointConfig.a(
         (int)Math.floor(var2.field_70169_q), (int)Math.floor(var2.field_70167_r), (int)Math.floor(var2.field_70166_s)
      );
      WaypointConfig var4 = null;

      for(WaypointConfig var6 : var1.d()) {
         var4 = var6;
      }

      ChromaColor var8 = var4 != null ? var4.c() : new ChromaColor(false, new Color(191, 0, 32, 223));
      WaypointsMenu.a var9 = new WaypointsMenu.a(var3, var8);
      WaypointsMenu var7 = new WaypointsMenu(var0, var9);
      e.c().a().b(var7);
   }
}
