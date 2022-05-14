package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import org.jetbrains.annotations.NotNull;

public interface SelectEvent {
   ac<SelectEvent> a = ad.a(SelectEvent.class, var0 -> var1 -> {
         for(SelectEvent var5 : var0) {
            var5.select(var1);
         }

      });

   void select(@NotNull String var1);
}
