package net.digitalingot.feather;

public final class hl {
   private hl() {
      throw new AssertionError();
   }

   public static float a(float var0) {
      int var1 = Float.floatToIntBits(var0);
      var1 = 1419967116 - var1 / 3;
      float var2 = Float.intBitsToFloat(var1);
      var2 = 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
      return 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
   }
}
