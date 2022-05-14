package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

public interface openScreen {
   ac<openScreen> a = ad.a(openScreen.class, var0 -> var1 -> {
         GuiScreen var2 = var1;

         for(openScreen var6 : var0) {
            var2 = var6.openScreen(var2);
         }

         return var2;
      });

   @NotNull
   GuiScreen openScreen(@NotNull GuiScreen var1);
}
