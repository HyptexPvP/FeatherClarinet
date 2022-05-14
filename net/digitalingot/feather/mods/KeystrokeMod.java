package net.digitalingot.feather.mods;

import java.awt.Color;
import java.text.DecimalFormat;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.fP;
import net.digitalingot.feather.g;
import net.digitalingot.feather.ib;
import net.digitalingot.feather.ij;
import net.digitalingot.feather.iu;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.IntUtil;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.PlayerUtil;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.KEYSTROKES,
   b = @dn(
   a = "Keystrokes",
   b = "https://assets.feathercdn.net/game/mods/keystrokes.svg",
   c = "Display your key presses",
   d = {ModsConponment.Category.HUD}
)
)
public class KeystrokeMod extends HUDMod<KeystrokeMod.f> implements fP.a {
   private static final int c = 20;
   private static final int d = 1;
   private static final int e = 3;
   private static final int f = 2;
   private static final int g = 62;
   private static final int h = 12;
   private final fP i = new fP(this, this);
   private final DecimalFormat j = IntUtil.a("#.#");
   private KeystrokeMod.d k;
   private KeystrokeMod.d l;
   private KeystrokeMod.d m;
   private KeystrokeMod.d n;
   private KeystrokeMod.d o;
   private KeystrokeMod.b p;
   private KeystrokeMod.b q;
   private KeystrokeMod.d[] r = new KeystrokeMod.d[0];
   private int s;
   private float t;
   private float u;
   private float v;
   private float w;
   private float x;
   private float y;
   private String z;

   private void o() {
      GameSettings var1 = Minecraft.func_71410_x().field_71474_y;
      this.k = new KeystrokeMod.d(this.b, KeystrokeMod.e.FORWARD, var1.field_74351_w);
      this.l = new KeystrokeMod.d(this.b, KeystrokeMod.e.BACK, var1.field_74368_y);
      this.m = new KeystrokeMod.d(this.b, KeystrokeMod.e.LEFT, var1.field_74370_x);
      this.n = new KeystrokeMod.d(this.b, KeystrokeMod.e.RIGHT, var1.field_74366_z);
      this.o = new KeystrokeMod.d(this.b, KeystrokeMod.e.JUMP, var1.field_74314_A);
      this.p = new KeystrokeMod.b(this.b, KeystrokeMod.e.ATTACK, var1.field_74312_F);
      this.q = new KeystrokeMod.b(this.b, KeystrokeMod.e.USE, var1.field_74313_G);
      this.r = new KeystrokeMod.d[]{this.k, this.l, this.m, this.n, this.o, this.p, this.q};
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      this.p();
      if (this.b.l != KeystrokeMod.f.b.NONE) {
         this.c(var2, this.k);
         this.c(var2, this.m);
         this.c(var2, this.l);
         this.c(var2, this.n);
      }

      if (this.b.j != KeystrokeMod.f.b.NONE) {
         this.a(var2, this.p);
         this.a(var2, this.q);
      }

      if (this.b.k != KeystrokeMod.f.b.NONE) {
         this.d(var2, this.o);
      }

      if (this.b.o == KeystrokeMod.f.a.SEPARATE) {
         this.a.a(var2, (int)this.t, (int)this.u, (int)this.v, (int)this.w, this.b.s.getRGB(), false);
         this.a.a(var2, this.z, this.x, this.y, this.b.u, false);
      }

   }

   @Override
   public void i() {
      IntUtil.a(this.j, this.b.p);
      this.o();
      this.q();
      this.r();
   }

   @Override
   public int a() {
      return this.s;
   }

   @Override
   public int b() {
      return 62;
   }

   private void p() {
      net.digitalingot.feather.g.a();
      long var1 = System.currentTimeMillis();

      for(KeystrokeMod.d var6 : this.r) {
         int var7 = PlayerUtil.a(var6.c);
         var6.f = iu.a(var7);
         var6.a(var1);
      }

   }

   private void a(MatrixUtils var1, KeystrokeMod.d var2) {
      this.a.b(var1, (int)var2.i, (int)var2.j, (int)var2.k, (int)var2.l, var2.d.a.getRGB());
   }

   private void b(MatrixUtils var1, KeystrokeMod.d var2) {
      this.a.a(var1, var2.m, var2.n, var2.o, var2.d.b, false);
   }

   private void c(MatrixUtils var1, KeystrokeMod.d var2) {
      this.a(var1, var2);
      this.b(var1, var2);
   }

   private void a(MatrixUtils var1, KeystrokeMod.b var2) {
      this.c(var1, var2);
      if (this.b.o == KeystrokeMod.f.a.WITH_CLICKS) {
         var1.a();
         var1.b(0.5F, 0.5F, 1.0F);
         this.a.a(var1, var2.p, var2.q, var2.r, var2.d.b, false);
         var1.b();
      }

   }

   private void d(MatrixUtils var1, KeystrokeMod.d var2) {
      this.a(var1, var2);
      if (this.b.k == KeystrokeMod.f.b.ARROWS) {
         float var3 = var2.j + (var2.l - var2.j) / 2.0F;
         this.a.a(var1, (int)(var2.i + 20.0F), (int)(var3 + 1.0F), (int)(var2.k - 20.0F), (int)var3, var2.d.b.a(), var2.d.b.b());
      } else {
         this.b(var1, var2);
      }

   }

