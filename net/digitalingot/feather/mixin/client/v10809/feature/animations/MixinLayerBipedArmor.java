package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({LayerBipedArmor.class})
public abstract class MixinLayerBipedArmor extends LayerArmorBase<ModelBiped> {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);

   public MixinLayerBipedArmor(RendererLivingEntity<?> var1) {
      super(var1);
   }

   public boolean func_177142_b() {
      OldAnimations var1 = feather$ANIMATIONS_PROVIDER.a();
      return var1.m() && var1.k().k;
   }
}
