package net.digitalingot.feather.mods;

import com.google.common.reflect.TypeToken;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.dy;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.gY;
import net.digitalingot.feather.gZ;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.is;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.WaypointEvent;
import net.digitalingot.feather.config.WaypointConfig;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.event.JoinLevelEvent;
import net.digitalingot.feather.event.RenderEVent;
import net.digitalingot.feather.event.SelectEvent;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.gui.WaypointUI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.WorldClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FeatherModule(
   a = ModsConfig.WAYPOINTS,
   b = @dn(
   a = "Waypoints",
   b = "https://assets.feathercdn.net/game/mods/waypoints.svg",
   c = "",
   d = {}
)
)
public class Waypoints extends Mod<Waypoints.a> {
   private File a;
   @NotNull
   private final Set<WaypointConfig> c = new LinkedHashSet();
   @NotNull
   private final List<WaypointConfig> d = new ArrayList();

   @Override
   public void f() {
      Browser var1 = e.c().a();
      var1.a(BrowserEvents.CREATE_UPDATE_WAYPOINT, new WaypointUI(this));
      var1.a(BrowserEvents.DELETE_WAYPOINT, new WaypointEvent(this));
      RenderEVent.c.a((var1x, var2) -> {
         if (this.m()) {
            ;
         }
      });
      FeatherGUI.b.a((var1x, var2, var3, var4) -> {
         if (this.m()) {
            if (Minecraft.func_71410_x().field_71439_g != null) {
               if (this.b.b.b()) {
                  BrowserUtils.INSTANCE.show();
                  gZ.a(true, this);
               } else if (this.b.c.b()) {
                  BrowserUtils.INSTANCE.show();
                  gZ.a(false, this);
               }

            }
         }
      });
      SelectEvent.a.a(var1x -> {
         if (this.m()) {
            if (var1x.equals(ModsConfig.WAYPOINTS.getSlug())) {
               BrowserUtils.INSTANCE.show();
               gZ.a(false, this);
            }

         }
      });
      JoinLevelEvent.a.a((var1x, var2) -> {
         if (this.m()) {
            if (var1x == Minecraft.func_71410_x().field_71439_g) {
               this.a();
               gY.a(this.d);
            }

         }
      });
   }

   @Override
   public void g() {
      this.a = new File(e.c().e(), "waypoints.json");
      if (this.a.exists()) {
         Set var1 = hP.a(this.a).a((new TypeToken<LinkedHashSet<WaypointConfig>>() {
         }).getType());
         this.c.addAll(var1);
      }

      EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
      if (var2 != null && var2.field_70170_p != null) {
         this.a();
         gY.a(this.d);
      }

   }

   @Override
   public void h() {
      this.c.clear();
      this.d.clear();
   }

   public void a() {
      this.d.clear();

      for(WaypointConfig var2 : this.c) {
         if (var2.a(this)) {
            this.d.add(var2);
         }
      }

   }

   public void a(@NotNull WaypointConfig var1) {
      this.c.remove(var1);
      this.c.add(var1);
      this.a();
      this.o();
   }

   public void b(@NotNull WaypointConfig var1) {
      this.c.remove(var1);
      this.a();
      this.o();
   }

   private void o() {
      this.a.getParentFile().mkdirs();
      hP.a(this.a).b_().a(this.c);
   }

   @Nullable
   public String b() {
      WorldClient var1 = Minecraft.func_71410_x().field_71441_e;
      return var1 == null ? null : var1.field_73011_w.func_80007_l();
   }

   @Nullable
   public String c() {
      if (Minecraft.func_71410_x().func_71356_B()) {
         return null;
      } else {
         ServerData var1 = Minecraft.func_71410_x().func_147104_D();
         return var1 == null ? null : var1.field_78845_b;
      }
   }

   @NotNull
   public Set<WaypointConfig> d() {
      return this.c;
   }

   @NotNull
   public List<WaypointConfig> e() {
      return this.d;
   }

   @dt(
      b = @dy(
   a = "waypoints",
   b = "Waypoints",
   c = "https://assets.feathercdn.net/game/hudselection/waypoints.svg",
   d = 0
)
   )
   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Key Settings");
      @ModConfigAnnotation(
         a = "waypointCreateKey",
         b = "Create Waypoint",
         c = "59",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public is b;
      @ModConfigAnnotation(
         a = "waypointMenuKey",
         b = "Menu",
         c = "192",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public is c;
   }
}
