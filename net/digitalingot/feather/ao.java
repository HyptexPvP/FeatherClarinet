package net.digitalingot.feather;

import net.digitalingot.feather.event.EventForge;
import net.digitalingot.feather.event.renderFogDensityEvent;
import net.minecraft.block.Block;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ao implements EventForge {
   @SubscribeEvent
   public void a(FogDensity var1) {
      Block var2 = var1.block;
      Float var3 = var1.density;
      var3 = renderFogDensityEvent.a.a().renderFogDensity(var2, var3);
      if (var3 != null) {
         var1.setCanceled(true);
         var1.density = var3;
      }

   }
}
