package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({ModelBiped.class})
public abstract class MixinModelBiped extends ModelBase {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);

   @ModifyConstant(
      method = {"setRotationAngles(FFFFFFLnet/minecraft/entity/Entity;)V"},
      constant = {@Constant(
   floatValue = (float) (-Math.PI / 6)
)},
      require = 1,
      allow = 1
   )
   private float feather$legacySword(float var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      return var2.m() && var2.k().l ? 0.0F : var1;
   }
}
