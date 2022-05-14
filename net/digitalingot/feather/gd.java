package net.digitalingot.feather;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.UUID;

public class gd {
   private final JsonObject a;

   public gd(JsonObject var1) {
      this.a = var1;
   }

   public gd(String var1) {
      this(new JsonParser().parse(var1).getAsJsonObject());
   }

   public gd() {
      this(new JsonObject());
   }

   public Object a(String var1) {
      return this.a.get(var1);
   }

   public int b(String var1) {
      return this.h(var1);
   }

   public long c(String var1) {
      return this.i(var1);
   }

   public JsonObject a() {
      return this.a;
   }

   public String d(String var1) {
      return this.j(var1);
   }

   public UUID e(String var1) {
      return this.l(var1);
   }

   public boolean f(String var1) {
      return this.a.has(var1);
   }

   public boolean a(String var1, boolean var2) {
      try {
         return this.a.get(var1).getAsBoolean();
      } catch (Exception var4) {
         return var2;
      }
   }

   public boolean g(String var1) {
      return this.a(var1, false);
   }

   public int a(String var1, int var2) {
      try {
         return this.a.get(var1).getAsInt();
      } catch (Exception var4) {
         return var2;
      }
   }

   public int h(String var1) {
      return this.a(var1, 0);
   }

   public long a(String var1, long var2) {
      try {
         return this.a.get(var1).getAsLong();
      } catch (Exception var5) {
         return var2;
      }
   }

   public long i(String var1) {
      return this.a(var1, 0L);
   }

   public String a(String var1, String var2) {
      try {
         return this.a.get(var1).getAsString();
      } catch (Exception var4) {
         return var2;
      }
   }

   public String j(String var1) {
      return this.a(var1, "");
   }

   private UUID l(String var1) {
      return UUID.fromString(this.j(var1));
   }

   public gd b(String var1, boolean var2) {
      this.a.addProperty(var1, var2);
      return this;
   }

   public gd b(String var1, String var2) {
      this.a.addProperty(var1, var2);
      return this;
   }

   public gd b(String var1, int var2) {
      this.a.addProperty(var1, var2);
      return this;
   }

   public gd a(String var1, double var2) {
      this.a.addProperty(var1, var2);
      return this;
   }

   public gd b(String var1, long var2) {
      this.a.addProperty(var1, var2);
      return this;
   }

   public gd a(String var1, gd var2) {
      this.a(var1, var2.a);
      return this;
   }

   public void a(String var1, JsonObject var2) {
      this.a.add(var1, var2);
   }

   public void a(String var1, JsonArray var2) {
      this.a.add(var1, var2);
   }

   public gd a(String var1, JsonElement var2) {
      this.a.add(var1, var2);
      return this;
   }

   public gd a(String var1, Object var2) {
      return this.b(var1, var2.toString());
   }

   public gd a(String var1, Number var2) {
      this.a.add(var1, new JsonPrimitive(var2));
      return this;
   }

   public void k(String var1) {
      this.a.remove(var1);
   }

   public String toString() {
      return this.a.toString();
   }
}