   private void q() {
      float var1 = 0.0F;
      if (this.b.l != KeystrokeMod.f.b.NONE) {
         this.k.a(1.0F, var1++);
         this.m.a(0.0F, var1);
         this.l.a(1.0F, var1);
         this.n.a(2.0F, var1++);
      }

      if (this.b.j != KeystrokeMod.f.b.NONE) {
         this.p.a(0.0F, var1);
         this.q.a(1.0F, var1++);
      }

      if (this.b.k != KeystrokeMod.f.b.NONE) {
         this.o.a(0.0F, var1++);
      }

      this.s = (int)(var1 * 21.0F);
      if (this.b.o == KeystrokeMod.f.a.SEPARATE) {
         this.t = 0.0F;
         this.u = var1 * 21.0F;
         this.v = this.t + 62.0F;
         this.w = this.u + 12.0F;
         this.s += 12;
      }

   }

   @Override
   public void a(double var1, double var3) {
      switch(this.b.o) {
         case WITH_CLICKS:
            if (var1 != 0.0) {
               this.a(this.p, this.i.a());
            }

            if (var3 != 0.0) {
               this.a(this.q, this.i.b());
            }
            break;
         case SEPARATE:
            if (var1 != 0.0) {
               this.s();
            }
      }

   }

   private void r() {
      this.a(this.p, this.i.a());
      this.a(this.q, this.i.b());
      this.s();
   }

   private void s() {
      this.z = this.a(this.i.a());
      this.x = this.t + (float)(62 - RenderUtil.a(this.z)) / 2.0F;
      this.y = this.u + 2.5F;
   }

   private void a(KeystrokeMod.b var1, double var2) {
      var1.a(this.a(var2));
   }

   private String a(double var1) {
      return this.b.q ? "CPS: " + this.j.format(var1) : this.j.format(var1) + " CPS";
   }

   static class a {
      @NotNull
      public Color a;
      @NotNull
      public ChromaColor b;

      public a(@NotNull Color var1, @NotNull ChromaColor var2) {
         this.a = var1;
         this.b = var2;
      }
   }

   static class b extends KeystrokeMod.d {
      private String p;
      private float q;
      private float r;

      public b(KeystrokeMod.f var1, KeystrokeMod.e var2, KeyBinding var3) {
         super(var1, var2, var3);
      }

      @Override
      public void a(float var1, float var2) {
         super.a(var1, var2);
         if (this.a.o == KeystrokeMod.f.a.WITH_CLICKS) {
            this.o -= 2.0F;
            if (this.p != null) {
               this.b();
            }
         }

      }

      public void a(String var1) {
         this.p = var1;
         this.b();
      }

      private void b() {
         float var1 = (float)RenderUtil.a(this.p) / 2.0F;
         this.q = this.i + (this.b.bounds.width - var1) / 2.0F;
         this.r = this.o + 7.0F + 1.0F;
         this.q *= 2.0F;
         this.r *= 2.0F;
      }
   }

   static enum c {
      THIRD(20.0F, 20.0F, 1.0F),
      HALF(30.5F, 20.0F, 1.0F),
      FULL(62.0F, 20.0F, 0.0F);

      private final float width;
      private final float height;
      private final float margin;

      private c(float var3, float var4, float var5) {
         this.width = var3;
         this.height = var4;
         this.margin = var5;
      }
   }

   static class d {
      protected final KeystrokeMod.f a;
      protected final KeystrokeMod.e b;
      protected final KeyBinding c;
      protected final KeystrokeMod.a d;
      protected float e;
      protected boolean f;
      protected long g;
      protected boolean h;
      protected float i;
      protected float j;
      protected float k;
      protected float l;
      protected String m;
      protected float n;
      protected float o;

      public d(KeystrokeMod.f var1, KeystrokeMod.e var2, KeyBinding var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.e = 0.0F;
         this.d = new KeystrokeMod.a(this.a(var1.t, var1.s), this.a(var1.v, var1.u));
         this.a(System.currentTimeMillis());
      }

      private ChromaColor a(ChromaColor var1, ChromaColor var2) {
         ChromaColor var3 = this.h ? var1 : var2;
         if (this.e != 1.0F) {
            ChromaColor var4 = this.h ? var2 : var1;
            return ib.a(var4, var3, this.e);
         } else {
            return var3;
         }
      }

      private Color a(Color var1, Color var2) {
         Color var3 = this.h ? var1 : var2;
         if (this.e != 1.0F) {
            Color var4 = this.h ? var2 : var1;
            return ib.a(var4, var3, this.e);
         } else {
            return var3;
         }
      }

      public void a(long var1) {
         boolean var4 = this.f;
         boolean var3;
         if (this.h != var4) {
            this.h = var4;
            this.g = var1;
            var3 = true;
         } else {
            var3 = this.e != 1.0F;
         }

         if (var3) {
            this.e = ij.a((float)((double)(var1 - this.g) / Math.max(1.0, this.a.m)));
            this.d.b = this.a(this.a.v, this.a.u);
            this.d.a = this.a(this.a.t, this.a.s);
         }

      }

