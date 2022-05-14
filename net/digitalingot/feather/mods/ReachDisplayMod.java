package net.digitalingot.feather.mods;

import java.awt.Color;
import java.text.DecimalFormat;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.AttackEvent;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.IntUtil;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

@FeatherModule(
   a = ModsConfig.REACH_DISPLAY,
   b = @dn(
   a = "Reach Display",
   b = "https://assets.feathercdn.net/game/mods/reachdisplay.svg",
   c = "Distance distance when hitting a player",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class ReachDisplayMod extends HUDMod<ReachDisplayMod.a> {
   private static final long c = 2000L;
   private static final float d = 4.777F;
   private static final float e = 0.3239F;
   private static final float f = 0.0F;
   private static final String g = "No hit";
   private static final int h = 10;
   private static final Minecraft i = Minecraft.func_71410_x();
   private final DecimalFormat j = IntUtil.a("#.# blocks");
   private long k;
   private float l = 0.0F;
   private int m;
   private int n;
   private String o;
   private float p;
   private float q;

   @Override
   public void f() {
      AttackEvent.a.a((var1, var2) -> {
         if (this.m()) {
            if (i.field_71476_x != null) {
               if (i.field_71476_x.field_72313_a == MovingObjectType.ENTITY) {
                  if (i.field_71476_x.field_72308_g != null) {
                     Entity var3 = i.field_71476_x.field_72308_g;
                     Vec3 var4 = i.field_71476_x.field_72307_f;
                     if (var2.func_145782_y() == var3.func_145782_y()) {
                        Entity var5 = i.func_175606_aa();
                        Vec3 var6 = var5.func_174824_e(1.0F);
                        float var7 = (float)var4.func_72438_d(var6);
                        this.k = System.currentTimeMillis();
                        this.l = var7;
                        this.o();
                     }
                  }
               }
            }
         }
      });
      Events.a.a(var1 -> {
         if (var1 == Events.c.END && i.field_71439_g != null && this.m()) {
            if (this.l != 0.0F && System.currentTimeMillis() > this.k + 2000L) {
               this.l = 0.0F;
               this.o();
            }

         }
      });
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      this.a.b(var2, 0, 0, this.n, this.m, this.b.l.getRGB());
      ChromaColor var3 = this.b.m;
      this.a.a(var2, this.o, this.p, this.q, var3.a(), this.b.n, var3.b());
   }

   @Override
   public void i() {
      IntUtil.a(this.j, this.b.j);
      this.n = RenderUtil.a(this.j.format(4.777F)) + 10;
      this.m = Math.round((float)this.n * 0.3239F);
      this.o();
      this.q = ((float)this.m - RenderUtil.b(this.b.n)) / 2.0F;
   }

   private void o() {
      if (this.l == 0.0F) {
         this.o = "No hit";
      } else {
         this.o = this.j.format((double)this.l);
      }

      int var1 = RenderUtil.a(this.o);
      this.p = (float)(this.n - var1) / 2.0F;
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public int b() {
      return this.n;
   }

   @HUDConfig(
      d = true,
      e = true
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Reach Display");
      @ModConfigAnnotation(
         a = "digits",
         b = "Digits",
         c = "1",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         a = 3
      )
      public int j;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh k = new eh("Style");
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background",
         c = "7/7/7/146",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public Color l;
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text",
         c = "false/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public ChromaColor m;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean n;

      @Override
      public double c() {
         return (double)(RenderUtil.a("0.0") + 2) / 2.0;
      }

      @Override
      public double d() {
         return 6.0;
      }
   }
}
