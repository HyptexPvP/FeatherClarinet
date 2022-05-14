package net.digitalingot.feather.event;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityEvent implements EventForge {
   @SubscribeEvent
   public void a(EntityJoinWorldEvent var1) {
      Entity var2 = var1.entity;
      World var3 = var1.world;
      JoinLevelEvent.a.a().joinLevel(var2, var3);
   }
}
