package net.digitalingot.feather;

import java.util.StringJoiner;
import net.digitalingot.feather.util.IntegerUtil;
import org.jetbrains.annotations.NotNull;

public class dV implements dL<is> {
   @NotNull
   private final IntegerUtil a = new IntegerUtil();

   @NotNull
   public is b(@NotNull String var1, @NotNull Class<? extends is> var2) {
      if (var1.equals("0")) {
         return new is(new int[0]);
      } else {
         String[] var3 = var1.split(",");
         int[] var4 = new int[var3.length];

         for(int var5 = 0; var5 < var3.length; ++var5) {
            var4[var5] = ix.b(this.a.b(var3[var5], Integer.class)).b();
         }

         return new is(var4);
      }
   }

   @NotNull
   public String a(@NotNull is var1) {
      if (var1.c().length == 0) {
         return "0";
      } else {
         StringJoiner var2 = new StringJoiner(",");

         for(int var6 : var1.c()) {
            var2.add(String.valueOf(ix.a(var6).c()));
         }

         return var2.toString();
      }
   }
}
