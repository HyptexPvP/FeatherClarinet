package net.digitalingot.feather;

import java.io.InputStream;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hT implements hN {
   @NotNull
   private final String a;
   @Nullable
   private InputStream b;

   public hT(@NotNull String var1) {
      this.a = var1;
   }

   @NotNull
   @Override
   public InputStream a() {
      this.b = this.getClass().getClassLoader().getResourceAsStream(this.a);
      return this.b;
   }

   public void close() {
      CloseableUtil.a(this.b);
      this.b = null;
   }
}
