package net.digitalingot.feather.util;

import org.jetbrains.annotations.NotNull;

public class SystemUtil {
   public static String a(@NotNull String var0, @NotNull String var1) {
      String var2 = System.getenv(var0);
      return var2 != null ? var2 : var1;
   }
}
