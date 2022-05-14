package net.digitalingot.feather.mixin.client.gui.inventory;

import net.digitalingot.feather.ie;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiContainerCreative.class})
public abstract class MixinGuiContainerCreative extends InventoryEffectRenderer {
   public MixinGuiContainerCreative(Container var1) {
      super(var1);
   }

   @Inject(
      method = {"renderToolTip"},
      at = {@At("HEAD")}
   )
   private void renderTooltipEventPre(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      ie.a = var1;
   }

   @Inject(
      method = {"renderToolTip"},
      at = {@At("TAIL")}
   )
   private void renderTooltipEventPost(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      ie.a = null;
   }
}
