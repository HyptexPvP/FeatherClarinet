package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.feather.browserEvent.BuildCosmeticMenuEvent;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.cosmetic.CosmeticAPI;
import net.digitalingot.feather.cosmetic.CosmeticsSetting;
import net.digitalingot.feather.gui.CosmeticUI;
import net.digitalingot.feather.gui.ModSettingsUI;
import org.jetbrains.annotations.NotNull;

public class w {
   public static void a(@NotNull CosmeticUI var0) {
      CosmeticAPI var1 = var0.b();
      List var2 = a(var1);
      BuildCosmeticMenuEvent var3 = new BuildCosmeticMenuEvent(var2);
      e.c().a().b(var3);
   }

   @NotNull
   private static List<ModSettingsUI> a(@NotNull CosmeticAPI var0) {
      ArrayList var1 = new ArrayList();

      for(Cosmetic var3 : var0.d().values()) {
         Class var5 = (Class)CosmeticsSetting.a.get(var3.b());
         List var4;
         if (var5 != null) {
            Object var6 = var0.f().a(var3.b(), var5);
            var4 = eg.a(var6);
         } else {
            var4 = null;
         }

         ModSettingsUI var7 = new ModSettingsUI(var3.a(), var3.b(), var3.c(), var3.d(), var4);
         var1.add(var7);
      }

      return var1;
   }
}
