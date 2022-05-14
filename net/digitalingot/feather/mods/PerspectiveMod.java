package net.digitalingot.feather.mods;

import net.digitalingot.feather.ae;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.is;
import net.digitalingot.feather.event.OrientEvent;
import net.digitalingot.feather.event.PlayerEvent;
import net.digitalingot.feather.event.TurnEvent;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.PlayerUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;

@FeatherModule(
   a = ModsConfig.PERSPECTIVE,
   b = @dn(
   a = "Perspective",
   b = "https://assets.feathercdn.net/game/mods/perspective.svg",
   c = "Freelook",
   d = {}
)
)
public class PerspectiveMod extends Mod<PerspectiveMod.a> {
   private Minecraft a;
   private float c = 0.0F;
   private float d = 0.0F;
   private float e;
   private float f;
   private float g;
   private float h;
   private boolean i = false;
   private int j = 0;

   @Override
   public void f() {
      this.a = Minecraft.func_71410_x();
      PlayerEvent.b.a((var1, var2) -> {
         if (this.m()) {
            this.i = false;
         }
      });
      FeatherGUI.b.a((var1, var2, var3, var4) -> {
         if (this.m()) {
            GameSettings var5 = this.a.field_71474_y;
            if (this.b.a != null && this.b.a.c()[0] == var1) {
               boolean var6 = false;
               if (var3 == 1) {
                  this.i = !this.i;
                  EntityPlayerSP var7 = this.a.field_71439_g;
                  this.d = var7.field_70177_z;
                  this.c = var7.field_70125_A;
                  if (this.i) {
                     this.j = var5.field_74320_O;
                     var5.field_74320_O = 1;
                  } else {
                     var5.field_74320_O = this.j;
                  }

                  var6 = true;
               } else if (this.b.b && this.i) {
                  this.i = false;
                  var5.field_74320_O = this.j;
                  var6 = true;
               }

               if (var6) {
               }
            }

            boolean var8 = var5.field_151457_aa.func_151463_i() == var1;
            if (var8) {
               this.i = false;
            }

         }
      });
      TurnEvent.a.a((var1, var2) -> {
         if (!this.m()) {
            return ae.PASS;
         } else if (!this.i) {
            return ae.PASS;
         } else {
            boolean var3 = this.a.field_71474_y.field_74338_d;
            this.d += var1 * 0.15F;
            this.c += var2 * (var3 ? -0.15F : 0.15F);
            if (this.c < -90.0F) {
               this.c = -90.0F;
            }

            if (this.c > 90.0F) {
               this.c = 90.0F;
            }

            return ae.FAIL;
         }
      });
      OrientEvent.a.a(var1 -> {
         if (this.m()) {
            if (this.i) {
               this.h = var1.field_70177_z;
               this.e = var1.field_70125_A;
               this.g = var1.field_70126_B;
               this.f = var1.field_70127_C;
               PlayerUtil.b(var1, this.d);
               PlayerUtil.a(var1, this.c);
               var1.field_70126_B = this.d;
               var1.field_70127_C = this.c;
            }
         }
      });
      OrientEvent.b.a(var1 -> {
         if (this.m()) {
            if (this.i) {
               PlayerUtil.b(var1, this.h);
               PlayerUtil.a(var1, this.e);
               var1.field_70126_B = this.g;
               var1.field_70127_C = this.f;
               EntityPlayerSP var2 = this.a.field_71439_g;
               boolean var3 = var2.field_70701_bs == 0.0F;
               boolean var4 = var2.field_70702_br == 0.0F;
               if (var3 && var4 && !var2.field_71158_b.field_78901_c) {
                  var1.field_70167_r += 1.0E-6;
               }

            }
         }
      });
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "keyPerspective",
         b = "Perspective",
         c = "75",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public is a;
      @ModConfigAnnotation(
         a = "returnOnRelease",
         b = "Return on Release",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
   }
}
