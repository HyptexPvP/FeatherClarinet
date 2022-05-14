package net.digitalingot.feather;

import java.util.List;
import java.util.Map.Entry;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.event.StateChangeEvent;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class ey {
   @NotNull
   private final ConfigManager a;

   public ey(@NotNull ConfigManager var1) {
      this.a = var1;
   }

   public void a() {
      this.b(true);
      this.a(true);
   }

   public void b() {
      this.a(false);
   }

   private void a(boolean var1) {
      for(Class var3 : this.a.getMods()) {
         Entry var4 = (Entry)this.a
            .f()
            .entrySet()
            .stream()
            .filter(var1x -> ((Mod)var1x.getValue()).getClass() == var3)
            .findFirst()
            .orElseThrow(IllegalStateException::new);
         ModsConfig var5 = (ModsConfig)var4.getKey();
         Mod var6 = (Mod)var4.getValue();
         if ((!var1 || !var5.isCore()) && var6.k().j() && !this.a.j().contains(var6.l().a())) {
            this.a(var6);
         }
      }

   }

   public void c() {
      this.b(false);
   }

   private void b(boolean var1) {
      List var2 = this.a.getMods();

      for(int var3 = var2.size() - 1; var3 >= 0; --var3) {
         Class var4 = (Class)var2.get(var3);
         Entry var5 = (Entry)this.a
            .f()
            .entrySet()
            .stream()
            .filter(var1x -> ((Mod)var1x.getValue()).getClass() == var4)
            .findFirst()
            .orElseThrow(IllegalStateException::new);
         ModsConfig var6 = (ModsConfig)var5.getKey();
         Mod var7 = (Mod)var5.getValue();
         if ((!var1 || !var6.isCore()) && var7.m()) {
            this.b(var7);
         }
      }

   }

   public void a(@NotNull Mod<?> var1) {
      var1.a(true);
      if (!var1.n()) {
         var1.f();
         var1.b(true);
      }

      var1.g();
      var1.i();
      StateChangeEvent.a.a().loadedStateChange(var1, true);
   }

   public void b(@NotNull Mod<?> var1) {
      if (var1.m()) {
         var1.a(false);
         var1.h();
         StateChangeEvent.a.a().loadedStateChange(var1, false);
      }
   }
}
