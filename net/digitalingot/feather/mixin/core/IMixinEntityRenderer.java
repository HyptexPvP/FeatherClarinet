package net.digitalingot.feather.mixin.core;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({EntityRenderer.class})
public interface IMixinEntityRenderer {
   @Invoker("loadShader")
   void feather$loadShader(ResourceLocation var1);
}
