package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class iB extends iy implements Serializable {
   private static final long q = 1L;
   public float a;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   public float i;
   public float j;
   public float k;
   public float l;
   public float m;
   public float n;
   public float o;
   public float p;

   public iB() {
      this.a();
   }

   public iB(iB var1) {
      this.c(var1);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a).append(' ').append(this.e).append(' ').append(this.i).append(' ').append(this.m).append('\n');
      var1.append(this.b).append(' ').append(this.f).append(' ').append(this.j).append(' ').append(this.n).append('\n');
      var1.append(this.c).append(' ').append(this.g).append(' ').append(this.k).append(' ').append(this.o).append('\n');
      var1.append(this.d).append(' ').append(this.h).append(' ').append(this.l).append(' ').append(this.p).append('\n');
      return var1.toString();
   }

   @Override
   public iy a() {
      return a(this);
   }

   public static iB a(iB var0) {
      var0.a = 1.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 0.0F;
      var0.e = 0.0F;
      var0.f = 1.0F;
      var0.g = 0.0F;
      var0.h = 0.0F;
      var0.i = 0.0F;
      var0.j = 0.0F;
      var0.k = 1.0F;
      var0.l = 0.0F;
      var0.m = 0.0F;
      var0.n = 0.0F;
      var0.o = 0.0F;
      var0.p = 1.0F;
      return var0;
   }

   @Override
   public iy e() {
      return b(this);
   }

   public static iB b(iB var0) {
      var0.a = 0.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 0.0F;
      var0.e = 0.0F;
      var0.f = 0.0F;
      var0.g = 0.0F;
      var0.h = 0.0F;
      var0.i = 0.0F;
      var0.j = 0.0F;
      var0.k = 0.0F;
      var0.l = 0.0F;
      var0.m = 0.0F;
      var0.n = 0.0F;
      var0.o = 0.0F;
      var0.p = 0.0F;
      return var0;
   }

   public iB c(iB var1) {
      return a(var1, this);
   }

   public static iB a(iB var0, iB var1) {
      if (var1 == null) {
         var1 = new iB();
      }

      var1.a = var0.a;
      var1.b = var0.b;
      var1.c = var0.c;
      var1.d = var0.d;
      var1.e = var0.e;
      var1.f = var0.f;
      var1.g = var0.g;
      var1.h = var0.h;
      var1.i = var0.i;
      var1.j = var0.j;
      var1.k = var0.k;
      var1.l = var0.l;
      var1.m = var0.m;
      var1.n = var0.n;
      var1.o = var0.o;
      var1.p = var0.p;
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
      this.j = var1.get();
      this.k = var1.get();
      this.l = var1.get();
      this.m = var1.get();
      this.n = var1.get();
      this.o = var1.get();
      this.p = var1.get();
      return this;
   }

   @Override
   public iy b(FloatBuffer var1) {
      this.a = var1.get();
      this.e = var1.get();
      this.i = var1.get();
      this.m = var1.get();
      this.b = var1.get();
      this.f = var1.get();
      this.j = var1.get();
      this.n = var1.get();
      this.c = var1.get();
      this.g = var1.get();
      this.k = var1.get();
      this.o = var1.get();
      this.d = var1.get();
      this.h = var1.get();
      this.l = var1.get();
      this.p = var1.get();
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
      var1.put(this.j);
      var1.put(this.k);
      var1.put(this.l);
      var1.put(this.m);
      var1.put(this.n);
      var1.put(this.o);
      var1.put(this.p);
      return this;
   }

   @Override
   public iy d(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.e);
      var1.put(this.i);
      var1.put(this.m);
      var1.put(this.b);
      var1.put(this.f);
      var1.put(this.j);
      var1.put(this.n);
      var1.put(this.c);
      var1.put(this.g);
      var1.put(this.k);
      var1.put(this.o);
      var1.put(this.d);
      var1.put(this.h);
      var1.put(this.l);
      var1.put(this.p);
      return this;
   }

   public iy e(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      var1.put(this.c);
      var1.put(this.e);
      var1.put(this.f);
      var1.put(this.g);
      var1.put(this.i);
      var1.put(this.j);
      var1.put(this.k);
      return this;
   }

   public static iB a(iB var0, iB var1, iB var2) {
      if (var2 == null) {
         var2 = new iB();
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
      var2.j = var0.j + var1.j;
      var2.k = var0.k + var1.k;
      var2.l = var0.l + var1.l;
      var2.m = var0.m + var1.m;
      var2.n = var0.n + var1.n;
      var2.o = var0.o + var1.o;
      var2.p = var0.p + var1.p;
      return var2;
   }

   public static iB b(iB var0, iB var1, iB var2) {
      if (var2 == null) {
         var2 = new iB();
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
      var2.j = var0.j - var1.j;
      var2.k = var0.k - var1.k;
      var2.l = var0.l - var1.l;
      var2.m = var0.m - var1.m;
      var2.n = var0.n - var1.n;
      var2.o = var0.o - var1.o;
      var2.p = var0.p - var1.p;
      return var2;
   }

   public static iB c(iB var0, iB var1, iB var2) {
      if (var2 == null) {
         var2 = new iB();
      }

      float var3 = var0.a * var1.a + var0.e * var1.b + var0.i * var1.c + var0.m * var1.d;
      float var4 = var0.b * var1.a + var0.f * var1.b + var0.j * var1.c + var0.n * var1.d;
      float var5 = var0.c * var1.a + var0.g * var1.b + var0.k * var1.c + var0.o * var1.d;
      float var6 = var0.d * var1.a + var0.h * var1.b + var0.l * var1.c + var0.p * var1.d;
      float var7 = var0.a * var1.e + var0.e * var1.f + var0.i * var1.g + var0.m * var1.h;
      float var8 = var0.b * var1.e + var0.f * var1.f + var0.j * var1.g + var0.n * var1.h;
      float var9 = var0.c * var1.e + var0.g * var1.f + var0.k * var1.g + var0.o * var1.h;
      float var10 = var0.d * var1.e + var0.h * var1.f + var0.l * var1.g + var0.p * var1.h;
      float var11 = var0.a * var1.i + var0.e * var1.j + var0.i * var1.k + var0.m * var1.l;
      float var12 = var0.b * var1.i + var0.f * var1.j + var0.j * var1.k + var0.n * var1.l;
      float var13 = var0.c * var1.i + var0.g * var1.j + var0.k * var1.k + var0.o * var1.l;
      float var14 = var0.d * var1.i + var0.h * var1.j + var0.l * var1.k + var0.p * var1.l;
      float var15 = var0.a * var1.m + var0.e * var1.n + var0.i * var1.o + var0.m * var1.p;
      float var16 = var0.b * var1.m + var0.f * var1.n + var0.j * var1.o + var0.n * var1.p;
      float var17 = var0.c * var1.m + var0.g * var1.n + var0.k * var1.o + var0.o * var1.p;
      float var18 = var0.d * var1.m + var0.h * var1.n + var0.l * var1.o + var0.p * var1.p;
      var2.a = var3;
      var2.b = var4;
      var2.c = var5;
      var2.d = var6;
      var2.e = var7;
      var2.f = var8;
      var2.g = var9;
      var2.h = var10;
      var2.i = var11;
      var2.j = var12;
      var2.k = var13;
      var2.l = var14;
      var2.m = var15;
      var2.n = var16;
      var2.o = var17;
      var2.p = var18;
      return var2;
   }

   public static iK a(iB var0, iK var1, iK var2) {
      if (var2 == null) {
         var2 = new iK();
      }

      float var3 = var0.a * var1.a + var0.e * var1.b + var0.i * var1.c + var0.m * var1.d;
      float var4 = var0.b * var1.a + var0.f * var1.b + var0.j * var1.c + var0.n * var1.d;
      float var5 = var0.c * var1.a + var0.g * var1.b + var0.k * var1.c + var0.o * var1.d;
      float var6 = var0.d * var1.a + var0.h * var1.b + var0.l * var1.c + var0.p * var1.d;
      var2.a = var3;
      var2.b = var4;
      var2.c = var5;
      var2.d = var6;
      return var2;
   }

   @Override
   public iy d() {
      return this.d(this);
   }

   public iB a(iI var1) {
      return this.a(var1, this);
   }

   public iB a(iJ var1) {
      return this.a(var1, this);
   }

   public iB b(iJ var1) {
      return a(var1, this, this);
   }

   public static iB a(iJ var0, iB var1, iB var2) {
      if (var2 == null) {
         var2 = new iB();
      }

      var2.a = var1.a * var0.a;
      var2.b = var1.b * var0.a;
      var2.c = var1.c * var0.a;
      var2.d = var1.d * var0.a;
      var2.e = var1.e * var0.b;
      var2.f = var1.f * var0.b;
      var2.g = var1.g * var0.b;
      var2.h = var1.h * var0.b;
      var2.i = var1.i * var0.c;
      var2.j = var1.j * var0.c;
      var2.k = var1.k * var0.c;
      var2.l = var1.l * var0.c;
      return var2;
   }

   public iB a(float var1, iJ var2) {
      return this.a(var1, var2, this);
   }

   public iB a(float var1, iJ var2, iB var3) {
      return a(var1, var2, this, var3);
   }

   public static iB a(float var0, iJ var1, iB var2, iB var3) {
      if (var3 == null) {
         var3 = new iB();
      }

      float var4 = (float)Math.cos((double)var0);
      float var5 = (float)Math.sin((double)var0);
      float var6 = 1.0F - var4;
      float var7 = var1.a * var1.b;
      float var8 = var1.b * var1.c;
      float var9 = var1.a * var1.c;
      float var10 = var1.a * var5;
      float var11 = var1.b * var5;
      float var12 = var1.c * var5;
      float var13 = var1.a * var1.a * var6 + var4;
      float var14 = var7 * var6 + var12;
      float var15 = var9 * var6 - var11;
      float var16 = var7 * var6 - var12;
      float var17 = var1.b * var1.b * var6 + var4;
      float var18 = var8 * var6 + var10;
      float var19 = var9 * var6 + var11;
      float var20 = var8 * var6 - var10;
      float var21 = var1.c * var1.c * var6 + var4;
      float var22 = var2.a * var13 + var2.e * var14 + var2.i * var15;
      float var23 = var2.b * var13 + var2.f * var14 + var2.j * var15;
      float var24 = var2.c * var13 + var2.g * var14 + var2.k * var15;
      float var25 = var2.d * var13 + var2.h * var14 + var2.l * var15;
      float var26 = var2.a * var16 + var2.e * var17 + var2.i * var18;
      float var27 = var2.b * var16 + var2.f * var17 + var2.j * var18;
      float var28 = var2.c * var16 + var2.g * var17 + var2.k * var18;
      float var29 = var2.d * var16 + var2.h * var17 + var2.l * var18;
      var3.i = var2.a * var19 + var2.e * var20 + var2.i * var21;
      var3.j = var2.b * var19 + var2.f * var20 + var2.j * var21;
      var3.k = var2.c * var19 + var2.g * var20 + var2.k * var21;
      var3.l = var2.d * var19 + var2.h * var20 + var2.l * var21;
      var3.a = var22;
      var3.b = var23;
      var3.c = var24;
      var3.d = var25;
      var3.e = var26;
      var3.f = var27;
      var3.g = var28;
      var3.h = var29;
      return var3;
   }

   public iB a(iJ var1, iB var2) {
      return b(var1, this, var2);
   }

   public static iB b(iJ var0, iB var1, iB var2) {
      if (var2 == null) {
         var2 = new iB();
      }

      var2.m += var1.a * var0.a + var1.e * var0.b + var1.i * var0.c;
      var2.n += var1.b * var0.a + var1.f * var0.b + var1.j * var0.c;
      var2.o += var1.c * var0.a + var1.g * var0.b + var1.k * var0.c;
      var2.p += var1.d * var0.a + var1.h * var0.b + var1.l * var0.c;
      return var2;
   }

   public iB a(iI var1, iB var2) {
      return a(var1, this, var2);
   }

   public static iB a(iI var0, iB var1, iB var2) {
      if (var2 == null) {
         var2 = new iB();
      }

      var2.m += var1.a * var0.a + var1.e * var0.b;
      var2.n += var1.b * var0.a + var1.f * var0.b;
      var2.o += var1.c * var0.a + var1.g * var0.b;
      var2.p += var1.d * var0.a + var1.h * var0.b;
      return var2;
   }

   public iB d(iB var1) {
      return b(this, var1);
   }

   public static iB b(iB var0, iB var1) {
      if (var1 == null) {
         var1 = new iB();
      }

      float var2 = var0.a;
      float var3 = var0.e;
      float var4 = var0.i;
      float var5 = var0.m;
      float var6 = var0.b;
      float var7 = var0.f;
      float var8 = var0.j;
      float var9 = var0.n;
      float var10 = var0.c;
      float var11 = var0.g;
      float var12 = var0.k;
      float var13 = var0.o;
      float var14 = var0.d;
      float var15 = var0.h;
      float var16 = var0.l;
      float var17 = var0.p;
      var1.a = var2;
      var1.b = var3;
      var1.c = var4;
      var1.d = var5;
      var1.e = var6;
      var1.f = var7;
      var1.g = var8;
      var1.h = var9;
      var1.i = var10;
      var1.j = var11;
      var1.k = var12;
      var1.l = var13;
      var1.m = var14;
      var1.n = var15;
      var1.o = var16;
      var1.p = var17;
      return var1;
   }

   @Override
   public float f() {
      float var1 = this.a
         * (
            this.f * this.k * this.p
               + this.g * this.l * this.n
               + this.h * this.j * this.o
               - this.h * this.k * this.n
               - this.f * this.l * this.o
               - this.g * this.j * this.p
         );
      var1 -= this.b
         * (
            this.e * this.k * this.p
               + this.g * this.l * this.m
               + this.h * this.i * this.o
               - this.h * this.k * this.m
               - this.e * this.l * this.o
               - this.g * this.i * this.p
         );
      var1 += this.c
         * (
            this.e * this.j * this.p
               + this.f * this.l * this.m
               + this.h * this.i * this.n
               - this.h * this.j * this.m
               - this.e * this.l * this.n
               - this.f * this.i * this.p
         );
      return var1
         - this.d
            * (
               this.e * this.j * this.o
                  + this.f * this.k * this.m
                  + this.g * this.i * this.n
                  - this.g * this.j * this.m
                  - this.e * this.k * this.n
                  - this.f * this.i * this.o
            );
   }

   private static float a(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return var0 * (var4 * var8 - var5 * var7) + var1 * (var5 * var6 - var3 * var8) + var2 * (var3 * var7 - var4 * var6);
   }

   @Override
   public iy b() {
      return c(this, this);
   }

   public static iB c(iB var0, iB var1) {
      float var2 = var0.f();
      if (var2 != 0.0F) {
         if (var1 == null) {
            var1 = new iB();
         }

         float var3 = 1.0F / var2;
         float var4 = a(var0.f, var0.g, var0.h, var0.j, var0.k, var0.l, var0.n, var0.o, var0.p);
         float var5 = -a(var0.e, var0.g, var0.h, var0.i, var0.k, var0.l, var0.m, var0.o, var0.p);
         float var6 = a(var0.e, var0.f, var0.h, var0.i, var0.j, var0.l, var0.m, var0.n, var0.p);
         float var7 = -a(var0.e, var0.f, var0.g, var0.i, var0.j, var0.k, var0.m, var0.n, var0.o);
         float var8 = -a(var0.b, var0.c, var0.d, var0.j, var0.k, var0.l, var0.n, var0.o, var0.p);
         float var9 = a(var0.a, var0.c, var0.d, var0.i, var0.k, var0.l, var0.m, var0.o, var0.p);
         float var10 = -a(var0.a, var0.b, var0.d, var0.i, var0.j, var0.l, var0.m, var0.n, var0.p);
         float var11 = a(var0.a, var0.b, var0.c, var0.i, var0.j, var0.k, var0.m, var0.n, var0.o);
         float var12 = a(var0.b, var0.c, var0.d, var0.f, var0.g, var0.h, var0.n, var0.o, var0.p);
         float var13 = -a(var0.a, var0.c, var0.d, var0.e, var0.g, var0.h, var0.m, var0.o, var0.p);
         float var14 = a(var0.a, var0.b, var0.d, var0.e, var0.f, var0.h, var0.m, var0.n, var0.p);
         float var15 = -a(var0.a, var0.b, var0.c, var0.e, var0.f, var0.g, var0.m, var0.n, var0.o);
         float var16 = -a(var0.b, var0.c, var0.d, var0.f, var0.g, var0.h, var0.j, var0.k, var0.l);
         float var17 = a(var0.a, var0.c, var0.d, var0.e, var0.g, var0.h, var0.i, var0.k, var0.l);
         float var18 = -a(var0.a, var0.b, var0.d, var0.e, var0.f, var0.h, var0.i, var0.j, var0.l);
         float var19 = a(var0.a, var0.b, var0.c, var0.e, var0.f, var0.g, var0.i, var0.j, var0.k);
         var1.a = var4 * var3;
         var1.f = var9 * var3;
         var1.k = var14 * var3;
         var1.p = var19 * var3;
         var1.b = var8 * var3;
         var1.e = var5 * var3;
         var1.i = var6 * var3;
         var1.c = var12 * var3;
         var1.g = var13 * var3;
         var1.j = var10 * var3;
         var1.d = var16 * var3;
         var1.m = var7 * var3;
         var1.h = var17 * var3;
         var1.n = var11 * var3;
         var1.o = var15 * var3;
         var1.l = var18 * var3;
         return var1;
      } else {
         return null;
      }
   }

   @Override
   public iy c() {
      return this.e(this);
   }

   public iB e(iB var1) {
      return d(this, var1);
   }

   public static iB d(iB var0, iB var1) {
      if (var1 == null) {
         var1 = new iB();
      }

      var1.a = -var0.a;
      var1.b = -var0.b;
      var1.c = -var0.c;
      var1.d = -var0.d;
      var1.e = -var0.e;
      var1.f = -var0.f;
      var1.g = -var0.g;
      var1.h = -var0.h;
      var1.i = -var0.i;
      var1.j = -var0.j;
      var1.k = -var0.k;
      var1.l = -var0.l;
      var1.m = -var0.m;
      var1.n = -var0.n;
      var1.o = -var0.o;
      var1.p = -var0.p;
      return var1;
   }
}
