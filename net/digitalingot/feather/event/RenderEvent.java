package net.digitalingot.feather.event;

import net.digitalingot.feather.ae;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Text;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

@SideOnly(Side.CLIENT)
public class RenderEvent implements EventForge {
   @SubscribeEvent
   public void a(Pre var1) {
      ElementType var2 = var1.type;
      RenderEVent.c var3 = this.a(var2);
      if (var3 != null) {
         ae var4 = RenderEVent.a.a().render(null, var3);
         if (var4 == ae.FAIL) {
            var1.setCanceled(true);
         }

      }
   }

   @SubscribeEvent
   public void a(Post var1) {
      ElementType var2 = var1.type;
      RenderEVent.c var3 = this.a(var2);
      if (var3 != null) {
         RenderEVent.b.a().render(null, var3);
      }
   }

   @SubscribeEvent
   public void a(Text var1) {
      MatrixUtils var2 = new MatrixUtils();
      ((RenderEvent)a.a()).render(var2);
      GlStateManager.func_179120_a(770, 771, 1, 0);
   }

   @Nullable
   private RenderEVent.c a(ElementType var1) {
      switch(var1) {
         case ALL:
            return RenderEVent.c.ALL;
         case CROSSHAIRS:
            return RenderEVent.c.CROSSHAIRS;
         case FOOD:
            return RenderEVent.c.FOOD;
         default:
            return null;
      }
   }
}
