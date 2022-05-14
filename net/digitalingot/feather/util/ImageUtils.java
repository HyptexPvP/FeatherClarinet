package net.digitalingot.feather.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import net.digitalingot.feather.FeatherLogger;

public class ImageUtils {
   public static final int a = 64;

   public static BufferedImage a(BufferedImage var0) {
      if (var0 == null) {
         return null;
      } else if (var0.getHeight() <= 64 && var0.getWidth() <= 64) {
         return var0;
      } else {
         FeatherLogger.a.debug("Scaling resource pack icon from " + var0.getWidth() + " to " + 64);
         BufferedImage var1 = new BufferedImage(64, 64, 2);
         Graphics var2 = var1.getGraphics();
         var2.drawImage(var0, 0, 0, 64, 64, null);
         var2.dispose();
         return var1;
      }
   }
}
