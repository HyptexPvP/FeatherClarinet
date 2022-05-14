package net.digitalingot.feather;

import java.io.BufferedInputStream;
import java.io.InputStream;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hR implements hN {
   @NotNull
   private final hN a;
   @Nullable
   private BufferedInputStream b;

   public hR(@NotNull hN var1) {
      this.a = var1;
   }

   @NotNull
   @Override
   public InputStream a() {
      this.b = new BufferedInputStream(this.a.a());
      return this.b;
   }

   public void close() {
      CloseableUtil.a(this.b);
      this.a.close();
   }
}
