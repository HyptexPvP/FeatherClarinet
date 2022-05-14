package net.digitalingot.feather.util;

import net.digitalingot.feather.dL;
import org.jetbrains.annotations.NotNull;

public class IntegerUtil implements dL<Integer> {
   @NotNull
   public Integer b(@NotNull String var1, @NotNull Class<? extends Integer> var2) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
         throw new FeatherError(var4);
      }
   }

   @NotNull
   public String a(@NotNull Integer var1) {
      return var1.toString();
   }
}
