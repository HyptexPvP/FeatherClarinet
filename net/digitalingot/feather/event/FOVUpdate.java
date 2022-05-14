package net.digitalingot.feather.event;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FOVUpdate implements EventForge {
   @SubscribeEvent
   public void a(net.minecraftforge.client.event.FOVUpdateEvent var1) {
      float var2 = var1.fov;
      float var3 = var1.newfov;
      var3 = FOVUpdateEvent.a.a().updateFOV(var2, var3);
      var1.newfov = var3;
   }
}
