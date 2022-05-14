package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.cosmetic.CosmeticLoader;
import net.digitalingot.feather.cosmetic.CosmeticManager;
import net.digitalingot.feather.gui.CosmeticUI;
import org.jetbrains.annotations.NotNull;

public class fa implements CosmeticManager {
   @NotNull
   private final CosmeticUI a;

   public fa(@NotNull CosmeticUI var1) {
      this.a = var1;
   }

   @Override
   public void a(UUID var1, t var2) {
   }

   @Override
   public void a(List<CosmeticManager.a> var1) {
      for(CosmeticManager.a var3 : var1) {
         this.a.c().put(var3.a(), var3.b());
      }

      CosmeticLoader.a(this.a);
   }
}
