package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import java.nio.FloatBuffer;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({RendererLivingEntity.class})
public abstract class MixinRendererLivingEntity<T extends EntityLivingBase> extends Render<T> {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);
   @Shadow
   protected FloatBuffer field_177095_g;

   protected MixinRendererLivingEntity(RenderManager var1) {
      super(var1);
   }

   @Inject(
      method = {"setBrightness(Lnet/minecraft/entity/EntityLivingBase;FZ)Z"},
      at = {@At(
   value = "INVOKE",
   target = "Ljava/nio/FloatBuffer;put(F)Ljava/nio/FloatBuffer;",
   remap = false,
   ordinal = 3,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void feather$customHurtColor(T var1, float var2, boolean var3, CallbackInfoReturnable<Boolean> var4) {
      OldAnimations var5 = feather$ANIMATIONS_PROVIDER.a();
      if (var5.m() && var5.k().s != OldAnimations.a.a.DEFAULT) {
         this.field_177095_g.position(0);
         var5.a(this.field_177095_g);
      }

   }
}
