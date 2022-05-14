package net.digitalingot.feather.mixin.client.renderer;

import java.util.Collection;
import java.util.Collections;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.mods.PotionEffect;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.inventory.Container;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InventoryEffectRenderer.class})
public abstract class MixinInventoryEffectRenderer extends GuiContainer {
   @Unique
   private static final dl<CoreMod> CORE_PROVIDER = ConfigManager.a(CoreMod.class);
   @Unique
   private static final dl<PotionEffect> POTION_EFFECTS_PROVIDER = ConfigManager.a(PotionEffect.class);

   public MixinInventoryEffectRenderer(Container var1) {
      super(var1);
   }

   @Redirect(
      method = {"updateActivePotionEffects"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;getActivePotionEffects()Ljava/util/Collection;",
   opcode = 182
),
      require = 2,
      allow = 2
   )
   private Collection<net.minecraft.potion.PotionEffect> feather$hideInventoryEffects(EntityPlayerSP var1) {
      PotionEffect var2 = POTION_EFFECTS_PROVIDER.a();
      return (Collection<net.minecraft.potion.PotionEffect>)(var2 != null && var2.m() && var2.k().s ? Collections.emptySet() : var1.func_70651_bq());
   }

   @Inject(
      method = {"drawScreen"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void feather$logo(CallbackInfo var1) {
      CoreMod var2 = CORE_PROVIDER.a();
      if (var2 != null) {
         var2.a(this.field_146294_l, this.field_146295_m);
      }

   }
}
