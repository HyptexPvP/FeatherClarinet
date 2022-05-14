package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({GuiIngame.class})
public abstract class MixinGuiIngame extends Gui {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);

   @ModifyConstant(
      method = {"showCrosshair()Z"},
      constant = {@Constant(
   intValue = 0,
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private int feather$legacyDebug(int var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      return var2.m() && var2.k().q ? 1 : var1;
   }
}
