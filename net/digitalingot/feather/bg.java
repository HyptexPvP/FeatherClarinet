package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.HUDButtonEdit;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.gui.ModLayout;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.ModPosition;
import net.digitalingot.feather.settings.BuildModProfile;
import net.digitalingot.feather.util.HUDUtil;
import net.digitalingot.feather.util.MatrixUtils;

class bg {
   private static final int a = 125;
   private static final int b = 0;
   private static final int c = -1;
   private static final int d = 6;
   private static final int e = 3;
   private static final int f = 48;
   private static final int g = 24;
   private final bk h = new bk();
   private final bf i = new ModLayout();
   private int j;
   private int k;
   private List<HUDMod<? extends HUDPosition>> l = Lists.newArrayList();
   private HUDMod<? extends HUDPosition> m = null;
   private int n = -1;
   private double o;
   private double p;
   private double q;
   private int r;
   private int s;
   private bg.b t;
   private bg.a u;
   private bg.e v;
   private boolean w = false;
   private int x = -1;
   private int y = 5;
   private final Set<bg.c> z = EnumSet.noneOf(bg.c.class);
   private final Set<bg.c> A = EnumSet.noneOf(bg.c.class);
   private final Set<bg.c> B = EnumSet.noneOf(bg.c.class);

   public bg() {
      this.n();
   }

   private void c() {
      this.l = (List)d().stream().filter(var0 -> var0.m() && ((HUDPosition)var0.k()).j()).collect(Collectors.toList());
   }

   public void a(int var1, int var2) {
      this.j = var1;
      this.k = var2;
      this.c();
      aN.a();
   }

   public void a() {
      this.h();
      this.l.clear();
      this.h.d();
      HUDUtil.a();
      net.digitalingot.feather.e.c().b().c();
   }

   private static List<HUDMod<? extends HUDPosition>> d() {
      ConfigManager var0 = net.digitalingot.feather.e.c().b();
      return (List<HUDMod<? extends HUDPosition>>)var0.f()
         .values()
         .stream()
         .filter(var0x -> var0x instanceof HUDMod)
         .map(var0x -> (HUDMod)var0x)
         .collect(Collectors.toList());
   }

   public void a(MatrixUtils var1) {
      hH.a().b(var1, 0, 0, this.j, this.k, 1056964608);
      bg.c.handleKeys(this);

      for(int var2 = 0; var2 < this.l.size(); ++var2) {
         if (var2 != this.n) {
            this.a(var1, (HUDMod<? extends HUDPosition>)this.l.get(var2), var2 == this.x ? bh.a.SELECTED : bh.a.UNSELECTED);
         }
      }

      if (this.j()) {
         if (this.u == bg.a.MOVE) {
            this.h.a(this.m, this.l);
            this.h.a(this.m);
         }

         this.a(var1, this.m, bh.a.SELECTED);
         if (this.u == bg.a.MOVE) {
            this.h.a();
         }
      }

   }

   private void a(MatrixUtils var1, HUDMod<? extends HUDPosition> var2, bh.a var3) {
      var1.a();
      var1.a((float)((HUDPosition)var2.k()).e().getStartX(var2), (float)((HUDPosition)var2.k()).i().getStartY(var2), 0.0F);
      this.i.a(var1, var2);
      this.i.a(var3.background);
      this.i.b();
      this.a(var1, var2);
      this.i.a(var3.border, var3.corner);
      this.i.c();
      this.i.a();
      var1.b();
   }

   private void a(MatrixUtils var1, HUDMod<? extends HUDPosition> var2) {
      ModPosition var3 = var2.e();
      var3.f();
      var1.a();
      double var4 = ((HUDPosition)var2.k()).h();
      var1.b(var4, var4, 1.0);
      var2.a(HUDMod.a.MOD_LAYOUT, var1);
      var1.b();
      var3.e();
   }

   public void a(char var1, int var2) {
   }

   public boolean a(int var1, int var2, int var3) {
      this.w = var3 == 0;
      if (this.w) {
         int var4 = -1;

         for(int var5 = 0; var5 < this.l.size(); ++var5) {
            if (this.a((HUDMod<? extends HUDPosition>)this.l.get(var5), var1, var2)) {
               var4 = var5;
               break;
            }
         }

         if (var4 != -1) {
            this.a(var4);
            this.r = var1;
            this.s = var2;
            switch(this.u) {
               case DISABLE:
                  this.e();
                  return true;
               case OPEN_SETTINGS:
                  this.f();
                  return true;
            }
         } else {
            this.h();
         }
      }

      return false;
   }

