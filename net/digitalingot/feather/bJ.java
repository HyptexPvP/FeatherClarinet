package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import net.digitalingot.feather.util.FeatherAssets;
import net.digitalingot.feather.util.FeatherBrowserButtons;

public class bJ {
   public static class a extends TypeAdapter<FeatherAssets> {
      public void a(JsonWriter var1, FeatherAssets var2) {
         var1.beginObject();
         var1.name("name").value(var2.getName());
         var1.name("slug").value(var2.getSlug());
         var1.name("icon").value(var2.getIcon());
         var1.endObject();
      }

      public FeatherAssets a(JsonReader var1) {
         throw new UnsupportedOperationException("not implemented");
      }
   }

   public static class b extends TypeAdapter<FeatherBrowserButtons> {
      public void a(JsonWriter var1, FeatherBrowserButtons var2) {
         var1.beginObject();
         var1.name("name").value(var2.getName());
         var1.name("slug").value(var2.getSlug());
         var1.endObject();
      }

      public FeatherBrowserButtons a(JsonReader var1) {
         throw new UnsupportedOperationException("not implemented");
      }
   }

   public static class c extends TypeAdapter<ck> {
      public void a(JsonWriter var1, ck var2) {
         var1.beginObject();
         var1.name("slug").value(var2.getSlug());
         var1.endObject();
      }

      public ck a(JsonReader var1) {
         return null;
      }
   }
}
