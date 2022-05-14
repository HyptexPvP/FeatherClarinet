package net.digitalingot.feather.mixin.core;

import java.util.List;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.ViewFrustum;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({RenderGlobal.class})
public interface IMixinRenderGlobal {
   @Accessor
   ViewFrustum getViewFrustum();

   @Accessor
   List<Object> getRenderInfos();
}
