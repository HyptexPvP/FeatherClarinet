package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import org.jetbrains.annotations.NotNull;

public class ix {
   @NotNull
   private static final ImmutableMap<Integer, iv> a;
   @NotNull
   private static final ImmutableMap<Integer, iv> b;

   @NotNull
   public static iv a(int var0) {
      iv var1 = (iv)a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         return var0 >= 100000 ? iw.b : iw.a;
      }
   }

   @NotNull
   public static iv b(int var0) {
      iv var1 = (iv)b.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         return var0 >= 100000 ? iw.b : iw.a;
      }
   }

   static {
      Builder var0 = ImmutableMap.builder();
      Builder var1 = ImmutableMap.builder();

      for(iv var5 : iw.c) {
         var0.put(var5.b(), var5);
         var1.put(var5.c(), var5);
      }

      a = var0.build();
      b = var1.build();
   }
}
