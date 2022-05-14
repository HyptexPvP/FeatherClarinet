package net.digitalingot.feather;

import java.awt.Rectangle;
import java.nio.ByteBuffer;
import org.cef.ICefRenderer;
import org.lwjgl.opengl.GL11;

abstract class aU implements ICefRenderer {
   private boolean f = false;
   protected int a = 0;
   protected int b = 0;
   protected Rectangle c = new Rectangle(0, 0, 0, 0);
   protected Rectangle d = new Rectangle(0, 0, 0, 0);
   protected int e = 0;

   protected void a() {
      this.e();
   }

   public void b() {
      this.f();
   }

   protected abstract boolean c();

   public void onPaint(boolean var1, Rectangle[] var2, ByteBuffer var3, int var4, int var5) {
      boolean var6 = !var1;
      boolean var7 = var1 && this.c.width > 0 && this.c.height > 0;
      if (var6 || var7) {
         int var8 = GL11.glGetInteger(32873);
         boolean var9 = GL11.glIsEnabled(3042);
         boolean var10 = this.c();
         if (!var9) {
            GL11.glEnable(3042);
         }

         if (!var10) {
            GL11.glEnable(3553);
         }

         if (!this.f) {
            this.a();
            this.f = true;
         } else {
            GL11.glBindTexture(3553, this.e);
         }

         int var11 = GL11.glGetInteger(3317);
         int var12 = GL11.glGetInteger(3314);
         int var13 = GL11.glGetInteger(3316);
         int var14 = GL11.glGetInteger(3315);
         GL11.glPixelStorei(3317, 1);
         if (var6) {
            int var15 = this.a;
            int var16 = this.b;
            this.a = var4;
            this.b = var5;
            GL11.glPixelStorei(3314, this.a);
            if (var15 == this.a && var16 == this.b) {
               for(Rectangle var20 : var2) {
                  GL11.glPixelStorei(3316, var20.x);
                  GL11.glPixelStorei(3315, var20.y);
                  GL11.glTexSubImage2D(3553, 0, var20.x, var20.y, var20.width, var20.height, 32993, 33639, var3);
               }
            } else {
               GL11.glPixelStorei(3316, 0);
               GL11.glPixelStorei(3315, 0);
               GL11.glTexImage2D(3553, 0, 6408, this.a, this.b, 0, 32993, 33639, var3);
            }
         } else {
            int var21 = 0;
            int var22 = 0;
            int var23 = this.c.x;
            int var24 = this.c.y;
            int var25 = var4;
            int var26 = var5;
            if (var23 < 0) {
               var21 = -var23;
               var23 = 0;
            }

            if (var24 < 0) {
               var22 = -var24;
               var24 = 0;
            }

            if (var23 + var4 > this.a) {
               var25 = var4 - (var23 + var4 - this.a);
            }

            if (var24 + var5 > this.b) {
               var26 = var5 - (var24 + var5 - this.b);
            }

            GL11.glPixelStorei(3314, var4);
            GL11.glPixelStorei(3316, var21);
            GL11.glPixelStorei(3315, var22);
            GL11.glTexSubImage2D(3553, 0, var23, var24, var25, var26, 32993, 33639, var3);
         }

         GL11.glPixelStorei(3317, var11);
         GL11.glPixelStorei(3314, var12);
         GL11.glPixelStorei(3316, var13);
         GL11.glPixelStorei(3315, var14);
         GL11.glBindTexture(3553, var8);
         if (!var9) {
            GL11.glDisable(3042);
         }

         if (!var10) {
            GL11.glDisable(3553);
         }

      }
   }

   public void onPopupSize(Rectangle var1) {
      if (var1.width > 0 && var1.height > 0) {
         this.d = var1;
         this.c = this.a(this.d);
      }
   }

   public void onPopupClosed() {
      this.c.setBounds(0, 0, 0, 0);
      this.d.setBounds(0, 0, 0, 0);
   }

   protected Rectangle a(Rectangle var1) {
      if (var1.x < 0) {
         var1.x = 0;
      }

      if (var1.y < 0) {
         var1.y = 0;
      }

      if (var1.x + var1.width > this.a) {
         var1.x = this.a - var1.width;
      }

      if (var1.y + var1.height > this.b) {
         var1.y = this.b - var1.height;
      }

      if (var1.x < 0) {
         var1.x = 0;
      }

      if (var1.y < 0) {
         var1.y = 0;
      }

      return var1;
   }

   private void e() {
      this.e = GL11.glGenTextures();
      GL11.glBindTexture(3553, this.e);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
   }

   private void f() {
      if (this.e != 0) {
         GL11.glDeleteTextures(this.e);
         this.e = 0;
      }

   }

   protected final boolean d() {
      return this.f && this.a != 0 && this.b != 0;
   }
}
