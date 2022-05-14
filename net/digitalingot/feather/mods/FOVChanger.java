package net.digitalingot.feather.mods;

import net.digitalingot.feather.dn;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.event.FOVUpdateEvent;
import net.digitalingot.feather.gui.HUD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;

@FeatherModule(
   a = ModsConfig.FOV_CHANGER,
   b = @dn(
   a = "FOV Changer",
   b = "https://assets.feathercdn.net/game/mods/fovchanger.svg",
   c = "Customize field of view",
   d = {}
)
)
public class FOVChanger extends Mod<FOVChanger.a> {
   public static final Potion a = Potion.func_180142_b("speed");
   public static final Potion c = Potion.func_180142_b("slowness");

   @Override
   public void f() {
      FOVUpdateEvent.a.a((var1, var2) -> {
         if (!this.m()) {
            return var2;
         } else {
            EntityPlayerSP var3 = Minecraft.func_71410_x().field_71439_g;
            float var4 = 100.0F;
            if (var3.func_70051_ag()) {
               var4 = (float)((double)var4 + this.b.d);
            }

            if (var3.field_71075_bZ.field_75100_b) {
               var4 = (float)((double)var4 + this.b.b);
            }

            if (var3.func_70644_a(a)) {
               var4 = (float)((double)var4 + this.b.e);
            }

            if (var3.func_70644_a(c)) {
               var4 = (float)((double)var4 - this.b.c);
            }

            ItemStack var5 = var3.func_70694_bm();
            if (this.b.a > 0.0 && var5 != null && var5.func_77973_b() instanceof ItemBow) {
               float var6 = (float)Math.pow((double)((float)(var5.func_77988_m() - var3.func_71052_bv()) / 20.0F), 2.0);
               var4 = (float)((double)var4 - (double)MathHelper.func_76131_a(var6, 0.0F, 1.0F) * this.b.a);
            }

            return var1 * var4 / 100.0F;
         }
      });
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "bowZoomModifier",
         b = "Bow Zoom",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      @DoubleRange(
         b = -50.0,
         a = 50.0
      )
      public double a;
      @ModConfigAnnotation(
         a = "flyingModifier",
         b = "Flying Modifier",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @DoubleRange(
         b = -50.0,
         a = 50.0
      )
      public double b;
      @ModConfigAnnotation(
         a = "slownessModifier",
         b = "Slowness Modifier",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      @DoubleRange(
         b = -50.0,
         a = 50.0
      )
      public double c;
      @ModConfigAnnotation(
         a = "sprintModifier",
         b = "Sprint Modifier",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      @DoubleRange(
         b = -50.0,
         a = 50.0
      )
      public double d;
      @ModConfigAnnotation(
         a = "swiftnessModifier",
         b = "Swiftness Modifier",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      @DoubleRange(
         b = -50.0,
         a = 50.0
      )
      public double e;
   }
}
