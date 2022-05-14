package net.digitalingot.feather.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import net.digitalingot.feather.hP;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {
   private static final String a = "https://api.imgur.com/3/image";
   private static final Map<String, String> b = new HashMap();

   public static String a(File var0) {
      String var1 = (String)b.get(var0.getAbsolutePath());
      if (var1 != null) {
         return var1;
      } else {
         String var2 = b(var0);
         JsonParser var3 = new JsonParser();
         JsonElement var4 = var3.parse(var2);
         String var5 = var4.getAsJsonObject().get("data").getAsJsonObject().get("link").getAsString().replace("i.imgur.com", "i.feathermc.com");
         b.put(var0.getAbsolutePath(), var5);
         return var5;
      }
   }

   private static String b(File var0) {
      HttpURLConnection var1 = null;

      String var2;
      try {
         var1 = a("https://api.imgur.com/3/image");
         a(var1, "image=" + c(var0));
         var2 = a(var1);
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      } finally {
         if (var1 != null) {
            var1.disconnect();
         }

      }

      return var2;
   }

   private static String c(File var0) {
      byte[] var1 = Base64.encodeBase64(FileUtils.readFileToByteArray(var0));
      return URLEncoder.encode(new String(var1, StandardCharsets.US_ASCII), StandardCharsets.UTF_8.toString());
   }

   private static HttpURLConnection a(String var0) {
      HttpURLConnection var1 = (HttpURLConnection)new URL(var0).openConnection();
      var1.setDoInput(true);
      var1.setDoOutput(true);
      var1.setRequestMethod("POST");
      var1.setRequestProperty("Authorization", "Client-ID ecd202364b54dde");
      var1.setReadTimeout(100000);
      var1.connect();
      return var1;
   }

   private static void a(HttpURLConnection var0, String var1) {
      OutputStream var2 = var0.getOutputStream();

      try {
         OutputStreamWriter var3 = new OutputStreamWriter(var2);

         try {
            var3.write(var1);
            var3.flush();
         } catch (Throwable var8) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }

            throw var8;
         }

         var3.close();
      } catch (Throwable var9) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }
         }

         throw var9;
      }

      if (var2 != null) {
         var2.close();
      }

   }

   private static String a(HttpURLConnection var0) {
      InputStream var1 = var0.getInputStream();
      return hP.a(var1).c();
   }
}
