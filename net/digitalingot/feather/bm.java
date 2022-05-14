package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLClassLoader;

public class bm {
   public static void a(String[] var0) {
      URLClassLoader var1 = (URLClassLoader)bm.class.getClassLoader();
      bn var2 = new bn(var1.getURLs());
      Thread.currentThread().setContextClassLoader(var2);

      try {
         Class var3 = var2.findClass("net.minecraft.launchwrapper.Launch");
         Method var4 = var3.getDeclaredMethod("main", String[].class);
         var4.invoke(null, var0);
      } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassNotFoundException var5) {
         var5.printStackTrace();
      }

   }
}
