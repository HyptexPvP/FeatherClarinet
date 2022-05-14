package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class bF<T extends Enum<T>> extends TypeAdapter<T> {
   private final Map<String, T> a = new HashMap();
   private final Map<T, String> b = new HashMap();

   public bF(Class<T> var1) {
      for(Enum var5 : (Enum[])var1.getEnumConstants()) {
         String var6 = a(var1, (T)var5);
         this.a.put(var6, var5);
         this.b.put(var5, var6);
      }

   }

   public T a(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return (T)this.a.get(var1.nextString());
      }
   }

   public void a(JsonWriter var1, T var2) {
      var1.value(var2 == null ? null : (String)this.b.get(var2));
   }

   private static <T> String a(Class<T> var0, T var1) {
      Field var2;
      try {
         var2 = var0.getDeclaredField(var1.toString());
      } catch (NoSuchFieldException var5) {
         throw new IllegalStateException(var5);
      }

      dw var3 = (dw)var2.getDeclaredAnnotation(dw.class);
      if (var3 != null) {
         return var3.a();
      } else {
         SerializedName var4 = (SerializedName)var2.getDeclaredAnnotation(SerializedName.class);
         return var4 != null ? var4.value() : var1.toString();
      }
   }
}
