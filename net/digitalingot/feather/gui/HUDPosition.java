package net.digitalingot.feather.gui;

import net.digitalingot.feather.dw;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import net.digitalingot.feather.mods.ModConfigValueAnnotation;

public class HUDPosition extends HUD {
   @ModConfigAnnotation(
      a = "hudHeightGravity",
      b = "Height Gravity",
      c = "left",
      e = @ModConfigValueAnnotation(
   a = -99
)
   )
   public transient HUDPosition.b a;
   @ModConfigAnnotation(
      a = "hudRelativeX",
      b = "Relative X",
      e = @ModConfigValueAnnotation(
   a = -98
)
   )
   public transient double b;
   @ModConfigAnnotation(
      a = "hudRelativeY",
      b = "Relative Y",
      e = @ModConfigValueAnnotation(
   a = -97
)
   )
   public transient double c;
   @ModConfigAnnotation(
      a = "hudScale",
      b = "Scale",
      e = @ModConfigValueAnnotation(
   a = -96
)
   )
   public transient double d;
   @ModConfigAnnotation(
      a = "hudVerticalGravity",
      b = "Vertical Gravity",
      c = "top",
      e = @ModConfigValueAnnotation(
   a = -95
)
   )
   public transient HUDPosition.c e;

   public void a(HUDMod<?> var1, double var2, double var4) {
      double var6 = b(var2);
      double var8 = a(var4);
      double var10 = b(var1.d() / 2.0);
      var6 = Math.min(1.0 - var10, Math.max(var6, var10));
      double var12 = a(var1.c() / 2.0);
      var8 = Math.min(1.0 - var12, Math.max(var8, var12));
      this.a = HUDPosition.b.of(var6);
      this.e = HUDPosition.c.of(var8);
      this.b = this.a.getRelX(var1, var6);
      this.c = this.e.getRelY(var1, var8);
   }

   public void a(HUDMod<?> var1, double var2, double var4, double var6) {
      this.d = var6;
      this.a(var1, var2, var4);
   }

   public static double a(double var0) {
      return var0 / a();
   }

   public static double b(double var0) {
      return var0 / b();
   }

   public static double a() {
      return (double)hp.d() / hp.g();
   }

   public static double b() {
      return (double)hp.c() / hp.g();
   }

   public static double c(double var0) {
      return a() * var0;
   }

   public static double d(double var0) {
      return b() * var0;
   }

   public double c() {
      return 1.0;
   }

   public double d() {
      return 1.0;
   }

   public HUDPosition.b e() {
      return this.a;
   }

   public double f() {
      return this.b;
   }

   public double g() {
      return this.c;
   }

   public double h() {
      return this.d;
   }

   public HUDPosition.c i() {
      return this.e;
   }

   public static enum a {
      @dw(
         a = "background",
         b = "Background"
      )
      BACKGROUND,
      @dw(
         a = "brackets",
         b = "Brackets"
      )
      BRACKETS,
      @dw(
         a = "justText",
         b = "Just Text"
      )
      JUST_TEXT;
   }

   public static enum b {
      @dw(
         a = "left",
         b = "Left"
      )
      LEFT {
         @Override
         public double getCenterX(HUDMod<?> var1) {
            return HUDPosition.d(((HUDPosition)var1.k()).b + HUDPosition.b(var1.d() / 2.0));
         }

         @Override
         public double getRelX(HUDMod<?> var1, double var2) {
            return var2 - HUDPosition.b(var1.d() / 2.0);
         }
      },
      @dw(
         a = "center",
         b = "Center"
      )
      CENTER {
         @Override
         public double getCenterX(HUDMod<?> var1) {
            return HUDPosition.d(0.5 + ((HUDPosition)var1.k()).b);
         }

         @Override
         public double getRelX(HUDMod<?> var1, double var2) {
            return var2 - 0.5;
         }
      },
      @dw(
         a = "right",
         b = "Right"
      )
      RIGHT {
         @Override
         public double getCenterX(HUDMod<?> var1) {
            return HUDPosition.d(1.0 - ((HUDPosition)var1.k()).b - HUDPosition.b(var1.d() / 2.0));
         }

         @Override
         public double getRelX(HUDMod<?> var1, double var2) {
            return 1.0 - var2 - HUDPosition.b(var1.d() / 2.0);
         }
      };

      private b() {
      }

      public static HUDPosition.b of(double var0) {
         return var0 <= 0.3333333333333333 ? LEFT : (var0 >= 0.6666666666666666 ? RIGHT : CENTER);
      }

      public abstract double getCenterX(HUDMod<?> var1);

      public int getEndX(HUDMod<?> var1) {
         return (int)Math.round(this.getCenterX(var1) + var1.d() / 2.0);
      }

      public abstract double getRelX(HUDMod<?> var1, double var2);

      public int getStartX(HUDMod<?> var1) {
         return (int)Math.round(this.getCenterX(var1) - var1.d() / 2.0);
      }
   }

   public static enum c {
      @dw(
         a = "top",
         b = "Top"
      )
      TOP {
         @Override
         public double getCenterY(HUDMod<?> var1) {
            return HUDPosition.c(((HUDPosition)var1.k()).c + HUDPosition.a(var1.c() / 2.0));
         }

         @Override
         public double getRelY(HUDMod<?> var1, double var2) {
            return var2 - HUDPosition.a(var1.c() / 2.0);
         }
      },
      @dw(
         a = "middle",
         b = "Middle"
      )
      MIDDLE {
         @Override
         public double getCenterY(HUDMod<?> var1) {
            return HUDPosition.c(0.5 + ((HUDPosition)var1.k()).c);
         }

         @Override
         public double getRelY(HUDMod<?> var1, double var2) {
            return var2 - 0.5;
         }
      },
      @dw(
         a = "bottom",
         b = "Bottom"
      )
      BOTTOM {
         @Override
         public double getCenterY(HUDMod<?> var1) {
            return HUDPosition.c(1.0 - ((HUDPosition)var1.k()).c - HUDPosition.a(var1.c() / 2.0));
         }

         @Override
         public double getRelY(HUDMod<?> var1, double var2) {
            return 1.0 - var2 - HUDPosition.a(var1.c() / 2.0);
         }
      };

      private c() {
      }

      public static HUDPosition.c of(double var0) {
         return var0 <= 0.3333333333333333 ? TOP : (var0 >= 0.6666666666666666 ? BOTTOM : MIDDLE);
      }

      public abstract double getCenterY(HUDMod<?> var1);

      public int getEndY(HUDMod<?> var1) {
         return (int)Math.round(this.getCenterY(var1) + var1.c() / 2.0);
      }

      public abstract double getRelY(HUDMod<?> var1, double var2);

      public int getStartY(HUDMod<?> var1) {
         return (int)Math.round(this.getCenterY(var1) - var1.c() / 2.0);
      }
   }
}
