package net.digitalingot.feather.mixin.client.renderer.entity;

import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.GlintMod;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderItem.class})
public abstract class MixinRenderItem implements IResourceManagerReloadListener {
   private static final String RENDER_ITEM = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V";
   private static final String RENDER_EFFECT = "renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V";
   private static final String INVOKE_RENDER_EFFECT = "Lnet/minecraft/client/renderer/entity/RenderItem;renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V";
   @Unique
   private ItemStack renderedStack = null;
   @Unique
   private int effectRenderColor;

   @Inject(
      method = {"renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void glint$preRenderEffect(ItemStack var1, IBakedModel var2, CallbackInfo var3) {
      this.renderedStack = var1;
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void glint$postRenderEffect(ItemStack var1, IBakedModel var2, CallbackInfo var3) {
      this.renderedStack = null;
   }

   @Redirect(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;depthMask(Z)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void glint$renderEffect$nopDepthMask(boolean var1) {
   }

   @Redirect(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;depthFunc(I)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void glint$renderEffect$nopDepthFunc(int var1) {
   }

   @Inject(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableLighting()V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void glint$renderEffect(IBakedModel var1, CallbackInfo var2) {
      GlintMod var3 = e.c().b().b(GlintMod.class);
      if (!var3.c(this.renderedStack)) {
         GlStateManager.func_179132_a(false);
         GlStateManager.func_179143_c(514);
      }

      this.effectRenderColor = var3.m() ? var3.a(this.renderedStack) : -8372020;
   }

   @Redirect(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderModel(Lnet/minecraft/client/resources/model/IBakedModel;I)V"
),
      require = 2,
      allow = 2
   )
   private void glint$renderEffect$renderModel(RenderItem var1, IBakedModel var2, int var3) {
      this.func_175035_a(var2, this.effectRenderColor);
   }

   @Shadow
   public abstract void func_180454_a(ItemStack var1, IBakedModel var2);

   @Shadow
   protected abstract void func_175035_a(IBakedModel var1, int var2);

   @Redirect(
      method = {"renderItemModelTransform(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void glint$renderItemModelTransform(RenderItem var1, ItemStack var2, IBakedModel var3) {
      GlintMod var4 = e.c().b().b(GlintMod.class);
      GlintMod.a var5 = var4.k();
      boolean var6 = var5.b;
      var5.b = false;
      this.func_180454_a(var2, var3);
      var5.b = var6;
   }
}
