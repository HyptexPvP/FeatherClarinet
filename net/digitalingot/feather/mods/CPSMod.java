package net.digitalingot.feather.mods;

import java.awt.Color;
import java.text.DecimalFormat;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.fP;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.IntUtil;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;

@FeatherModule(
   a = ModsConfig.CPS,
   b = @dn(
   a = "CPS",
   b = "https://assets.feathercdn.net/game/mods/cps.svg",
   c = "",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class CPSMod extends HUDMod<CPSMod.a> implements fP.a {
   private static final int c = 59;
   private static final int d = 19;
   private static final String e = " | ";
   private static final int f = RenderUtil.a(" | ");
   private final fP g = new fP(this, this);
   private final DecimalFormat h = IntUtil.a("#.#");
   private String i;
   private int j;
   private String k;
   private float l;
   private float m;
   private int n;
   private int o;

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      if (this.b.n == HUDPosition.a.BACKGROUND) {
         this.a.b(var2, 0, 0, this.n, this.o, this.b.o.getRGB());
      }

      float var3 = this.l;
      if (this.i != null) {
         this.a.a(var2, this.i, var3, this.m, this.b.p, this.b.r);
         var3 += (float)this.j;
         this.a.a(var2, " | ", var3, this.m, this.b.q, this.b.r);
         var3 += (float)f;
      }

      this.a.a(var2, this.k, var3, this.m, this.b.p, this.b.r);
   }

   @Override
   public void i() {
      IntUtil.a(this.h, this.b.j);
      if (this.b.n == HUDPosition.a.BACKGROUND) {
         this.o = 19;
         this.n = 59;
      } else {
         this.o = Math.round(RenderUtil.b(this.b.r));
         if (this.b.k) {
            this.n = RenderUtil.a("0 | 0 CPS");
         } else {
            this.n = RenderUtil.a("0 CPS");
         }

         if (this.b.n == HUDPosition.a.BRACKETS) {
            this.n += RenderUtil.a("[]");
         }
      }

      this.o();
      this.m = ((float)this.o - RenderUtil.b(this.b.r)) / 2.0F;
   }

   private void o() {
      StringBuilder var1 = new StringBuilder();
      if (this.b.n == HUDPosition.a.BRACKETS) {
         var1.append('[');
      }

      var1.append(this.h.format(this.g.a()));
      if (this.b.k) {
         this.i = var1.toString();
         this.j = RenderUtil.a(this.i);
         var1 = new StringBuilder();
         var1.append(this.h.format(this.g.b()));
      } else {
         this.i = null;
         this.j = 0;
      }

      if (this.b.l) {
         var1.append(" CPS");
      }

      if (this.b.n == HUDPosition.a.BRACKETS) {
         var1.append(']');
      }

      this.k = var1.toString();
      int var2 = RenderUtil.a(this.k);
      int var3 = var2 + (this.i != null ? f + this.j : 0);
      this.l = (float)(this.n - var3) / 2.0F;
   }

   @Override
   public int a() {
      return this.o;
   }

   @Override
   public int b() {
      return this.n;
   }

   @Override
   public void a(double var1, double var3) {
      if (var1 != 0.0 || var3 != 0.0 && this.b.k) {
         this.o();
      }
   }

   @HUDConfig(
      d = true,
      b = 12.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("CPS");
      @ModConfigAnnotation(
         a = "digits",
         b = "Digits",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         a = 2
      )
      public int j;
      @ModConfigAnnotation(
         a = "right",
         b = "Right",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean k;
      @ModConfigAnnotation(
         a = "showCPSText",
         b = "Show CPS Text",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      public boolean l;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh m = new eh("Style");
      @ModConfigAnnotation(
         a = "displayMode",
         b = "Display Mode",
         c = "background",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public HUDPosition.a n;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background Color",
         c = "7/7/7/146",
         d = @dB(
   a = "displayMode",
   b = {"background"}
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color o;
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text Color",
         c = "false/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public ChromaColor p;
      @ModConfigAnnotation(
         a = "lineColor",
         b = "Line Color",
         c = "false/0/0/0",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      public ChromaColor q;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 15
)
      )
      public boolean r;

      @Override
      public double c() {
         return (double)hp.c() / hp.g() / 2.0;
      }
   }
}
