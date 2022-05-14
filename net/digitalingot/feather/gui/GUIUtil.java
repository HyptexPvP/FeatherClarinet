package net.digitalingot.feather.gui;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import net.digitalingot.feather.g;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

public class GUIUtil {
   private static Rectangle a;
   private static boolean b;

   private static Rectangle a(int var0, int var1) {
      GraphicsEnvironment var2 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice[] var3 = var2.getScreenDevices();

      for(GraphicsDevice var7 : var3) {
         GraphicsConfiguration var8 = var7.getDefaultConfiguration();
         Rectangle var9 = var8.getBounds();
         if (var9.contains(var0, var1)) {
            return var9;
         }
      }

      return new Rectangle(0, 0, g.b(), g.c());
   }

   private static Rectangle a(int var0) {
      if (var0 < 1) {
         return null;
      } else {
         GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
         GraphicsDevice[] var2 = var1.getScreenDevices();
         return var2 != null && var2.length != 0 && var2.length >= var0 ? var2[var0 - 1].getDefaultConfiguration().getBounds() : null;
      }
   }

   private static Rectangle a(Rectangle var0) {
      Point var2 = new Point((int)(var0.getMinX() + var0.getWidth() / 2.0), (int)(var0.getMinY() + var0.getHeight() / 2.0));
      return a((int)var2.getX(), (int)var2.getY());
   }

   public static void a(boolean var0) {
      if (g.h()) {
         b = true;
      }

      if (b != var0 || g.h() || g.i() != var0) {
         Rectangle var1 = new Rectangle(g.d(), g.e(), g.f(), g.g());
         if (var0 && !g.h()) {
            a = var1;
         }

         g.a(var0);
         Rectangle var2 = a(var1);
         Rectangle var3 = var0 ? var2 : a;
         if (var3 == null) {
            var3 = var2;
         }

         b = var0;
         Minecraft var4 = Minecraft.func_71410_x();
         GameSettings var5 = var4.field_71474_y;
         if (var5.field_74353_u != b) {
            var5.field_74353_u = b;
            var5.func_74303_b();
         }

         g.a(false, var3.x, var3.y, (int)var3.getWidth(), (int)var3.getHeight(), var5.field_74352_v);
         g.b(!var0);
         var4.func_71370_a((int)var3.getWidth(), (int)var3.getHeight());
         var4.func_175601_h();
      }
   }
}
