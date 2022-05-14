package net.digitalingot.feather.util;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

public class ImageResizer {
   public static ByteBuffer a(BufferedImage var0) {
      byte[] var1 = new byte[var0.getWidth() * var0.getHeight() * 4];
      int var2 = 0;

      for(int var3 = 0; var3 < var0.getHeight(); ++var3) {
         for(int var4 = 0; var4 < var0.getWidth(); ++var4) {
            int var5 = var0.getRGB(var4, var3);
            var1[var2] = (byte)(var5 << 8 >> 24);
            var1[var2 + 1] = (byte)(var5 << 16 >> 24);
            var1[var2 + 2] = (byte)(var5 << 24 >> 24);
            var1[var2 + 3] = (byte)(var5 >> 24);
            var2 += 4;
         }
      }

      return ByteBuffer.wrap(var1);
   }
}
