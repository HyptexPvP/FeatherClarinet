package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.util.Map;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.mods.HUDConfig;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dJ<T extends HUDPosition> extends dI<T> {
   public dJ(@NotNull Class<T> var1, @Nullable Map<String, String> var2) {
      super(var1, var2);
   }

   @NotNull
   public <C extends HUD> C a(Mod<C> var1) {
      return (C)this.a((HUDMod<T>)var1);
   }

   @NotNull
   public T a(HUDMod<T> var1) {
      HUDPosition var2 = super.a();
      var1.a(var2);
      this.a(var1, (T)var2);
      return (T)var2;
   }

   @NotNull
   public T f() {
      throw new RuntimeException(new UnsupportedOperationException("Please use parse(FeatherHUDModule<T>) instead"));
   }

   @Override
   protected void b() {
      super.b();

      assert this.c != null;

      this.c.sort((var0, var1) -> {
         Field var2 = var0.b();
         Field var3 = var1.b();
         if (var2 == null && var3 == null) {
            return 0;
         } else if (var2 == null) {
            return -1;
         } else if (var3 == null) {
            return 1;
         } else {
            Class var4 = var2.getDeclaringClass();
            Class var5 = var3.getDeclaringClass();
            boolean var6 = var4 == HUDPosition.class;
            boolean var7 = var5 == HUDPosition.class;
            if (var6 && var7) {
               return 0;
            } else if (var6) {
               return -1;
            } else {
               return var7 ? 1 : 0;
            }
         }
      });
   }

   private void a(@NotNull HUDMod<T> var1, @NotNull T var2) {
      HUDConfig var3 = this.g();
      if (this.b == null || !this.b.containsKey("hudRelativeX")) {
         double var4 = var3.d() ? var2.c() : var3.a();
         double var6 = var3.e() ? var2.d() : var3.b();
         double var8 = var3.c();
         var2.a(var1, var4, var6, var8);
      }

   }

   @NotNull
   private HUDConfig g() {
      return (HUDConfig)this.a.getDeclaredAnnotation(HUDConfig.class);
   }
}
