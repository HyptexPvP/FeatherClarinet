package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface ItemStackRender {
   ac<ItemStackRender> a = ad.a(ItemStackRender.class, var0 -> (var1, var2, var3, var4, var5) -> {
         for(ItemStackRender var9 : var0) {
            var9.render(var1, var2, var3, var4, var5);
         }

      });

   void render(@NotNull ItemStack var1, int var2, int var3, int var4, int var5);
}
