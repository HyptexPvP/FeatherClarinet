package net.digitalingot.feather.config;

import com.google.gson.JsonParseException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import joptsimple.internal.Strings;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.newProfileEvent;
import org.jetbrains.annotations.NotNull;

public class ClientPreferences {
   @NotNull
   private final ColorPicker a;
   @NotNull
   private final File b;

   public ClientPreferences(@NotNull File var1) {
      this.b = new File(var1, "client_preferences.json");

      List var2;
      try {
         if (!this.b.exists()) {
            this.b.getParentFile().mkdirs();
            this.b.createNewFile();
         }

         var2 = Files.readAllLines(this.b.toPath());
      } catch (IOException var7) {
         FeatherLogger.a.error("Error while trying to read preferences file", var7);
         var2 = Collections.emptyList();
      }

      String var3 = Strings.join(var2, "\n");

      ColorPicker var4;
      try {
         var4 = (ColorPicker)Browser.a.fromJson(var3, ColorPicker.class);
      } catch (JsonParseException var6) {
         var4 = this.c();
      }

      if (var4 == null) {
         var4 = this.c();
      }

      if (var4.a().c() == null) {
         var4.a().a(new ArrayList());
      }

      this.a = var4;
   }

   public void a() {
      try {
         String var1 = Browser.a.toJson(this.a);
         Files.write(this.b.toPath(), var1.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
      } catch (IOException var2) {
         FeatherLogger.a.error("Error while trying to save preferences", var2);
      }

   }

   @NotNull
   private ColorPicker c() {
      FavoriteMods var1 = new FavoriteMods(false, false, new ArrayList());
      newProfileEvent var2 = new newProfileEvent(new ArrayList(), new ArrayList());
      return new ColorPicker(var1, var2);
   }

   @NotNull
   public ColorPicker b() {
      return this.a;
   }
}
