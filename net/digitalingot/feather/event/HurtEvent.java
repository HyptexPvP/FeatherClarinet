package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.entity.EntityLivingBase;
import org.jetbrains.annotations.NotNull;

public interface HurtEvent {
   ac<HurtEvent> a = ad.a(HurtEvent.class, var0 -> var1 -> {
         for(HurtEvent var5 : var0) {
            var5.hurt(var1);
         }

      });

   void hurt(@NotNull EntityLivingBase var1);
}
