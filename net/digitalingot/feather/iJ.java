package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class iJ extends iH implements Serializable, iF, iM {
   private static final long d = 1L;
   public float a;
   public float b;
   public float c;

   public iJ() {
   }

   public iJ(iF var1) {
      this.a(var1);
   }

   public iJ(float var1, float var2, float var3) {
      this.a(var1, var2, var3);
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

   public iJ a(iF var1) {
      this.a = var1.d();
      this.b = var1.e();
      this.c = var1.f();
      return this;
   }

   @Override
   public float b() {
      return this.a * this.a + this.b * this.b + this.c * this.c;
   }

   public iJ b(float var1, float var2, float var3) {
      this.a += var1;
      this.b += var2;
      this.c += var3;
      return this;
   }

   public static iJ a(iJ var0, iJ var1, iJ var2) {
      if (var2 == null) {
         return new iJ(var0.a + var1.a, var0.b + var1.b, var0.c + var1.c);
      } else {
         var2.a(var0.a + var1.a, var0.b + var1.b, var0.c + var1.c);
         return var2;
      }
   }

   public static iJ b(iJ var0, iJ var1, iJ var2) {
      if (var2 == null) {
         return new iJ(var0.a - var1.a, var0.b - var1.b, var0.c - var1.c);
      } else {
         var2.a(var0.a - var1.a, var0.b - var1.b, var0.c - var1.c);
         return var2;
      }
   }

   public static iJ c(iJ var0, iJ var1, iJ var2) {
      if (var2 == null) {
         var2 = new iJ();
      }

      var2.a(var0.b * var1.c - var0.c * var1.b, var1.a * var0.c - var1.c * var0.a, var0.a * var1.b - var0.b * var1.a);
      return var2;
   }

   @Override
   public iH c() {
      this.a = -this.a;
      this.b = -this.b;
      this.c = -this.c;
      return this;
   }

   public iJ a(iJ var1) {
      if (var1 == null) {
         var1 = new iJ();
      }

      var1.a = -this.a;
      var1.b = -this.b;
      var1.c = -this.c;
      return var1;
   }

   public iJ b(iJ var1) {
      float var2 = this.h();
      if (var1 == null) {
         var1 = new iJ(this.a / var2, this.b / var2, this.c / var2);
      } else {
         var1.a(this.a / var2, this.b / var2, this.c / var2);
      }

      return var1;
   }

   public static float a(iJ var0, iJ var1) {
      return var0.a * var1.a + var0.b * var1.b + var0.c * var1.c;
   }

   public static float b(iJ var0, iJ var1) {
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
      return this;
   }

   @Override
   public iH a(float var1) {
      this.a *= var1;
      this.b *= var1;
      this.c *= var1;
      return this;
   }

   @Override
   public iH b(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      var1.put(this.c);
      return this;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("Vector3f[");
      var1.append(this.a);
      var1.append(", ");
      var1.append(this.b);
      var1.append(", ");
      var1.append(this.c);
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

   @Override
   public void d(float var1) {
      this.c = var1;
   }

   @Override
   public float f() {
      return this.c;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         iJ var2 = (iJ)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c;
      }
   }
}
