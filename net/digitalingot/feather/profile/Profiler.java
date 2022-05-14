package net.digitalingot.feather.profile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.digitalingot.feather.ea;
import net.digitalingot.feather.eb;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mods.HUDSelection;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Profiler {
   @NotNull
   private final ProfileManager a;
   @NotNull
   private final eb b;
   @NotNull
   private final ea c;
   @Nullable
   private Map<String, Map<String, String>> d;

   public Profiler(@NotNull ProfileManager var1) {
      this.a = var1;
      this.b = new eb(this);
      this.c = new ea(this);
   }

   public void a(@NotNull Map<String, Map<String, String>> var1) {
      this.b.a(var1);
      this.d = var1;
   }

   public void a(@NotNull String var1, @NotNull Map<String, String> var2) {
      this.b.a(var1, var2);
      if (this.d == null) {
         this.d = new HashMap();
      }

      this.d.put(var1, var2);
   }

   public void a(@NotNull String var1, @NotNull HUD var2) {
      HUDSelection var3 = new HUDSelection<>(var2);
      Map var4 = var3.a();
      this.a(var1, var4);
   }

   public void b(@NotNull Map<ModsConfig, Mod<?>> var1) {
      if (this.d == null) {
         this.d = new HashMap();
      }

      for(Entry var3 : var1.entrySet()) {
         ModsConfig var4 = (ModsConfig)var3.getKey();
         Mod var5 = (Mod)var3.getValue();
         HUDSelection var6 = new HUDSelection<>(var5.k());
         Map var7 = var6.a();
         this.d.put(var4.getSlug(), var7);
      }

      this.a(this.d);
   }

   @Nullable
   public Map<String, Map<String, String>> a() {
      this.d = this.c.a();
      return this.d;
   }

   @Nullable
   public Map<String, Map<String, String>> b() {
      return this.d;
   }

   @NotNull
   public File c() {
      return this.a.b().b();
   }

   @NotNull
   public ProfileManager d() {
      return this.a;
   }
}
