package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class iI extends iH implements Serializable, iE, iL {
   private static final long c = 1L;
   public float a;
   public float b;

   public iI() {
   }

   public iI(iE var1) {
      this.a(var1);
   }

   public iI(float var1, float var2) {
      this.a(var1, var2);
   }

   @Override
   public void a(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public iI a(iE var1) {
      this.a = var1.d();
      this.b = var1.e();
      return this;
   }

   @Override
   public float b() {
      return this.a * this.a + this.b * this.b;
   }

   public iI b(float var1, float var2) {
      this.a += var1;
      this.b += var2;
      return this;
   }

   @Override
   public iH c() {
      this.a = -this.a;
      this.b = -this.b;
      return this;
   }

   public iI a(iI var1) {
      if (var1 == null) {
         var1 = new iI();
      }

      var1.a = -this.a;
      var1.b = -this.b;
      return var1;
   }

   public iI b(iI var1) {
      float var2 = this.h();
      if (var1 == null) {
         var1 = new iI(this.a / var2, this.b / var2);
      } else {
         var1.a(this.a / var2, this.b / var2);
      }

      return var1;
   }

   public static float a(iI var0, iI var1) {
      return var0.a * var1.a + var0.b * var1.b;
   }

   public static float b(iI var0, iI var1) {
      float var2 = a(var0, var1) / (var0.h() * var1.h());
      if (var2 < -1.0F) {
         var2 = -1.0F;
      } else if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return (float)Math.acos((double)var2);
   }

   public static iI a(iI var0, iI var1, iI var2) {
      if (var2 == null) {
         return new iI(var0.a + var1.a, var0.b + var1.b);
      } else {
         var2.a(var0.a + var1.a, var0.b + var1.b);
         return var2;
      }
   }

   public static iI b(iI var0, iI var1, iI var2) {
      if (var2 == null) {
         return new iI(var0.a - var1.a, var0.b - var1.b);
      } else {
         var2.a(var0.a - var1.a, var0.b - var1.b);
         return var2;
      }
   }

   @Override
   public iH b(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      return this;
   }

   @Override
   public iH a(FloatBuffer var1) {
      this.a = var1.get();
      this.b = var1.get();
      return this;
   }

   @Override
   public iH a(float var1) {
      this.a *= var1;
      this.b *= var1;
      return this;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("Vector2f[");
      var1.append(this.a);
      var1.append(", ");
      var1.append(this.b);
      var1.append(']');
      return var1.toString();
   }

   @Override
   public final float d() {
      return this.a;
   }

   @Override
   public final float e() {
      return this.b;
   }

   @Override
   public final void b(float var1) {
      this.a = var1;
   }

   @Override
   public final void c(float var1) {
      this.b = var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         iI var2 = (iI)var1;
         return this.a == var2.a && this.b == var2.b;
      }
   }
}
