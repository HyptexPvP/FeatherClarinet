package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class bE extends TypeAdapter<Color> {
   public void a(JsonWriter var1, Color var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.beginObject();
         String var3;
         if (var2.getAlpha() == 0) {
            var3 = String.format("#%02x%02x%02x", var2.getRed(), var2.getGreen(), var2.getBlue());
         } else {
            var3 = String.format("#%02x%02x%02x%02x", var2.getRed(), var2.getGreen(), var2.getBlue(), var2.getAlpha());
         }

         var1.name("color").value(var3);
         var1.name("chroma").value(false);
         var1.endObject();
      }
   }

   public Color a(JsonReader var1) {
      var1.beginObject();
      Color var2 = null;

      while(var1.hasNext()) {
         String var3 = var1.nextName();
         if (var3.equals("color")) {
            var2 = a(var1.nextString());
         } else if (var3.equals("chroma")) {
            var1.nextBoolean();
         }
      }

      var1.endObject();
      return var2;
   }

   private static Color a(@NotNull String var0) {
      int var1 = Integer.valueOf(var0.substring(1, 3), 16);
      int var2 = Integer.valueOf(var0.substring(3, 5), 16);
      int var3 = Integer.valueOf(var0.substring(5, 7), 16);
      if (var0.length() > 7) {
         int var4 = Integer.valueOf(var0.substring(7, 9), 16);
         return new Color(var1, var2, var3, var4);
      } else {
         return new Color(var1, var2, var3);
      }
   }
}
