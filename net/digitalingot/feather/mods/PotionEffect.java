package net.digitalingot.feather.mods;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.io;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.util.StringUtils;

@FeatherModule(
   a = ModsConfig.POTION_EFFECTS,
   b = @dn(
   a = "Potion Effects",
   b = "https://assets.feathercdn.net/game/mods/potioneffects.svg",
   c = "Display potion effects",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class PotionEffect extends HUDMod<PotionEffect.a> {
   private static final ResourceLocation c = new ResourceLocation("minecraft:textures/gui/container/inventory.png");
   private static final List<net.minecraft.potion.PotionEffect> d = Lists.newArrayList(
      new net.minecraft.potion.PotionEffect[]{a(1, 1000, 1), a(2, 2456, 7), a(3, 8456, 12), a(4, 12456, 6), a(5, 45456, 17)}
   );
   private final Set<Integer> e = Sets.newHashSet(new Integer[]{9, 12, 13, 14, 15, 16});

   private static net.minecraft.potion.PotionEffect a(int var0, int var1, int var2) {
      return new net.minecraft.potion.PotionEffect(var0, var1, var2);
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      switch(var1) {
         case HUD_OVERLAY:
            this.a(var2);
            return;
         case MOD_LAYOUT:
            this.b(var2);
            return;
      }
   }

   private void a(MatrixUtils var1) {
      this.a(var1, Minecraft.func_71410_x().field_71439_g.func_70651_bq());
   }

   private void b(MatrixUtils var1) {
      this.a(var1, d);
   }

   @Override
   public int a() {
      return 5 * (this.b.o ? 33 : 20);
   }

   @Override
   public int b() {
      return !this.b.o && !this.b.q ? 50 : 120;
   }

   public boolean o() {
      return this.m() && this.b.s;
   }

   public String a(String var1) {
      char[] var2 = var1.toCharArray();
      boolean var3 = true;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var2[var5];
         if (var6 == ' ') {
            var3 = true;
         } else if (var3) {
            var2[var5] = Character.toUpperCase(var6);
            var3 = false;
         }
      }

      return new String(var2);
   }

   private void a(MatrixUtils var1, Collection<net.minecraft.potion.PotionEffect> var2) {
      if (!((Collection)var2).isEmpty()) {
         int var3 = this.b.o ? 33 : (this.b.q ? 20 : 18);
         if (((Collection)var2).size() > 5 && this.b.o) {
            var3 = 132 / (((Collection)var2).size() - 1);
         }

         int var4 = 0;
         if (this.b.i) {
            var4 = this.a() - var3;
            var3 = -var3;
            ArrayList var21 = new ArrayList((Collection)var2);
            var2 = Lists.reverse((List)var21);
         }

         for(net.minecraft.potion.PotionEffect var6 : var2) {
            Potion var7 = Potion.field_76425_a[var6.func_76456_a()];
            String var8 = var7.func_76393_a();
            int var9 = var6.func_76459_b();
            boolean var10 = var6.func_100011_g();
            String var11;
            if (var10) {
               var11 = "**:**";
            } else {
               var11 = StringUtils.func_76337_a(var9);
            }

            RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
            RenderUtil.a(0, c);
            StringBuilder var12 = new StringBuilder();
            if (this.b.q) {
               var12.append(this.a(StatCollector.func_74838_a(var8)));
               int var13 = var7.func_76396_c();
               if (!this.e.contains(var13)) {
                  var12.append(" ").append(io.a(var6.func_76458_c() + 1));
               }
            }

            String var22 = var12.toString();
            if (this.b.o) {
               this.a.b(var1, 0, var4, 0, 166, 140, 32);
            }

            boolean var14 = var7.func_76400_d();
            int var15 = var7.func_76392_e();
            int var16 = var15 % 8 * 18;
            int var17 = 198 + var15 / 8 * 18;
            if (!this.b.j) {
               if (var14) {
                  int var23 = this.b.o ? 6 : 0;
                  int var26 = var4 + (this.b.o ? 7 : 0);
                  this.a.b(var1, var23, var26, var16, var17, 18, 18);
               }

               this.a.a(var1, var22, (float)((this.b.o ? 10 : 4) + 18), (float)(var4 + (this.b.o ? 6 : 0)), this.b.n, true);
               if (this.a(var6, var6.func_76459_b(), this.b.k)) {
                  this.a.a(var1, var11, (float)((this.b.o ? 10 : 4) + 18), (float)(var4 + (this.b.o ? 6 : 0) + (this.b.q ? 10 : 5)), this.b.m, true);
               }
            } else {
               int var18 = this.b() - 5;
               if (var14 && (!this.b.r || this.a(var6, var6.func_76459_b(), this.b.k))) {
                  int var19 = var18 + (this.b.o ? -24 : -18);
                  int var20 = var4 + (this.b.o ? 7 : 0);
                  this.a.b(var1, var19, var20, var16, var17, 18, 18);
               }

               int var24 = this.a.a(var22);
               this.a.a(var1, var22, (float)(var18 + (this.b.o ? -10 : -4) - 18 - var24), (float)(var4 + (this.b.o ? 6 : 0)), this.b.n, true);
               var24 = this.a.a(var11);
               if (this.a(var6, var6.func_76459_b(), this.b.k)) {
                  this.a
                     .a(
                        var1,
                        var11,
                        (float)(var18 + (this.b.o ? -10 : -4) - 18 - var24),
                        (float)(var4 + (this.b.o ? 6 : 0) + (this.b.q ? 10 : 2)),
                        this.b.m,
                        true
                     );
               }
            }

            var4 += var3;
         }

      }
   }

   private boolean a(net.minecraft.potion.PotionEffect var1, int var2, int var3) {
      if (!var1.func_82720_e() && var2 / 20 <= var3) {
         return var2 % 20 < 10;
      } else {
         return true;
      }
   }

   @HUDConfig(
      a = 300.0,
      b = 145.0
   )
   public static class a extends HUDPosition {
      @ModConfigAnnotation(
         a = "bottomToTop",
         b = "Bottom to Top",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public boolean i;
      @ModConfigAnnotation(
         a = "rightAlign",
         b = "Right Align",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean j;
      @ModConfigAnnotation(
         a = "durationBlinkSeconds",
         b = "Blink Duration (in seconds)",
         c = "10",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      @IntegerRange(
         b = 1,
         a = 60
      )
      public int k;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh l = new eh("Color");
      @ModConfigAnnotation(
         a = "durationColor",
         b = "Color Duration (in seconds)",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public ChromaColor m;
      @ModConfigAnnotation(
         a = "effectNameColor",
         b = "Color Effect Name",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public ChromaColor n;
      @ModConfigAnnotation(
         a = "enableBackground",
         b = "Background",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean o;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh p = new eh("Show");
      @ModConfigAnnotation(
         a = "enableEffectName",
         b = "Effect Name",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean q;
      @ModConfigAnnotation(
         a = "enableIconBlink",
         b = "Icon Blink",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public boolean r;
      @ModConfigAnnotation(
         a = "hideInventoryStatus",
         b = "Hide Inventory Status",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      public boolean s;
      @ModConfigAnnotation(
         a = "hideVanillaEffects",
         b = "Hide Vanilla Effects (1.12.2+)",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 24
)
      )
      public boolean t;
   }
}
