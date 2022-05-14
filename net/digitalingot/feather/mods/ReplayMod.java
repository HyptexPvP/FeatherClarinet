package net.digitalingot.feather.mods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

public class ReplayMod {
   @Nullable
   private static final Class<?> a;
   private static final Field b;
   private static final Method c;
   private static long d;
   private static boolean e;

   public static boolean a() {
      return a != null;
   }

   public static void b() {
      Object var0 = b.get(null);
      Class var1 = Class.forName("com.replaymod.replay.gui.screen.GuiReplayViewer");
      Constructor var2 = var1.getConstructor(a);
      Object var3 = var2.newInstance(var0);
      Method var4 = var1.getMethod("display");
      var4.invoke(var3);
   }

   public static boolean c() {
      if (a == null) {
         return false;
      } else {
         long var0 = System.currentTimeMillis();
         if (var0 - d < 1000L) {
            return e;
         } else {
            try {
               Object var2 = b.get(null);
               Object var3 = c.invoke(var2);
               d = var0;
               e = var3 != null;
               return e;
            } catch (InvocationTargetException | IllegalAccessException var4) {
               return false;
            }
         }
      }
   }

   static {
      Class var0;
      try {
         var0 = Class.forName("com.replaymod.replay.ReplayModReplay");
      } catch (ClassNotFoundException var3) {
         var0 = null;
      }

      if (var0 == null) {
         a = null;
         b = null;
         c = null;
      } else {
         try {
            a = var0;
            b = var0.getDeclaredField("instance");
            c = var0.getDeclaredMethod("getReplayHandler");
         } catch (NoSuchMethodException | NoSuchFieldException var2) {
            throw new IllegalStateException(var2);
         }
      }

   }
}
