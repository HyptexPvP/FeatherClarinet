package net.digitalingot.feather.event;

import java.util.List;
import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface TooltipEvent {
   ac<TooltipEvent> a = ad.a(TooltipEvent.class, var0 -> (var1, var2) -> {
         for(TooltipEvent var6 : var0) {
            var6.showTooltip(var1, var2);
         }

      });

   void showTooltip(@NotNull ItemStack var1, @NotNull List<String> var2);
}
