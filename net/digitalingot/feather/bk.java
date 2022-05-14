package net.digitalingot.feather;

import java.util.List;
import java.util.TreeSet;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;

class bk {
   private final CoreMod.a a;
   private final TreeSet<bk.a> b = new TreeSet();
   private final TreeSet<bk.b> c = new TreeSet();
   private bk.a d;
   private bk.b e;
   private final Minecraft f;

   public bk() {
      this.a = net.digitalingot.feather.e.c().b().<CoreMod>b(CoreMod.class).k();
      this.f = Minecraft.func_71410_x();
   }

   public void a(HUDMod<? extends HUDPosition> var1) {
      HUDPosition var2 = (HUDPosition)var1.k();
      if (this.e != null || this.d != null) {
         double var3 = this.e == null ? var2.e().getCenterX(var1) : this.e.a();
         double var5 = this.d == null ? var2.i().getCenterY(var1) : this.d.a();
         var2.a(var1, var3, var5);
      }
   }

   public void a() {
      if (this.d != null) {
         int var1 = this.a.w;
         int var2 = this.a.v.getRGB();
         hH.a().a(0, this.d.e - (var1 + 1) / 2, (int)((double)hp.c() / hp.g() + 1.0), this.d.e + var1 / 2, var2);
      }

      if (this.e != null) {
         int var3 = this.a.w;
         int var4 = this.a.v.getRGB();
         hH.a().a(this.e.e - (var3 + 1) / 2, 0, this.e.e + var3 / 2, (int)((double)hp.d() / hp.g() + 1.0), var4);
      }

   }

   public int[] b() {
      int var1 = (int)((double)hp.d() / hp.g());
      return new int[]{1, var1 / 2, var1};
   }

   public int[] c() {
      int var1 = (int)((double)hp.c() / hp.g());
      return new int[]{1, var1 / 2, var1};
   }

   public void a(HUDMod<? extends HUDPosition> var1, List<HUDMod<? extends HUDPosition>> var2) {
      this.b.clear();
      this.c.clear();

      for(HUDMod var4 : var2) {
         if (var4 != var1) {
            HUDPosition var5 = (HUDPosition)var4.k();
            HUDPosition.c var6 = var5.i();
            HUDPosition.b var7 = var5.e();
            this.b.add(new bk.a(var1, var6.getStartY(var4), false));
            this.b.add(new bk.a(var1, (int)Math.round(var6.getCenterY(var4)), true));
            this.b.add(new bk.a(var1, var6.getEndY(var4), false));
            this.c.add(new bk.b(var1, var7.getStartX(var4), false));
            this.c.add(new bk.b(var1, (int)Math.round(var7.getCenterX(var4)), true));
            this.c.add(new bk.b(var1, var7.getEndX(var4), false));
         }
      }

      int[] var8 = this.c();
      this.c.add(new bk.b(var1, var8[0], false));
      this.c.add(new bk.b(var1, var8[1], true));
      this.c.add(new bk.b(var1, var8[2], false));
      int[] var9 = this.b();
      this.b.add(new bk.a(var1, var9[0], false));
      this.b.add(new bk.a(var1, var9[1], true));
      this.b.add(new bk.a(var1, var9[2], false));
      int var10 = this.a.x;
      this.d = (bk.a)this.b.iterator().next();
      if (this.d != null && this.d.b > var10) {
         this.d = null;
      }

      this.e = (bk.b)this.c.iterator().next();
      if (this.e != null && this.e.b > var10) {
         this.e = null;
      }

   }

   public void d() {
      this.b.clear();
      this.c.clear();
      this.d = null;
      this.e = null;
   }

   public static class a implements Comparable<bk.a> {
      private final boolean a;
      private final int b;
      private final boolean c;
      private final HUDMod<? extends HUDPosition> d;
      private final int e;

      public a(HUDMod<? extends HUDPosition> var1, int var2, boolean var3) {
         this.d = var1;
         this.e = var2;
         this.a = var3;
         HUDPosition var4 = (HUDPosition)var1.k();
         HUDPosition.c var5 = var4.i();
         if (var3) {
            this.b = (int)Math.abs((long)var2 - Math.round(var5.getCenterY(var1)));
            this.c = false;
         } else {
            int var6 = Math.abs(var2 - var5.getStartY(var1));
            int var7 = Math.abs(var2 - var5.getEndY(var1));
            this.c = var7 < var6;
            this.b = Math.min(var6, var7);
         }
      }

      public int a(bk.a var1) {
         return Integer.compare(this.b, var1.b);
      }

      public double a() {
         return this.a ? (double)this.e : (double)this.e * 1.0 + (double)(this.c ? -1 : 1) * this.d.c() / 2.0;
      }
   }

   public static class b implements Comparable<bk.b> {
      private final boolean a;
      private final int b;
      private final HUDMod<? extends HUDPosition> c;
      private final boolean d;
      private final int e;

      public b(HUDMod<? extends HUDPosition> var1, int var2, boolean var3) {
         this.c = var1;
         this.e = var2;
         this.a = var3;
         HUDPosition var4 = (HUDPosition)var1.k();
         HUDPosition.b var5 = var4.e();
         if (var3) {
            this.b = (int)Math.abs((long)var2 - Math.round(var5.getCenterX(var1)));
            this.d = false;
         } else {
            int var6 = Math.abs(var2 - var5.getStartX(var1));
            int var7 = Math.abs(var2 - var5.getEndX(var1));
            this.d = var7 < var6;
            this.b = Math.min(var6, var7);
         }
      }

      public int a(bk.b var1) {
         return Integer.compare(this.b, var1.b);
      }

      public double a() {
         return this.a ? (double)this.e : (double)this.e * 1.0 + (double)(this.d ? -1 : 1) * this.c.d() / 2.0;
      }
   }
}
