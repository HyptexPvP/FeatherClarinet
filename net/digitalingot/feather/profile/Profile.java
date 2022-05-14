package net.digitalingot.feather.profile;

import java.io.File;
import net.digitalingot.feather.FeatherLogger;
import org.jetbrains.annotations.NotNull;

public class Profile {
   @NotNull
   private final String a;
   @NotNull
   private final File b;

   public Profile(@NotNull ProfileManager var1, @NotNull String var2) {
      this.a = var2;
      this.b = var1.d().resolve("profiles/" + var2 + ".json").toFile();
      if (this.b.getParentFile().mkdirs()) {
         FeatherLogger.a.info("Created profiles directory under " + this.b.getAbsolutePath());
      }

   }

   @NotNull
   public String a() {
      return this.a;
   }

   @NotNull
   public File b() {
      return this.b;
   }
}
