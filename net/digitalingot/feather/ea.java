package net.digitalingot.feather;

import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.digitalingot.feather.profile.Profiler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ea {
   @NotNull
   private final Profiler a;

   public ea(@NotNull Profiler var1) {
      this.a = var1;
   }

   @Nullable
   public Map<String, Map<String, String>> a() {
      try {
         FileReader var1 = new FileReader(this.a.c());

         Map var4;
         try {
            BufferedReader var2 = new BufferedReader(var1);

            try {
               JsonReader var3 = new JsonReader(var2);

               try {
                  var4 = this.a(var3);
               } catch (Throwable var9) {
                  try {
                     var3.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }

                  throw var9;
               }

               var3.close();
            } catch (Throwable var10) {
               try {
                  var2.close();
               } catch (Throwable var7) {
                  var10.addSuppressed(var7);
               }

               throw var10;
            }

            var2.close();
         } catch (Throwable var11) {
            try {
               var1.close();
            } catch (Throwable var6) {
               var11.addSuppressed(var6);
            }

            throw var11;
         }

         var1.close();
         return var4;
      } catch (IOException var12) {
         return null;
      }
   }

   @NotNull
   private Map<String, Map<String, String>> a(@NotNull JsonReader var1) {
      HashMap var2 = new HashMap();
      var1.beginObject();

      while(var1.hasNext()) {
         String var3 = var1.nextName();
         Map var4 = this.b(var1);
         var2.put(var3, var4);
      }

      var1.endObject();
      return var2;
   }

   @NotNull
   private Map<String, String> b(@NotNull JsonReader var1) {
      HashMap var2 = new HashMap();
      var1.beginObject();

      while(var1.hasNext()) {
         String var3 = var1.nextName();
         String var4 = var1.nextString();
         var2.put(var3, var4);
      }

      var1.endObject();
      return var2;
   }
}
