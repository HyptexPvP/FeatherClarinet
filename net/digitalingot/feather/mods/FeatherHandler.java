package net.digitalingot.feather.mods;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import net.digitalingot.feather.dI;
import net.digitalingot.feather.dJ;
import net.digitalingot.feather.iS;
import net.digitalingot.feather.config.ClientPreferences;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.gui.HUDPosition;
import org.jetbrains.annotations.NotNull;

public class FeatherHandler {
   @NotNull
   private final ConfigManager b;
   @NotNull
   private final ClientPreferences c;

   public FeatherHandler(@NotNull ConfigManager var1, @NotNull ClientPreferences var2) {
      this.b = var1;
      this.c = var2;
   }

   public void a() {
      for(Class var2 : this.b.getMods()) {
         FeatherModule var3 = (FeatherModule)var2.getDeclaredAnnotation(FeatherModule.class);
         if (var3 == null) {
            throw new IllegalStateException("FeatherModule not annotated with @FeatherHandler");
         }

         try {
            Mod var4 = (Mod)var2.getConstructor().newInstance();
            var4.a(var3);
            this.a(var4);
            this.b.f().put(var3.a(), var4);
            this.b.g().put(var4.getClass(), var4);
         } catch (IllegalAccessException | InvocationTargetException | InstantiationException var5) {
            throw new IllegalStateException(var5);
         } catch (NoSuchMethodException var6) {
            throw new IllegalStateException("FeatherModule has no default constructor");
         }
      }

   }

   public <T extends HUD> void a(@NotNull Mod<T> var1) {
      Class var2 = iS.a(var1.getClass(), 0);

      assert var2 != null;

      Map var3 = this.b.getProfiler().b();

      assert var3 != null;

      Map var4 = (Map)var3.get(var1.l().a().getSlug());
      HUD var5;
      if (HUDPosition.class.isAssignableFrom(var2)) {
         dJ var6 = new dJ(var2, var4);
         var5 = var6.a(var1);
      } else {
         dI var7 = new dI(var2, var4);
         var5 = var7.a();
      }

      List var8 = this.c.b().a().c();
      var5.h = var8.contains(var1.l().a().getSlug());
      var1.a(var5);
   }
}
