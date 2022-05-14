package net.digitalingot.feather;

import java.io.InputStream;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;

public class hV implements hN {
   @NotNull
   private final InputStream a;

   public hV(@NotNull InputStream var1) {
      this.a = var1;
   }

   @NotNull
   @Override
   public InputStream a() {
      return this.a;
   }

   public void close() {
      CloseableUtil.a(this.a);
   }
}
