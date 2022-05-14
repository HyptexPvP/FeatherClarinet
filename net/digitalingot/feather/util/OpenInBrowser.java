package net.digitalingot.feather.util;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public final class OpenInBrowser {
   private static final Minecraft a = Minecraft.func_71410_x();
   private static final OpenInBrowser.a b = OpenInBrowser.a.get();

   private OpenInBrowser() {
      throw new AssertionError();
   }

   public static boolean a() {
      return b == OpenInBrowser.a.WINDOWS;
   }

   public static boolean b() {
      return b == OpenInBrowser.a.LINUX;
   }

   public static boolean c() {
      return b == OpenInBrowser.a.MACOS;
   }

   public static boolean a(URI var0) {
      return b(var0) || c(var0.toString());
   }

   public static boolean a(File var0) {
      return b(var0) || c(var0.getPath());
   }

   private static boolean c(String var0) {
      return b.open(var0);
   }

   private static boolean b(File var0) {
      Desktop var1 = a(Action.OPEN);
      if (var1 != null) {
         try {
            var1.open(var0);
            return true;
         } catch (IOException var3) {
         }
      }

      return false;
   }

   private static boolean b(URI var0) {
      Desktop var1 = a(Action.BROWSE);
      if (var1 != null) {
         try {
            var1.browse(var0);
            return true;
         } catch (IOException var3) {
         }
      }

      return false;
   }

   private static Desktop a(Action var0) {
      if (!Desktop.isDesktopSupported()) {
         return null;
      } else {
         Desktop var1 = Desktop.getDesktop();
         return !var1.isSupported(var0) ? null : var1;
      }
   }

   private static boolean d(String var0) {
      try {
         Process var1 = new ProcessBuilder(new String[]{var0})
            .redirectInput(Redirect.DISCARD)
            .redirectOutput(Redirect.DISCARD)
            .redirectError(Redirect.DISCARD)
            .start();
         return var1.isAlive();
      } catch (IOException var2) {
         return false;
      }
   }

   public static String d() {
      return GuiScreen.func_146277_j();
   }

   public static void a(String var0) {
      GuiScreen.func_146275_d(var0);
   }

   static enum a {
      WINDOWS("explorer"),
      LINUX("xdg-open"),
      MACOS("open");

      private final String command;

      private a(String var3) {
         this.command = var3;
      }

      private boolean open(String var1) {
         return OpenInBrowser.d(this.command + " \"" + var1 + "\"");
      }

      private static OpenInBrowser.a get() {
         String var0 = getOsName();
         if (var0 != null) {
            if (var0.startsWith("Linux") || var0.startsWith("LINUX")) {
               return LINUX;
            }

            if (var0.startsWith("Mac")) {
               return MACOS;
            }

            if (var0.startsWith("Windows")) {
               return WINDOWS;
            }
         }

         throw new IllegalStateException("Unable to detect OS");
      }

      private static String getOsName() {
         try {
            return System.getProperty("os.name");
         } catch (SecurityException var1) {
            return null;
         }
      }
   }
}
