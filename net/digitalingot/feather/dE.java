package net.digitalingot.feather;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;

public class dE {
   @NotNull
   private final dr a;
   @NotNull
   private final Type b;
   @NotNull
   private final Method c;

   public dE(@NotNull dr var1, @NotNull Type var2, @NotNull Method var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @NotNull
   public dr a() {
      return this.a;
   }

   @NotNull
   public Type b() {
      return this.b;
   }

   @NotNull
   public Method c() {
      return this.c;
   }
}
