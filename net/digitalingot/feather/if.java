package net.digitalingot.feather;

import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class if {
   public static int a(EntityPlayer var0, Item... var1) {
      int var2 = var1.length;
      int var3 = 0;

      for(ItemStack var9 : var0.field_71071_by.field_70462_a) {
         if (var9 != null) {
            Item var4 = var9.func_77973_b();

            for(int var5 = 0; var5 < var2; ++var5) {
               if (var4 == var1[var5]) {
                  var3 += var9.field_77994_a;
                  break;
               }
            }
         }
      }

      return var3;
   }

   public static int a(EntityPlayer var0, ItemStack... var1) {
      int var2 = var1.length;
      int var8 = 0;

      for(ItemStack var12 : var0.field_71071_by.field_70462_a) {
         if (var12 != null) {
            Item var6 = var12.func_77973_b();
            int var7 = var12.func_77952_i();
            int var4 = var12.field_77994_a;

            for(int var3 = 0; var3 < var2; ++var3) {
               ItemStack var5 = var1[var3];
               if (var6 == var5.func_77973_b() && var7 == var5.func_77952_i()) {
                  var8 += var4;
               }
            }
         }
      }

      return var8;
   }

   @Deprecated
   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, float var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      Tessellator var9 = Tessellator.func_178181_a();
      WorldRenderer var10 = var9.func_178180_c();
      var10.func_181668_a(7, DefaultVertexFormats.field_181707_g);
      var10.func_181662_b((double)var0, (double)(var1 + var5), (double)var6)
         .func_181673_a((double)((float)var2 * var7), (double)((float)(var3 + var5) * var8))
         .func_181675_d();
      var10.func_181662_b((double)(var0 + var4), (double)(var1 + var5), (double)var6)
         .func_181673_a((double)((float)(var2 + var4) * var7), (double)((float)(var3 + var5) * var8))
         .func_181675_d();
      var10.func_181662_b((double)(var0 + var4), (double)var1, (double)var6)
         .func_181673_a((double)((float)(var2 + var4) * var7), (double)((float)var3 * var8))
         .func_181675_d();
      var10.func_181662_b((double)var0, (double)var1, (double)var6).func_181673_a((double)((float)var2 * var7), (double)((float)var3 * var8)).func_181675_d();
      var9.func_78381_a();
   }

   @Deprecated
   public static void a(FontRenderer var0, ItemStack var1, int var2, int var3, boolean var4, boolean var5) {
      if (var1 != null && (var4 || var5)) {
         if (var1.func_77951_h() && var4) {
            int var6 = (int)Math.round(13.0 - (double)var1.func_77952_i() * 13.0 / (double)var1.func_77958_k());
            int var7 = (int)Math.round(255.0 - (double)var1.func_77952_i() * 255.0 / (double)var1.func_77958_k());
            RenderUtil.d();
            RenderUtil.f();
            RenderUtil.m();
            RenderUtil.a();
            RenderUtil.j();
            WorldRenderer var8 = Tessellator.func_178181_a().func_178180_c();
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            a(var8, var2 + 2, var3 + 13, 13, 2, 0);
            a(var8, var2 + 2, var3 + 13, 12, 1, var10);
            a(var8, var2 + 2, var3 + 13, var6, 1, var9);
            RenderUtil.b();
            RenderUtil.n();
            RenderUtil.c();
            RenderUtil.e();
            RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
         }

         if (var5) {
            int var11 = 0;
            EntityPlayerSP var12 = Minecraft.func_71410_x().field_71439_g;
            if (var1.func_77976_d() > 1) {
               var11 = a(var12, var1);
            } else if (var1.func_77973_b().equals(Items.field_151031_f)) {
               var11 = a(var12, Items.field_151032_g);
            }

            if (var11 > 1) {
               String var13 = String.valueOf(var11);
               RenderUtil.f();
               hH.b().func_175065_a(var13, (float)(var2 + 19 - 2 - hH.a().a(var13)), (float)(var3 + 6 + 3), 16777215, false);
               RenderUtil.e();
            }
         }

      }
   }

   public static void a(FontRenderer var0, ItemStack var1, int var2, int var3) {
      a(var0, var1, var2, var3, true, true);
   }

   @Deprecated
   public static void a(WorldRenderer var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var5 >> 16 & 0xFF;
      int var7 = var5 >> 8 & 0xFF;
      int var8 = var5 & 0xFF;
      var0.func_181668_a(7, DefaultVertexFormats.field_181706_f);
      var0.func_181662_b((double)var1, (double)var2, 0.0).func_181669_b(var6, var7, var8, 255).func_181675_d();
      var0.func_181662_b((double)var1, (double)(var2 + var4), 0.0).func_181669_b(var6, var7, var8, 255).func_181675_d();
      var0.func_181662_b((double)(var1 + var3), (double)(var2 + var4), 0.0).func_181669_b(var6, var7, var8, 255).func_181675_d();
      var0.func_181662_b((double)(var1 + var3), (double)var2, 0.0).func_181669_b(var6, var7, var8, 255).func_181675_d();
      Tessellator.func_178181_a().func_78381_a();
   }

   public static void a(MatrixUtils var0, ItemStack var1, int var2, int var3, boolean var4, boolean var5) {
      if (var1 != null && (var4 || var5)) {
         if (var1.func_77951_h() && var4) {
            int var6 = (int)Math.round(13.0 - (double)var1.func_77952_i() * 13.0 / (double)var1.func_77958_k());
            int var7 = (int)Math.round(255.0 - (double)var1.func_77952_i() * 255.0 / (double)var1.func_77958_k());
            int var8 = 255 - var7 << 16 | var7 << 8;
            int var9 = (255 - var7) / 4 << 16 | 16128;
            RenderUtil.d();
            RenderUtil.f();
            RenderUtil.m();
            RenderUtil.a();
            RenderUtil.j();
            RenderUtil var10 = RenderUtil.r();
            a(var0, var10, var2 + 2, var3 + 13, 13, 2, 0);
            a(var0, var10, var2 + 2, var3 + 13, 12, 1, var9);
            a(var0, var10, var2 + 2, var3 + 13, var6, 1, var8);
            RenderUtil.b();
            RenderUtil.n();
            RenderUtil.c();
            RenderUtil.e();
         }

         if (var5) {
            int var11 = 0;
            EntityPlayerSP var12 = Minecraft.func_71410_x().field_71439_g;
            if (var1.func_77976_d() > 1) {
               var11 = a(var12, var1);
            } else if (var1.func_77973_b().equals(Items.field_151031_f)) {
               var11 = a(var12, Items.field_151032_g);
            }

            if (var11 > 1) {
               String var13 = String.valueOf(var11);
               int var14 = RenderUtil.a(var13);
               RenderUtil.f();
               RenderUtil.a(var0, var13, (float)(var2 + 19 - 2 - var14), (float)(var3 + 6 + 3), -1, false);
               RenderUtil.e();
            }
         }

      }
   }

   public static void a(MatrixUtils var0, RenderUtil var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var6 >> 16 & 0xFF;
      int var8 = var6 >> 8 & 0xFF;
      int var9 = var6 & 0xFF;
      var1.b(RenderUtil.a.QUADS, DefaultVertexFormats.field_181706_f);
      var1.a(var0, (double)var2, (double)var3, 0.0).b(var7, var8, var9, 255).s();
      var1.a(var0, (double)var2, (double)(var3 + var5), 0.0).b(var7, var8, var9, 255).s();
      var1.a(var0, (double)(var2 + var4), (double)(var3 + var5), 0.0).b(var7, var8, var9, 255).s();
      var1.a(var0, (double)(var2 + var4), (double)var3, 0.0).b(var7, var8, var9, 255).s();
      var1.t();
   }
}
