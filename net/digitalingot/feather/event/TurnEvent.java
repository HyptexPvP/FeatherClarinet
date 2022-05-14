package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.digitalingot.feather.ae;
import org.jetbrains.annotations.NotNull;

public interface TurnEvent {
   ac<TurnEvent> a = ad.a(TurnEvent.class, var0 -> (var1, var2) -> {
         for(TurnEvent var6 : var0) {
            ae var7 = var6.turn(var1, var2);
            if (var7 != ae.PASS) {
               return var7;
            }
         }

         return ae.PASS;
      });

   @NotNull
   ae turn(float var1, float var2);
}
