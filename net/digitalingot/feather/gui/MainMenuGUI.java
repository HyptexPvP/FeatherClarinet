package net.digitalingot.feather.gui;

import java.nio.FloatBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.BufferUtils;

public class MainMenuGUI {
   private static final ResourceLocation[] a = new ResourceLocation[]{
      new ResourceLocation("feather:textures/gui/panorama/panorama_0.png"),
      new ResourceLocation("feather:textures/gui/panorama/panorama_1.png"),
      new ResourceLocation("feather:textures/gui/panorama/panorama_2.png"),
      new ResourceLocation("feather:textures/gui/panorama/panorama_3.png"),
      new ResourceLocation("feather:textures/gui/panorama/panorama_4.png"),
      new ResourceLocation("feather:textures/gui/panorama/panorama_5.png")
   };
   @NotNull
   private final BrowserGUI b;
   private float c;

   public MainMenuGUI(@NotNull BrowserGUI var1) {
      this.b = var1;
   }

   public void a(float var1) {
      this.c += var1;
      this.a(this.b.field_146297_k, (float)Math.sin((double)(this.c * 0.001F)) * 5.0F + 25.0F, -this.c * 0.1F, 1.0F);
   }

   public void a(Minecraft var1, float var2, float var3, float var4) {
      Tessellator var5 = Tessellator.func_178181_a();
      WorldRenderer var6 = var5.func_178180_c();
      GlStateManager.func_179128_n(5889);
      GlStateManager.func_179094_E();
      GlStateManager.func_179096_D();
      GlStateManager.func_179110_a(this.a(85.0, (float)var1.field_71462_r.field_146294_l / (float)var1.field_71462_r.field_146295_m, 0.05F, 10.0F));
      GlStateManager.func_179128_n(5888);
      GlStateManager.func_179094_E();
      GlStateManager.func_179096_D();
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.func_179114_b(180.0F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179147_l();
      GlStateManager.func_179118_c();
      GlStateManager.func_179129_p();
      GlStateManager.func_179132_a(false);
      GlStateManager.func_179147_l();

      for(int var7 = 0; var7 < 4; ++var7) {
         GlStateManager.func_179094_E();
         float var8 = ((float)(var7 % 2) / 2.0F - 0.5F) / 256.0F;
         float var9 = ((float)(var7 / 2) / 2.0F - 0.5F) / 256.0F;
         float var10 = 0.0F;
         GlStateManager.func_179109_b(var8, var9, 0.0F);
         GlStateManager.func_179114_b(var2, 1.0F, 0.0F, 0.0F);
         GlStateManager.func_179114_b(var3, 0.0F, 1.0F, 0.0F);

         for(int var11 = 0; var11 < 6; ++var11) {
            var1.func_110434_K().func_110577_a(a[var11]);
            var6.func_181668_a(7, DefaultVertexFormats.field_181709_i);
            int var12 = Math.round(255.0F * var4) / (var7 + 1);
            if (var11 == 0) {
               var6.func_181662_b(-1.0, -1.0, 1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, 1.0, 1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, 1.0, 1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, -1.0, 1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
            }

            if (var11 == 1) {
               var6.func_181662_b(1.0, -1.0, 1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, 1.0, 1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, 1.0, -1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, -1.0, -1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
            }

            if (var11 == 2) {
               var6.func_181662_b(1.0, -1.0, -1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, 1.0, -1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, 1.0, -1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, -1.0, -1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
            }

            if (var11 == 3) {
               var6.func_181662_b(-1.0, -1.0, -1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, 1.0, -1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, 1.0, 1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, -1.0, 1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
            }

            if (var11 == 4) {
               var6.func_181662_b(-1.0, -1.0, -1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, -1.0, 1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, -1.0, 1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, -1.0, -1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
            }

            if (var11 == 5) {
               var6.func_181662_b(-1.0, 1.0, 1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(-1.0, 1.0, -1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, 1.0, -1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
               var6.func_181662_b(1.0, 1.0, 1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
            }

            var5.func_78381_a();
         }

         GlStateManager.func_179121_F();
         GlStateManager.func_179135_a(true, true, true, false);
      }

      GlStateManager.func_179135_a(true, true, true, true);
      GlStateManager.func_179128_n(5889);
      GlStateManager.func_179121_F();
      GlStateManager.func_179128_n(5888);
      GlStateManager.func_179121_F();
      GlStateManager.func_179132_a(true);
      GlStateManager.func_179089_o();
      GlStateManager.func_179126_j();
   }

   private FloatBuffer a(double var1, float var3, float var4, float var5) {
      float var6 = (float)(1.0 / Math.tan(var1 * (float) (Math.PI / 180.0) / 2.0));
      FloatBuffer var7 = BufferUtils.createFloatBuffer(16);
      var7.put(this.a(0, 0), var6 / var3);
      var7.put(this.a(0, 1), 0.0F);
      var7.put(this.a(0, 2), 0.0F);
      var7.put(this.a(0, 3), 0.0F);
      var7.put(this.a(1, 0), 0.0F);
      var7.put(this.a(1, 1), var6);
      var7.put(this.a(1, 2), 0.0F);
      var7.put(this.a(1, 3), 0.0F);
      var7.put(this.a(2, 0), 0.0F);
      var7.put(this.a(2, 1), 0.0F);
      var7.put(this.a(2, 2), (var5 + var4) / (var4 - var5));
      var7.put(this.a(2, 3), 2.0F * var5 * var4 / (var4 - var5));
      var7.put(this.a(3, 0), 0.0F);
      var7.put(this.a(3, 1), 0.0F);
      var7.put(this.a(3, 2), -1.0F);
      var7.put(this.a(3, 3), 0.0F);
      return var7;
   }

   private int a(int var1, int var2) {
      return var2 * 4 + var1;
   }
}
