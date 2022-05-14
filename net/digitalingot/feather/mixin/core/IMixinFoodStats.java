package net.digitalingot.feather.mixin.core;

import net.minecraft.util.FoodStats;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({FoodStats.class})
public interface IMixinFoodStats {
   @Accessor
   float getFoodExhaustionLevel();
}
