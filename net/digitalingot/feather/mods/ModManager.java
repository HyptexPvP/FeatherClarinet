package net.digitalingot.feather.mods;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.feather.e;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.RenderEvent;
import net.digitalingot.feather.event.StateChangeEvent;
import net.digitalingot.feather.gui.HUDEdiorUI;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.Minecraft;

public enum ModManager {
   INSTANCE;

   private static final Minecraft minecraft = Minecraft.func_71410_x();
   private boolean init;
   private boolean needsUpdate;
   private HUDMod<? extends HUDPosition>[] enabledHudModules;

   private void onInit() {
      this.cacheHudMods();
      Events.a.a(var1 -> {
         if (var1 == Events.c.START) {
            this.onClientTick();
         }

      });
      StateChangeEvent.a.a((var1, var2) -> this.onModLoadedStateChanged(var1));
      RenderEvent.a.a(var1 -> this.onRender(HUDMod.a.HUD_OVERLAY, var1));
   }

   private void cacheHudMods() {
      List var1 = getEnabledHudModules();
      this.enabledHudModules = (HUDMod[])Array.newInstance(HUDMod.class, var1.size());
      var1.toArray(this.enabledHudModules);
   }

   private void onClientTick() {
      if (this.needsUpdate) {
         this.cacheHudMods();
         this.needsUpdate = false;
      }

   }

   private void onRender(HUDMod.a var1, MatrixUtils var2) {
      if (minecraft.field_71439_g != null) {
         if (!isModLayoutOpen() || var1 == HUDMod.a.MOD_LAYOUT) {
            if (!ReplayMod.c()) {
               for(HUDMod var6 : this.enabledHudModules) {
                  ModPosition var7 = var6.e();
                  var7.f();
                  var2.a();
                  var2.a((float)((HUDPosition)var6.b).e().getStartX(var6), (float)((HUDPosition)var6.b).i().getStartY(var6), 0.0F);
                  double var8 = ((HUDPosition)var6.b).h();
                  var2.b(var8, var8, 1.0);
                  var6.a(var1, var2);
                  var2.b();
                  var7.e();
               }

            }
         }
      }
   }

   private void onModLoadedStateChanged(Mod<?> var1) {
      if (var1 instanceof HUDMod) {
         this.needsUpdate = true;
      }

   }

   public void init() {
      Preconditions.checkState(!this.init);
      this.onInit();
      this.init = true;
   }

   private static boolean isModLayoutOpen() {
      return Minecraft.func_71410_x().field_71462_r instanceof HUDEdiorUI;
   }

   private static List<HUDMod<? extends HUDPosition>> getEnabledHudModules() {
      ConfigManager var0 = e.c().b();
      return (List<HUDMod<? extends HUDPosition>>)var0.f()
         .values()
         .stream()
         .filter(var0x -> var0x.m() && var0x.k().j())
         .filter(var0x -> var0x instanceof HUDMod)
         .map(var0x -> (HUDMod)var0x)
         .collect(Collectors.toList());
   }
}
