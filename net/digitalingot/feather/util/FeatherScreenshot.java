package net.digitalingot.feather.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.concurrent.ForkJoinPool;
import net.digitalingot.feather.h;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherScreenshot extends h {
   public FeatherScreenshot() {
      super("featherscreenshot", Collections.emptyList());
   }

   @Override
   public void a(@NotNull String[] var1) {
      if (var1.length >= 2) {
         String var2 = var1[0];
         StringJoiner var3 = new StringJoiner(" ");

         for(int var4 = 1; var4 < var1.length; ++var4) {
            var3.add(var1[var4]);
         }

         String var6 = var3.toString();
         File var5 = new File(var6);
         ForkJoinPool.commonPool().execute(() -> {
            switch(var2) {
               case "copy":
                  Minecraft.func_71410_x().func_152344_a(() -> OpenInBrowser.a(var5.getAbsolutePath()));
                  break;
               case "upload":
                  String var6x = ScreenshotUtil.a(var5);
                  this.b(var6x);
                  break;
               case "tweet":
                  String var5x = ScreenshotUtil.a(var5);
                  this.b(this.a(var5x));
            }

         });
      }
   }

   private String a(@NotNull String var1) {
      String var2;
      try {
         var2 = URLEncoder.encode(var1, StandardCharsets.UTF_8.toString());
      } catch (UnsupportedEncodingException var4) {
         throw new IllegalStateException(var4);
      }

      return "https://twitter.com/intent/tweet?text=Look%20at%20this%20screenshot%20I%20took!%0A"
         + var2
         + "%0A%0A%20%40Feather_Client&related=Feather_Client%3AFeather%20Client%20Published%20via&hashtags=minecraft";
   }

   private void b(@NotNull String var1) {
      try {
         OpenInBrowser.a(new URL(var1).toURI());
      } catch (URISyntaxException | MalformedURLException var3) {
      }

   }
}
