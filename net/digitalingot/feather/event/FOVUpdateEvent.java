package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;

public interface FOVUpdateEvent {
   ac<FOVUpdateEvent> a = ad.a(FOVUpdateEvent.class, var0 -> (var1, var2) -> {
         float var3 = var2;

         for(FOVUpdateEvent var7 : var0) {
            var3 = var7.updateFOV(var1, var3);
         }

         return var3;
      });

   float updateFOV(float var1, float var2);
}
