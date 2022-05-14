package net.digitalingot.feather;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;

public interface hQ extends Closeable, AutoCloseable {
   @NotNull
   OutputStream b();

   @NotNull
   default hS b_() {
      return new hS(this);
   }

   default void a(@NotNull Object var1) {
      this.a(new Gson(), var1);
   }

   default void a(@NotNull Gson var1, @NotNull Object var2) {
      this.a(var1.toJson(var2));
   }

   default void a(@NotNull String var1) {
      this.a(var1.getBytes());
   }

   default void a(byte[] var1) {
      this.a_((Consumer<OutputStream>)(var1x -> {
         try {
            var1x.write(var1);
         } catch (IOException var3) {
            throw new hO(var3);
         }
      }));
   }

   default void a(@NotNull InputStream var1) {
      try {
         InputStream var2 = var1;

         try {
            this.a_((Consumer<OutputStream>)(var1x -> {
               try {
                  var2.transferTo(var1x);
               } catch (IOException var3) {
                  throw new hO(var3);
               }
            }));
         } catch (Throwable var6) {
            if (var1 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if (var1 != null) {
            var1.close();
         }

      } catch (IOException var7) {
         throw new hO(var7);
      }
   }

   default <T> T a_(@NotNull Function<OutputStream, T> var1) {
      Object var3;
      try {
         OutputStream var2 = this.b();
         var3 = var1.apply(var2);
      } finally {
         CloseableUtil.a(this);
      }

      return (T)var3;
   }

   default void a_(@NotNull Consumer<OutputStream> var1) {
      try {
         OutputStream var2 = this.b();
         var1.accept(var2);
      } finally {
         CloseableUtil.a(this);
      }

   }
}
