package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface renderFogDensityEvent {
   ac<renderFogDensityEvent> a = ad.a(renderFogDensityEvent.class, var0 -> (var1, var2) -> {
         Float var3 = null;

         for(renderFogDensityEvent var7 : var0) {
            var3 = var7.renderFogDensity(var1, var3 == null ? 0.1F : var3);
         }

         return var3;
      });

   @Nullable
   Float renderFogDensity(@NotNull Block var1, float var2);
}
