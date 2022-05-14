package net.digitalingot.feather.settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eg;
import net.digitalingot.feather.browserEvent.BuildSideBarSettings;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class BuildModSettings {
   public static void a(@NotNull ConfigManager var0) {
      Set var1 = var0.f().entrySet();
      TreeMap var2 = new TreeMap();

      for(Entry var4 : var1) {
         ModsConfig var5 = (ModsConfig)var4.getKey();
         Mod var6 = (Mod)var4.getValue();
         dn var7 = var6.l().b();
         if (!var7.e().a().isEmpty()) {
            List var8 = eg.a(var6.k());
            BuildSideBarSettings.a var9 = new BuildSideBarSettings.a(var7.a(), var5, var7.e().a(), var7.b(), var7.c(), var8);
            var2.put(var7.e().b().a(), var9);
         }
      }

      BuildSideBarSettings var10 = new BuildSideBarSettings(new ArrayList(var2.values()));
      e.c().a().b(var10);
   }
}
