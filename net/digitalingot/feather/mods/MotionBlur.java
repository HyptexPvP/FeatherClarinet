package net.digitalingot.feather.mods;

import net.digitalingot.feather.dn;
import net.digitalingot.feather.gh;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mixin.core.IMixinEntityRenderer;
import net.digitalingot.feather.mixin.core.IMixinSimpleReloadableResourceManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.util.ResourceLocation;

@FeatherModule(
   a = ModsConfig.MOTION_BLUR,
   b = @dn(
   a = "Motion Blur",
   b = "https://assets.feathercdn.net/game/mods/motionblur.svg",
   c = "",
   d = {ModsConponment.Category.PVP}
)
)
public class MotionBlur extends Mod<MotionBlur.a> {
   @Override
   public void f() {
      Events.a.a(var1 -> {
         if (this.m()) {
            if (Minecraft.func_71410_x().field_71441_e != null) {
               if (var1 == Events.c.START) {
                  EntityRenderer var2 = Minecraft.func_71410_x().field_71460_t;
                  if (var2.func_147706_e() != null && Minecraft.func_71410_x().field_71462_r == null) {
                     IResourceManager var3 = Minecraft.func_71410_x().func_110442_L();
                     if (var3 instanceof SimpleReloadableResourceManager) {
                        IMixinSimpleReloadableResourceManager var4 = (IMixinSimpleReloadableResourceManager)var3;
                        var4.getDomainResourceManagers().put("motionblur", new gh(this));
                        ((IMixinEntityRenderer)var2).feather$loadShader(new ResourceLocation("motionblur", "motionblur"));
                     }

                  }
               }
            }
         }
      });
   }

   @Override
   public void h() {
      EntityRenderer var1 = Minecraft.func_71410_x().field_71460_t;
      var1.func_181022_b();
   }

   @Override
   public void i() {
      EntityRenderer var1 = Minecraft.func_71410_x().field_71460_t;
      var1.func_181022_b();
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "blurAmount",
         b = "Blur Amount",
         c = "50",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      @DoubleRange(
         b = 0.0,
         a = 100.0
      )
      public double a;
   }
}
