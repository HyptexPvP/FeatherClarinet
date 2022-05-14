package net.digitalingot.feather;

import net.digitalingot.feather.util.FeatherError;
import org.jetbrains.annotations.NotNull;

public class dS implements dL<Double> {
   @NotNull
   public Double b(@NotNull String var1, @NotNull Class<? extends Double> var2) {
      try {
         return Double.parseDouble(var1);
      } catch (NumberFormatException var4) {
         throw new FeatherError(var4);
      }
   }

   @NotNull
   public String a(@NotNull Double var1) {
      return var1.toString();
   }
}
