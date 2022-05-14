package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class fs {
   private static WorldRenderer a(Color var0, Tessellator var1) {
      WorldRenderer var2 = var1.func_178180_c();
      RenderUtil.i();
      RenderUtil.m();
      RenderUtil.a(770, 771, 1, 0);
      return var2;
   }

   public static void a(double var0, double var2, int var4, Color var5) {
      int var6 = var5.getRed();
      int var7 = var5.getGreen();
      int var8 = var5.getBlue();
      int var9 = var5.getAlpha();
      Tessellator var10 = Tessellator.func_178181_a();
      WorldRenderer var11 = a(var5, var10);
      var11.func_181668_a(3, DefaultVertexFormats.field_181706_f);

      for(int var12 = 0; var12 <= 360; ++var12) {
         float var13 = (float)((double)var12 * Math.PI / 180.0);
         var11.func_181662_b(var0 + Math.cos((double)var13) * (double)var4, var2 + Math.sin((double)var13) * (double)var4, 0.0)
            .func_181669_b(var6, var7, var8, var9)
            .func_181675_d();
      }

      var10.func_78381_a();
      RenderUtil.n();
      RenderUtil.j();
   }

   public static void a(int var0, int var1, int var2, int var3, Color var4) {
      if (var0 < var2) {
         int var5 = var0;
         var0 = var2;
         var2 = var5;
      }

      if (var1 < var3) {
         int var11 = var1;
         var1 = var3;
         var3 = var11;
      }

      int var12 = var4.getRed();
      int var6 = var4.getGreen();
      int var7 = var4.getBlue();
      int var8 = var4.getAlpha();
      Tessellator var9 = Tessellator.func_178181_a();
      WorldRenderer var10 = a(var4, var9);
      var10.func_181668_a(7, DefaultVertexFormats.field_181706_f);
      var10.func_181662_b((double)var0, (double)var3, 0.0).func_181669_b(var12, var6, var7, var8).func_181675_d();
      var10.func_181662_b((double)var2, (double)var3, 0.0).func_181669_b(var12, var6, var7, var8).func_181675_d();
      var10.func_181662_b((double)var2, (double)var1, 0.0).func_181669_b(var12, var6, var7, var8).func_181675_d();
      var10.func_181662_b((double)var0, (double)var1, 0.0).func_181669_b(var12, var6, var7, var8).func_181675_d();
      var9.func_78381_a();
      RenderUtil.n();
      RenderUtil.j();
   }

   public static void a(int var0, int var1, int var2, Color var3, int var4) {
      a(var1, var0, var2 + var4, var0 + var4, var3);
   }

   public static void b(int var0, int var1, int var2, int var3, Color var4) {
      int var5 = var4.getRed();
      int var6 = var4.getBlue();
      int var7 = var4.getGreen();
      int var8 = var4.getAlpha();
      Tessellator var9 = Tessellator.func_178181_a();
      WorldRenderer var10 = a(var4, var9);
      var10.func_181668_a(3, DefaultVertexFormats.field_181706_f);
      var10.func_181662_b((double)var0, (double)var1, 0.0).func_181669_b(var5, var7, var6, var8).func_181675_d();
      var10.func_181662_b((double)var2, (double)var3, 0.0).func_181669_b(var5, var7, var6, var8).func_181675_d();
      var9.func_78381_a();
      RenderUtil.n();
      RenderUtil.j();
   }

   public static void a(int var0, int var1, int var2, int var3, Color var4, int var5) {
      a(var1, var0, var2, var4, var5);
      a(var3, var0, var2, var4, var5);
      b(var0, var1, var3, var4, var5);
      b(var2, var1, var3, var4, var5);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      float var6 = 0.00390625F;
      float var7 = 0.00390625F;
      Tessellator var8 = Tessellator.func_178181_a();
      WorldRenderer var9 = var8.func_178180_c();
      var9.func_181668_a(7, DefaultVertexFormats.field_181707_g);
      var9.func_181662_b((double)var0, (double)(var1 + var5), 0.0)
         .func_181673_a((double)((float)var2 * var6), (double)((float)(var3 + var5) * var7))
         .func_181675_d();
      var9.func_181662_b((double)(var0 + var4), (double)(var1 + var5), 0.0)
         .func_181673_a((double)((float)(var2 + var4) * var6), (double)((float)(var3 + var5) * var7))
         .func_181675_d();
      var9.func_181662_b((double)(var0 + var4), (double)var1, 0.0)
         .func_181673_a((double)((float)(var2 + var4) * var6), (double)((float)var3 * var7))
         .func_181675_d();
      var9.func_181662_b((double)var0, (double)var1, 0.0).func_181673_a((double)((float)var2 * var6), (double)((float)var3 * var7)).func_181675_d();
      var8.func_78381_a();
   }

   public static void b(int var0, int var1, int var2, Color var3, int var4) {
      a(var0, var1, var0 + var4, var2 + var4, var3);
   }

   public static int a(String var0) {
      return hH.b().func_78256_a(var0);
   }
}
