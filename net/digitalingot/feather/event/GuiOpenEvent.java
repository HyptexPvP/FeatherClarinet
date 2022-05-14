package net.digitalingot.feather.event;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiOpenEvent implements EventForge {
   @SubscribeEvent
   public void a(net.minecraftforge.client.event.GuiOpenEvent var1) {
      GuiScreen var2 = var1.gui;
      if (var2 != null) {
         GuiScreen var3 = openScreen.a.a().openScreen(var2);
         var1.gui = var3;
      }
   }
}
