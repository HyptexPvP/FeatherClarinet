package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ReceiveMessageEvent {
   ac<ReceiveMessageEvent> a = ad.a(ReceiveMessageEvent.class, var0 -> var1 -> {
         IChatComponent var2 = var1;

         for(ReceiveMessageEvent var6 : var0) {
            var2 = var6.receiveMessage(var2);
            if (var2 == null) {
               return null;
            }
         }

         return var2;
      });

   @Nullable
   IChatComponent receiveMessage(@NotNull IChatComponent var1);
}
