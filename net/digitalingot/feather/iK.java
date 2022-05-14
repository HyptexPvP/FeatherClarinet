package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class iK extends iH implements Serializable, iG, iN {
   private static final long e = 1L;
   public float a;
   public float b;
   public float c;
   public float d;

   public iK() {
   }

   public iK(iG var1) {
      this.a(var1);
   }

   public iK(float var1, float var2, float var3, float var4) {
      this.a(var1, var2, var3, var4);
   }

   @Override
   public void a(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void a(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @Override
   public void a(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public iK a(iG var1) {
      this.a = var1.d();
      this.b = var1.e();
      this.c = var1.f();
      this.d = var1.g();
      return this;
   }

   @Override
   public float b() {
      return this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
   }

   public iK b(float var1, float var2, float var3, float var4) {
      this.a += var1;
      this.b += var2;
      this.c += var3;
      this.d += var4;
      return this;
   }

   public static iK a(iK var0, iK var1, iK var2) {
      if (var2 == null) {
         return new iK(var0.a + var1.a, var0.b + var1.b, var0.c + var1.c, var0.d + var1.d);
      } else {
         var2.a(var0.a + var1.a, var0.b + var1.b, var0.c + var1.c, var0.d + var1.d);
         return var2;
      }
   }

   public static iK b(iK var0, iK var1, iK var2) {
      if (var2 == null) {
         return new iK(var0.a - var1.a, var0.b - var1.b, var0.c - var1.c, var0.d - var1.d);
      } else {
         var2.a(var0.a - var1.a, var0.b - var1.b, var0.c - var1.c, var0.d - var1.d);
         return var2;
      }
   }

   @Override
   public iH c() {
      this.a = -this.a;
      this.b = -this.b;
      this.c = -this.c;
      this.d = -this.d;
      return this;
   }

   public iK a(iK var1) {
      if (var1 == null) {
         var1 = new iK();
      }

      var1.a = -this.a;
      var1.b = -this.b;
      var1.c = -this.c;
      var1.d = -this.d;
      return var1;
   }

   public iK b(iK var1) {
      float var2 = this.h();
      if (var1 == null) {
         var1 = new iK(this.a / var2, this.b / var2, this.c / var2, this.d / var2);
      } else {
         var1.a(this.a / var2, this.b / var2, this.c / var2, this.d / var2);
      }

      return var1;
   }

   public static float a(iK var0, iK var1) {
      return var0.a * var1.a + var0.b * var1.b + var0.c * var1.c + var0.d * var1.d;
   }

   public static float b(iK var0, iK var1) {
      float var2 = a(var0, var1) / (var0.h() * var1.h());
      if (var2 < -1.0F) {
         var2 = -1.0F;
      } else if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return (float)Math.acos((double)var2);
   }

   @Override
   public iH a(FloatBuffer var1) {
      this.a = var1.get();
      this.b = var1.get();
      this.c = var1.get();
      this.d = var1.get();
      return this;
   }

   @Override
   public iH a(float var1) {
      this.a *= var1;
      this.b *= var1;
      this.c *= var1;
      this.d *= var1;
      return this;
   }

   @Override
   public iH b(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      var1.put(this.c);
      var1.put(this.d);
      return this;
   }

   public String toString() {
      return "Vector4f: " + this.a + " " + this.b + " " + this.c + " " + this.d;
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

   @Override
   public void d(float var1) {
      this.c = var1;
   }

   @Override
   public float f() {
      return this.c;
   }

   @Override
   public void e(float var1) {
      this.d = var1;
   }

   @Override
   public float g() {
      return this.d;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         iK var2 = (iK)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.d == var2.d;
      }
   }
}
