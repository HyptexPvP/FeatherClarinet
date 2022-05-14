package net.digitalingot.feather.mods;

import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.renderFogDensityEvent;
import net.digitalingot.feather.gui.HUD;
import net.minecraft.init.Blocks;

@FeatherModule(
   a = ModsConfig.CLEAR_WATER,
   b = @dn(
   a = "Clear Water",
   b = "https://assets.feathercdn.net/game/mods/clearwater.svg",
   c = "Removes fog underwater so you can see clearer",
   d = {}
)
)
public class ClearWaterMod extends Mod<ClearWaterMod.a> {
   @Override
   public void f() {
      renderFogDensityEvent.a.a((var1, var2) -> {
         if (!this.m()) {
            return null;
         } else if (this.b.e && var1 == Blocks.field_150355_j) {
            return (float)this.b.i / 250.0F;
         } else {
            return this.b.b && var1 == Blocks.field_150353_l ? (float)this.b.c / 250.0F : null;
         }
      });
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Lava");
      @ModConfigAnnotation(
         a = "lava",
         b = "Lava",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
      @ModConfigAnnotation(
         a = "fogDensityLava",
         b = "Fog Density",
         d = @dB(
   a = "lava"
),
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      @IntegerRange(
         a = 50
      )
      public int c;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh d = new eh("Water");
      @ModConfigAnnotation(
         a = "water",
         b = "Water",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "fogDensityWater",
         b = "Fog Density",
         d = @dB(
   a = "water"
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      @IntegerRange(
         a = 50
      )
      public int i;
   }
}
