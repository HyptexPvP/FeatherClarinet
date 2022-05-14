package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.HUD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;

@FeatherModule(
   a = ModsConfig.WEATHER_CHANGER,
   b = @dn(
   a = "Weather Changer",
   b = "https://assets.feathercdn.net/game/mods/weatherchanger.svg",
   c = "Change the weather locally",
   d = {}
)
)
public class WeatherChanger extends Mod<WeatherChanger.a> {
   @Override
   public void f() {
      Events.a.a(var1 -> {
         if (this.m() && this.b.a != WeatherChanger.a.a.DEFAULT) {
            if (var1 == Events.c.END) {
               WorldClient var2 = Minecraft.func_71410_x().field_71441_e;
               if (var2 != null) {
                  if (this.b.a == WeatherChanger.a.a.CLEAR) {
                     var2.func_72894_k(0.0F);
                     var2.func_147442_i(0.0F);
                  } else {
                     var2.func_72894_k(1.0F);
                     if (this.b.a == WeatherChanger.a.a.THUNDER) {
                        var2.func_147442_i(1.0F);
                     } else {
                        var2.func_147442_i(0.0F);
                     }
                  }

               }
            }
         }
      });
   }

   @Override
   public void i() {
      if (!this.b.g || this.b.a == WeatherChanger.a.a.DEFAULT) {
         WorldClient var1 = Minecraft.func_71410_x().field_71441_e;
         if (var1 != null) {
            var1.func_72894_k(var1.func_72912_H().func_76059_o() ? 1.0F : 0.0F);
            var1.func_147442_i(var1.func_72912_H().func_76061_m() ? 1.0F : 0.0F);
         }
      }
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "weatherMode",
         b = "Weather Mode",
         c = "default",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public WeatherChanger.a.a a;
      @ModConfigAnnotation(
         a = "fallingColor",
         b = "Rain / Snow Color",
         c = "255/255/255",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public Color b;

      public static enum a {
         @dw(
            a = "default",
            b = "Default"
         )
         DEFAULT,
         @dw(
            a = "clear",
            b = "Clear"
         )
         CLEAR,
         @dw(
            a = "rain",
            b = "Rain"
         )
         RAIN,
         @dw(
            a = "thunder",
            b = "Thunder"
         )
         THUNDER;
      }
   }
}
