package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class dY extends RuntimeException {
   public dY(@NotNull String var1) {
      super(var1);
   }

   public dY(@NotNull String var1, @NotNull Throwable var2) {
      super(var1, var2);
   }

   public dY(@NotNull Throwable var1) {
      super(var1);
   }
}
