package net.digitalingot.feather.mods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.command.CommandHandler;
import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.FeatherScreenshot;
import net.digitalingot.feather.util.OpenInBrowser;
import net.digitalingot.feather.util.ScreenshotUtil;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.SCREENSHOT,
   b = @dn(
   a = "Screenshot",
   b = "https://assets.feathercdn.net/game/mods/screenshot.svg",
   c = "",
   d = {}
)
)
public class Screenshot extends Mod<Screenshot.a> {
   @Override
   public void f() {
      FeatherScreenshot var1 = new FeatherScreenshot();
      CommandHandler.a.a(var1::a);
      ChatEvent.b.a((var1x, var2) -> {
         if (!this.m()) {
            return var2;
         } else {
            try {
               var1x = var1x.getCanonicalFile();
            } catch (IOException var4) {
               throw new IllegalStateException(var4);
            }

            this.a(var1x);
            return ScreenshotUploader.a(var1x, this.b);
         }
      });
   }

   private void a(@NotNull File var1) {
      switch(this.b.b) {
         case COPY_URL:
            ForkJoinPool.commonPool().execute(() -> {
               String var1x = ScreenshotUtil.a(var1);
               Minecraft.func_71410_x().func_152344_a(() -> OpenInBrowser.a(var1x));
            });
            break;
         case COPY_FILE:
            Minecraft.func_71410_x().func_152344_a(() -> OpenInBrowser.a(var1.getAbsolutePath()));
      }

   }

   @dt(
      a = true
   )
   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Screenshot");
      @ModConfigAnnotation(
         a = "autoCopyMode",
         b = "Auto Copy Mode",
         c = "dontCopy",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public Screenshot.a.a b;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh c = new eh("Screenshot Menu");
      @ModConfigAnnotation(
         a = "openOption",
         b = "Show Open Option",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean d;
      @ModConfigAnnotation(
         a = "copyOption",
         b = "Show Copy Option",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "uploadOption",
         b = "Show Upload Option",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean i;
      @ModConfigAnnotation(
         a = "tweetOption",
         b = "Show Tweet Option",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 14
)
      )
      public boolean j;

      public static enum a {
         @dw(
            a = "dontCopy",
            b = "Don't Copy"
         )
         DONT_COPY,
         @dw(
            a = "copyFile",
            b = "Copy File"
         )
         COPY_FILE,
         @dw(
            a = "copyURL",
            b = "Copy URL"
         )
         COPY_URL;
      }
   }
}
