package net.digitalingot.feather.cosmetic;

import com.google.common.reflect.TypeToken;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import joptsimple.internal.Strings;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.config.Config;
import org.jetbrains.annotations.NotNull;

public class CosmeticsSetting {
   @NotNull
   public static final Map<String, Class<?>> a = new HashMap();
   @NotNull
   private final Map<String, Config> b;
   @NotNull
   private final File c = new File(e.c().d(), "cosmetic_settings.json");

   public CosmeticsSetting() {
      List var1;
      try {
         if (!this.c.exists()) {
            this.c.createNewFile();
         }

         var1 = Files.readAllLines(this.c.toPath());
      } catch (IOException var6) {
         FeatherLogger.a.error("Error while trying to read cosmetics file", var6);
         var1 = Collections.emptyList();
      }

      String var2 = Strings.join(var1, "\n");

      Object var3;
      try {
         Type var4 = (new TypeToken<HashMap<String, Config>>() {
         }).getType();
         var3 = (Map)Browser.a.fromJson(var2, var4);
      } catch (JsonParseException var5) {
         var3 = new HashMap();
      }

      if (var3 == null) {
         var3 = new HashMap();
      }

      this.b = (Map<String, Config>)var3;
   }

   public <T> T a(@NotNull String var1, @NotNull Class<T> var2) {
      JsonElement var3 = Browser.a.toJsonTree(this.b.get(var1));
      return (T)Browser.a.fromJson(var3, var2);
   }

   public void a(@NotNull String var1, @NotNull Config var2) {
      this.b.put(var1, var2);
      this.a();
   }

   public void a() {
      try {
         String var1 = Browser.a.toJson(this.b);
         Files.write(this.c.toPath(), var1.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
      } catch (IOException var2) {
         FeatherLogger.a.error("Error while trying to save cosmetics settings", var2);
      }

   }

   @NotNull
   public Map<String, Config> b() {
      return this.b;
   }
}
