package net.digitalingot.feather.mods;

import net.digitalingot.feather.hH;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.MatrixUtils;

public class ModPosition extends hH {
   private final HUDMod<?> b;
   private boolean c;

   public ModPosition(HUDMod<?> var1) {
      this.b = var1;
   }

   public void e() {
      this.c = false;
   }

   public void f() {
      this.c = true;
   }

   public void a(MatrixUtils var1) {
      var1.b();
      this.c = false;
   }

   public void b(MatrixUtils var1) {
      var1.a();
      HUDPosition var2 = this.b.k();
      var1.a((float)var2.e().getStartX(this.b), (float)var2.i().getStartY(this.b), 0.0F);
      double var3 = var2.h();
      var1.b(var3, var3, 1.0);
      this.c = true;
   }

   @Override
   protected float a(float var1) {
      HUDPosition var2 = this.b.k();
      float var3 = (float)var2.e().getStartX(this.b);
      return this.c ? (float)((double)var1 + (double)var3 / var2.d) : var1 + var3;
   }

   @Override
   protected float b(float var1) {
      HUDPosition var2 = this.b.k();
      float var3 = (float)var2.i().getStartY(this.b);
      return this.c ? (float)((double)var1 + (double)var3 / var2.d) : var1 + var3;
   }
}
