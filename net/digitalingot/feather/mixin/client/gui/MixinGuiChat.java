package net.digitalingot.feather.mixin.client.gui;

import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.NickHider;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiTextField;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({GuiChat.class})
public abstract class MixinGuiChat {
   @Shadow
   protected GuiTextField field_146415_a;

   @ModifyVariable(
      method = {"onAutocompleteResponse"},
      at = @At("HEAD")
   )
   public String[] nickHider$maskPlayerName(String[] var1) {
      NickHider var2 = e.c().b().b(NickHider.class);
      return var2.m() ? var2.a(var1, this.field_146415_a.func_146179_b()) : var1;
   }
}
