package net.digitalingot.feather.mixin.client.gui;

import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.NickHider;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({FontRenderer.class})
public abstract class MixinFontRenderer {
   @ModifyArg(
      method = {"renderString"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;renderStringAtPos(Ljava/lang/String;Z)V"
)
   )
   public String nickHider$changeString(String var1) {
      if (!e.a()) {
         return var1;
      } else {
         NickHider var2 = e.c().b().b(NickHider.class);
         return var2.m() ? var2.b(var1) : var1;
      }
   }

   @ModifyVariable(
      method = {"getStringWidth"},
      at = @At("HEAD")
   )
   public String nickHider$modifyStringWidth(String var1) {
      if (!e.a()) {
         return var1;
      } else {
         NickHider var2 = e.c().b().b(NickHider.class);
         return var2.m() ? var2.b(var1) : var1;
      }
   }
}
