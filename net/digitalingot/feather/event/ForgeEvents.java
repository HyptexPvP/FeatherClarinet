package net.digitalingot.feather.event;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

@SideOnly(Side.CLIENT)
public class ForgeEvents implements EventForge {
   @SubscribeEvent
   public void a(ClientTickEvent var1) {
      Events.c var2 = this.a(var1.phase);
      Events.a.a().tick(var2);
   }

   @SubscribeEvent
   public void a(WorldTickEvent var1) {
      Events.c var2 = this.a(var1.phase);
      Events.b.a().tick(var2, var1.world);
   }

   @SubscribeEvent
   public void a(PlayerTickEvent var1) {
      Events.c var2 = this.a(var1.phase);
      Events.c.a().tick(var2, var1.player);
   }

   @SubscribeEvent
   public void a(RenderTickEvent var1) {
      Events.c var2 = this.a(var1.phase);
      Events.d.a().tick(var2);
   }

   @NotNull
   private Events.c a(Phase var1) {
      return var1 == Phase.END ? Events.c.END : Events.c.START;
   }
}