      public void a() {
         this.d.b = this.a(this.a.v, this.a.u);
         this.d.a = this.a(this.a.t, this.a.s);
         this.m = this.b.getText(this.a);
      }

      public void a(float var1, float var2) {
         this.a();
         KeystrokeMod.c var3 = this.b.bounds;
         this.i = var1 * (var3.width + var3.margin);
         this.j = var2 * (var3.height + 1.0F);
         this.k = this.i + var3.width;
         this.l = this.j + var3.height;
         this.n = this.i + (var3.width - (float)this.b.getTextWidth(this.a)) / 2.0F;
         this.o = this.j + (var3.height - 7.0F) / 2.0F;
      }
   }

   static enum e {
      FORWARD(KeystrokeMod.c.THIRD, "W", "+"),
      LEFT(KeystrokeMod.c.THIRD, "A", "<"),
      BACK(KeystrokeMod.c.THIRD, "S", "-"),
      RIGHT(KeystrokeMod.c.THIRD, "D", ">"),
      JUMP(KeystrokeMod.c.FULL, "JUMP", ""),
      CPS(KeystrokeMod.c.FULL, "", ""),
      ATTACK(KeystrokeMod.c.HALF, "LMB", "<--"),
      USE(KeystrokeMod.c.HALF, "RMB", "-->");

      private KeystrokeMod.c bounds;
      private final String name;
      private final int nameWidth;
      private final String arrow;
      private final int arrowWidth;

      private e(KeystrokeMod.c var3, String var4, String var5) {
         this.bounds = var3;
         this.name = var4;
         this.nameWidth = RenderUtil.a(var4);
         this.arrow = var5;
         this.arrowWidth = RenderUtil.a(var5);
      }

      private String getText(KeystrokeMod.f var1) {
         switch(this.getDisplayMode(var1)) {
            case NAMES:
               return this.name;
            case ARROWS:
               return this.arrow;
            default:
               return null;
         }
      }

      private int getTextWidth(KeystrokeMod.f var1) {
         switch(this.getDisplayMode(var1)) {
            case NAMES:
               return this.nameWidth;
            case ARROWS:
               return this.arrowWidth;
            default:
               return 0;
         }
      }

      private KeystrokeMod.f.b getDisplayMode(KeystrokeMod.f var1) {
         switch(this) {
            case FORWARD:
            case LEFT:
            case BACK:
            case RIGHT:
               return var1.l;
            case JUMP:
               return var1.k;
            case ATTACK:
            case USE:
               return var1.j;
            default:
               throw new AssertionError();
         }
      }
   }

   @HUDConfig(
      a = 35.0,
      b = 75.0
   )
   public static class f extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Keystrokes");
      @ModConfigAnnotation(
         a = "clicksDisplayMode",
         b = "Clicks Display Mode",
         c = "names",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public KeystrokeMod.f.b j;
      @ModConfigAnnotation(
         a = "jumpDisplayMode",
         b = "Jump Display Mode",
         c = "arrows",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public KeystrokeMod.f.b k;
      @ModConfigAnnotation(
         a = "keysDisplayMode",
         b = "Keys Display Mode",
         c = "names",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public KeystrokeMod.f.b l;
      @ModConfigAnnotation(
         a = "fadeTime",
         b = "Fade Time",
         c = "300",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      @DoubleRange(
         a = 2500.0
      )
      public double m;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh n = new eh("CPS");
      @ModConfigAnnotation(
         a = "cpsDisplayMode",
         b = "Display Mode",
         c = "separate",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public KeystrokeMod.f.a o;
      @ModConfigAnnotation(
         a = "cpsDigits",
         b = "Digits",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      @IntegerRange(
         a = 2
      )
      public int p = 0;
      @ModConfigAnnotation(
         a = "cpsReversed",
         b = "Reversed Text",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean q;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh r = new eh("Colors");
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background",
         c = "7/7/7/146",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public Color s;
      @ModConfigAnnotation(
         a = "backgroundActiveColor",
         b = "Background Active",
         c = "255/255/255/53",
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public Color t;
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text",
         c = "false/255/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      public ChromaColor u;
      @ModConfigAnnotation(
         a = "textActiveColor",
         b = "Text Active",
         c = "false/0/145/237",
         e = @ModConfigValueAnnotation(
   a = 24
)
      )
      public ChromaColor v;

      public static enum a {
         @dw(
            a = "none",
            b = "None"
         )
         NONE,
         @dw(
            a = "withClicks",
            b = "With Clicks"
         )
         WITH_CLICKS,
         @dw(
            a = "separate",
            b = "Separate"
         )
         SEPARATE;
      }

      public static enum b {
         @dw(
            a = "none",
            b = "None"
         )
         NONE,
         @dw(
            a = "names",
            b = "Names"
         )
         NAMES,
         @dw(
            a = "arrows",
            b = "Arrows"
         )
         ARROWS;
      }
   }
}
