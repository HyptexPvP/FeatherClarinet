package net.digitalingot.feather;

public final class ij {
   private ij() {
      throw new AssertionError();
   }

   public static float a(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static float a(float var0) {
      return a(var0, 0.0F, 1.0F);
   }
}
