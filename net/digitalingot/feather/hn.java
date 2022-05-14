package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;

public final class hn {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   public static final int g = 6;
   public static final int h = 7;
   public static final int i = 7;
   public static final int j = 0;
   public static final int k = 1;
   public static final int l = 2;
   private static final Minecraft m = Minecraft.func_71410_x();

   private hn() {
      throw new AssertionError();
   }

   public static boolean a(int var0) {
      return var0 > 7 ? false : Mouse.isButtonDown(var0);
   }

   public static boolean a() {
      return m.field_71415_G;
   }

   public static final class a {
      private a() {
         throw new AssertionError();
      }

      public static double a() {
         return (double)Mouse.getX();
      }

      public static double b() {
         return (double)Mouse.getY();
      }
   }

   public static final class b {
      private b() {
         throw new AssertionError();
      }

      public static double a() {
         return hn.a.a() * (double)hp.e() / (double)hp.a();
      }

      public static double b() {
         return hn.a.b() * (double)hp.f() / (double)hp.a();
      }
   }
}
