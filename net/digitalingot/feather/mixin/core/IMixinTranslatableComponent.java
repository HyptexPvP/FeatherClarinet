package net.digitalingot.feather.mixin.core;

import net.minecraft.util.ChatComponentTranslation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ChatComponentTranslation.class})
public interface IMixinTranslatableComponent {
   @Accessor("lastTranslationUpdateTimeInMilliseconds")
   void setLastUpdate(long var1);
}
