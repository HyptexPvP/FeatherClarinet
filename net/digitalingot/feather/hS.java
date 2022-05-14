package net.digitalingot.feather;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hS implements hQ {
   @NotNull
   private final hQ a;
   @Nullable
   private BufferedOutputStream b;

   public hS(@NotNull hQ var1) {
      this.a = var1;
   }

   @NotNull
   @Override
   public OutputStream b() {
      this.b = new BufferedOutputStream(this.a.b());
      return this.b;
   }

   public void close() {
      CloseableUtil.a(this.b);
      this.a.close();
   }
}
