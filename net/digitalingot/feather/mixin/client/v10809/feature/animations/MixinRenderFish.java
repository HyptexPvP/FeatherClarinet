package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderFish;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.util.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({RenderFish.class})
public abstract class MixinRenderFish extends Render<EntityFishHook> {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);

   protected MixinRenderFish(RenderManager var1) {
      super(var1);
   }

   @Redirect(
      method = {"doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V"},
      at = @At(
   value = "NEW",
   target = "(DDD)Lnet/minecraft/util/Vec3;",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private Vec3 feather$legacyRod(double var1, double var3, double var5) {
      OldAnimations var7 = feather$ANIMATIONS_PROVIDER.a();
      if (var7.m() && var7.k().e) {
         var1 = -0.5;
         var3 = 0.03;
         var5 = 0.8;
      }

      return new Vec3(var1, var3, var5);
   }
}
