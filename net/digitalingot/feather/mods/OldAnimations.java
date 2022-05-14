package net.digitalingot.feather.mods;

import java.awt.Color;
import java.nio.FloatBuffer;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.gui.HUD;

@FeatherModule(
   a = ModsConfig.ANIMATIONS,
   b = @dn(
   a = "Animations",
   b = "https://assets.feathercdn.net/game/mods/animations.svg",
   c = "Switch between 1.7 and 1.8 animations",
   d = {}
)
)
public class OldAnimations extends Mod<OldAnimations.a> {
   public void a(FloatBuffer var1) {
      OldAnimations.a.a var2 = this.b.s;
      Color var3 = this.b.t;
      if (var2 == OldAnimations.a.a.CUSTOM_COLOR) {
         var1.put((float)var3.getRed() / 255.0F);
         var1.put((float)var3.getGreen() / 255.0F);
         var1.put((float)var3.getBlue() / 255.0F);
         var1.put((float)var3.getAlpha() / 255.0F);
      } else if (var2 == OldAnimations.a.a.CHROMA) {
         Color var4 = new Color(hH.a().c());
         var1.put((float)var4.getRed() / 255.0F);
         var1.put((float)var4.getGreen() / 255.0F);
         var1.put((float)var4.getBlue() / 255.0F);
         var1.put((float)var3.getAlpha() / 255.0F);
      }

   }

   @dt(
      a = true
   )
   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Animations");
      @ModConfigAnnotation(
         a = "blockHit",
         b = "Block Hit",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
      @ModConfigAnnotation(
         a = "blockBreak",
         b = "Block Break",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public boolean c;
      @ModConfigAnnotation(
         a = "bow",
         b = "Bow",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean d;
      @ModConfigAnnotation(
         a = "rod",
         b = "Rod",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "eating",
         b = "Eating",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 5
)
      )
      public boolean i;
      @ModConfigAnnotation(
         a = "sneaking",
         b = "Sneaking",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 6
)
      )
      public boolean j;
      @ModConfigAnnotation(
         a = "damage",
         b = "Damage",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 7
)
      )
      public boolean k;
      @ModConfigAnnotation(
         a = "sword",
         b = "Sword",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 8
)
      )
      public boolean l;
      @ModConfigAnnotation(
         a = "itemHeld",
         b = "Item Held",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 9
)
      )
      public boolean m;
      @ModConfigAnnotation(
         a = "itemUpdate",
         b = "Item Update",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 10
)
      )
      public boolean n;
      @ModConfigAnnotation(
         a = "swing",
         b = "Swing",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean o;
      @ModConfigAnnotation(
         a = "health",
         b = "Health",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "debug",
         b = "Debug",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean q;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh r = new eh("Damage Indicator");
      @ModConfigAnnotation(
         a = "damageIndicatorMode",
         b = "Mode",
         c = "default",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public OldAnimations.a.a s;
      @ModConfigAnnotation(
         a = "damageIndicatorColor",
         b = "Color",
         c = "160/0/0/76",
         d = @dB(
   a = "damageIndicatorMode",
   b = {"customColor"}
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public Color t;

      public static enum a {
         @dw(
            a = "default",
            b = "Default"
         )
         DEFAULT,
         @dw(
            a = "customColor",
            b = "Custom Color"
         )
         CUSTOM_COLOR,
         @dw(
            a = "chroma",
            b = "Chroma"
         )
         CHROMA;
      }
   }
}
