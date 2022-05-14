package net.digitalingot.feather;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import net.digitalingot.feather.util.CloseableUtil;
import org.jetbrains.annotations.NotNull;

public interface hN extends Closeable, AutoCloseable {
   @NotNull
   InputStream a();

   default void a(@NotNull hQ var1) {
      this.a(var1::a);
   }

   @NotNull
   default hN a_() {
      return new hR(this);
   }

   @NotNull
   default <T> T a(@NotNull Type var1) {
      Gson var2 = new Gson();
      return this.a(var2, var1);
   }

   @NotNull
   default <T> T a(@NotNull Class<T> var1) {
      Gson var2 = new Gson();
      return this.a(var2, var1);
   }

   @NotNull
   default <T> T a(@NotNull Gson var1, @NotNull Class<T> var2) {
      return (T)var1.fromJson(this.c(), var2);
   }

   @NotNull
   default <T> T a(@NotNull Gson var1, @NotNull Type var2) {
      return (T)var1.fromJson(this.c(), var2);
   }

   @NotNull
   default String c() {
      return String.join("\n", this.d());
   }

   @NotNull
   default List<String> d() {
      return this.a((Function<InputStream, List<String>>)(var0 -> {
         try {
            InputStreamReader var1 = new InputStreamReader(var0);

            ArrayList var5;
            try {
               BufferedReader var2 = new BufferedReader(var1);

               try {
                  ArrayList var3 = new ArrayList();

                  String var4;
                  while((var4 = var2.readLine()) != null) {
                     var3.add(var4);
                  }

                  var5 = var3;
               } catch (Throwable var8) {
                  try {
                     var2.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }

                  throw var8;
               }

               var2.close();
            } catch (Throwable var9) {
               try {
                  var1.close();
               } catch (Throwable var6) {
                  var9.addSuppressed(var6);
               }

               throw var9;
            }

            var1.close();
            return var5;
         } catch (IOException var10) {
            throw new hO(var10);
         }
      }));
   }

   default <T> T a(@NotNull Function<InputStream, T> var1) {
      Object var3;
      try {
         InputStream var2 = this.a();
         var3 = var1.apply(var2);
      } finally {
         CloseableUtil.a(this);
      }

      return (T)var3;
   }

   default void a(@NotNull Consumer<InputStream> var1) {
      try {
         InputStream var2 = this.a();
         var1.accept(var2);
      } finally {
         CloseableUtil.a(this);
      }

   }
}
