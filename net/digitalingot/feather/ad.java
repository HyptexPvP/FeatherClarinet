package net.digitalingot.feather;

import java.util.function.Function;

public final class ad {
   private static boolean a = true;

   private ad() {
   }

   public static boolean a() {
      return a;
   }

   public static void b() {
      ag.a();
   }

   public static <T> ac<T> a(Class<? super T> var0, Function<T[], T> var1) {
      return ag.a(var0, var1);
   }

   public static <T> ac<T> a(Class<T> var0, T var1, Function<T[], T> var2) {
      return a(var0, var2x -> {
         if (var2x.length == 0) {
            return var1;
         } else {
            return var2x.length == 1 ? var2x[0] : var2.apply(var2x);
         }
      });
   }

   public static String a(Object var0) {
      return var0.getClass().getName();
   }
}
