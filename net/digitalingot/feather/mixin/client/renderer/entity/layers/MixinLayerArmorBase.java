package net.digitalingot.feather.mixin.client.renderer.entity.layers;

import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.GlintMod;
import net.digitalingot.feather.mods.ModsConfig;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({LayerArmorBase.class})
public abstract class MixinLayerArmorBase<T extends ModelBase> implements LayerRenderer<EntityLivingBase> {
   @Unique
   private ItemStack itemBeingRendered = null;

   @Redirect(
      method = {"renderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFFI)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/item/ItemArmor;getColor(Lnet/minecraft/item/ItemStack;)I",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int getItemBeingRendered(ItemArmor var1, ItemStack var2) {
      this.itemBeingRendered = var2;
      return var1.func_82814_b(var2);
   }

   @Redirect(
      method = {"renderGlint"},
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableLighting()V",
   ordinal = 0
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void feather$renderGlint(float var1, float var2, float var3, float var4) {
      GlintMod var5 = (GlintMod)e.c().b().a(ModsConfig.GLINT);
      if (var5.m()) {
         int var6 = var5.a(this.itemBeingRendered);
         var1 = (float)(var6 >> 16 & 0xFF) / 255.0F;
         var2 = (float)(var6 >> 8 & 0xFF) / 255.0F;
         var3 = (float)(var6 & 0xFF) / 255.0F;
         var4 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      }

      GlStateManager.func_179131_c(var1, var2, var3, var4);
   }
}
