package net.digitalingot.feather;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hU implements hN, hQ {
   @NotNull
   private final File a;
   @Nullable
   private InputStream b;
   @Nullable
   private OutputStream c;

   public hU(@NotNull File var1) {
      this.a = var1;
   }

   @NotNull
   @Override
   public InputStream a() {
      if (this.b != null) {
         return this.b;
      } else {
         try {
            this.b = new FileInputStream(this.a);
            return this.b;
         } catch (Exception var2) {
            throw new hO(var2);
         }
      }
   }

   @NotNull
   @Override
   public OutputStream b() {
      if (this.c != null) {
         return this.c;
      } else {
         try {
            this.c = new FileOutputStream(this.a);
            return this.c;
         } catch (Exception var2) {
            throw new hO(var2);
         }
      }
   }

   public void close() {
      CloseableUtil.a(this.b, this.c);
      this.b = null;
      this.c = null;
   }
}
