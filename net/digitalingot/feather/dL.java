package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface dL<T> {
   @NotNull
   T a(@NotNull String var1, @NotNull Class<? extends T> var2);

   @NotNull
   String a(@NotNull T var1);
}
