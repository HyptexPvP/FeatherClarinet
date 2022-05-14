package net.digitalingot.feather.util;

import net.digitalingot.feather.dL;
import org.jetbrains.annotations.NotNull;

public class BooleanUtil implements dL<Boolean> {
   @NotNull
   public Boolean b(@NotNull String var1, @NotNull Class<? extends Boolean> var2) {
      if (var1.equalsIgnoreCase("true")) {
         return true;
      } else if (var1.equalsIgnoreCase("false")) {
         return false;
      } else {
         throw new FeatherError("Input was neither true nor false.");
      }
   }

   @NotNull
   public String a(@NotNull Boolean var1) {
      return var1.toString();
   }
}
