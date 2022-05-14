package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.digitalingot.feather.ae;
import org.jetbrains.annotations.NotNull;

public class RenderEVent {
   public static ac<RenderEVent.b> a = ad.a(RenderEVent.b.class, var0 -> (var1, var2) -> {
         for(RenderEVent.b var6 : var0) {
            ae var7 = var6.render(var1, var2);
            if (var7 != ae.PASS) {
               return var7;
            }
         }

         return ae.PASS;
      });
   public static ac<RenderEVent.a> b = ad.a(RenderEVent.a.class, var0 -> (var1, var2) -> {
         for(RenderEVent.a var6 : var0) {
            var6.render(var1, var2);
         }

      });
   public static ac<RenderEVent.a> c = ad.a(RenderEVent.a.class, var0 -> (var1, var2) -> {
         for(RenderEVent.a var6 : var0) {
            var6.render(var1, var2);
         }

      });
   public static ac<RenderEVent.a> d = ad.a(RenderEVent.a.class, var0 -> (var1, var2) -> {
         for(RenderEVent.a var6 : var0) {
            var6.render(var1, var2);
         }

      });

   public interface a {
      void render(@NotNull Void var1, @NotNull RenderEVent.c var2);
   }

   public interface b {
      @NotNull
      ae render(@NotNull Void var1, @NotNull RenderEVent.c var2);
   }

   public static enum c {
      ALL,
      CROSSHAIRS,
      FOOD;
   }
}
