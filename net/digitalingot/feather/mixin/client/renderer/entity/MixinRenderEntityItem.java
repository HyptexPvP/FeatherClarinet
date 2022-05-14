package net.digitalingot.feather.mixin.client.renderer.entity;

import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.ItemPhysics;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderEntityItem.class})
public abstract class MixinRenderEntityItem extends Render<EntityItem> {
   protected MixinRenderEntityItem(RenderManager var1) {
      super(var1);
   }

   @Inject(
      method = {"doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void physicsMod$doRender(EntityItem var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      ItemPhysics var11 = e.c().b().b(ItemPhysics.class);
      if (var11.m()) {
         var11.a(var1, var9, var2, var4, var6);
         var10.cancel();
      }

   }
}
