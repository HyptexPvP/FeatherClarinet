package net.digitalingot.feather.mixin.client.resources;

import net.digitalingot.feather.eV;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({FallbackResourceManager.class})
public class MixinFallbackResourceManager {
   @ModifyVariable(
      method = {"getResource"},
      at = @At("HEAD"),
      require = 1
   )
   public ResourceLocation feather$clearGlass$getResource(ResourceLocation var1) {
      return eV.a(var1);
   }
}
