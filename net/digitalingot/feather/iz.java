package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class iz extends iy implements Serializable {
   private static final long e = 1L;
   public float a;
   public float b;
   public float c;
   public float d;

   public iz() {
      this.a();
   }

   public iz(iz var1) {
      this.a(var1);
   }

   public iz a(iz var1) {
      return a(var1, this);
   }

   public static iz a(iz var0, iz var1) {
      if (var1 == null) {
         var1 = new iz();
      }

      var1.a = var0.a;
      var1.b = var0.b;
      var1.c = var0.c;
      var1.d = var0.d;
      return var1;
   }

   @Override
   public iy a(FloatBuffer var1) {
      this.a = var1.get();
      this.b = var1.get();
      this.c = var1.get();
      this.d = var1.get();
      return this;
   }

   @Override
   public iy b(FloatBuffer var1) {
      this.a = var1.get();
      this.c = var1.get();
      this.b = var1.get();
      this.d = var1.get();
      return this;
   }

   @Override
   public iy c(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      var1.put(this.c);
      var1.put(this.d);
      return this;
   }

   @Override
   public iy d(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.c);
      var1.put(this.b);
      var1.put(this.d);
      return this;
   }

   public static iz a(iz var0, iz var1, iz var2) {
      if (var2 == null) {
         var2 = new iz();
      }

      var2.a = var0.a + var1.a;
      var2.b = var0.b + var1.b;
      var2.c = var0.c + var1.c;
      var2.d = var0.d + var1.d;
      return var2;
   }

   public static iz b(iz var0, iz var1, iz var2) {
      if (var2 == null) {
         var2 = new iz();
      }

      var2.a = var0.a - var1.a;
      var2.b = var0.b - var1.b;
      var2.c = var0.c - var1.c;
      var2.d = var0.d - var1.d;
      return var2;
   }

   public static iz c(iz var0, iz var1, iz var2) {
      if (var2 == null) {
         var2 = new iz();
      }

      float var3 = var0.a * var1.a + var0.c * var1.b;
      float var4 = var0.b * var1.a + var0.d * var1.b;
      float var5 = var0.a * var1.c + var0.c * var1.d;
      float var6 = var0.b * var1.c + var0.d * var1.d;
      var2.a = var3;
      var2.b = var4;
      var2.c = var5;
      var2.d = var6;
      return var2;
   }

   public static iI a(iz var0, iI var1, iI var2) {
      if (var2 == null) {
         var2 = new iI();
      }

      float var3 = var0.a * var1.a + var0.c * var1.b;
      float var4 = var0.b * var1.a + var0.d * var1.b;
      var2.a = var3;
      var2.b = var4;
      return var2;
   }

   @Override
   public iy d() {
      return this.b(this);
   }

   public iz b(iz var1) {
      return b(this, var1);
   }

   public static iz b(iz var0, iz var1) {
      if (var1 == null) {
         var1 = new iz();
      }

      float var2 = var0.c;
      float var3 = var0.b;
      var1.b = var2;
      var1.c = var3;
      return var1;
   }

   @Override
   public iy b() {
      return c(this, this);
   }

   public static iz c(iz var0, iz var1) {
      float var2 = var0.f();
      if (var2 != 0.0F) {
         if (var1 == null) {
            var1 = new iz();
         }

         float var3 = 1.0F / var2;
         float var4 = var0.d * var3;
         float var5 = -var0.b * var3;
         float var6 = var0.a * var3;
         float var7 = -var0.c * var3;
         var1.a = var4;
         var1.b = var5;
         var1.c = var7;
         var1.d = var6;
         return var1;
      } else {
         return null;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a).append(' ').append(this.c).append(' ').append('\n');
      var1.append(this.b).append(' ').append(this.d).append(' ').append('\n');
      return var1.toString();
   }

   @Override
   public iy c() {
      return this.c(this);
   }

   public iz c(iz var1) {
      return d(this, var1);
   }

   public static iz d(iz var0, iz var1) {
      if (var1 == null) {
         var1 = new iz();
      }

      var1.a = -var0.a;
      var1.b = -var0.b;
      var1.c = -var0.c;
      var1.d = -var0.d;
      return var1;
   }

   @Override
   public iy a() {
      return d(this);
   }

   public static iz d(iz var0) {
      var0.a = 1.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 1.0F;
      return var0;
   }

   @Override
   public iy e() {
      return e(this);
   }

   public static iz e(iz var0) {
      var0.a = 0.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 0.0F;
      return var0;
   }

   @Override
   public float f() {
      return this.a * this.d - this.b * this.c;
   }
}
