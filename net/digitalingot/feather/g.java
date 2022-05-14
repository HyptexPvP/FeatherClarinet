package net.digitalingot.feather;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class g {
   public static void a() {
      Mouse.poll();
   }

   public static boolean a(int var0) {
      return Keyboard.isKeyDown(var0);
   }

   public static int b() {
      return Display.getDesktopDisplayMode().getWidth();
   }

   public static int c() {
      return Display.getDesktopDisplayMode().getHeight();
   }

   public static int d() {
      return Display.getX();
   }

   public static int e() {
      return Display.getY();
   }

   public static int f() {
      return Display.getWidth();
   }

   public static int g() {
      return Display.getHeight();
   }

   public static boolean h() {
      return Display.isFullscreen();
   }

   public static boolean i() {
      String var0 = System.getProperty("org.lwjgl.opengl.Window.undecorated");
      if (var0 == null) {
         System.setProperty("org.lwjgl.opengl.Window.undecorated", "false");
         return i();
      } else {
         return var0.equals("false");
      }
   }

   public static void a(boolean var0) {
      System.setProperty("org.lwjgl.opengl.Window.undecorated", Boolean.toString(var0));
   }

   public static void a(boolean var0, int var1, int var2, int var3, int var4, boolean var5) {
      try {
         Display.setFullscreen(var0);
         Display.setDisplayMode(new DisplayMode(var3, var4));
         Display.setLocation(var1, var2);
         Display.setVSyncEnabled(var5);
      } catch (LWJGLException var7) {
         throw new RuntimeException(var7);
      }
   }

   public static void b(boolean var0) {
      Display.setResizable(var0);
   }
}
