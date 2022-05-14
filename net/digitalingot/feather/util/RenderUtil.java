package net.digitalingot.feather.util;

import java.awt.Color;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormatElement.EnumUsage;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix3f;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public final class RenderUtil {
   public static final float a = 7.0F;
   public static final float b = 1.0F;
   public static final float c = 1.0F;
   private static final FontRenderer d = Minecraft.func_71410_x().field_71466_p;
   private static final TextureManager e = Minecraft.func_71410_x().func_110434_K();
   private final WorldRenderer f;
   private VertexFormat g;

   private RenderUtil() {
      throw new AssertionError();
   }

   private RenderUtil(WorldRenderer var1) {
      this.f = var1;
   }

   public static void a() {
      GlStateManager.func_179118_c();
   }

   public static void b() {
      GlStateManager.func_179141_d();
   }

   public static void a(int var0, float var1) {
      GlStateManager.func_179092_a(var0, var1);
   }

   public static void a(int var0) {
      GlStateManager.func_179103_j(var0);
   }

   public static void c() {
      GlStateManager.func_179145_e();
   }

   public static void d() {
      GlStateManager.func_179140_f();
   }

   public static void e() {
      GlStateManager.func_179126_j();
   }

   public static void f() {
      GlStateManager.func_179097_i();
   }

   public static void b(int var0) {
      GlStateManager.func_179143_c(var0);
   }

   public static void a(boolean var0) {
      GlStateManager.func_179132_a(var0);
   }

   public static void g() {
      GlStateManager.func_179091_B();
   }

   public static void h() {
      GlStateManager.func_179101_C();
   }

   public static void i() {
      GlStateManager.func_179147_l();
   }

   public static void j() {
      GlStateManager.func_179084_k();
   }

   public static void k() {
      GlStateManager.func_179129_p();
   }

   public static void l() {
      GlStateManager.func_179129_p();
   }

   public static void a(int var0, int var1, int var2, int var3) {
      GlStateManager.func_179120_a(var0, var1, var2, var3);
   }

   public static void a(int var0, int var1) {
      GlStateManager.func_179112_b(var0, var1);
   }

   @Deprecated
   public static void m() {
      GlStateManager.func_179090_x();
   }

   @Deprecated
   public static void n() {
      GlStateManager.func_179098_w();
   }

   public static void a(float var0, float var1, float var2, float var3) {
      GlStateManager.func_179131_c(var0, var1, var2, var3);
   }

   public static void a(float var0, float var1, float var2) {
      GlStateManager.func_179124_c(var0, var1, var2);
   }

   public static void a(float var0) {
      GL11.glLineWidth(var0);
   }

   public static float o() {
      return GL11.glGetFloat(2849);
   }

   public static void a(MatrixUtils var0, String var1, float var2, float var3, int var4, boolean var5) {
      if ((var4 >> 24 & 0xFF) > 10) {
         ScaleUtil.a();
         var0.e();
         d.func_175065_a(var1, var2, var3, var4, var5);
         ScaleUtil.b();
      }
   }

   public static void a(MatrixUtils var0, String var1, float var2, float var3, int var4, int var5) {
      if ((var4 >> 24 & 0xFF) > 10) {
         ScaleUtil.a();
         var0.e();
         d.func_175065_a(var1, var2 + 1.0F, var3 + 1.0F, var5, false);
         d.func_175065_a(var1, var2, var3, var4, false);
         ScaleUtil.b();
      }
   }

   public static int a(String var0) {
      return d.func_78256_a(var0);
   }

   public static float a(char var0) {
      return (float)d.func_78263_a(var0);
   }

   public static float b(boolean var0) {
      float var1 = 7.0F;
      if (var0) {
         ++var1;
      }

      return var1;
   }

   public static int p() {
      return GL11.glGetInteger(34016);
   }

   public static void c(int var0) {
      GlStateManager.func_179138_g(var0);
   }

   public static void a(int var0, Runnable var1) {
      int var2 = GL11.glGetInteger(32873);
      d(var0);
      var1.run();
      d(var2);
   }

   private static void d(int var0) {
      GlStateManager.func_179144_i(var0);
   }

   public static void b(int var0, int var1) {
      b(var0, () -> d(var1));
   }

   public static void a(int var0, ResourceLocation var1) {
      b(var0, a(var1));
   }

   private static int a(ResourceLocation var0) {
      Object var1 = e.func_110581_b(var0);
      if (var1 == null) {
         var1 = new SimpleTexture(var0);
         e.func_110579_a(var0, (ITextureObject)var1);
      }

      return ((ITextureObject)var1).func_110552_b();
   }

   public static void b(int var0, Runnable var1) {
      int var2 = p();
      c(33984 + var0);
      var1.run();
      c(var2);
   }

   public static Tessellator q() {
      return Tessellator.func_178181_a();
   }

   public static RenderUtil r() {
      return new RenderUtil(q().func_178180_c());
   }

   public RenderUtil a(MatrixUtils var1, double var2, double var4, double var6) {
      Vector4f var8 = new Vector4f((float)var2, (float)var4, (float)var6, 1.0F);
      Matrix4f.transform(var1.c().a(), var8, var8);
      this.f.func_181662_b((double)var8.getX(), (double)var8.getY(), (double)var8.getZ());
      return this;
   }

   public RenderUtil a(MatrixUtils var1, float var2, float var3, float var4) {
      Vector3f var5 = new Vector3f(var2, var3, var4);
      Matrix3f.transform(var1.c().b(), var5, var5);
      this.f.func_181663_c(var5.getX(), var5.getY(), var5.getZ());
      return this;
   }

   public RenderUtil b(int var1, int var2, int var3, int var4) {
      this.f.func_181669_b(var1, var2, var3, var4);
      return this;
   }

   public RenderUtil b(float var1, float var2, float var3, float var4) {
      this.f.func_181666_a(var1, var2, var3, var4);
      return this;
   }

   public RenderUtil a(Color var1) {
      return this.b(var1.getRed(), var1.getGreen(), var1.getBlue(), var1.getAlpha());
   }

   public RenderUtil s() {
      this.f.func_181675_d();
      return this;
   }

   public RenderUtil a(double var1, double var3) {
      this.f.func_181673_a(var1, var3);
      return this;
   }

   public RenderUtil a(RenderUtil.a var1, VertexFormat var2) {
      this.g = var2;
      this.f.func_181668_a(var1.vertexMode, var2);
      return this;
   }

   public RenderUtil b(RenderUtil.a var1, VertexFormat var2) {
      return this.a(var1, var2);
   }

   public void t() {
      this.w();
   }

   public void a(int var1, int var2, int var3) {
      this.f.func_181674_a((float)var1, (float)var2, (float)var3);
      this.w();
   }

   private static boolean[] a(VertexFormat var0) {
      EnumUsage var1 = EnumUsage.UV;
      boolean[] var2 = new boolean[2];

      for(VertexFormatElement var4 : var0.func_177343_g()) {
         if (var4.func_177375_c() == var1) {
            int var5 = var4.func_177369_e();
            if (var2.length <= var5) {
               var2 = Arrays.copyOf(var2, var5 + 1);
            }

            var2[var5] = true;
         }
      }

      return var2;
   }

   private void w() {
      VertexFormat var1 = this.g;
      if (var1 == null) {
         q().func_78381_a();
      } else {
         boolean[] var2 = a(var1);
         boolean[] var3 = new boolean[var2.length];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var4;
            b(var5, () -> {
               boolean var3x = var3[var5] = GL11.glIsEnabled(3553);
               boolean var4x = var2[var5];
               if (var3x != var4x) {
                  if (var4x) {
                     GlStateManager.func_179098_w();
                  } else {
                     GlStateManager.func_179090_x();
                  }
               }

            });
         }

         q().func_78381_a();

         for(int var6 = 0; var6 < var3.length; ++var6) {
            if (var3[var6] != var2[var6]) {
               if (var3[var6]) {
                  b(var6, GlStateManager::func_179098_w);
               } else {
                  b(var6, GlStateManager::func_179090_x);
               }
            }
         }

      }
   }

   @Deprecated
   public static void u() {
      ScaleUtil.a();
   }

   @Deprecated
   public static void v() {
      ScaleUtil.b();
   }

   @Deprecated
   public static void b(float var0, float var1, float var2) {
      ScaleUtil.a(var0, var1, var2);
   }

   @Deprecated
   public static void a(double var0, double var2, double var4) {
      ScaleUtil.a(var0, var2, var4);
   }

   @Deprecated
   public static void c(float var0, float var1, float var2, float var3) {
      ScaleUtil.a(var0, var1, var2, var3);
   }

   @Deprecated
   public static void c(float var0, float var1, float var2) {
      ScaleUtil.b(var0, var1, var2);
   }

   @Deprecated
   public static void b(double var0, double var2, double var4) {
      ScaleUtil.b(var0, var2, var4);
   }

   public static enum a {
      LINES(1),
      LINE_STRIP(3),
      TRIANGLES(4),
      TRIANGLE_STRIP(5),
      TRIANGLE_FAN(6),
      QUADS(7);

      private final int mode;
      private final int vertexMode;

      private a(int var3) {
         this.mode = var3;
         this.vertexMode = var3;
      }

      public static RenderUtil.a fromGlMode(int var0) {
         switch(var0) {
            case 1:
               return LINES;
            case 2:
            default:
               throw new IllegalArgumentException("Invalid mode " + var0);
            case 3:
               return LINE_STRIP;
            case 4:
               return TRIANGLES;
            case 5:
               return TRIANGLE_STRIP;
            case 6:
               return TRIANGLE_FAN;
            case 7:
               return QUADS;
         }
      }
   }
}
