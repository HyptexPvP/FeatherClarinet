package net.digitalingot.feather;

import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

public class bt<S, F> {
   @Nullable
   private final Consumer<S> a;
   @Nullable
   private final Consumer<F> b;

   public bt(@Nullable Consumer<S> var1, @Nullable Consumer<F> var2) {
      this.a = var1;
      this.b = var2;
   }

   @Nullable
   public Consumer<S> a() {
      return this.a;
   }

   @Nullable
   public Consumer<F> b() {
      return this.b;
   }
}
