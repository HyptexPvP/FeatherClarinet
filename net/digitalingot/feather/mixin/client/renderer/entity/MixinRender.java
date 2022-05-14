package net.digitalingot.feather.mixin.client.renderer.entity;

import net.digitalingot.feather.event.RenderEvent2D;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({Render.class})
public abstract class MixinRender<T extends Entity> {
   private static final String RENDER_LIVING_LABEL = "renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V";
   private static final String DISABLE_TEXTURE = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V";
   @Unique
   protected boolean renderingName = false;
   @Unique
   private int renderNameplateEvent$posX;
   @Unique
   private int renderNameplateEvent$posY;
   @Unique
   private RenderEvent2D.a arguments = null;

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 1,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int feather$renderNameplateEvent$captureY(int var1) {
      this.renderNameplateEvent$posY = var1;
      return var1;
   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 2,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int feather$renderNameplateEvent$captureX(int var1) {
      this.renderNameplateEvent$posX = var1;
      return var1;
   }

   @Inject(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
)},
      locals = LocalCapture.CAPTURE_FAILHARD,
      require = 1,
      allow = 1
   )
   private void feather$renderNameplateEvent$call(T var1, String var2, double var3, double var5, double var7, int var9, CallbackInfo var10) {
      if (var1 instanceof AbstractClientPlayer && this.renderingName) {
         this.arguments = new RenderEvent2D.a((float)this.renderNameplateEvent$posX, (float)this.renderNameplateEvent$posY);
         RenderEvent2D.a.a().render(var1, this.arguments);
      }

   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 1,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int feather$renderNameplateEvent$setY(int var1) {
      return this.arguments != null ? (int)this.arguments.b() : var1;
   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 2,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int feather$renderNameplateEvent$setX(int var1) {
      if (this.arguments != null) {
         var1 = (int)this.arguments.a();
         this.arguments = null;
      }

      return var1;
   }
}
