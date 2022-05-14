package net.digitalingot.feather.gui;

import net.digitalingot.feather.e;
import org.jetbrains.annotations.Nullable;

public class HUDButtonEdit {
   public static void a(boolean var0) {
      a(null, var0);
   }

   public static void a(@Nullable String var0, boolean var1) {
      HUDEditButton var2 = new HUDEditButton(var0, var1);
      e.c().a().b(var2);
   }
}
