package net.digitalingot.feather.config;

import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.digitalingot.feather.aM;
import net.digitalingot.feather.dF;
import net.digitalingot.feather.dG;
import net.digitalingot.feather.dH;
import net.digitalingot.feather.dM;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.e;
import net.digitalingot.feather.et;
import net.digitalingot.feather.ey;
import net.digitalingot.feather.f;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mods.FeatherHandler;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import net.digitalingot.feather.mods.ModsConfig;
import net.digitalingot.feather.profile.Profiler;
import net.digitalingot.feather.settings.BuildModProfile;
import org.jetbrains.annotations.NotNull;

public class ConfigManager {
   @NotNull
   private final List<Class<? extends Mod<?>>> mods;
   @NotNull
   private final Map<ModsConfig, Mod<?>> modsConfig = new HashMap();
   @NotNull
   private final Map<Class<? extends Mod<?>>, Mod<?>> c = new HashMap();
   @NotNull
   private final Profiler profiler;
   @NotNull
   private final ey e = new ey(this);
   @NotNull
   private final FeatherHandler featherHandler;
   @NotNull
   private Set<ModsConfig> getModMap = new HashSet();

   public ConfigManager(@NotNull List<Class<? extends Mod<?>>> var1, @NotNull Profiler var2, @NotNull ClientPreferences var3) {
      this.mods = var1;
      this.profiler = var2;
      this.featherHandler = new FeatherHandler(this, var3);
   }

   public void a() {
      this.featherHandler.a();
   }

   public void b() {
      this.e.b();
   }

   public void c() {
      this.profiler.b(this.modsConfig);
   }

   public void loadConfig(@NotNull List<String> var1) {
      HashSet var2 = new HashSet(var1.size());

      for(String var4 : var1) {
         ModsConfig var5 = ModsConfig.fromSlug(var4);
         if (var5 != null && !var5.isCore()) {
            var2.add(var5);
         }
      }

      this.getModMap = var2;

      for(ModsConfig var7 : this.getModMap) {
         this.e.b((Mod<?>)this.modsConfig.get(var7));
      }

   }

   public void d() {
      for(ModsConfig var2 : this.getModMap) {
         Mod var3 = (Mod)this.modsConfig.get(var2);
         if (var3.k().g) {
            this.e.a(var3);
         }
      }

      this.getModMap.clear();
   }

   public void e() {
      if (this.profiler.a() == null) {
         this.profiler.a(new HashMap());
         this.profiler.a();
      }

      for(Mod var2 : this.modsConfig.values()) {
         this.featherHandler.a(var2);
      }

      this.e.a();
      et.a(this);
      BuildModProfile.a(this);
      aM.a(this);
   }

   public <T extends HUD> void a(@NotNull Mod<T> var1, @NotNull Map<String, JsonElement> var2) {
      dG var3 = new dG(var1.k().getClass());

      for(dF var6 : var3.a()) {
         ModConfigAnnotation var7 = var6.c();
         String var8 = var7.a();
         JsonElement var9 = (JsonElement)var2.get(var8);
         if (var9 != null) {
            Object var10 = Browser.a.fromJson(var9, var6.a());
            dH var11 = new dH(var6);
            if (!var11.a(var10)) {
               throw new IllegalArgumentException("Config key \"" + var8 + "\" contained a payload which couldn't be validated: \"" + var9 + "\"");
            }

            try {
               var6.b().set(var1.k(), var10);
            } catch (IllegalAccessException var13) {
               throw new IllegalStateException(var13);
            }
         }
      }

   }

   public <T extends HUD> void a(@NotNull Mod<T> var1) {
      dG var2 = new dG(var1.k().getClass());

      for(dF var5 : var2.a()) {
         ModConfigAnnotation var6 = var5.c();
         if (var6.e().a() >= 0) {
            dM var7 = new dM(var5, var6.c());
            Object var8 = var7.a();

            try {
               var5.b().set(var1.k(), var8);
            } catch (IllegalAccessException var10) {
               throw new IllegalStateException(var10);
            }
         }
      }

      this.d(var1);
   }

   public void b(@NotNull Mod<?> var1) {
      var1.k().g = true;
      this.d(var1);
   }

   public void c(@NotNull Mod<?> var1) {
      var1.k().g = false;
      this.d(var1);
   }

   public <T extends HUD> void d(@NotNull Mod<T> var1) {
      this.profiler.a(var1.l().a().getSlug(), var1.k());
      var1.j();
      var1.i();
      dt var2 = (dt)var1.k().getClass().getDeclaredAnnotation(dt.class);
      if (var2 != null && !var2.b().a().isEmpty()) {
         aM.a(this);
      }

      if (var1.m() && !var1.k().j()) {
         this.e.b(var1);
      } else if (!var1.m() && var1.k().j() && !this.getModMap.contains(var1.l().a())) {
         this.e.a(var1);
      }

   }

   @NotNull
   public static <T extends Mod<?>> dl<T> a(@NotNull final Class<T> var0) {
      return new dl<T>() {
         private T b;

         @Override
         public T a() {
            if (this.b != null) {
               return this.b;
            } else {
               f var1 = net.digitalingot.feather.e.c();
               if (var1 == null) {
                  return null;
               } else {
                  this.b = var1.b().b(var0);
                  return this.b;
               }
            }
         }
      };
   }

   @NotNull
   public Mod<?> a(@NotNull ModsConfig var1) {
      return (Mod<?>)this.modsConfig.get(var1);
   }

   @NotNull
   public <T extends Mod<?>> T b(@NotNull Class<T> var1) {
      return (T)this.c.get(var1);
   }

   @NotNull
   public Map<ModsConfig, Mod<?>> f() {
      return this.modsConfig;
   }

   @NotNull
   public Map<Class<? extends Mod<?>>, Mod<?>> g() {
      return this.c;
   }

   @NotNull
   public List<Class<? extends Mod<?>>> getMods() {
      return this.mods;
   }

   @NotNull
   public Profiler getProfiler() {
      return this.profiler;
   }

   @NotNull
   public Set<ModsConfig> j() {
      return this.getModMap;
   }
}
