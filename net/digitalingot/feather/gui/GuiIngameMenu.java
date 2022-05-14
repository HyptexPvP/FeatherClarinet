package net.digitalingot.feather.gui;

import net.digitalingot.feather.event.UIInitialization;
import net.digitalingot.feather.mixin.core.IMixinScreen;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;

public class GuiIngameMenu {
   public void a() {
      UIInitialization.a.a(var0 -> {
         if (var0 instanceof net.minecraft.client.gui.GuiIngameMenu) {
            IMixinScreen var1 = (IMixinScreen)var0;
            var1.getRenderables().removeIf(GuiIngameMenu::a);
            String var2 = "Server List";
            String var3 = "Feather Settings";
            int var4 = var0.field_146295_m / 4 + 72 - 16;
            GuiButton var5 = new GuiButton(99, var0.field_146294_l / 2 - 100, var4, 98, 20, var2);
            var1.getRenderables().add(var5);
            GuiButton var6 = new GuiButton(100, var0.field_146294_l / 2 + 2, var4, 98, 20, var3);
            var1.getRenderables().add(var6);
         }

      });
   }

   private static boolean a(Object var0) {
      if (!(var0 instanceof GuiButton)) {
         return false;
      } else {
         GuiButton var1 = (GuiButton)var0;
         String var2 = var1.field_146126_j;
         return var2.equals(I18n.func_135052_a("menu.shareToLan", new Object[0]));
      }
   }
}
