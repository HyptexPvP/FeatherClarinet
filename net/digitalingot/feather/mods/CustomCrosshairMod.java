package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.ae;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.fs;
import net.digitalingot.feather.ft;
import net.digitalingot.feather.fu;
import net.digitalingot.feather.fv;
import net.digitalingot.feather.fx;
import net.digitalingot.feather.fy;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.RenderEVent;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.CrosshairRender;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@FeatherModule(
   a = ModsConfig.CROSSHAIR,
   b = @dn(
   a = "Custom Crosshair",
   b = "https://assets.feathercdn.net/game/mods/crosshair.svg",
   c = "Customize your crosshair",
   d = {ModsConponment.Category.PVP}
)
)
public class CustomCrosshairMod extends Mod<CustomCrosshairMod.a> {
   private ft a = null;

   @Override
   public void f() {
      RenderEVent.a.a((var1, var2) -> {
         if (this.m() && var2 == RenderEVent.c.CROSSHAIRS) {
            RenderUtil.u();
            Minecraft var3 = Minecraft.func_71410_x();
            float var4 = (float)hp.g();
            int var5 = hp.c() / 2;
            int var6 = hp.d() / 2;
            RenderUtil.c(1.0F / var4, 1.0F / var4, 1.0F / var4);
            Color var7 = this.b.i.c();
            int var8 = this.b.d;
            if (this.b.i.b()) {
               var7 = new Color(hH.a().c());
            }

            EntityPlayerSP var9 = var3.field_71439_g;
            if (!var9.func_175149_v()) {
               ItemStack var10 = var9.func_70694_bm();
               if (var10 != null) {
                  int var11 = var9.func_71052_bv();
                  if (var10.func_77973_b() == Items.field_151031_f) {
                     float var12 = (float)(var10.func_77973_b().func_77626_a(var10) - var11) / 20.0F;
                     if (var11 == 0 || var12 > 1.0F) {
                        var12 = 1.0F;
                     }

                     var8 = this.b.d + (int)((1.0F - var12) * (float)(this.b.d + 5) * 2.0F);
                  }
               }
            }

            this.a().a(this.b, var5, var6, var8, var7);
            if (this.b.k && this.b.b != CustomCrosshairMod.a.a.DEFAULT) {
               this.a(var5, var6);
            }

            RenderUtil.j();
            RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
            RenderUtil.v();
            return ae.FAIL;
         } else {
            return ae.PASS;
         }
      });
   }

   @Override
   public void i() {
      this.a = null;
   }

   private ft a() {
      if (this.a == null) {
         switch(this.b.b) {
            case CROSS:
               this.a = new CrosshairRender();
               break;
            case CIRCLE:
               this.a = new fv();
               break;
            case SQUARE:
               this.a = new fy();
               break;
            case ARROW:
               this.a = new fu();
               break;
            case DEFAULT:
               this.a = new fx();
               break;
            default:
               throw new IllegalStateException();
         }
      }

      return this.a;
   }

   private void a(int var1, int var2) {
      int var3 = this.b.e / 2;
      int var4 = (this.b.e + 1) / 2;
      if (this.b.n) {
         fs.a(var1 - var3 - this.b.o, var2 - var3 - this.b.o, var1 + var4 + this.b.o, var2 + var4 + this.b.o, this.b.p);
      }

      fs.a(var1 - var3, var2 - var3, var1 + var4, var2 + var4, this.b.i.b() ? new Color(hH.a().c(), true) : this.b.l);
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Crosshair");
      @ModConfigAnnotation(
         a = "type",
         b = "Type",
         c = "cross",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public CustomCrosshairMod.a.a b;
      @ModConfigAnnotation(
         a = "size",
         b = "Size",
         c = "5",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      @IntegerRange(
         a = 50
      )
      public int c;
      @ModConfigAnnotation(
         a = "gap",
         b = "Gap",
         c = "3",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      @IntegerRange(
         a = 50
      )
      public int d;
      @ModConfigAnnotation(
         a = "thickness",
         b = "Thickness",
         c = "1",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      @IntegerRange(
         b = 1,
         a = 50
      )
      public int e;
      @ModConfigAnnotation(
         a = "color",
         b = "Color",
         c = "false/255/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 5
)
      )
      public ChromaColor i;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh j = new eh("Dot");
      @ModConfigAnnotation(
         a = "dot",
         b = "Dot",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean k;
      @ModConfigAnnotation(
         a = "dotColor",
         b = "Dot Color",
         c = "255/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color l;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh m = new eh("Outline");
      @ModConfigAnnotation(
         a = "outline",
         b = "Outline",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean n;
      @ModConfigAnnotation(
         a = "outlineThickness",
         b = "Thickness",
         c = "1",
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      @IntegerRange(
         b = 1,
         a = 50
      )
      public int o;
      @ModConfigAnnotation(
         a = "outlineColor",
         b = "Color",
         c = "0/0/0/255",
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      public Color p;

      public static enum a {
         @dw(
            a = "cross",
            b = "Cross"
         )
         CROSS,
         @dw(
            a = "circle",
            b = "Circle"
         )
         CIRCLE,
         @dw(
            a = "square",
            b = "Square"
         )
         SQUARE,
         @dw(
            a = "default",
            b = "Default"
         )
         DEFAULT,
         @dw(
            a = "arrow",
            b = "Arrow"
         )
         ARROW;
      }
   }
}
