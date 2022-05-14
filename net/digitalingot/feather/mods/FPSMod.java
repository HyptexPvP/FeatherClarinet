package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.mixin.core.IMixinMinecraft;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;

@FeatherModule(
   a = ModsConfig.FPS,
   b = @dn(
   a = "FPS",
   b = "https://assets.feathercdn.net/game/mods/fps.svg",
   c = "Display your frames per second",
   d = {ModsConponment.Category.HUD}
)
)
public class FPSMod extends HUDMod<FPSMod.a> {
   private static final int c = 59;
   private static final int d = 19;
   private static final String e = "FPS: ";
   private static final String f = " FPS";
   private String g;
   private float h;
   private float i;
   private int j = 0;
   private int k;
   private int l;

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      this.o();
      if (this.b.l == HUDPosition.a.BACKGROUND) {
         this.a.b(var2, 0, 0, this.k, this.l, this.b.m.getRGB());
      }

      this.a.a(var2, this.g, this.h, this.i, this.b.n, this.b.o);
   }

   private void o() {
      int var1 = IMixinMinecraft.getFPS();
      this.a(var1);
      int var2 = b(var1);
      if (var2 != this.j) {
         this.p();
         this.j = var2;
      }

   }

   private void a(int var1) {
      StringBuilder var2 = new StringBuilder();
      if (this.b.l == HUDPosition.a.BRACKETS) {
         var2.append('[');
      }

      if (this.b.j) {
         var2.append("FPS: ");
      }

      var2.append(var1);
      if (!this.b.j) {
         var2.append(" FPS");
      }

      if (this.b.l == HUDPosition.a.BRACKETS) {
         var2.append(']');
      }

      this.g = var2.toString();
   }

   private void p() {
      this.h = (float)(this.k - RenderUtil.a(this.g)) / 2.0F;
   }

   private static int b(int var0) {
      if (var0 >= 10000) {
         return 5;
      } else if (var0 >= 1000) {
         return 4;
      } else if (var0 >= 100) {
         return 3;
      } else {
         return var0 >= 10 ? 2 : 1;
      }
   }

   @Override
   public int a() {
      return this.l;
   }

   @Override
   public int b() {
      return this.k;
   }

   @Override
   public void i() {
      if (this.b.l == HUDPosition.a.BACKGROUND) {
         this.l = 19;
         this.k = 59;
      } else {
         this.l = Math.round(RenderUtil.b(this.b.o));
         this.k = RenderUtil.a("9999 FPS");
         if (this.b.l == HUDPosition.a.BRACKETS) {
            this.k += RenderUtil.a("[]");
         }
      }

      this.i = ((float)this.l - RenderUtil.b(this.b.o)) / 2.0F;
      this.j = -1;
      this.o();
   }

   @HUDConfig(
      a = 33.0,
      b = 8.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("FPS");
      @ModConfigAnnotation(
         a = "reversed",
         b = "Reversed",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean j;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh k = new eh("Style");
      @ModConfigAnnotation(
         a = "displayMode",
         b = "Display Mode",
         c = "background",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public HUDPosition.a l;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background",
         c = "7/7/7/146",
         d = @dB(
   a = "displayMode",
   b = {"background"}
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color m;
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text",
         c = "false/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public ChromaColor n;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 14
)
      )
      public boolean o;
   }
}
