package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface Track {
   ac<Track> a = ad.a(Track.class, var0 -> var1 -> {
         for(Track var5 : var0) {
            var5.track(var1);
         }

      });
   ac<Track> b = ad.a(Track.class, var0 -> var1 -> {
         for(Track var5 : var0) {
            var5.track(var1);
         }

      });

   void track(@NotNull Entity var1);
}
