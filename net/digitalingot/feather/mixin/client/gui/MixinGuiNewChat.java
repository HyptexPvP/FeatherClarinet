package net.digitalingot.feather.mixin.client.gui;

import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.ChatOption;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiNewChat.class})
public abstract class MixinGuiNewChat extends Gui {
   @Inject(
      method = {"drawChat"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$chatOptions$chatHidden(CallbackInfo var1) {
      ChatOption var2 = e.c().b().b(ChatOption.class);
      if (var2.k().c) {
         var1.cancel();
      }

   }

   @Redirect(
      method = {"drawChat"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"
),
      require = 1,
      allow = 1
   )
   private int feather$chatOptions$textShadow(FontRenderer var1, String var2, float var3, float var4, int var5) {
      ChatOption var6 = e.c().b().b(ChatOption.class);
      return var6.k().i ? var1.func_175063_a(var2, var3, var4, var5) : var1.func_78276_b(var2, (int)var3, (int)var4, var5);
   }

   @ModifyConstant(
      method = {"setChatLine"},
      constant = {@Constant(
   intValue = 100
)},
      require = 2,
      allow = 2
   )
   private int feather$chatOptions$unlimited(int var1) {
      ChatOption var2 = e.c().b().b(ChatOption.class);
      return var2.k().d ? 100000 : var1;
   }

   @Redirect(
      method = {"drawChat"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"
),
      require = 3,
      allow = 3
   )
   private void feather$chatOptions$background(int var1, int var2, int var3, int var4, int var5) {
      ChatOption var6 = e.c().b().b(ChatOption.class);
      boolean var7 = true;
      int var8 = var5 >> 24 & 0xFF;
      var5 = var6.k().e.getRGB();
      int var9 = var5 >> 24 & 0xFF;
      if (var8 < 127 && var8 < var9) {
         var5 = var5 & 16777215 | var8 << 24;
      }

      func_73734_a(var1, var2, var3, var4, var5);
   }
}
