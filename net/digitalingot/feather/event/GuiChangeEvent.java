package net.digitalingot.feather.event;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiChangeEvent implements EventForge {
   @SubscribeEvent
   public void a(InitGuiEvent var1) {
      GuiScreen var2 = var1.gui;
      if (var2 != null) {
         UIInitialization.a.a().postInitialization(var2);
      }
   }
}
