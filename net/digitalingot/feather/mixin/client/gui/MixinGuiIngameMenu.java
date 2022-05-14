package net.digitalingot.feather.mixin.client.gui;

import net.digitalingot.feather.gui.HUDEdiorUI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngameMenu.class})
public class MixinGuiIngameMenu {
   @Inject(
      method = {"actionPerformed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void feather$pauseScreenModifier(GuiButton var1, CallbackInfo var2) {
      if (var1.field_146127_k == 99) {
         var2.cancel();
         Minecraft.func_71410_x().func_147108_a(new GuiMultiplayer((GuiScreen)this));
      } else if (var1.field_146127_k == 100) {
         var2.cancel();
         Minecraft.func_71410_x().func_147108_a(new HUDEdiorUI());
      }

   }
}
