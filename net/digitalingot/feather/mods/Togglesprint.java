package net.digitalingot.feather.mods;

import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.components.TextLength;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

@FeatherModule(
   a = ModsConfig.TOGGLE_SPRINT,
   b = @dn(
   a = "Toggle Sprint",
   b = "https://assets.feathercdn.net/game/mods/togglesprint.svg",
   c = "Toggle your sprint and sneak key",
   d = {ModsConponment.Category.PVP}
)
)
public class Togglesprint extends HUDMod<Togglesprint.a> {
   private static final Minecraft c = Minecraft.func_71410_x();
   private static final KeyBinding d = c.field_71474_y.field_151444_V;
   private static final KeyBinding e = c.field_71474_y.field_74311_E;
   private boolean f;
   private boolean g;
   private boolean h;
   private boolean i;
   private int j;
   private int k;

   @Override
   public void f() {
      FeatherGUI.b.a((var1, var2, var3, var4) -> {
         if (this.m()) {
            if (c.field_71439_g != null) {
               if (c.field_71439_g != null) {
                  boolean var5 = c.field_71474_y.field_151444_V.func_151463_i() == var1;
                  if (var5 && var3 == 1 && c.field_71439_g.field_71075_bZ.field_75100_b) {
                     this.g = this.b.k && !this.g;
                     this.h = !this.h;
                  }

               }
            }
         }
      });
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      switch(var1) {
         case HUD_OVERLAY:
            this.a(var2);
            break;
         case MOD_LAYOUT:
            this.b(var2);
      }

   }

   private void a(MatrixUtils var1) {
      if (!e.func_151470_d()) {
         this.i = false;
      }

      if (this.b.k && d.func_151468_f()) {
         this.g = !this.g;
      } else if (this.b.j && e.func_151468_f() && !c.field_71439_g.field_71075_bZ.field_75100_b) {
         this.f = !this.f;
      }

      if (!this.b.p) {
         if (c.field_71439_g.func_70093_af()) {
            String var2 = c.field_71474_y.field_74311_E.func_151470_d() ? this.b.r : this.b.s;
            this.a.a(var1, var2, 2.0F, 1.0F, this.b.q, true);
         } else if (c.field_71439_g.func_70051_ag() || this.g) {
            String var3 = c.field_71474_y.field_151444_V.func_151470_d() ? this.b.t : (this.g ? this.b.u : this.b.v);
            this.a.a(var1, var3, 2.0F, 1.0F, this.b.q, true);
         }

      }
   }

   private void b(MatrixUtils var1) {
      this.a.a(var1, this.b.u, 2.0F, 1.0F, this.b.q, true);
   }

   @Override
   public void i() {
      if (!this.b.j) {
         this.f = false;
      }

      this.g = this.b.k;
      this.t();
   }

   @Override
   public int a() {
      return this.k;
   }

   @Override
   public int b() {
      return this.j;
   }

   @Override
   public void h() {
      this.g = false;
      this.f = false;
   }

   public boolean o() {
      return this.m() && this.g;
   }

   public boolean p() {
      return this.m() && this.f;
   }

   public void c(boolean var1) {
      this.f = var1;
   }

   public boolean q() {
      return !this.m() || !this.b.m;
   }

   public boolean r() {
      return this.h;
   }

   public int s() {
      return c.field_71439_g.field_71075_bZ.field_75098_d ? this.b.n : 1;
   }

   private void t() {
      this.j = RenderUtil.a(this.b.t);
      float var1 = 1.0F;
      float var2 = 7.0F;
      float var3 = 2.0F;
      this.k = Math.round(var1 + var2 + var3);
   }

   @HUDConfig(
      d = true,
      b = 15.0
   )
   @dt(
      a = true
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Toggle Sprint");
      @ModConfigAnnotation(
         a = "toggleSneak",
         b = "Toggle Sneak",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean j;
      @ModConfigAnnotation(
         a = "toggleSprint",
         b = "Toggle Sprint",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public boolean k;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh l = new eh("Fly");
      @ModConfigAnnotation(
         a = "blockSprintWhenFlying",
         b = "Block Sprint",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean m;
      @ModConfigAnnotation(
         a = "flyBoostAmount",
         b = "Boost Amount",
         c = "1",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      @IntegerRange(
         b = 1,
         a = 8
      )
      public int n;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh o = new eh("Text Settings");
      @ModConfigAnnotation(
         a = "hideText",
         b = "Hide Text",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "textColor",
         b = "Color",
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public ChromaColor q;
      @ModConfigAnnotation(
         a = "sneakingKeyHeldText",
         b = "Sneaking Held",
         c = "[Sneaking (Key Held)]",
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String r;
      @ModConfigAnnotation(
         a = "sneakingToggledText",
         b = "Sneaking Toggled",
         c = "[Sneaking (Toggled)]",
         e = @ModConfigValueAnnotation(
   a = 24
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String s;
      @ModConfigAnnotation(
         a = "sprintingKeyHeldText",
         b = "Sprinting Held",
         c = "[Sprinting (Key Held)]",
         e = @ModConfigValueAnnotation(
   a = 25
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String t;
      @ModConfigAnnotation(
         a = "sprintingToggledText",
         b = "Sprinting Toggled",
         c = "[Sprinting (Toggled)]",
         e = @ModConfigValueAnnotation(
   a = 26
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String u;
      @ModConfigAnnotation(
         a = "sprintingVanillaText",
         b = "Sprinting Vanilla",
         c = "[Sprinting (Vanilla)]",
         e = @ModConfigValueAnnotation(
   a = 27
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String v;

      @Override
      public double c() {
         return 70.0 + (double)hH.a().a("[Sprinting (Key Held)])") / 2.0;
      }
   }
}
