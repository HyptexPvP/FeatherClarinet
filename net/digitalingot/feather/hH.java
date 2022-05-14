package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.gui.FeatherFontRender;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class hH {
   public static final int a = 12;
   private static final FeatherFontRender b = new FeatherFontRender();
   private static hH c;
   private CoreMod.a d = null;
   private double e = 1.0;
   private double f = 0.0;
   private double g = 0.0;

   protected hH() {
      Minecraft.func_71410_x().func_175599_af().field_77023_b = 200.0F;
   }

   private CoreMod.a e() {
      if (this.d == null) {
         this.d = net.digitalingot.feather.e.c().b().<CoreMod>b(CoreMod.class).k();
      }

      return this.d;
   }

   public static hH a() {
      if (c == null) {
         c = new hH();
      }

      return c;
   }

   public static FeatherFontRender b() {
      return b;
   }

   public final void a(MatrixUtils var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, -1);
   }

   public final void a(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, var6, 1.0F);
   }

   public final void a(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = var2 + var4;
      int var9 = var3 + var5;
      float var10;
      float var11;
      float var12;
      float var13;
      if (var6 != -1) {
         var10 = (float)(var6 >> 24 & 0xFF) / 255.0F;
         var11 = (float)(var6 >> 16 & 0xFF) / 255.0F;
         var12 = (float)(var6 >> 8 & 0xFF) / 255.0F;
         var13 = (float)(var6 & 0xFF) / 255.0F;
      } else {
         var13 = 1.0F;
         var12 = 1.0F;
         var11 = 1.0F;
         var10 = 1.0F;
      }

      boolean var14 = var7 != 0.1F;
      if (var14) {
         RenderUtil.a(var7);
      }

      RenderUtil var15 = RenderUtil.r();
      var15.b(RenderUtil.a.LINE_STRIP, DefaultVertexFormats.field_181706_f);
      var15.a(var1, (double)var2, (double)var9, 0.0).b(var11, var12, var13, var10).s();
      var15.a(var1, (double)var8, (double)var9, 0.0).b(var11, var12, var13, var10).s();
      var15.a(var1, (double)var8, (double)var3, 0.0).b(var11, var12, var13, var10).s();
      var15.a(var1, (double)var2, (double)var3, 0.0).b(var11, var12, var13, var10).s();
      var15.a(var1, (double)var2, (double)var9, 0.0).b(var11, var12, var13, var10).s();
      var15.t();
      if (var14) {
         RenderUtil.a(1.0F);
      }

   }

   @Deprecated
   public final void a(int var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, false);
   }

   public final void b(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, var6, false);
   }

   @Deprecated
   public final void a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = Math.round(this.a((float)var1));
      int var8 = Math.round(this.b((float)var2));
      int var9 = Math.round(this.a((float)var3));
      int var10 = Math.round(this.b((float)var4));
      this.a(new MatrixUtils(), var7, var8, var9, var10, var5, var6);
   }

   public final void a(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var7) {
         CoreMod.a var8 = this.e();
         if (var8.l == hI.NORMAL) {
            double var9 = var8.m;
            long var11 = System.currentTimeMillis();
            float var13 = (float)(((double)var11 - (double)(var2 * 100) / var9 - (double)(var3 * 100) / var9) % (50000.0 / var9) / (50000.0 / var9));
            int var14 = Math.abs(var4 - var2);
            float var15 = (float)(((double)var11 - (double)((var2 + var14) * 100) / var9 - (double)(var3 * 100) / var9) % (50000.0 / var9) / (50000.0 / var9));
            int var16 = Color.HSBtoRGB(var13, 0.8F, 0.8F);
            int var17 = Color.HSBtoRGB(var15, 0.8F, 0.8F);
            this.c(var1, var2, var3, var4, var5, var16, var17);
         } else {
            this.c(var1, var2, var3, var4, var5, this.c());
         }
      } else {
         this.c(var1, var2, var3, var4, var5, var6);
      }

   }

   private void c(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 < var4) {
         int var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      if (var3 < var5) {
         int var13 = var3;
         var3 = var5;
         var5 = var13;
      }

      float var8 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var9 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var6 & 0xFF) / 255.0F;
      RenderUtil.i();
      RenderUtil.m();
      RenderUtil.a(770, 771, 1, 0);
      RenderUtil var12 = RenderUtil.r();
      var12.b(RenderUtil.a.QUADS, DefaultVertexFormats.field_181706_f);
      var12.a(var1, (double)var2, (double)var5, 0.0).b(var9, var10, var11, var8).s();
      var12.a(var1, (double)var4, (double)var5, 0.0).b(var9, var10, var11, var8).s();
      var12.a(var1, (double)var4, (double)var3, 0.0).b(var9, var10, var11, var8).s();
      var12.a(var1, (double)var2, (double)var3, 0.0).b(var9, var10, var11, var8).s();
      var12.t();
      RenderUtil.n();
      RenderUtil.j();
   }

   @Deprecated
   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = Math.round(this.a((float)var1));
      int var8 = Math.round(this.b((float)var2));
      int var9 = var7 + var3;
      int var10 = var8 + var4;
      this.c(new MatrixUtils(), var7, var8, var9, var10, var5, var6);
   }

   public void a(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var4;
      int var9 = var3 + var5;
      this.c(var1, var2, var3, var8, var9, var6, var7);
   }

   private void c(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 < var4) {
         int var8 = var2;
         var2 = var4;
         var4 = var8;
      }

      if (var3 < var5) {
         int var17 = var3;
         var3 = var5;
         var5 = var17;
      }

      int var18 = var6 >> 24 & 0xFF;
      int var9 = var6 >> 16 & 0xFF;
      int var10 = var6 >> 8 & 0xFF;
      int var11 = var6 >> 0 & 0xFF;
      int var12 = var7 >> 24 & 0xFF;
      int var13 = var7 >> 16 & 0xFF;
      int var14 = var7 >> 8 & 0xFF;
      int var15 = var7 >> 0 & 0xFF;
      RenderUtil.m();
      RenderUtil.i();
      RenderUtil.a();
      RenderUtil.a(770, 771, 1, 0);
      RenderUtil.a(7425);
      RenderUtil var16 = RenderUtil.r();
      var16.b(RenderUtil.a.TRIANGLE_STRIP, DefaultVertexFormats.field_181706_f);
      var16.a(var1, (double)var4, (double)var5, 0.0).b(var9, var10, var11, var18).s();
      var16.a(var1, (double)var4, (double)var3, 0.0).b(var9, var10, var11, var18).s();
      var16.a(var1, (double)var2, (double)var5, 0.0).b(var13, var14, var15, var12).s();
      var16.a(var1, (double)var2, (double)var3, 0.0).b(var13, var14, var15, var12).s();
      var16.t();
      RenderUtil.a(7424);
      RenderUtil.j();
      RenderUtil.b();
      RenderUtil.n();
   }

   @Deprecated
   public void a(String var1, float var2, float var3, ChromaColor var4, boolean var5) {
      this.a(new MatrixUtils(), var1, this.a(var2), this.b(var3), var4, var5);
   }

   public void a(MatrixUtils var1, String var2, float var3, float var4, ChromaColor var5, boolean var6) {
      this.a(var1, var2, var3, var4, var5.a(), var6, var5.b());
   }

   @Deprecated
   public void a(String var1, float var2, float var3, int var4, boolean var5, boolean var6) {
      this.a(new MatrixUtils(), var1, this.a(var2), this.b(var3), var4, var5, var6);
   }

   public void a(MatrixUtils var1, String var2, float var3, float var4, int var5, boolean var6, boolean var7) {
      if (var7) {
         int var8 = var5 >> 24 & 0xFF;
         this.a(var1, var2, var3, var4, var8, var6);
      } else {
         RenderUtil.a(var1, var2, var3, var4, var5, var6);
      }

   }

   protected void a(MatrixUtils var1, String var2, float var3, float var4, int var5, boolean var6) {
      var2 = ib.a(var2);
      CoreMod.a var7 = this.e();
      switch(var7.l) {
         case BREATHING:
            Color var17 = new Color(this.c(), true);
            var17 = new Color(var17.getRed(), var17.getGreen(), var17.getBlue(), var17.getAlpha() * var5 / 255);
            this.a(var1, var2, var3, var4, var17.getRGB(), var6, false);
            break;
         case NORMAL:
            for(char var11 : var2.toCharArray()) {
               float var12 = (float)(
                  ((double)System.currentTimeMillis() - ((double)var3 * this.e - this.f) * 100.0 / var7.m - ((double)var4 * this.e - this.g) * 100.0 / var7.m)
                     % (50000.0 / var7.m)
                     / (50000.0 / var7.m)
               );
               int var13 = Color.HSBtoRGB(var12, 0.8F, 0.8F);
               Color var14 = new Color(var13, true);
               var14 = new Color(var14.getRed(), var14.getGreen(), var14.getBlue(), var14.getAlpha() * var5 / 255);
               String var15 = String.valueOf(var11);
               this.a(var1, var15, var3, var4, var14.getRGB(), var6, false);
               var3 += (float)this.a(var15);
            }
      }

   }

   public int c() {
      double var1 = 50000.0 / this.e().m;
      double var3 = (double)System.currentTimeMillis() % var1 / var1;
      return Color.HSBtoRGB((float)var3, 0.8F, 0.8F);
   }

   public int a(String var1) {
      return b.func_78256_a(var1);
   }

   @Deprecated
   public void a(ItemStack var1, int var2, int var3, boolean var4, boolean var5) {
      var2 = Math.round(this.a((float)var2));
      var3 = Math.round(this.b((float)var3));
      RenderUtil.g();
      RenderHelper.func_74519_b();
      RenderHelper.func_74520_c();
      Minecraft.func_71410_x().func_175599_af().func_180450_b(var1, var2, var3);
      if.a(b, var1, var2, var3, var4, var5);
      RenderHelper.func_74518_a();
      RenderUtil.h();
   }

   public void a(MatrixUtils var1, ItemStack var2, int var3, int var4, boolean var5, boolean var6) {
      RenderUtil.g();
      RenderHelper.func_74519_b();
      RenderHelper.func_74520_c();
      var1.a(() -> Minecraft.func_71410_x().func_175599_af().func_180450_b(var2, var3, var4));
      RenderHelper.func_74518_a();
      RenderUtil.h();
   }

   @Deprecated
   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.b(new MatrixUtils(), Math.round(this.a((float)var1)), Math.round(this.b((float)var2)), var3, var4, var5, var6);
   }

   public void b(MatrixUtils var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, (float)var4, (float)var5, var6, var7, var6, var7, 256.0F, 256.0F);
   }

   @Deprecated
   public void a(int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      this.a(new MatrixUtils(), Math.round(this.a((float)var1)), Math.round(this.b((float)var2)), var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public void a(MatrixUtils var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, -1);
   }

   @Deprecated
   public void a(int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10, int var11) {
      this.a(new MatrixUtils(), Math.round(this.a((float)var1)), Math.round(this.b((float)var2)), var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public void a(MatrixUtils var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12) {
      float var13 = 1.0F / var10;
      float var14 = 1.0F / var11;
      float var15 = (float)(var12 >> 24 & 0xFF) / 255.0F;
      float var16 = (float)(var12 >> 16 & 0xFF) / 255.0F;
      float var17 = (float)(var12 >> 8 & 0xFF) / 255.0F;
      float var18 = (float)(var12 & 0xFF) / 255.0F;
      RenderUtil var19 = RenderUtil.r();
      var19.b(RenderUtil.a.QUADS, DefaultVertexFormats.field_181709_i);
      var19.a(var1, (double)var2, (double)(var3 + var9), 0.0)
         .a((double)(var4 * var13), (double)((var5 + (float)var7) * var14))
         .b(var16, var17, var18, var15)
         .s();
      var19.a(var1, (double)(var2 + var8), (double)(var3 + var9), 0.0)
         .a((double)((var4 + (float)var6) * var13), (double)((var5 + (float)var7) * var14))
         .b(var16, var17, var18, var15)
         .s();
      var19.a(var1, (double)(var2 + var8), (double)var3, 0.0)
         .a((double)((var4 + (float)var6) * var13), (double)(var5 * var14))
         .b(var16, var17, var18, var15)
         .s();
      var19.a(var1, (double)var2, (double)var3, 0.0).a((double)(var4 * var13), (double)(var5 * var14)).b(var16, var17, var18, var15).s();
      var19.t();
   }

   public void a(
      MatrixUtils var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13
   ) {
      float var14 = 1.0F / var10;
      float var15 = 1.0F / var11;
      int var16 = var12 >> 24 & 0xFF;
      int var17 = var12 >> 16 & 0xFF;
      int var18 = var12 >> 8 & 0xFF;
      int var19 = var12 >> 0 & 0xFF;
      int var20 = var13 >> 24 & 0xFF;
      int var21 = var13 >> 16 & 0xFF;
      int var22 = var13 >> 8 & 0xFF;
      int var23 = var13 >> 0 & 0xFF;
      RenderUtil.i();
      RenderUtil.a();
      RenderUtil.a(770, 771, 1, 0);
      RenderUtil.a(7425);
      boolean var24 = GL11.glIsEnabled(2848);
      if (!var24) {
         GL11.glEnable(2848);
      }

      RenderUtil var25 = RenderUtil.r();
      var25.b(RenderUtil.a.TRIANGLE_STRIP, DefaultVertexFormats.field_181709_i);
      var25.a(var1, (double)(var2 + var8), (double)(var3 + var9), 0.0)
         .a((double)((var4 + (float)var6) * var14), (double)((var5 + (float)var7) * var15))
         .b(var21, var22, var23, var20)
         .s();
      var25.a(var1, (double)(var2 + var8), (double)var3, 0.0)
         .a((double)((var4 + (float)var6) * var14), (double)(var5 * var15))
         .b(var21, var22, var23, var20)
         .s();
      var25.a(var1, (double)var2, (double)(var3 + var9), 0.0)
         .a((double)(var4 * var14), (double)((var5 + (float)var7) * var15))
         .b(var17, var18, var19, var16)
         .s();
      var25.a(var1, (double)var2, (double)var3, 0.0).a((double)(var4 * var14), (double)(var5 * var15)).b(var17, var18, var19, var16).s();
      var25.t();
      if (!var24) {
         GL11.glDisable(2848);
      }

      RenderUtil.a(7424);
      RenderUtil.j();
      RenderUtil.b();
      RenderUtil.n();
   }

   public void a(AxisAlignedBB var1, float var2, float var3, float var4, float var5) {
      this.a(var1.field_72340_a, var1.field_72338_b, var1.field_72339_c, var1.field_72336_d, var1.field_72337_e, var1.field_72334_f, var2, var3, var4, var5);
   }

   public void a(double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      Tessellator var17 = Tessellator.func_178181_a();
      WorldRenderer var18 = var17.func_178180_c();
      var18.func_181668_a(3, DefaultVertexFormats.field_181706_f);
      this.a(var18, var1, var3, var5, var7, var9, var11, var13, var14, var15, var16);
      var17.func_78381_a();
   }

   public void a(
      WorldRenderer var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14, float var15, float var16, float var17
   ) {
      var1.func_181662_b(var2, var4, var6).func_181666_a(var14, var15, var16, 0.0F).func_181675_d();
      var1.func_181662_b(var2, var4, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var4, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var4, var12).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var2, var4, var12).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var2, var4, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var2, var10, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var10, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var10, var12).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var2, var10, var12).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var2, var10, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var2, var10, var12).func_181666_a(var14, var15, var16, 0.0F).func_181675_d();
      var1.func_181662_b(var2, var4, var12).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var10, var12).func_181666_a(var14, var15, var16, 0.0F).func_181675_d();
      var1.func_181662_b(var8, var4, var12).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var10, var6).func_181666_a(var14, var15, var16, 0.0F).func_181675_d();
      var1.func_181662_b(var8, var4, var6).func_181666_a(var14, var15, var16, var17).func_181675_d();
      var1.func_181662_b(var8, var4, var6).func_181666_a(var14, var15, var16, 0.0F).func_181675_d();
   }

   public void d() {
      this.e = 1.0;
      this.f = 0.0;
      this.g = 0.0;
   }

   public void a(double var1, double var3, double var5) {
      this.e = var1;
      this.f = var3;
      this.g = var5;
   }

   protected float a(float var1) {
      return var1;
   }

   protected float b(float var1) {
      return var1;
   }
}
