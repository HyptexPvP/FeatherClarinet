package net.digitalingot.feather;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class io {
   private static final NavigableMap<Integer, String> a = io.b.descendingMap();
   private static final TreeMap<Integer, String> b = new TreeMap();

   public static int a(String var0) {
      var0 = var0.toUpperCase();
      int var1 = 0;

      for(Entry var3 : a.entrySet()) {
         String var4 = (String)var3.getValue();

         for(int var5 = var3.getKey(); var0.startsWith(var4); var0 = var0.substring(var4.length())) {
            var1 += var5;
         }
      }

      return var1;
   }

   public static String a(int var0) {
      StringBuilder var1 = new StringBuilder();

      while(var0 > 0) {
         Entry var2 = b.floorEntry(var0);
         var0 -= var2.getKey();
         var1.append((String)var2.getValue());
      }

      return var1.toString();
   }

   static {
      b.put(1, "I");
      b.put(4, "IV");
      b.put(5, "V");
      b.put(9, "IX");
      b.put(10, "X");
      b.put(40, "XL");
      b.put(50, "L");
      b.put(90, "XC");
      b.put(100, "C");
      b.put(400, "CD");
      b.put(500, "D");
      b.put(900, "CM");
      b.put(1000, "M");
      b.put(4000, "MV̅");
      b.put(5000, "V̅");
      b.put(9000, "MX̅");
      b.put(10000, "X̅");
      b.put(40000, "X̅L̅");
      b.put(50000, "L̅");
      b.put(90000, "X̅C̅");
      b.put(100000, "C̅");
      b.put(400000, "C̅D̅");
      b.put(500000, "D̅");
      b.put(900000, "C̅M̅");
      b.put(1000000, "M̅");
   }
}
