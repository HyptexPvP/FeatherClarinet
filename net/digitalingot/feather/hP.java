package net.digitalingot.feather;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import net.digitalingot.feather.util.HTTPUtils;
import org.jetbrains.annotations.NotNull;

public class hP {
   @NotNull
   public static hV a(@NotNull InputStream var0) {
      return new hV(var0);
   }

   @NotNull
   public static HTTPUtils a(@NotNull URL var0) {
      return new HTTPUtils(var0);
   }

   @NotNull
   public static HTTPUtils a(@NotNull String var0) {
      try {
         return a(new URL(var0));
      } catch (MalformedURLException var2) {
         throw new IllegalArgumentException("Illegal URL", var2);
      }
   }

   @NotNull
   public static hU a(@NotNull File var0) {
      return new hU(var0);
   }

   @NotNull
   public static hU b(@NotNull String var0) {
      return new hU(new File(var0));
   }

   @NotNull
   public static hT c(@NotNull String var0) {
      return new hT(var0);
   }
}
