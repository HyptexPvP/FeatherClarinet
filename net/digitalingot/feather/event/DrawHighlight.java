package net.digitalingot.feather.event;

import net.digitalingot.feather.ae;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DrawHighlight implements EventForge {
   @SubscribeEvent
   public void a(DrawBlockHighlightEvent var1) {
      ae var2 = DrawBlockHighlight.a.a().drawHighlightBlock();
      if (var2 == ae.FAIL) {
         var1.setCanceled(true);
      }

   }
}
