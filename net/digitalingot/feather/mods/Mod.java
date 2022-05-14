package net.digitalingot.feather.mods;

import net.digitalingot.feather.gui.HUD;
import org.jetbrains.annotations.NotNull;

public abstract class Mod<C extends HUD> {
   @NotNull
   protected C b;
   @NotNull
   private FeatherModule a;
   private boolean c;
   private boolean d;

   public void f() {
   }

   public void g() {
   }

   public void h() {
   }

   public void i() {
   }

   public void j() {
   }

   @NotNull
   public C k() {
      return this.b;
   }

   public void a(@NotNull C var1) {
      this.b = var1;
   }

   @NotNull
   public FeatherModule l() {
      return this.a;
   }

   public void a(@NotNull FeatherModule var1) {
      this.a = var1;
   }

   public boolean m() {
      return this.d;
   }

   public void a(boolean var1) {
      this.d = var1;
   }

   public boolean n() {
      return this.c;
   }

   public void b(boolean var1) {
      this.c = var1;
   }
}
