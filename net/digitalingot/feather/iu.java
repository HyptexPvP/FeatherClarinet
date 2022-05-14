package net.digitalingot.feather;

public class iu {
   public static boolean a(int var0) {
      return var0 < 0 ? hn.a(var0 + 100) : g.a(var0);
   }

   public static boolean a(int... var0) {
      for(int var4 : var0) {
         if (!a(var4)) {
            return false;
         }
      }

      return true;
   }
}