   public void b(int var1, int var2, int var3) {
      if (var3 == 0) {
         if (this.j()) {
            this.g();
         }

         this.i();
         this.w = false;
      }

   }

   public void c(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.r;
         int var5 = var2 - this.s;
         if (this.j()) {
            switch(this.u) {
               case MOVE:
                  this.c(var4, var5);
                  break;
               case SCALE:
                  int var6;
                  switch(this.t) {
                     case BOTTOM_RIGHT:
                     case TOP_LEFT:
                        var6 = (var4 + var5) / 2;
                        break;
                     case TOP_RIGHT:
                     case BOTTOM_LEFT:
                        var6 = (var4 + -var5) / 2;
                        break;
                     default:
                        throw new AssertionError();
                  }

                  double var7 = (double)this.m.b() * this.q / k();
                  double var9 = (double)this.m.a() * this.q / k();
                  double var11 = Math.min(5.0, Math.max(0.2F, this.q + (double)(var6 * this.v.multiplier) / 100.0));
                  double var13 = var7 / this.q * var11;
                  double var15 = var9 / this.q * var11;
                  double var17 = var13 - var7;
                  double var19 = var15 - var9;
                  double var21;
                  double var23;
                  switch(this.t) {
                     case BOTTOM_RIGHT:
                        var21 = this.o + var17;
                        var23 = this.p + var19;
                        break;
                     case TOP_LEFT:
                        var21 = this.o - var17;
                        var23 = this.p - var19;
                        break;
                     case TOP_RIGHT:
                        var21 = this.o + var17;
                        var23 = this.p - var19;
                        break;
                     case BOTTOM_LEFT:
                        var21 = this.o - var17;
                        var23 = this.p + var19;
                        break;
                     default:
                        throw new AssertionError();
                  }

                  this.a(var11, var21, var23);
            }
         }
      }

   }

   public void a(double var1, double var3) {
      if (this.u == null) {
         this.x = this.b((int)var1, (int)var3);
      }

   }

   private int b(int var1, int var2) {
      for(int var3 = 0; var3 < this.l.size(); ++var3) {
         if (bg.b.fromModule((HUDMod<? extends HUDPosition>)this.l.get(var3), var1, var2) != null) {
            return var3;
         }
      }

      return -1;
   }

   private void e() {
      f var1 = net.digitalingot.feather.e.c();
      var1.b().c(this.m);
      BuildModProfile.a(var1.b());
      this.h();
      this.c();
   }

   private void f() {
      String var1 = this.m.l().a().getSlug();
      BrowserUtils.INSTANCE.show();
      HUDButtonEdit.a(var1, true);
   }

   private void c(int var1, int var2) {
      this.m.k().a(this.m, this.o + (double)var1, this.p + (double)var2);
   }

   private void a(double var1, double var3, double var5) {
      HUDPosition var7 = this.m.k();
      var7.d = var1;
      var7.a(this.m, var3, var5);
   }

   private void g() {
      HUDPosition var1 = this.m.k();
      this.o = var1.e().getCenterX(this.m);
      this.p = var1.i().getCenterY(this.m);
      this.q = var1.h();
   }

   private void a(int var1) {
      this.n = var1;
      this.m = (HUDMod)this.l.get(var1);
      this.g();
   }

   private void h() {
      this.n = -1;
      this.m = null;
      this.i();
   }

   private void i() {
      this.t = null;
      this.u = null;
      this.v = null;
   }

   private boolean j() {
      return this.n != -1;
   }

   private boolean a(HUDMod<? extends HUDPosition> var1, int var2, int var3) {
      bg.b var4 = bg.b.fromModule(var1, var2, var3);
      if (var4 != null) {
         this.t = var4;
         this.u = bg.a.fromInteractionPoint(var4);
         this.v = bg.e.fromInteractionPoint(var4);
         this.x = -1;
      }

      return var4 != null;
   }

   private static double k() {
      return hp.g();
   }

   private void b(int var1) {
      if (this.m != null) {
         HUDPosition var2 = this.m.k();
         var2.a(this.m, this.o + (double)var1, this.p);
         this.o += (double)var1;
      }

   }

   private void a(int var1, long var2) {
      if (this.m != null) {
         HUDPosition var4 = this.m.k();
         var1 = (int)((long)var1 * var2 / 125L);
         var4.a(this.m, this.o + (double)var1, this.p);
      }

   }

   private void c(int var1) {
      if (this.m != null) {
         HUDPosition var2 = this.m.k();
         var2.a(this.m, this.o, this.p + (double)var1);
         this.p += (double)var1;
      }

   }

   private void b(int var1, long var2) {
      if (this.m != null) {
         HUDPosition var4 = this.m.k();
         var1 = (int)((long)var1 * var2 / 125L);
         var4.a(this.m, this.o, this.p + (double)var1);
      }

   }

   private void d(int var1) {
      this.y = var1;
   }

   private void c(int var1, long var2) {
      double var4 = Math.max(0.2, Math.min(5.0, this.q + (double)var1 * 0.02 * (double)var2 / 125.0));
      HUDPosition var6 = this.m.k();
      var6.d = var4;
   }

   private void l() {
      if (!this.w && !this.l.isEmpty()) {
         int var1 = this.l.size();
         this.a((this.n + 1) % var1);
      }
   }

   private void m() {
      if (!this.w && !this.l.isEmpty()) {
         int var1 = this.l.size();
         this.a((this.n + var1 - 1) % var1);
      }
   }

   private void n() {
      bg.c.LEFT.onPress = () -> {
         if (!this.w) {
            this.b(-this.y);
         }

      };
      bg.c.RIGHT.onPress = () -> {
         if (!this.w) {
            this.b(this.y);
         }

      };
      bg.c.UP.onPress = () -> {
         if (!this.w) {
            this.c(-this.y);
         }

      };
      bg.c.UP_LEFT.onPress = () -> {
         if (!this.w) {
            this.b(-this.y);
            this.c(-this.y);
         }

      };
      bg.c.UP_RIGHT.onPress = () -> {
         if (!this.w) {
            this.b(this.y);
            this.c(-this.y);
         }

      };
      bg.c.DOWN.onPress = () -> {
         if (!this.w) {
            this.c(this.y);
         }

      };
      bg.c.DOWN_LEFT.onPress = () -> {
         if (!this.w) {
            this.b(-this.y);
            this.c(this.y);
         }

      };
      bg.c.DOWN_RIGHT.onPress = () -> {
         if (!this.w) {
            this.b(this.y);
            this.c(this.y);
         }

      };
      bg.c.LEFT.onHold = var1 -> {
         if (!this.w) {
            this.a(-this.y, var1);
         }

      };
      bg.c.RIGHT.onHold = var1 -> {
         if (!this.w) {
            this.a(this.y, var1);
         }

      };
      bg.c.UP.onHold = var1 -> {
         if (!this.w) {
            this.b(-this.y, var1);
         }

      };
      bg.c.UP_LEFT.onHold = var1 -> {
         if (!this.w) {
            this.a(-this.y, var1);
            this.b(-this.y, var1);
         }

      };
      bg.c.UP_RIGHT.onHold = var1 -> {
         if (!this.w) {
            this.a(this.y, var1);
            this.b(-this.y, var1);
         }

      };
      bg.c.DOWN.onHold = var1 -> {
         if (!this.w) {
            this.b(this.y, var1);
         }

      };
      bg.c.DOWN_LEFT.onHold = var1 -> {
         if (!this.w) {
            this.a(-this.y, var1);
            this.b(this.y, var1);
         }

      };
      bg.c.DOWN_RIGHT.onHold = var1 -> {
         if (!this.w) {
            this.a(this.y, var1);
            this.b(this.y, var1);
         }

      };
      bg.c.SPEED_UP.onPress = () -> this.d(25);
      bg.c.SPEED_UP.onRelease = () -> this.d(5);
      bg.c.SLOW_DOWN.onPress = () -> this.d(1);
      bg.c.SLOW_DOWN.onRelease = () -> this.d(5);
      bg.c.INC_SCALE.onPress = () -> {
         if (!this.w && this.m != null) {
            HUDPosition var1 = this.m.k();
            double var2 = var1.d + 0.02 * (double)this.y;
            var1.d = var2;
            this.q = var2;
         }

      };
      bg.c.INC_SCALE.onHold = var1 -> {
         if (!this.w && this.m != null) {
            this.c(this.y, var1);
         }

      };
      bg.c.DEC_SCALE.onPress = () -> {
         if (!this.w && this.m != null) {
            HUDPosition var1 = this.m.k();
            double var2 = var1.d - 0.02 * (double)this.y;
            var1.d = var2;
            this.q = var2;
         }

      };
      bg.c.DEC_SCALE.onHold = var1 -> {
         if (!this.w && this.m != null) {
            this.c(-this.y, var1);
         }

      };
      bg.c.RESET_SCALE.onPress = () -> {
         if (!this.w && this.m != null) {
            HUDPosition var1 = this.m.k();
            var1.d = 1.0;
            this.q = 1.0;
         }

      };
      bg.c.RESET_POS.onPress = () -> {
         if (!this.w && this.m != null) {
            HUDPosition var1 = this.m.k();
            this.o = (double)this.j / 2.0 / k();
            this.p = (double)this.k / 2.0 / k();
            var1.a(this.m, this.o, this.p);
         }

      };
      bg.c.NEXT_MOD.onPress = this::l;
      bg.c.PREV_MOD.onPress = this::m;
   }

   static enum a {
      MOVE,
      SCALE,
      DISABLE,
      OPEN_SETTINGS;

      private static bg.a fromInteractionPoint(bg.b var0) {
         switch(var0) {
            case BOTTOM_RIGHT:
            case TOP_LEFT:
            case TOP_RIGHT:
            case BOTTOM_LEFT:
               return SCALE;
            case BODY:
               return MOVE;
            case INNER_BOTTOM_LEFT:
               return OPEN_SETTINGS;
            case INNER_BOTTOM_RIGHT:
               return DISABLE;
            default:
               throw new AssertionError();
         }
      }
   }

   static enum b {
      TOP_LEFT,
      TOP_RIGHT,
      BOTTOM_LEFT,
      BOTTOM_RIGHT,
      INNER_BOTTOM_LEFT,
      INNER_BOTTOM_RIGHT,
      BODY;

      private bg.d getRect(bg.d var1) {
         switch(this) {
            case BOTTOM_RIGHT:
               return new bg.d(var1.a() - 3, var1.b() - 3, 6, 6);
            case TOP_LEFT:
               return new bg.d(var1.a - 3, var1.b - 3, 6, 6);
            case TOP_RIGHT:
               return new bg.d(var1.a() - 3, var1.b - 3, 6, 6);
            case BOTTOM_LEFT:
               return new bg.d(var1.a - 3, var1.b() - 3, 6, 6);
            case BODY:
               return var1;
            case INNER_BOTTOM_LEFT:
               int var3 = (int)(24.0 / bg.k());
               return new bg.d(var1.a, var1.b() - var3, var3, var3);
            case INNER_BOTTOM_RIGHT:
               int var2 = (int)(24.0 / bg.k());
               return new bg.d(var1.a() - var2, var1.b() - var2, var2, var2);
            default:
               throw new AssertionError();
         }
      }

      private static bg.b fromModule(HUDMod<? extends HUDPosition> var0, int var1, int var2) {
         HUDPosition var3 = (HUDPosition)var0.k();
         HUDPosition.b var4 = var3.e();
         HUDPosition.c var5 = var3.i();
         int var6 = var4.getStartX(var0);
         int var7 = var4.getEndX(var0);
         int var8 = var5.getStartY(var0);
         int var9 = var5.getEndY(var0);
         bg.d var10 = new bg.d(var6, var8, var7 - var6, var9 - var8);

         for(bg.b var14 : values()) {
            bg.d var15 = var14.getRect(var10);
            if (var15.a(var1, var2)) {
               return var14;
            }
         }

         return null;
      }
   }

   static enum c {
      SLOW_DOWN(true, bh.h.slowDown),
      SPEED_UP(true, bh.h.speedUp),
      INC_SCALE(true, bh.h.incScale),
      DEC_SCALE(true, bh.h.decScale),
      RESET_SCALE(true, bh.h.resetScale),
      LEFT(true, false, bh.h.left),
      RIGHT(true, false, bh.h.right),
      UP(false, true, bh.h.up),
      UP_LEFT(true, true, bh.h.upLeft),
      UP_RIGHT(true, true, bh.h.upRight),
      DOWN(false, true, bh.h.down),
      DOWN_LEFT(true, true, bh.h.downLeft),
      DOWN_RIGHT(true, true, bh.h.downRight),
      NEXT_MOD(true, bh.h.nextMod),
      PREV_MOD(true, bh.h.prevMod),
      RESET_POS(true, true, bh.h.resetPos);

      private static final int KEY_HOLD_DELAY = 500;
      private boolean blockX;
      private boolean blockY;
      private boolean blockScale;
      private long downSince;
      private int[] ids;
      private Consumer<Long> onHold;
      private Runnable onPress;
      private Runnable onRelease;

      private c(boolean var3, int... var4) {
         this.blockX = this.blockY = this.blockScale = var3;
         this.ids = var4;
      }

      private c(boolean var3, boolean var4, int... var5) {
         this.blockX = var3;
         this.blockY = var4;
         this.ids = var5;
      }

      private boolean isPressed() {
         for(int var4 : this.ids) {
            if (iu.a(var4)) {
               return true;
            }
         }

         return false;
      }

      private static void handleKeys(bg var0) {
         long var1 = System.currentTimeMillis();

         for(bg.c var6 : values()) {
            if (!var6.isPressed()) {
               if (var6.downSince != 0L) {
                  if (var6.blockX) {
                     var0.z.remove(var6);
                  }

                  if (var6.blockY) {
                     var0.A.remove(var6);
                  }

                  if (var6.blockScale) {
                     var0.B.remove(var6);
                  }

                  if (!var0.w && var0.m != null) {
                     HUDPosition var11 = var0.m.k();
                     long var8 = var1 - 500L;
                     if (var6.blockX) {
                        setDownSince(var0.z, var8);
                        var0.o = var11.e().getCenterX(var0.m);
                     }

                     if (var6.blockY) {
                        setDownSince(var0.A, var8);
                        var0.p = var11.i().getCenterY(var0.m);
                     }

                     if (var6.blockScale) {
                        setDownSince(var0.B, var8);
                        var0.q = var11.d;
                     }
                  }

                  if (var6.downSince > 0L) {
                     if (var6.onRelease != null) {
                        var6.onRelease.run();
                     }

                     var6.downSince = 0L;
                  }
               }
            } else if (var6.downSince == 0L) {
               if (var6.blockX) {
                  var0.z.add(var6);
               }

               if (var6.blockY) {
                  var0.A.add(var6);
               }

               if (var6.blockScale) {
                  var0.B.add(var6);
               }

               if (!var0.w && var0.m != null) {
                  HUDPosition var10 = var0.m.k();
                  if (var6.blockX) {
                     var0.o = var10.e().getCenterX(var0.m);
                  }

                  if (var6.blockY) {
                     var0.p = var10.i().getCenterY(var0.m);
                  }

                  if (var6.blockScale) {
                     var0.q = var10.d;
                  }
               }

               var6.downSince = var1;
               if (var6.onPress != null) {
                  var6.onPress.run();
               }
            } else if (var6.onHold == null) {
               if (var6.blockX) {
                  var0.z.remove(var6);
               }

               if (var6.blockY) {
                  var0.A.remove(var6);
               }

               if (var6.blockScale) {
                  var0.B.remove(var6);
               }
            } else if (var1 - var6.downSince > 500L) {
               if (var6.blockX && var0.z.size() > 1 || var6.blockY && var0.A.size() > 1 || var6.blockScale && var0.B.size() > 1) {
                  var6.downSince = var1 - 500L;
                  if (!var0.w && var0.m != null) {
                     HUDPosition var7 = var0.m.k();
                     if (var6.blockX) {
                        var0.o = var7.e().getCenterX(var0.m);
                     }

                     if (var6.blockY) {
                        var0.p = var7.i().getCenterY(var0.m);
                     }

                     if (var6.blockScale) {
                        var0.q = var7.d;
                     }
                  }
               }

               var6.onHold.accept(var1 - var6.downSince - 500L);
            }
         }

      }

      private static void setDownSince(Set<bg.c> var0, long var1) {
         for(bg.c var4 : var0) {
            var4.downSince = var1;
         }

      }
   }

   static class d {
      protected final int a;
      protected final int b;
      protected final int c;
      protected final int d;

      public d(int var1, int var2, int var3, int var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
      }

      public int a() {
         return this.a + this.c;
      }

      public int b() {
         return this.b + this.d;
      }

      public boolean a(int var1, int var2) {
         int var3 = this.c;
         int var4 = this.d;
         if ((var3 | var4) < 0) {
            return false;
         } else {
            int var5 = this.a;
            int var6 = this.b;
            if (var1 >= var5 && var2 >= var6) {
               var3 += var5;
               var4 += var6;
               return (var3 < var5 || var3 > var1) && (var4 < var6 || var4 > var2);
            } else {
               return false;
            }
         }
      }
   }

   public static enum e {
      TOP_LEFT(-1),
      TOP_RIGHT(1),
      BOTTOM_LEFT(-1),
      BOTTOM_RIGHT(1),
      CENTER(0);

      private int multiplier;

      private e(int var3) {
         this.multiplier = var3;
      }

      private static bg.e fromInteractionPoint(bg.b var0) {
         switch(var0) {
            case BOTTOM_RIGHT:
               return BOTTOM_RIGHT;
            case TOP_LEFT:
               return TOP_LEFT;
            case TOP_RIGHT:
               return TOP_RIGHT;
            case BOTTOM_LEFT:
               return BOTTOM_LEFT;
            default:
               return null;
         }
      }
   }
}
