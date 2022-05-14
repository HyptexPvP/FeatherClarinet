package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPlayer.class})
public abstract class MixinEntityPlayer extends EntityLivingBase {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);
   @Unique
   private static final float feather$PLAYER_HEIGHT = 1.62F;
   @Unique
   private static final float feather$SNEAK_HEIGHT = 1.54F;
   @Unique
   private static final int feather$SNEAK_ANIM_UPDATE = 16;
   @Unique
   private float feather$currentHeight = 1.62F;
   @Unique
   private long feather$lastChangeTime = System.currentTimeMillis();

   public MixinEntityPlayer(World var1) {
      super(var1);
   }

   @Inject(
      method = {"getEyeHeight()F"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$applyLegacyEyeHeight(CallbackInfoReturnable<Float> var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      if (var2.m() && var2.k().j) {
         var1.setReturnValue(this.feather$getLegacyEyeHeight());
      }

   }

   @Unique
   private float feather$getLegacyEyeHeight() {
      if (this.func_70093_af()) {
         if (this.feather$currentHeight > 1.54F) {
            long var1 = System.currentTimeMillis();
            long var3 = var1 - this.feather$lastChangeTime;
            if (var3 > 16L) {
               this.feather$currentHeight -= 0.012F;
               this.feather$lastChangeTime = var1;
            }
         }
      } else if (this.feather$currentHeight < 1.62F && this.feather$currentHeight > 0.2F) {
         long var5 = System.currentTimeMillis();
         long var6 = var5 - this.feather$lastChangeTime;
         if (var6 > 16L) {
            this.feather$currentHeight += 0.012F;
            this.feather$lastChangeTime = var5;
         }
      } else {
         this.feather$currentHeight = 1.62F;
      }

      if (this.func_70608_bn()) {
         this.feather$currentHeight = 0.2F;
      }

      return this.feather$currentHeight;
   }
}
