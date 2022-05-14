package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.client.gui.GuiScreen;

public interface UIInitialization {
   ac<UIInitialization> a = ad.a(UIInitialization.class, var0 -> var1 -> {
         for(UIInitialization var5 : var0) {
            var5.postInitialization(var1);
         }

      });

   void postInitialization(GuiScreen var1);
}
