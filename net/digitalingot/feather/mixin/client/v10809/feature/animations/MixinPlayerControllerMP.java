package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerControllerMP.class})
public abstract class MixinPlayerControllerMP {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);

   @Inject(
      method = {"getIsHittingBlock()Z"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$legacyBlockBuild(CallbackInfoReturnable<Boolean> var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      if (var2.m() && var2.k().c) {
         var1.setReturnValue(false);
      }

   }
}
