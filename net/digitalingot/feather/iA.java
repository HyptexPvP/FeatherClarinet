package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class iA extends iy implements Serializable {
   private static final long j = 1L;
   public float a;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   public float i;

   public iA() {
      this.a();
   }

   public iA a(iA var1) {
      return a(var1, this);
   }

   public static iA a(iA var0, iA var1) {
      if (var1 == null) {
         var1 = new iA();
      }

      var1.a = var0.a;
      var1.d = var0.d;
      var1.g = var0.g;
      var1.b = var0.b;
      var1.e = var0.e;
      var1.h = var0.h;
      var1.c = var0.c;
      var1.f = var0.f;
      var1.i = var0.i;
      return var1;
   }

   @Override
   public iy a(FloatBuffer var1) {
      this.a = var1.get();
      this.b = var1.get();
      this.c = var1.get();
      this.d = var1.get();
      this.e = var1.get();
      this.f = var1.get();
      this.g = var1.get();
      this.h = var1.get();
      this.i = var1.get();
      return this;
   }

   @Override
   public iy b(FloatBuffer var1) {
      this.a = var1.get();
      this.d = var1.get();
      this.g = var1.get();
      this.b = var1.get();
      this.e = var1.get();
      this.h = var1.get();
      this.c = var1.get();
      this.f = var1.get();
      this.i = var1.get();
      return this;
   }

   @Override
   public iy c(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      var1.put(this.c);
      var1.put(this.d);
      var1.put(this.e);
      var1.put(this.f);
      var1.put(this.g);
      var1.put(this.h);
      var1.put(this.i);
      return this;
   }

   @Override
   public iy d(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.d);
      var1.put(this.g);
      var1.put(this.b);
      var1.put(this.e);
      var1.put(this.h);
      var1.put(this.c);
      var1.put(this.f);
      var1.put(this.i);
      return this;
   }

   public static iA a(iA var0, iA var1, iA var2) {
      if (var2 == null) {
         var2 = new iA();
      }

      var2.a = var0.a + var1.a;
      var2.b = var0.b + var1.b;
      var2.c = var0.c + var1.c;
      var2.d = var0.d + var1.d;
      var2.e = var0.e + var1.e;
      var2.f = var0.f + var1.f;
      var2.g = var0.g + var1.g;
      var2.h = var0.h + var1.h;
      var2.i = var0.i + var1.i;
      return var2;
   }

   public static iA b(iA var0, iA var1, iA var2) {
      if (var2 == null) {
         var2 = new iA();
      }

      var2.a = var0.a - var1.a;
      var2.b = var0.b - var1.b;
      var2.c = var0.c - var1.c;
      var2.d = var0.d - var1.d;
      var2.e = var0.e - var1.e;
      var2.f = var0.f - var1.f;
      var2.g = var0.g - var1.g;
      var2.h = var0.h - var1.h;
      var2.i = var0.i - var1.i;
      return var2;
   }

   public static iA c(iA var0, iA var1, iA var2) {
      if (var2 == null) {
         var2 = new iA();
      }

      float var3 = var0.a * var1.a + var0.d * var1.b + var0.g * var1.c;
      float var4 = var0.b * var1.a + var0.e * var1.b + var0.h * var1.c;
      float var5 = var0.c * var1.a + var0.f * var1.b + var0.i * var1.c;
      float var6 = var0.a * var1.d + var0.d * var1.e + var0.g * var1.f;
      float var7 = var0.b * var1.d + var0.e * var1.e + var0.h * var1.f;
      float var8 = var0.c * var1.d + var0.f * var1.e + var0.i * var1.f;
      float var9 = var0.a * var1.g + var0.d * var1.h + var0.g * var1.i;
      float var10 = var0.b * var1.g + var0.e * var1.h + var0.h * var1.i;
      float var11 = var0.c * var1.g + var0.f * var1.h + var0.i * var1.i;
      var2.a = var3;
      var2.b = var4;
      var2.c = var5;
      var2.d = var6;
      var2.e = var7;
      var2.f = var8;
      var2.g = var9;
      var2.h = var10;
      var2.i = var11;
      return var2;
   }

   public static iJ a(iA var0, iJ var1, iJ var2) {
      if (var2 == null) {
         var2 = new iJ();
      }

      float var3 = var0.a * var1.a + var0.d * var1.b + var0.g * var1.c;
      float var4 = var0.b * var1.a + var0.e * var1.b + var0.h * var1.c;
      float var5 = var0.c * var1.a + var0.f * var1.b + var0.i * var1.c;
      var2.a = var3;
      var2.b = var4;
      var2.c = var5;
      return var2;
   }

   @Override
   public iy d() {
      return b(this, this);
   }

   public iA b(iA var1) {
      return b(this, var1);
   }

   public static iA b(iA var0, iA var1) {
      if (var1 == null) {
         var1 = new iA();
      }

      float var2 = var0.a;
      float var3 = var0.d;
      float var4 = var0.g;
      float var5 = var0.b;
      float var6 = var0.e;
      float var7 = var0.h;
      float var8 = var0.c;
      float var9 = var0.f;
      float var10 = var0.i;
      var1.a = var2;
      var1.b = var3;
      var1.c = var4;
      var1.d = var5;
      var1.e = var6;
      var1.f = var7;
      var1.g = var8;
      var1.h = var9;
      var1.i = var10;
      return var1;
   }

   @Override
   public float f() {
      return this.a * (this.e * this.i - this.f * this.h) + this.b * (this.f * this.g - this.d * this.i) + this.c * (this.d * this.h - this.e * this.g);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a).append(' ').append(this.d).append(' ').append(this.g).append(' ').append('\n');
      var1.append(this.b).append(' ').append(this.e).append(' ').append(this.h).append(' ').append('\n');
      var1.append(this.c).append(' ').append(this.f).append(' ').append(this.i).append(' ').append('\n');
      return var1.toString();
   }

   @Override
   public iy b() {
      return c(this, this);
   }

   public static iA c(iA var0, iA var1) {
      float var2 = var0.f();
      if (var2 != 0.0F) {
         if (var1 == null) {
            var1 = new iA();
         }

         float var3 = 1.0F / var2;
         float var4 = var0.e * var0.i - var0.f * var0.h;
         float var5 = -var0.d * var0.i + var0.f * var0.g;
         float var6 = var0.d * var0.h - var0.e * var0.g;
         float var7 = -var0.b * var0.i + var0.c * var0.h;
         float var8 = var0.a * var0.i - var0.c * var0.g;
         float var9 = -var0.a * var0.h + var0.b * var0.g;
         float var10 = var0.b * var0.f - var0.c * var0.e;
         float var11 = -var0.a * var0.f + var0.c * var0.d;
         float var12 = var0.a * var0.e - var0.b * var0.d;
         var1.a = var4 * var3;
         var1.e = var8 * var3;
         var1.i = var12 * var3;
         var1.b = var7 * var3;
         var1.d = var5 * var3;
         var1.g = var6 * var3;
         var1.c = var10 * var3;
         var1.f = var11 * var3;
         var1.h = var9 * var3;
         return var1;
      } else {
         return null;
      }
   }

   @Override
   public iy c() {
      return this.c(this);
   }

   public iA c(iA var1) {
      return d(this, var1);
   }

   public static iA d(iA var0, iA var1) {
      if (var1 == null) {
         var1 = new iA();
      }

      var1.a = -var0.a;
      var1.b = -var0.c;
      var1.c = -var0.b;
      var1.d = -var0.d;
      var1.e = -var0.f;
      var1.f = -var0.e;
      var1.g = -var0.g;
      var1.h = -var0.i;
      var1.i = -var0.h;
      return var1;
   }

   @Override
   public iy a() {
      return d(this);
   }

   public static iA d(iA var0) {
      var0.a = 1.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 0.0F;
      var0.e = 1.0F;
      var0.f = 0.0F;
      var0.g = 0.0F;
      var0.h = 0.0F;
      var0.i = 1.0F;
      return var0;
   }

   @Override
   public iy e() {
      return e(this);
   }

   public static iA e(iA var0) {
      var0.a = 0.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 0.0F;
      var0.e = 0.0F;
      var0.f = 0.0F;
      var0.g = 0.0F;
      var0.h = 0.0F;
      var0.i = 0.0F;
      return var0;
   }
}
