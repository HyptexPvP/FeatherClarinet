package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface OrientEvent {
   ac<OrientEvent> a = ad.a(OrientEvent.class, var0 -> var1 -> {
         for(OrientEvent var5 : var0) {
            var5.orient(var1);
         }

      });
   ac<OrientEvent> b = ad.a(OrientEvent.class, var0 -> var1 -> {
         for(OrientEvent var5 : var0) {
            var5.orient(var1);
         }

      });

   void orient(@NotNull Entity var1);
}
