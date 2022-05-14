package net.digitalingot.feather;

import java.nio.FloatBuffer;

public class iC extends iH implements iG {
   private static final long e = 1L;
   public float a;
   public float b;
   public float c;
   public float d;

   public iC() {
      this.a();
   }

   public iC(iG var1) {
      this.a(var1);
   }

   public iC(float var1, float var2, float var3, float var4) {
      this.a(var1, var2, var3, var4);
   }

   public void a(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public iC a(iG var1) {
      this.a = var1.d();
      this.b = var1.e();
      this.c = var1.f();
      this.d = var1.g();
      return this;
   }

   public iC a() {
      return a(this);
   }

   public static iC a(iC var0) {
      var0.a = 0.0F;
      var0.b = 0.0F;
      var0.c = 0.0F;
      var0.d = 1.0F;
      return var0;
   }

   @Override
   public float b() {
      return this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
   }

   public static iC a(iC var0, iC var1) {
      float var2 = 1.0F / var0.h();
      if (var1 == null) {
         var1 = new iC();
      }

      var1.a(var0.a * var2, var0.b * var2, var0.c * var2, var0.d * var2);
      return var1;
   }

   public iC b(iC var1) {
      return a(this, var1);
   }

   public static float b(iC var0, iC var1) {
      return var0.a * var1.a + var0.b * var1.b + var0.c * var1.c + var0.d * var1.d;
   }

   public iC c(iC var1) {
      return c(this, var1);
   }

   public static iC c(iC var0, iC var1) {
      if (var1 == null) {
         var1 = new iC();
      }

      var1.a = -var0.a;
      var1.b = -var0.b;
      var1.c = -var0.c;
      var1.d = var0.d;
      return var1;
   }

   @Override
   public iH c() {
      return c(this, this);
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
      return a(var1, this, this);
   }

   public static iC a(float var0, iC var1, iC var2) {
      if (var2 == null) {
         var2 = new iC();
      }

      var2.a = var1.a * var0;
      var2.b = var1.b * var0;
      var2.c = var1.c * var0;
      var2.d = var1.d * var0;
      return var2;
   }

   @Override
   public iH b(FloatBuffer var1) {
      var1.put(this.a);
      var1.put(this.b);
      var1.put(this.c);
      var1.put(this.d);
      return this;
   }

   @Override
   public final float d() {
      return this.a;
   }

   @Override
   public final float e() {
      return this.b;
   }

   public final void b(float var1) {
      this.a = var1;
   }

   public final void c(float var1) {
      this.b = var1;
   }

   public void d(float var1) {
      this.c = var1;
   }

   @Override
   public float f() {
      return this.c;
   }

   public void e(float var1) {
      this.d = var1;
   }

   @Override
   public float g() {
      return this.d;
   }

   public String toString() {
      return "Quaternion: " + this.a + " " + this.b + " " + this.c + " " + this.d;
   }

   public static iC a(iC var0, iC var1, iC var2) {
      if (var2 == null) {
         var2 = new iC();
      }

      var2.a(
         var0.a * var1.d + var0.d * var1.a + var0.b * var1.c - var0.c * var1.b,
         var0.b * var1.d + var0.d * var1.b + var0.c * var1.a - var0.a * var1.c,
         var0.c * var1.d + var0.d * var1.c + var0.a * var1.b - var0.b * var1.a,
         var0.d * var1.d - var0.a * var1.a - var0.b * var1.b - var0.c * var1.c
      );
      return var2;
   }

   public static iC b(iC var0, iC var1, iC var2) {
      float var3 = var1.b();
      var3 = (double)var3 == 0.0 ? var3 : 1.0F / var3;
      if (var2 == null) {
         var2 = new iC();
      }

      var2.a(
         (var0.a * var1.d - var0.d * var1.a - var0.b * var1.c + var0.c * var1.b) * var3,
         (var0.b * var1.d - var0.d * var1.b - var0.c * var1.a + var0.a * var1.c) * var3,
         (var0.c * var1.d - var0.d * var1.c - var0.a * var1.b + var0.b * var1.a) * var3,
         (var0.d * var1.d + var0.a * var1.a + var0.b * var1.b + var0.c * var1.c) * var3
      );
      return var2;
   }

   public final void a(iK var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      float var2 = (float)Math.sqrt((double)(this.a * this.a + this.b * this.b + this.c * this.c));
      float var3 = (float)(Math.sin(0.5 * (double)var1.d) / (double)var2);
      this.a *= var3;
      this.b *= var3;
      this.c *= var3;
      this.d = (float)Math.cos(0.5 * (double)var1.d);
   }

   public final iC a(iB var1) {
      return a(var1, this);
   }

   public static iC a(iB var0, iC var1) {
      return var1.a(var0.a, var0.b, var0.c, var0.e, var0.f, var0.g, var0.i, var0.j, var0.k);
   }

   public final iC a(iA var1) {
      return a(var1, this);
   }

   public static iC a(iA var0, iC var1) {
      return var1.a(var0.a, var0.b, var0.c, var0.d, var0.e, var0.f, var0.g, var0.h, var0.i);
   }

   private iC a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var11 = var1 + var5 + var9;
      if ((double)var11 >= 0.0) {
         float var10 = (float)Math.sqrt((double)var11 + 1.0);
         this.d = var10 * 0.5F;
         var10 = 0.5F / var10;
         this.a = (var8 - var6) * var10;
         this.b = (var3 - var7) * var10;
         this.c = (var4 - var2) * var10;
      } else {
         float var12 = Math.max(Math.max(var1, var5), var9);
         if (var12 == var1) {
            float var14 = (float)Math.sqrt((double)(var1 - (var5 + var9)) + 1.0);
            this.a = var14 * 0.5F;
            var14 = 0.5F / var14;
            this.b = (var2 + var4) * var14;
            this.c = (var7 + var3) * var14;
            this.d = (var8 - var6) * var14;
         } else if (var12 == var5) {
            float var16 = (float)Math.sqrt((double)(var5 - (var9 + var1)) + 1.0);
            this.b = var16 * 0.5F;
            var16 = 0.5F / var16;
            this.c = (var6 + var8) * var16;
            this.a = (var2 + var4) * var16;
            this.d = (var3 - var7) * var16;
         } else {
            float var18 = (float)Math.sqrt((double)(var9 - (var1 + var5)) + 1.0);
            this.c = var18 * 0.5F;
            var18 = 0.5F / var18;
            this.a = (var7 + var3) * var18;
            this.b = (var6 + var8) * var18;
            this.d = (var4 - var2) * var18;
         }
      }

      return this;
   }
}
