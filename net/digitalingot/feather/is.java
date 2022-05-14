package net.digitalingot.feather;

import java.util.Arrays;
import java.util.StringJoiner;
import org.jetbrains.annotations.NotNull;

public class is {
   private final int[] a;

   public is(int[] var1) {
      this.a = Arrays.stream(var1).boxed().sorted(new it()).mapToInt(var0 -> var0).toArray();
   }

   @NotNull
   public String a() {
      StringJoiner var1 = new StringJoiner(" + ");

      for(int var5 : this.a) {
         var1.add(ix.a(var5).a());
      }

      return var1.toString();
   }

   public boolean b() {
      if (this.a.length == 0) {
         return false;
      } else {
         for(int var4 : this.a) {
            if (var4 != 0) {
               if (var4 >= 100000) {
                  if (!hn.a(var4 - 100001)) {
                     return false;
                  }
               } else if (!g.a(var4)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public int[] c() {
      return this.a;
   }
}
