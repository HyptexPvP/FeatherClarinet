package net.digitalingot.feather;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class it implements Comparator<Integer> {
   private static final List<Integer> a = Arrays.asList(18, 17, 16, 10018, 10017, 10016, 524, 10, 10524, 10010);

   public int a(Integer var1, Integer var2) {
      Integer var3 = ix.a(var1).c();
      Integer var4 = ix.a(var2).c();
      boolean var5 = a.stream().anyMatch(var1x -> Objects.equals(var1x, var3));
      boolean var6 = a.stream().anyMatch(var1x -> Objects.equals(var1x, var4));
      if (var5 && var6) {
         int var7 = a.indexOf(var3) - a.indexOf(var4);
         return var7 != 0 ? var7 : var3.compareTo(var4);
      } else if (var5) {
         return -1;
      } else {
         return var6 ? 1 : var3.compareTo(var4);
      }
   }
}
