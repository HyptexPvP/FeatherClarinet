package net.digitalingot.feather.util;

import java.io.Closeable;
import java.io.IOException;
import net.digitalingot.feather.FeatherLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CloseableUtil {
   public static void a(@Nullable @NotNull Closeable... var0) {
      for(Closeable var4 : var0) {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var6) {
            FeatherLogger.a.error("Failed to close closeable", var6);
         }
      }

   }
}
