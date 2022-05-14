package net.digitalingot.feather;

public class gy {
   public static void a(byte[] var0, float var1) {
      if (!(Math.abs((double)var1 - 1.0) < 0.001)) {
         for(int var2 = 0; var2 < var0.length; var2 += 2) {
            short var3 = a(var0[var2], var0[var2 + 1]);
            var3 = (short)((int)((float)var3 * var1));
            var0[var2] = (byte)var3;
            var0[var2 + 1] = (byte)(var3 >> 8);
         }

      }
   }

   public static byte[] a(byte[] var0, float var1, float var2) {
      byte[] var3 = new byte[var0.length * 2];

      for(int var4 = 0; var4 < var0.length; var4 += 2) {
         short var5 = a(var0[var4], var0[var4 + 1]);
         short var6 = (short)((int)((float)var5 * var1));
         short var7 = (short)((int)((float)var5 * var2));
         var3[var4 * 2] = (byte)var6;
         var3[var4 * 2 + 1] = (byte)(var6 >> 8);
         var3[var4 * 2 + 2] = (byte)var7;
         var3[var4 * 2 + 3] = (byte)(var7 >> 8);
      }

      return var3;
   }

   public static short a(byte var0, byte var1) {
      return (short)((var1 & 255) << 8 | var0 & 255);
   }

   public static byte[] a(short var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 0xFF)};
   }
}
