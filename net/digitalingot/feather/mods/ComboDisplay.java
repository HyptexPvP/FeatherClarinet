package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.event.AttackEvent;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.HurtEvent;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

@FeatherModule(
   a = ModsConfig.COMBO_DISPLAY,
   b = @dn(
   a = "Combo Display",
   b = "https://assets.feathercdn.net/game/mods/combodisplay.svg",
   c = "Display number of consecutive hits",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class ComboDisplay extends HUDMod<ComboDisplay.a> {
   private static final int c = 59;
   private static final int d = 19;
   private static final long e = 2000L;
   private static final long f = 500L;
   private static final Minecraft g = Minecraft.func_71410_x();
   private long h;
   private int i = 0;
   private int j;
   private String k;
   private float l;
   private float m;
   private int n;
   private int o;

   @Override
   public void f() {
      AttackEvent.a.a((var1, var2) -> {
         if (this.m() && var2 instanceof EntityPlayer) {
            if (g.field_71476_x != null) {
               if (g.field_71476_x.field_72313_a == MovingObjectType.ENTITY) {
                  if (g.field_71476_x.field_72308_g != null && g.field_71476_x.field_72308_g.func_145782_y() == var2.func_145782_y()) {
                     if (this.j != var2.func_145782_y()) {
                        this.i = 0;
                        this.o();
                     }

                     this.j = var2.func_145782_y();
                     this.h = System.currentTimeMillis();
                  }
               }
            }
         }
      });
      HurtEvent.a.a(var1 -> {
         if (this.m() && g.field_71439_g != null) {
            int var2 = var1.func_145782_y();
            if (var2 == g.field_71439_g.func_145782_y()) {
               this.i = 0;
               this.o();
            } else if (this.j == var2 && System.currentTimeMillis() - this.h < 500L) {
               ++this.i;
               this.o();
            }

         }
      });
      Events.a.a(var1 -> {
         if (var1 == Events.c.END && g.field_71439_g != null && this.m()) {
            if (System.currentTimeMillis() > this.h + 2000L) {
               this.i = 0;
               this.o();
            }

         }
      });
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      this.a.b(var2, 0, 0, 59, 19, this.b.j.getRGB());
      ChromaColor var3 = this.b.k;
      this.a.a(var2, this.k, this.l, this.m, var3.a(), this.b.l, var3.b());
   }

   private void o() {
      this.p();
   }

   @Override
   public int a() {
      return 19;
   }

   @Override
   public int b() {
      return 59;
   }

   @Override
   public void i() {
      this.p();
      this.m = (19.0F - RenderUtil.b(this.b.l)) / 2.0F;
   }

   private void p() {
      if (this.i == 0) {
         this.k = "No Combo";
      } else {
         this.k = this.b.i ? "Combo: " + this.i : this.i + " Combo";
      }

      this.l = (float)(59 - RenderUtil.a(this.k)) / 2.0F;
   }

   @HUDConfig(
      a = 33.0,
      b = 8.0
   )
   public static class a extends HUDPosition {
      @ModConfigAnnotation(
         a = "reversed",
         b = "Reversed",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public boolean i;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background Color",
         c = "7/7/7/146",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public Color j;
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text Color",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public ChromaColor k;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean l;
   }
}
