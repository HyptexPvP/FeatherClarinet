package net.digitalingot.feather.settings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eg;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import net.digitalingot.feather.mods.ModsConponment;
import org.jetbrains.annotations.NotNull;

public class BuildModConfig {
   public static void a(@NotNull ConfigManager var0) {
      Set var1 = var0.f().entrySet();
      ArrayList var2 = new ArrayList(var1.size());

      for(Entry var4 : var1) {
         Mod var5 = (Mod)var4.getValue();
         dn var6 = var5.l().b();
         if (var6.e().a().isEmpty()) {
            List var7 = eg.a(var5.k());
            ModsConponment var8 = new ModsConponment(var6.a(), (ModsConfig)var4.getKey(), var6.b(), var6.c(), var6.d(), var7);
            var2.add(var8);
         }
      }

      Collections.sort(var2);
      BuildModCategory var9 = new BuildModCategory(var2);
      e.c().a().b(var9);
   }
}
