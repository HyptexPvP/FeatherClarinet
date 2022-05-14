package net.digitalingot.feather.mixin.core;

import java.util.Map;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({SimpleReloadableResourceManager.class})
public interface IMixinSimpleReloadableResourceManager {
   @Accessor
   Map<String, FallbackResourceManager> getDomainResourceManagers();
}
