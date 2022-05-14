package net.digitalingot.feather.mixin.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.util.ChatComponentText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiMultiplayer.class})
public class MixinGuiMultiplayer {
   @Inject(
      method = {"connectToServer"},
      at = {@At("HEAD")}
   )
   public void feather$join(CallbackInfo var1) {
      Minecraft var2 = Minecraft.func_71410_x();
      if (var2.func_147114_u() != null) {
         var2.func_147114_u().func_147298_b().func_150718_a(new ChatComponentText(""));
      }

   }
}
