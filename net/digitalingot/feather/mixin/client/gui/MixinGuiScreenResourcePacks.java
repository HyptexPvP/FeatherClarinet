package net.digitalingot.feather.mixin.client.gui;

import java.io.File;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiScreenResourcePacks.class})
public class MixinGuiScreenResourcePacks {
   @Redirect(
      method = {"actionPerformed"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/io/File;getAbsolutePath()Ljava/lang/String;",
   remap = false
)
   )
   public String fixRelativePath(File var1) {
      String var2 = var1.getAbsolutePath();
      return var2.replace("/./", "/");
   }
}
