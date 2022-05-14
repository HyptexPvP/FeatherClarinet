package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

public interface StateChangeEvent {
   ac<StateChangeEvent> a = ad.a(StateChangeEvent.class, var0 -> (var1, var2) -> {
         for(StateChangeEvent var6 : var0) {
            var6.loadedStateChange(var1, var2);
         }

      });

   void loadedStateChange(@NotNull Mod<?> var1, boolean var2);
}
