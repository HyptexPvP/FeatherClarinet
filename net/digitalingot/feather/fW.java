package net.digitalingot.feather;

import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.util.CurrentServer;
import org.jetbrains.annotations.NotNull;

public abstract class fW<T extends HUD> {
   @NotNull
   protected final Mod<T> a;
   protected boolean b;

   protected fW(@NotNull Mod<T> var1) {
      this.a = var1;
   }

   public abstract boolean b();

   public void a() {
   }

   public void c() {
   }

   public void d() {
      this.b = true;
   }

   public void e() {
      this.b = false;
   }

   public boolean g() {
      return this.b && this.a.m() && this.b() && e.c().g() == CurrentServer.HYPIXEL;
   }

   public boolean h() {
      return this.b;
   }
}
