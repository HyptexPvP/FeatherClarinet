package net.digitalingot.feather.mixin.client.gui;

import net.digitalingot.feather.ie;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiScreen.class})
public abstract class MixinGuiScreen extends Gui implements GuiYesNoCallback {
   @Unique
   private int tooltipY;

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
