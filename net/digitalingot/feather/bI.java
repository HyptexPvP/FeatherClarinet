package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;

public class bI extends TypeAdapter<is> {
   public void a(JsonWriter var1, is var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.beginObject();
         var1.name("keys");
         var1.beginArray();

         for(int var6 : var2.c()) {
            var1.value((long)ix.a(var6).c());
         }

         var1.endArray();
         var1.name("display").value(var2.a());
         var1.endObject();
      }
   }

   public is a(JsonReader var1) {
      var1.beginObject();
      ArrayList var2 = new ArrayList();

      while(var1.hasNext()) {
         String var3 = var1.nextName();
         if (var3.equals("keys")) {
            var1.beginArray();

            while(var1.hasNext()) {
               var2.add(ix.b(var1.nextInt()).b());
            }

            var1.endArray();
         } else {
            var1.skipValue();
         }
      }

      var1.endObject();
      return new is(var2.stream().mapToInt(var0 -> var0).toArray());
   }
}
