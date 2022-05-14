package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public interface JoinLevelEvent {
   ac<JoinLevelEvent> a = ad.a(JoinLevelEvent.class, var0 -> (var1, var2) -> {
         for(JoinLevelEvent var6 : var0) {
            var6.joinLevel(var1, var2);
         }

      });

   void joinLevel(@NotNull Entity var1, @NotNull World var2);
}
