package net.digitalingot.feather.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class IntUtil {
   private IntUtil() {
      throw new AssertionError();
   }

   public static DecimalFormat a(String var0) {
      DecimalFormat var1 = new DecimalFormat(var0, new DecimalFormatSymbols(Locale.ROOT));
      var1.setRoundingMode(RoundingMode.HALF_UP);
      return var1;
   }

   public static void a(DecimalFormat var0, int var1) {
      var0.setMaximumFractionDigits(var1);
      var0.setMinimumFractionDigits(var1);
   }
}
