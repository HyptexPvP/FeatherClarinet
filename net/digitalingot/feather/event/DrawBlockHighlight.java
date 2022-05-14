package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.digitalingot.feather.ae;
import org.jetbrains.annotations.NotNull;

public interface DrawBlockHighlight {
   ac<DrawBlockHighlight> a = ad.a(DrawBlockHighlight.class, var0 -> () -> {
         for(DrawBlockHighlight var4 : var0) {
            ae var5 = var4.drawHighlightBlock();
            if (var5 != ae.PASS) {
               return var5;
            }
         }

         return ae.PASS;
      });

   @NotNull
   ae drawHighlightBlock();
}
