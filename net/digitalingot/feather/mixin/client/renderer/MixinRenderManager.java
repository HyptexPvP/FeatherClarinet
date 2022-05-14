package net.digitalingot.feather.mixin.client.renderer;

import net.digitalingot.feather.event.RenderEvent;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({RenderManager.class})
public abstract class MixinRenderManager {
   @Inject(
      method = {"doRenderEntity"},
      at = {@At("HEAD")},
      require = 1,
      allow = 1
   )
   private void feather$renderEntity(
      Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10, CallbackInfoReturnable<Boolean> var11
   ) {
      ((RenderEvent)RenderEvent.a.a()).render(var1, var2, var4, var6);
   }
}
