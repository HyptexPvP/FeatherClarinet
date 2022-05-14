package net.digitalingot.feather;

import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.security.CodeSigner;
import java.security.CodeSource;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

class bn extends URLClassLoader {
   private static final bl a = new bl();
   private final Map<String, Class<?>> b = new ConcurrentHashMap();
   private final Set<String> c = new HashSet(1000);

   bn(URL[] var1) {
      super(var1, null);
   }

   protected Class<?> findClass(String var1) {
      if (this.c.contains(var1)) {
         throw new ClassNotFoundException(var1);
      } else {
         Class var2 = (Class)this.b.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            if (a.a(var1)) {
               try {
                  var2 = this.a(var1);
               } catch (Throwable var5) {
                  this.c.add(var1);
                  throw new ClassNotFoundException(var1, var5);
               }
            } else {
               try {
                  var2 = super.findClass(var1);
               } catch (ClassNotFoundException var4) {
                  this.c.add(var1);
                  throw var4;
               }
            }

            this.b.put(var1, var2);
            return var2;
         }
      }
   }

   private Class<?> a(String var1) {
      String var2 = var1.replace('.', '/').concat(".class");
      URL var3 = super.findResource(var2);
      URLConnection var4 = null;
      InputStream var5 = null;

      Class var22;
      try {
         var4 = var3.openConnection();
         byte[] var6 = null;
         CodeSigner[] var7 = null;
         int var8 = var1.lastIndexOf(46);
         if (var8 != -1 && var4 instanceof JarURLConnection) {
            JarURLConnection var9 = (JarURLConnection)var4;
            JarFile var10 = var9.getJarFile();
            if (var10 != null && var10.getManifest() != null) {
               JarEntry var11 = var10.getJarEntry(var2);
               var5 = var4.getInputStream();
               var6 = a(var5);
               var7 = var11.getCodeSigners();
            }
         }

         CodeSource var20 = new CodeSource(var4.getURL(), var7);
         if (var5 == null) {
            var5 = var4.getInputStream();
            var6 = a(var5);
         }

         byte[] var21 = a.transform(var1, var1, var6);
         var22 = super.defineClass(var1, var21, 0, var21.length, var20);
      } finally {
         if (var4 != null && var5 == null) {
            var5 = var4.getInputStream();
         }

         if (var5 != null) {
            try {
               var5.close();
            } catch (IOException var18) {
            }
         }

      }

      return var22;
   }

   private static byte[] a(InputStream var0) {
      byte[] var1 = new byte[var0.available()];
      var0.read(var1);
      return var1;
   }
}
