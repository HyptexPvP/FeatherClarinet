package net.digitalingot.feather.profile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import net.digitalingot.feather.FeatherLogger;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ProfileManager {
   @NotNull
   private final Path a;
   @Nullable
   private Profile b;

   public ProfileManager(@NotNull Path var1) {
      this.a = var1;
   }

   public void a() {
      String var1 = this.f();
      this.b = new Profile(this, var1);
   }

   @NotNull
   public Profile b() {
      if (this.b == null) {
         this.a();
      }

      return this.b;
   }

   public void a(@NotNull String var1) {
      new Profile(this, var1).b().delete();
   }

   public void b(@NotNull String var1) {
      try {
         this.c(var1);
         this.b = new Profile(this, var1);
      } catch (IOException var3) {
         throw new IllegalStateException(var3);
      }
   }

   @NotNull
   public List<String> c() {
      ArrayList var1 = new ArrayList();

      for(String var5 : this.a.resolve("profiles").toFile().list()) {
         if (var5.endsWith(".json")) {
            var5 = var5.substring(0, var5.length() - ".json".length());
            var1.add(var5);
         }
      }

      return var1;
   }

   @NotNull
   private File e() {
      File var1 = this.g();
      if (!var1.exists()) {
         this.a(var1);
      }

      return var1;
   }

   private void a(@NotNull File var1) {
      try {
         if (var1.getParentFile().mkdirs()) {
            FeatherLogger.a.info("Created profile storage directory");
         }

         if (!var1.createNewFile()) {
            throw new IOException("Profile storage couldn't be created.");
         } else {
            this.c("default");
         }
      } catch (IOException var3) {
         throw new IllegalStateException(var3);
      }
   }

   private void c(@NotNull String var1) {
      FileWriter var2 = new FileWriter(this.e());

      try {
         BufferedWriter var3 = new BufferedWriter(var2);

         try {
            IOUtils.write(var1, var3);
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
         try {
            var2.close();
         } catch (Throwable var6) {
            var9.addSuppressed(var6);
         }

         throw var9;
      }

      var2.close();
   }

   @NotNull
   private String f() {
      File var1 = this.e();

      try {
         FileReader var2 = new FileReader(var1);

         String var4;
         try {
            BufferedReader var3 = new BufferedReader(var2);

            try {
               var4 = IOUtils.toString(var3);
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
            try {
               var2.close();
            } catch (Throwable var6) {
               var9.addSuppressed(var6);
            }

            throw var9;
         }

         var2.close();
         return var4;
      } catch (IOException var10) {
         throw new IllegalStateException(var10);
      }
   }

   @NotNull
   public Path d() {
      return this.a;
   }

   @NotNull
   private File g() {
      return this.a.resolve("current.profile").toFile();
   }
}
