package net.digitalingot.feather.gui;

import net.digitalingot.feather.bf;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.ModPosition;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.util.ResourceLocation;

class ModLayout implements bf {
   private static final ResourceLocation a = new ResourceLocation("feather:textures/gui/modlayout/remove.png");
   private static final ResourceLocation b = new ResourceLocation("feather:textures/gui/modlayout/settings.png");
   private MatrixUtils c;
   private HUDMod<? extends HUDPosition> d;
   private HUDPosition e;

   @Override
   public void a(MatrixUtils var1, HUDMod<? extends HUDPosition> var2) {
      this.c = var1;
      this.d = var2;
      this.e = (HUDPosition)var2.k();
   }

   @Override
   public void a() {
      this.d = null;
      this.e = null;
   }

   @Override
   public void a(int var1) {
      this.d.e().b(this.c, 0, 0, (int)Math.round(this.d.d()), (int)Math.round(this.d.c()), var1);
   }

   @Override
   public void b() {
      int var1 = hp.c();
      int var2 = hp.d();
      int var3 = var1 / 4;
      int var4 = var2 / 4;
      double var5 = this.e.e().getCenterX(this.d);
      double var7 = this.e.i().getCenterY(this.d);
      int var9 = (int)(this.d.c() + 4.0);
      String var10 = this.d.l().b().a();
      ModPosition var11 = this.d.e();
      int var12 = var11.a(var10);
      int var13 = (int)Math.round(this.d.d() - (double)var12);
      if (var5 < (double)var3) {
         if (var7 < (double)var4) {
            var11.a(this.c, var10, 0.0F, (float)var9, -1, false, false);
         } else {
            var11.a(this.c, var10, 0.0F, -13.0F, -1, false, false);
         }
      } else if (var7 < (double)var4) {
         var11.a(this.c, var10, (float)var13, (float)var9, -1, false, false);
      } else {
         var11.a(this.c, var10, (float)var13, -13.0F, -1, false, false);
      }

   }

   @Override
   public void b(int var1) {
      int var2 = (int)Math.round(this.d.d());
      int var3 = (int)Math.round(this.d.c());
      ModPosition var4 = this.d.e();
      var4.b(this.c, -2, -2, 2, 2, var1);
      var4.b(this.c, var2 - 2, -2, var2 + 2, 2, var1);
      var4.b(this.c, -2, var3 - 2, 2, var3 + 2, var1);
      var4.b(this.c, var2 - 2, var3 - 2, var2 + 2, var3 + 2, var1);
   }

   @Override
   public void c(int var1) {
      int var2 = (int)Math.round(this.d.d());
      int var3 = (int)Math.round(this.d.c());
      ModPosition var4 = this.d.e();
      var4.a(this.c, 0, 0, var2, var3, var1);
   }

   @Override
   public void a(int var1, int var2) {
      if (var1 != 0) {
         this.c(var1);
      }

      if (var2 != 0) {
         this.b(var2);
      }

   }

   @Override
   public void c() {
      this.c.a();
      double var1 = hp.g() * 2.0;
      this.c.b(1.0 / var1, 1.0 / var1, 1.0);
      boolean var3 = true;
      int var4 = (int)Math.round(this.d.d() * var1) - 48;
      int var5 = (int)Math.round(this.d.c() * var1) - 48;
      ModPosition var6 = this.d.e();
      RenderUtil.a(0, b);
      var6.a(this.c, 0, var5, 0.0F, 0.0F, 48, 48, 48, 48, 48.0F, 48.0F);
      RenderUtil.a(0, a);
      var6.a(this.c, var4, var5, 0.0F, 0.0F, 48, 48, 48, 48, 48.0F, 48.0F);
      this.c.b();
   }
}
