package net.digitalingot.feather.webscket;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebsocketAuthentication {
   public static int joinServer(String var0, String var1, String var2) {
      try {
         URL var3 = new URL("https://sessionserver.mojang.com/session/minecraft/join");
         HttpURLConnection var4 = (HttpURLConnection)var3.openConnection();

         int var19;
         try {
            var4.setRequestMethod("POST");
            var4.setDoOutput(true);
            JsonObject var5 = new JsonObject();
            var5.addProperty("accessToken", var0);
            var5.addProperty("selectedProfile", var1);
            var5.addProperty("serverId", var2);
            byte[] var6 = var5.toString().getBytes(StandardCharsets.UTF_8);
            var4.setFixedLengthStreamingMode(var6.length);
            var4.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            var4.connect();
            OutputStream var7 = var4.getOutputStream();

            try {
               var7.write(var6);
            } catch (Throwable var16) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var15) {
                     var16.addSuppressed(var15);
                  }
               }

               throw var16;
            }

            if (var7 != null) {
               var7.close();
            }

            var19 = var4.getResponseCode();
         } finally {
            var4.disconnect();
         }

         return var19;
      } catch (IOException var18) {
         return -1;
      }
   }
}
