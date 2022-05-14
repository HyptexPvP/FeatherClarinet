package net.digitalingot.feather.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.net.InetSocketAddress;

public class ServerAddress extends TypeAdapter<InetSocketAddress> {
   public void a(JsonWriter var1, InetSocketAddress var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         String var3 = var2.getAddress().getHostAddress() + ":" + var2.getPort();
         var1.value(var3);
      }
   }

   public InetSocketAddress a(JsonReader var1) {
      String var2 = var1.nextString();
      String[] var3 = var2.split(":", 2);
      String var4 = var3[0];
      int var5 = Integer.parseInt(var3[1]);
      return new InetSocketAddress(var4, var5);
   }
}
