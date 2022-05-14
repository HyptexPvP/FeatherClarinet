package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public interface PlayerEvent {
   ac<PlayerEvent> a = ad.a(PlayerEvent.class, var0 -> (var1, var2) -> {
         if (!PlayerEvent.a.a) {
            PlayerEvent.a.a = true;

            for(PlayerEvent var6 : var0) {
               var6.on(var1, var2);
            }

         }
      });
   ac<PlayerEvent> b = ad.a(PlayerEvent.class, var0 -> (var1, var2) -> {
         if (PlayerEvent.a.a) {
            PlayerEvent.a.a = false;

            for(PlayerEvent var6 : var0) {
               var6.on(var1, var2);
            }

         }
      });

   void on(@NotNull EntityPlayer var1, @NotNull NetHandlerPlayClient var2);

   public static class a {
      private static boolean a;
   }
}
