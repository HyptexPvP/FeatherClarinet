package net.digitalingot.feather.mods;

import java.util.concurrent.ThreadLocalRandom;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.PlayerUtil;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;

@FeatherModule(
   a = ModsConfig.ITEM_PHYSIC,
   b = @dn(
   a = "Item Physic",
   b = "https://assets.feathercdn.net/game/mods/itemphysic.svg",
   c = "",
   d = {}
)
)
public class ItemPhysics extends Mod<ItemPhysics.a> {
   public static final TransformType a = TransformType.GROUND;
   public static Minecraft c = Minecraft.func_71410_x();
   public static double d;

   public void a(Entity var1, float var2, double var3, double var5, double var7) {
      d = (double)System.currentTimeMillis() / 100.0 * (double)this.b.a % 360.0;
      if (!c.field_71415_G) {
         d = 0.0;
      }

      EntityItem var9 = (EntityItem)var1;
      ItemStack var10 = var9.func_92059_d();
      TextureManager var11 = Minecraft.func_71410_x().func_110434_K();
      var11.func_110577_a(TextureMap.field_110575_b);
      ITextureObject var12 = var11.func_110581_b(TextureMap.field_110575_b);
      var12.func_174936_b(false, false);
      RenderUtil.g();
      RenderUtil.a(516, 0.1F);
      RenderUtil.i();
      RenderHelper.func_74519_b();
      RenderUtil.a(770, 771, 1, 0);
      RenderUtil.u();
      IBakedModel var13 = c.func_175599_af().func_175037_a().func_178089_a(var10);
      boolean var14 = var13.func_177556_c();
      boolean var15 = var13.func_177556_c();
      int var16 = a(var10);
      RenderUtil.b((float)var3, (float)var5, (float)var7);
      if (var13.func_177556_c()) {
         RenderUtil.c(0.5F, 0.5F, 0.5F);
      }

      var13.func_177552_f().func_181689_a(a);
      RenderUtil.c(90.0F, 1.0F, 0.0F, 0.0F);
      RenderUtil.c(var9.field_70177_z, 0.0F, 0.0F, 1.0F);
      RenderUtil.a(0.0, 0.0, var15 ? -0.08 : -0.04);
      if (var15 || c.func_175598_ae().field_78733_k != null) {
         if (var15) {
            if (!var9.field_70122_E) {
               PlayerUtil.a(var9, (float)d);
            }
         } else if (!Double.isNaN(var9.field_70169_q) && !Double.isNaN(var9.field_70167_r) && !Double.isNaN(var9.field_70166_s) && var9.field_70170_p != null) {
            if (var9.field_70122_E) {
               PlayerUtil.a(var9, 0.0F);
            } else {
               PlayerUtil.a(var9, (float)d);
            }
         }

         RenderUtil.c(var9.field_70125_A, 1.0F, 0.0F, 0.0F);
      }

      RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);

      for(int var17 = 0; var17 < var16; ++var17) {
         RenderUtil.u();
         if (var14) {
            if (var17 > 0) {
               ThreadLocalRandom var18 = ThreadLocalRandom.current();
               float var19 = (var18.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var20 = (var18.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var21 = (var18.nextFloat() * 2.0F - 1.0F) * 0.15F;
               RenderUtil.b(var19, var20, var21);
            }

            c.func_175599_af().func_180454_a(var10, var13);
            RenderUtil.v();
         } else {
            c.func_175599_af().func_180454_a(var10, var13);
            RenderUtil.v();
            RenderUtil.b(0.0F, 0.0F, 0.05375F);
         }
      }

      RenderUtil.v();
      RenderUtil.h();
      RenderUtil.j();
      var11.func_110577_a(TextureMap.field_110575_b);
      var12.func_174935_a();
   }

   public static int a(ItemStack var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = var0.field_77994_a;
         if (var1 > 48) {
            return 5;
         } else if (var1 > 32) {
            return 4;
         } else if (var1 > 16) {
            return 3;
         } else {
            return var1 > 1 ? 2 : 1;
         }
      }
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "rotateSpeed",
         b = "Rotate Speed",
         c = "10",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      @IntegerRange
      public int a;
   }
}
