package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.digitalingot.feather.events.Events$e;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class Events {
   public static ac<Events.a> a = ad.a(Events.a.class, var0 -> var1 -> {
         for(Events.a var5 : var0) {
            var5.tick(var1);
         }

      });
   public static ac<Events.b> b = ad.a(Events.b.class, var0 -> (var1, var2) -> {
         for(Events.b var6 : var0) {
            var6.tick(var1, var2);
         }

      });
   public static ac<Events.d> c = ad.a(Events.d.class, var0 -> (var1, var2) -> {
         for(Events.d var6 : var0) {
            var6.tick(var1, var2);
         }

      });
   public static ac<Events$e> d = ad.a(Events$e.class, var0 -> var1 -> {
         for(Events$e var5 : var0) {
            var5.tick(var1);
         }

      });

   public interface a {
      void tick(@NotNull Events.c var1);
   }

   public interface b {
      void tick(@NotNull Events.c var1, @NotNull World var2);
   }

   public static enum c {
      START,
      END;
   }

   public interface d {
      void tick(@NotNull Events.c var1, @NotNull EntityPlayer var2);
   }
}
