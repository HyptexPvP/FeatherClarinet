package net.digitalingot.feather.mixin.core;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Minecraft.class})
public interface IMixinMinecraft {
   @Accessor
   void setSession(Session var1);

   @Accessor("debugFPS")
   static int getFPS() {
      throw new AssertionError();
   }
}
