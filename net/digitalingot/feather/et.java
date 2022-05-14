package net.digitalingot.feather;

import java.util.HashMap;
import java.util.Map.Entry;
import net.digitalingot.feather.browserEvent.LoadSideBarModConfigEvent;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.HUDSettings;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class et {
   public static void a(@NotNull ConfigManager var0) {
      HashMap var1 = new HashMap();

      for(Entry var3 : var0.f().entrySet()) {
         ModsConfig var4 = (ModsConfig)var3.getKey();
         Mod var5 = (Mod)var3.getValue();
         dn var6 = var5.l().b();
         if (!var6.e().a().isEmpty()) {
            HUDSettings var7 = new HUDSettings(var5.k());
            var1.put(var4, var7);
         }
      }

      LoadSideBarModConfigEvent var8 = new LoadSideBarModConfigEvent(var1);
      e.c().a().b(var8);
   }
}
