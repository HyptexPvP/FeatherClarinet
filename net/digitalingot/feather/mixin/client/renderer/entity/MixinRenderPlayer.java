package net.digitalingot.feather.mixin.client.renderer.entity;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({RenderPlayer.class})
public abstract class MixinRenderPlayer extends RendererLivingEntity<AbstractClientPlayer> {
   public MixinRenderPlayer(RenderManager var1, ModelBase var2, float var3) {
      super(var1, var2, var3);
   }

   @Redirect(
      method = {"renderOffsetLivingLabel(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;FD)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;renderOffsetLivingLabel(Lnet/minecraft/entity/Entity;DDDLjava/lang/String;FD)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void feather$setRenderingName(
      RendererLivingEntity<AbstractClientPlayer> var1, Entity var2, double var3, double var5, double var7, String var9, float var10, double var11
   ) {
      MixinRender var13 = (MixinRender)var1;
      var13.renderingName = true;
      super.func_177069_a((AbstractClientPlayer)var2, var3, var5, var7, var9, var10, var11);
      var13.renderingName = false;
   }
}
