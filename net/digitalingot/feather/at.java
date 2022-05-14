package net.digitalingot.feather;

import java.util.List;
import net.digitalingot.feather.event.EventForge;
import net.digitalingot.feather.event.TooltipEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class at implements EventForge {
   @SubscribeEvent
   public void a(ItemTooltipEvent var1) {
      ItemStack var2 = var1.itemStack;
      List var3 = var1.toolTip;
      TooltipEvent.a.a().showTooltip(var2, var3);
   }
}
