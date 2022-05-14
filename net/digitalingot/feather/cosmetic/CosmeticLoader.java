package net.digitalingot.feather.cosmetic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browserEvent.LoadCosmeticSettingsEvent;
import net.digitalingot.feather.gui.CosmeticUI;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class CosmeticLoader {
   public static void a(@NotNull CosmeticUI var0) {
      Map var1 = var0.b().f().b();
      Map var2 = b(var0);
      LoadCosmeticSettingsEvent var3 = new LoadCosmeticSettingsEvent(var1, var2);
      e.c().a().b(var3);
   }

   @NotNull
   private static Map<Cosmetic.a, String> b(@NotNull CosmeticUI var0) {
      UUID var1 = Minecraft.func_71410_x().func_110432_I().func_148256_e().getId();
      List var2 = (List)var0.c().get(var1);
      if (var2 == null) {
         return new HashMap();
      } else {
         HashMap var3 = new HashMap(var2.size());

         for(Cosmetic var5 : var2) {
            var3.put(var5.d(), var5.b());
         }

         return var3;
      }
   }
}
