package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.util.UUID;

public class in {
   public static byte[] a(UUID var0) {
      ByteBuffer var1 = ByteBuffer.wrap(new byte[16]);
      var1.putLong(var0.getMostSignificantBits());
      var1.putLong(var0.getLeastSignificantBits());
      return var1.array();
   }

   public static UUID a(byte[] var0) {
      long var1 = 0L;
      long var3 = 0L;

      for(int var5 = 0; var5 < 8; ++var5) {
         var1 = var1 << 8 | (long)(var0[var5] & 255);
      }

      for(int var6 = 8; var6 < 16; ++var6) {
         var3 = var3 << 8 | (long)(var0[var6] & 255);
      }

      return new UUID(var1, var3);
   }
}
