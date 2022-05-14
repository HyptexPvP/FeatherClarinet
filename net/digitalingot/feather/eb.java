package net.digitalingot.feather;

import com.google.gson.stream.JsonWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import net.digitalingot.feather.profile.Profiler;
import org.jetbrains.annotations.NotNull;

public class eb {
   @NotNull
   private final Profiler a;

   public eb(@NotNull Profiler var1) {
      this.a = var1;
   }

   public void a(@NotNull String var1, @NotNull Map<String, String> var2) {
      Map var3 = this.a.b();
      if (var3 == null) {
         var3 = this.a.a();
         if (var3 == null) {
            throw new IllegalStateException("Config cache after read still null.");
         }
      }

      var3.put(var1, var2);
      this.a(var3);
   }

   public void a(@NotNull Map<String, Map<String, String>> var1) {
      try {
         FileWriter var2 = new FileWriter(this.a.c());

         try {
            BufferedWriter var3 = new BufferedWriter(var2);

            try {
               JsonWriter var4 = new JsonWriter(var3);

               try {
                  this.b(var4, var1);
               } catch (Throwable var10) {
                  try {
                     var4.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }

                  throw var10;
               }

               var4.close();
            } catch (Throwable var11) {
               try {
                  var3.close();
               } catch (Throwable var8) {
                  var11.addSuppressed(var8);
               }

               throw var11;
            }

            var3.close();
         } catch (Throwable var12) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var12.addSuppressed(var7);
            }

            throw var12;
         }

         var2.close();
      } catch (IOException var13) {
         throw new RuntimeException(var13);
      }
   }

   private void b(@NotNull JsonWriter var1, @NotNull Map<String, Map<String, String>> var2) {
      if (!this.a.c().exists() && !this.a.c().createNewFile()) {
         throw new IOException("Configuration file could not be created");
      } else {
         var1.beginObject();

         for(Entry var4 : var2.entrySet()) {
            String var5 = (String)var4.getKey();
            Map var6 = (Map)var4.getValue();
            var1.name(var5);
            this.a(var1, var6);
         }

         var1.endObject();
      }
   }

   public void a(@NotNull JsonWriter var1, @NotNull Map<String, String> var2) {
      var1.beginObject();

      for(Entry var4 : var2.entrySet()) {
         String var5 = (String)var4.getKey();
         String var6 = (String)var4.getValue();
         var1.name(var5).value(var6);
      }

      var1.endObject();
   }
}
