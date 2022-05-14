package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.ae;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.g;
import net.digitalingot.feather.gi;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.if;
import net.digitalingot.feather.iu;
import net.digitalingot.feather.ix;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.ItemStackRender;
import net.digitalingot.feather.event.RenderEVent;
import net.digitalingot.feather.event.TooltipEvent;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mixin.core.IMixinAbstractGui;
import net.digitalingot.feather.mixin.core.IMixinFoodStats;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;

@FeatherModule(
   a = ModsConfig.SATURATION,
   b = @dn(
   a = "Saturation",
   b = "https://assets.feathercdn.net/game/mods/saturation.svg",
   c = "",
   d = {}
)
)
public class SaturationMod extends Mod<SaturationMod.a> {
   private static final int a = 3;
   private static final int c = -3;
   private static final int d = 3;
   private static final int e = ix.b(16).b();
   private static final int f = ix.b(10016).b();
   private static final Potion g = Potion.func_180142_b("hunger");
   private final ResourceLocation h = new ResourceLocation("feather:textures/saturation.png");
   private float i = 0.0F;

   @Override
   public void f() {
      TooltipEvent.a
         .a(
            (var1, var2) -> {
               if (this.m()) {
                  if (var1 != null) {
                     SaturationMod.a.a var3 = this.b.c;
                     if (var3 != SaturationMod.a.a.NEVER
                        && (var3 != SaturationMod.a.a.SHIFT_ONLY || net.digitalingot.feather.g.a(e) || net.digitalingot.feather.g.a(f))) {
                        if (var1.func_77973_b() instanceof ItemFood) {
                           var2.add("           ");
                           var2.add("           ");
                        }
                     }
                  }
               }
            }
         );
      ItemStackRender.a
         .a(
            (var1, var2, var3, var4, var5) -> {
               if (this.m()) {
                  if (var1 != null) {
                     SaturationMod.a.a var6 = this.b.c;
                     if (var6 != SaturationMod.a.a.NEVER && var6 != SaturationMod.a.a.SHIFT_ONLY || iu.a(ix.b(16).b()) || iu.a(ix.b(10016).b())) {
                        Minecraft var7 = Minecraft.func_71410_x();
                        GuiScreen var8 = var7.field_71462_r;
                        if (var8 != null) {
                           if (var1.func_77973_b() instanceof ItemFood) {
                              int var9 = var4 - 6;
                              int var10 = var5 - 26;
                              gi.a var11 = gi.a(var1);
                              gi.a var12 = gi.b(var1);
                              if (!var11.equals(var12) || var11.a != 0) {
                                 int var13 = Math.max(var11.a, var12.a);
                                 float var14 = Math.max(var11.a(), var12.a());
                                 int var15 = (int)Math.ceil((double)((float)Math.abs(var13) / 2.0F));
                                 boolean var16 = var15 > 10;
                                 String var17 = var16 ? (var13 < 0 ? -1 : 1) * var15 + "x " : null;
                                 if (var16) {
                                    var15 = 1;
                                 }
      
                                 int var18 = (int)Math.max(1.0, Math.ceil((double)(Math.abs(var14) / 2.0F)));
                                 boolean var19 = var18 > 10;
                                 String var20 = var19 ? (var14 < 0.0F ? -1 : 1) * var18 + "x " : null;
                                 if (var19) {
                                    var18 = 1;
                                 }
      
                                 int var21 = var3 + var10 + 1 + 3;
                                 int var22 = var2 + var9 + 1 + 3;
                                 int var23 = hp.f();
                                 boolean var24 = var21 + 20 < var23 - 3;
                                 int var25 = var22 - 3;
                                 int var26 = var24 ? var21 : var3 - 20 + -3;
                                 int var27 = var26 + 19;
                                 RenderUtil.d();
                                 RenderUtil.f();
                                 int var28 = var25 - 2;
                                 int var29 = var28;
                                 int var30 = var27 - 18;
                                 RenderUtil.a(0, Gui.field_110324_m);
      
                                 for(int var31 = 0; var31 < var15 * 2; var31 += 2) {
                                    var28 -= 9;
                                    if (var12.a < 0) {
                                       if.a(var28, var30, 34, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    } else if (var12.a > var11.a && var11.a <= var31) {
                                       if.a(var28, var30, 133, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    } else if (var12.a > var31 + 1 || var11.a == var12.a) {
                                       if.a(var28, var30, 16, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    } else if (var12.a == var31 + 1) {
                                       if.a(var28, var30, 124, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    } else {
                                       if.a(var28, var30, 34, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    }
      
                                    RenderUtil.a(1.0F, 1.0F, 1.0F, 0.25F);
                                    if.a(var28, var30, var11.a - 1 == var31 ? 115 : 106, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
                                    if (var12.a > var31) {
                                       if.a(var28, var30, var12.a - 1 == var31 ? 61 : 52, 27, 9, 9, (float)((int)((IMixinAbstractGui)var8).getBlitOffset()));
                                    }
                                 }
      
                                 if (var17 != null) {
                                    RenderUtil.u();
                                    RenderUtil.b(0.75, 0.75, 0.75);
                                    hH.b()
                                       .func_175065_a(
                                          var17,
                                          (float)var28 * 4.0F / 3.0F - (float)var7.field_71466_p.func_78256_a(var17) + 2.0F,
                                          (float)var30 * 4.0F / 3.0F + 2.0F,
                                          -2236963,
                                          true
                                       );
                                    RenderUtil.v();
                                 }
      
                                 var30 += 10;
                                 var28 = var29;
                                 float var38 = var12.a();
                                 float var32 = Math.abs(var38);
                                 RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
                                 RenderUtil.a(0, this.a());
      
                                 for(int var33 = 0; var33 < var18 * 2; var33 += 2) {
                                    float var34 = (var32 - (float)var33) / 2.0F;
                                    var28 -= 6;
                                    boolean var35 = var32 <= (float)var33;
                                    if (var35) {
                                       RenderUtil.a(1.0F, 1.0F, 1.0F, 0.5F);
                                    }
      
                                    if.a(
                                       var28,
                                       var30,
                                       var34 >= 1.0F ? 21 : ((double)var34 > 0.5 ? 14 : ((double)var34 > 0.25 ? 7 : (var34 > 0.0F ? 0 : 28))),
                                       this.b.o ? 34 : 27,
                                       7,
                                       7,
                                       (float)((int)((IMixinAbstractGui)var8).getBlitOffset())
                                    );
                                    if (var35) {
                                       RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
                                    }
                                 }
      
                                 if (var20 != null) {
                                    RenderUtil.u();
                                    RenderUtil.b(0.75, 0.75, 0.75);
                                    hH.b()
                                       .func_175065_a(
                                          var20,
                                          (float)var28 * 4.0F / 3.0F - (float)var7.field_71466_p.func_78256_a(var20) + 2.0F,
                                          (float)var30 * 4.0F / 3.0F + 1.0F,
                                          -2236963,
                                          true
                                       );
                                    RenderUtil.v();
                                 }
      
                                 RenderUtil.j();
                                 RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
                                 RenderHelper.func_74518_a();
                                 RenderUtil.d();
                                 RenderUtil.f();
                              }
                           }
                        }
                     }
                  }
               }
            }
         );
      Events.a.a(var1 -> {
         if (this.m()) {
            if (var1 == Events.c.START) {
               int var2 = 15000 / this.b.b;
               float var3 = (float)(System.currentTimeMillis() % (long)var2) * 1.0F / (float)var2;
               this.i = var3 < 0.66F ? var3 * 3.0F : 3.0F - var3 * 3.0F;
            }
         }
      });
      RenderEVent.a.a((var1, var2) -> {
         if (!this.m()) {
            return ae.PASS;
         } else if (this.b.i && var2 == RenderEVent.c.FOOD) {
            Minecraft var3 = Minecraft.func_71410_x();
            FoodStats var4 = var3.field_71439_g.func_71024_bL();
            int var5 = hp.e() / 2 + 91;
            int var6 = hp.f() - 39;
            this.a(((IMixinFoodStats)var4).getFoodExhaustionLevel(), var5, var6);
            return ae.PASS;
         } else {
            return ae.PASS;
         }
      });
      RenderEVent.b.a((var1, var2) -> {
         if (this.m()) {
            if (var2 == RenderEVent.c.FOOD) {
               Minecraft var3 = Minecraft.func_71410_x();
               EntityPlayerSP var4 = var3.field_71439_g;
               if (!var4.field_71075_bZ.field_75098_d) {
                  ItemStack var5 = var4.func_70694_bm();
                  FoodStats var6 = var4.func_71024_bL();
                  int var7 = hp.e() / 2 + 91;
                  int var8 = hp.f() - 39;
                  if (this.b.r) {
                     this.a(0.0F, var6.func_75115_e(), var3, var7, var8, 1.0F, this.b.n);
                  }

                  if (var5 != null && var5.func_77973_b() instanceof ItemFood) {
                     gi.a var9 = gi.b(var5);
                     if (this.b.k) {
                        this.a(var9.a, var6.func_75116_a(), var3, var7, var8, this.i);
                     }

                     if (this.b.q) {
                        int var10 = var6.func_75116_a() + var9.a;
                        float var11 = var6.func_75115_e() + var9.a();
                        float var12 = var11 > (float)var10 ? (float)var10 - var6.func_75115_e() : var9.a();
                        this.a(var12, var6.func_75115_e(), var3, var7, var8, this.i, this.b.m);
                     }

                  } else {
                     this.i = 0.0F;
                  }
               }
            }
         }
      });
   }

   public void a(float var1, int var2, int var3) {
      Minecraft var4 = Minecraft.func_71410_x();
      RenderUtil.b();
      RenderUtil.a(
         (float)((double)this.b.e.getRed() / 255.0),
         (float)((double)this.b.e.getGreen() / 255.0),
         (float)((double)this.b.e.getBlue() / 255.0),
         (float)((double)this.b.e.getAlpha() / 255.0)
      );
      RenderUtil.a(0, this.h);
      float var5 = 4.0F;
      float var6 = var1 / var5;
      int var7 = (int)(var6 * 81.0F);
      byte var8 = 9;
      GuiIngame var9 = var4.field_71456_v;
      if.a(var2 - var7, var3, 81 - var7, 18, var7, var8, (float)((int)((IMixinAbstractGui)var9).getBlitOffset()));
      RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderUtil.a(0, Gui.field_110324_m);
   }

   public void a(int var1, int var2, Minecraft var3, int var4, int var5, float var6) {
      if (var1 != 0) {
         int var7 = var2 / 2;
         int var8 = (int)Math.ceil((double)((float)Math.min(20, var2 + var1) / 2.0F));
         int var9 = var8 - var7;
         RenderUtil.a(0, Gui.field_110324_m);
         this.a(var6);

         for(int var10 = var7; var10 < var7 + var9; ++var10) {
            int var11 = var10 * 2 + 1;
            float var12 = (float)(var4 - var10 * 8 - 9);
            int var13 = 16;
            byte var14 = 13;
            if (var3.field_71439_g.func_70644_a(g)) {
               var13 += 36;
               var14 = 13;
            }

            GuiIngame var15 = var3.field_71456_v;
            if.a((int)var12, var5, 16 + var14 * 9, 27, 9, 9, (float)((int)((IMixinAbstractGui)var15).getBlitOffset()));
            int var16 = var13 + (var11 < var2 + var1 ? 36 : 45);
            if.a((int)var12, var5, var16, 27, 9, 9, (float)((int)((IMixinAbstractGui)var15).getBlitOffset()));
         }

         this.b(var6);
      }
   }

   public void a(float var1, float var2, Minecraft var3, int var4, int var5, float var6, boolean var7) {
      if (!(var2 + var1 < 0.0F)) {
         int var8 = var1 != 0.0F ? Math.max(0, (int)var2 / 2) : 0;
         int var9 = (int)Math.ceil((double)(Math.min(20.0F, var2 + var1) / 2.0F));
         int var10 = var9 - var8;
         RenderUtil.a(0, this.h);
         this.a(var6);
         int var11 = var7 ? 9 : 0;

         for(int var12 = var8; var12 < var8 + var10; ++var12) {
            int var13 = var4 - var12 * 8 - 9;
            float var14 = (var2 + var1) / 2.0F - (float)var12;
            GuiIngame var15 = var3.field_71456_v;
            if (var14 >= 1.0F) {
               if.a(var13, var5, 27, var11, 9, 9, (float)((int)((IMixinAbstractGui)var15).getBlitOffset()));
            } else if ((double)var14 > 0.5) {
               if.a(var13, var5, 18, var11, 9, 9, (float)((int)((IMixinAbstractGui)var15).getBlitOffset()));
            } else if ((double)var14 > 0.25) {
               if.a(var13, var5, 9, var11, 9, 9, (float)((int)((IMixinAbstractGui)var15).getBlitOffset()));
            } else if (var14 > 0.0F) {
               if.a(var13, var5, 0, var11, 9, 9, (float)((int)((IMixinAbstractGui)var15).getBlitOffset()));
            }
         }

         this.b(var6);
         RenderUtil.a(0, Gui.field_110324_m);
      }
   }

   public void a(float var1) {
      RenderUtil.i();
      if (var1 != 1.0F) {
         RenderUtil.a(1.0F, 1.0F, 1.0F, var1);
         RenderUtil.a(770, 771);
      }
   }

   public void b(float var1) {
      RenderUtil.j();
      if (var1 != 1.0F) {
         RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   public ResourceLocation a() {
      return this.h;
   }

   @dt(
      a = true
   )
   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("General");
      @ModConfigAnnotation(
         a = "animationSpeed",
         b = "Animation Speed",
         c = "10",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         b = 1,
         a = 25
      )
      public int b;
      @ModConfigAnnotation(
         a = "tooltipFoodValues",
         b = "Tooltip Food Values",
         c = "shiftOnly",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public SaturationMod.a.a c;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh d = new eh("Food Exhaustion");
      @ModConfigAnnotation(
         a = "foodExhaustionColor",
         b = "Color",
         c = "128/128/128",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public Color e;
      @ModConfigAnnotation(
         a = "foodExhaustionUnderlay",
         b = "Underlay",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public boolean i;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh j = new eh("Food Gain");
      @ModConfigAnnotation(
         a = "foodGainOverlay",
         b = "Gain Overlay",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean k;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh l = new eh("Red Saturation");
      @ModConfigAnnotation(
         a = "redSaturationGainOverlay",
         b = "Gain Overlay",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean m;
      @ModConfigAnnotation(
         a = "redSaturationOverlay",
         b = "Overlay",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      public boolean n;
      @ModConfigAnnotation(
         a = "redTooltipSaturation",
         b = "Tooltip Saturation",
         e = @ModConfigValueAnnotation(
   a = 33
)
      )
      public boolean o;
      @ModConfigValueAnnotation(
         a = 40
      )
      public eh p = new eh("Saturation");
      @ModConfigAnnotation(
         a = "saturationGainOverlay",
         b = "Gain Overlay",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 41
)
      )
      public boolean q;
      @ModConfigAnnotation(
         a = "saturationOverlay",
         b = "Overlay",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 42
)
      )
      public boolean r;

      public static enum a {
         @dw(
            a = "never",
            b = "Never"
         )
         NEVER,
         @dw(
            a = "shiftOnly",
            b = "Shift Only"
         )
         SHIFT_ONLY,
         @dw(
            a = "always",
            b = "Always"
         )
         ALWAYS;
      }
   }
}
