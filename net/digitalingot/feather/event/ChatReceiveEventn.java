package net.digitalingot.feather.event;

import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ChatReceiveEventn implements EventForge {
   @SubscribeEvent
   public void a(ClientChatReceivedEvent var1) {
      byte var2 = var1.type;
      if (var2 != 2) {
         IChatComponent var3 = var1.message;
         var3 = ReceiveMessageEvent.a.a().receiveMessage(var3);
         if (var3 == null) {
            var1.setCanceled(true);
         } else {
            var1.message = var3;
         }
      }
   }
}
