package net.digitalingot.feather.settings;

import java.util.HashMap;
import java.util.Map.Entry;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.e;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.config.ModConponmentConfig;
import net.digitalingot.feather.config.ModProfileConfig;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class BuildModProfile {
   public static void a(@NotNull ConfigManager var0) {
      HashMap var1 = new HashMap(var0.f().size());

      for(Entry var3 : var0.f().entrySet()) {
         ModsConfig var4 = (ModsConfig)var3.getKey();
         Mod var5 = (Mod)var3.getValue();
         dn var6 = var5.l().b();
         if (var6.e().a().isEmpty()) {
            ModConponmentConfig var7 = new ModConponmentConfig(var5.k());
            var1.put(var4, var7);
         }
      }

      ModProfileConfig var8 = new ModProfileConfig(var1);
      e.c().a().b(var8);
   }
}
