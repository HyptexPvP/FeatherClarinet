package net.digitalingot.feather;

import com.google.common.collect.Maps;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;

public class dN<T> {
   @NotNull
   private final dF a;
   @NotNull
   private final dL<T> b;
   @NotNull
   private final T c;

   public dN(@NotNull dF var1, @NotNull T var2) {
      this.a = var1;
      this.b = dO.a(var1.a());
      if (this.b == null) {
         throw new IllegalArgumentException("Type " + var1.a().getName() + " (" + var1 + ") not supported");
      } else {
         this.c = (T)var2;
      }
   }

   @NotNull
   public Entry<String, String> a() {
      String var1 = this.a.c().a();
      String var2 = this.b.a(this.c);
      return Maps.immutableEntry(var1, var2);
   }
}
