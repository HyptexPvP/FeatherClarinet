package net.digitalingot.feather.config;

import net.digitalingot.feather.e;
import net.digitalingot.feather.browserEvent.LoadPreferences;
import net.digitalingot.feather.mods.CoreMod;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class Preferences {
   public static void a(@NotNull ClientPreferences var0) {
      ColorPicker var1 = var0.b();
      boolean var2 = e.c().b().<CoreMod>b(CoreMod.class).k().s;
      String var3 = "Feather " + Minecraft.func_71410_x().func_175600_c() + " (" + e.c().f() + ")";
      LoadPreferences var4 = new LoadPreferences(var1.b(), var1.a(), var2, var3);
      e.c().a().b(var4);
   }
}
