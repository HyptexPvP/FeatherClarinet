package net.digitalingot.feather.util;

import org.jetbrains.annotations.NotNull;

public class FeatherError extends RuntimeException {
   public FeatherError(@NotNull String var1) {
      super(var1);
   }

   public FeatherError(@NotNull String var1, @NotNull Throwable var2) {
      super(var1, var2);
   }

   public FeatherError(@NotNull Throwable var1) {
      super(var1);
   }
}
