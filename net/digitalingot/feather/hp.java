package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public final class hp {
   private static final Minecraft a = Minecraft.func_71410_x();
   private static ScaledResolution b = null;
   private static int c = -1;
   private static int d = -1;

   private hp() {
      throw new AssertionError();
   }

   public static int a() {
      return a.field_71443_c;
   }

   public static int b() {
      return a.field_71440_d;
   }

   public static int c() {
      return a.field_71443_c;
   }

   public static int d() {
      return a.field_71440_d;
   }

   public static int e() {
      return h().func_78326_a();
   }

   public static int f() {
      return h().func_78328_b();
   }

   public static double g() {
      return (double)h().func_78325_e();
   }

   private static ScaledResolution h() {
      if (d != d() || c != c() || b == null) {
         b = new ScaledResolution(a);
      }

      return b;
   }
}
