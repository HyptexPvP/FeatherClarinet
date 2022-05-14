package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.ae;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.DrawBlockHighlight;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import org.lwjgl.opengl.GL11;

@FeatherModule(
   a = ModsConfig.BLOCK_OVERLAY,
   b = @dn(
   a = "Block Overlay",
   b = "https://assets.feathercdn.net/game/mods/blockoverlay.svg",
   c = "Add overlay and outline to blocks",
   d = {}
)
)
public class BlockOverlay extends Mod<BlockOverlay.a> {
   @Override
   public void f() {
      Minecraft var1 = Minecraft.func_71410_x();
      DrawBlockHighlight.a.a(() -> {
         if (!this.m()) {
            return ae.PASS;
         } else if (this.b.b == BlockOverlay.a.a.NONE) {
            return ae.FAIL;
         } else {
            MovingObjectPosition var2 = var1.field_71476_x;
            BlockPos var3 = var2.func_178782_a();
            if (var3 == null) {
               return ae.FAIL;
            } else {
               WorldClient var4 = var1.field_71441_e;
               IBlockState var5 = var4.func_180495_p(var3);
               Block var6 = var5.func_177230_c();
               if (var6 == null || var6 == Blocks.field_150350_a || var6 == Blocks.field_150355_j || var6 == Blocks.field_150353_l) {
                  return ae.FAIL;
               } else if (var6 != Blocks.field_150358_i && var6 != Blocks.field_150356_k) {
                  RenderManager var7 = var1.func_175598_ae();
                  double var8 = var7.field_78730_l;
                  double var10 = var7.field_78731_m;
                  double var12 = var7.field_78728_n;
                  RenderUtil.u();
                  RenderUtil.a(false);
                  RenderUtil.i();
                  RenderUtil.m();
                  RenderUtil.a(770, 771, 1, 0);
                  RenderUtil.b();
                  var6.func_180654_a(var4, var3);
                  AxisAlignedBB var14 = var6.func_180646_a(var4, var3);
                  var14 = var14.func_72321_a(0.002, 0.002, 0.002).func_72317_d(-var8, -var10, -var12);
                  if (this.b.b == BlockOverlay.a.a.FULL) {
                     Color var15 = this.b.c.c();
                     Color var16 = this.b.c.b() ? new Color(hH.a().c()) : var15;
                     float var17 = (float)var16.getRed() / 255.0F;
                     float var18 = (float)var16.getGreen() / 255.0F;
                     float var19 = (float)var16.getBlue() / 255.0F;
                     float var20 = (float)var16.getAlpha() / 255.0F;
                     a(var14, var17, var18, var19, var20);
                  }

                  float var22 = (float)this.b.e / 20.0F;
                  GL11.glLineWidth(var22);
                  Color var23 = this.b.i.b() ? new Color(hH.a().c()) : this.b.i.c();
                  float var24 = (float)var23.getRed() / 255.0F;
                  float var25 = (float)var23.getGreen() / 255.0F;
                  float var26 = (float)var23.getBlue() / 255.0F;
                  float var27 = (float)this.b.i.c().getAlpha() / 255.0F;
                  RenderUtil.a(var24, var25, var26, var27);
                  RenderGlobal.func_181561_a(var14);
                  RenderUtil.j();
                  RenderUtil.a(true);
                  RenderUtil.n();
                  RenderUtil.a();
                  RenderUtil.v();
                  return ae.FAIL;
               } else {
                  return ae.FAIL;
               }
            }
         }
      });
   }

   private static void a(AxisAlignedBB var0, float var1, float var2, float var3, float var4) {
      a(var0.field_72340_a, var0.field_72338_b, var0.field_72339_c, var0.field_72336_d, var0.field_72337_e, var0.field_72334_f, var1, var2, var3, var4);
   }

   private static void a(double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15) {
      Tessellator var16 = Tessellator.func_178181_a();
      WorldRenderer var17 = var16.func_178180_c();
      var17.func_181668_a(5, DefaultVertexFormats.field_181706_f);
      a(var17, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var16.func_78381_a();
   }

   private static void a(
      WorldRenderer var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   ) {
      Object var17 = null;
      a(var17, var0, var1, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var3, var11, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var1, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var5, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var11, var13, var14, var15, var16);
      a(var17, var0, var7, var9, var11, var13, var14, var15, var16);
   }

   private static void a(Object var0, WorldRenderer var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11) {
      var1.func_181662_b(var2, var4, var6).func_181666_a(var8, var9, var10, var11).func_181675_d();
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("General");
      @ModConfigAnnotation(
         a = "mode",
         b = "Mode",
         c = "full",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public BlockOverlay.a.a b;
      @ModConfigAnnotation(
         a = "fillColor",
         b = "Fill Color",
         c = "false/255/255/255/125",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public ChromaColor c;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh d = new eh("Outline");
      @ModConfigAnnotation(
         a = "outlineThickness",
         b = "Thickness",
         c = "25",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      @IntegerRange(
         b = 1
      )
      public int e;
      @ModConfigAnnotation(
         a = "outlineColor",
         b = "Color",
         c = "false/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public ChromaColor i;

      public static enum a {
         @dw(
            a = "none",
            b = "None"
         )
         NONE,
         @dw(
            a = "outline",
            b = "Outline"
         )
         OUTLINE,
         @dw(
            a = "full",
            b = "Full"
         )
         FULL;
      }
   }
}
