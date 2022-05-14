package net.digitalingot.feather.mods;

import java.awt.Color;
import java.util.List;
import java.util.Map.Entry;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.ik;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

@FeatherModule(
   a = ModsConfig.ITEM_INFO,
   b = @dn(
   a = "Item Info",
   b = "https://assets.feathercdn.net/game/mods/iteminfo.svg",
   c = "Display enchants when picking up an item",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class ItemInfo extends HUDMod<ItemInfo.a> {
   private static final String c = "";
   private static final String d = "14";
   private static final Minecraft e = Minecraft.func_71410_x();
   private String f;
   private long g;
   private float h;

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      this.a(var2, var1 == HUDMod.a.MOD_LAYOUT);
   }

   private void a(MatrixUtils var1, boolean var2) {
      float var3 = this.h;
      String var4 = null;
      String var5 = null;
      if (this.b.o) {
         if (var2) {
            var4 = "";
         } else {
            var4 = this.o();
         }
      }

      if (this.b.l) {
         if (var2) {
            var5 = "14";
         } else {
            int var6 = this.p();
            if (var6 != -1) {
               var5 = String.valueOf(var6);
            }
         }
      }

      float var10 = 1.0F;
      if (!var2 && this.b.r) {
         String var7 = var4 + "\n" + var5;
         long var8 = 0L;
         if (var7.equals(this.f)) {
            var8 = System.currentTimeMillis() - this.g - (long)this.b.j * 100L;
         } else {
            this.f = var7;
            this.g = System.currentTimeMillis();
         }

         if (var8 >= (long)this.b.s * 100L) {
            return;
         }

         if (var8 > 0L) {
            var10 = 1.0F - (float)var8 / 100.0F / (float)this.b.s;
         }
      }

      if (var4 != null) {
         Color var11 = this.b.p.c();
         Color var13 = new Color(var11.getRed(), var11.getGreen(), var11.getBlue(), Math.max(5, (int)((float)var11.getAlpha() * var10)));
         this.a.a(var1, var4, (float)(this.b() - this.a.a(var4)) / 2.0F, var3, var13.getRGB(), true, this.b.p.b());
         var3 += 16.0F;
      }

      if (var5 != null) {
         Color var12 = this.b.m.c();
         Color var14 = new Color(var12.getRed(), var12.getGreen(), var12.getBlue(), Math.max(5, (int)((float)var12.getAlpha() * var10)));
         this.a.a(var1, var5, (float)(this.b() - this.a.a(var5)) / 2.0F, var3, var14.getRGB(), true, this.b.m.b());
      }

   }

   @Override
   public int a() {
      if (this.b.l) {
         return this.b.o ? 30 : 14;
      } else {
         return this.b.o ? 14 : 0;
      }
   }

   @Override
   public int b() {
      return this.b.o ? 120 : 30;
   }

   @Override
   public void i() {
      float var1 = 8.0F;
      this.h = ((float)this.a() - var1) / 2.0F;
   }

   private String o() {
      EntityPlayerSP var1 = e.field_71439_g;
      if (var1 == null) {
         return "";
      } else {
         ItemStack var2 = var1.func_70694_bm();
         if (var2 == null) {
            return "";
         } else {
            return var2.func_77973_b() instanceof ItemPotion ? this.b(var2) : this.a(var2);
         }
      }
   }

   private String a(ItemStack var1) {
      if (!var1.func_77948_v()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder();

         for(Entry var4 : EnchantmentHelper.func_82781_a(var1).entrySet()) {
            int var5 = var4.getKey();
            var2.append((String)ik.a.get(var5)).append(" ").append(var4.getValue()).append(" ");
         }

         return var2.toString().trim();
      }
   }

   private String b(ItemStack var1) {
      ItemPotion var3 = (ItemPotion)var1.func_77973_b();
      List var2 = var3.func_77832_l(var1);
      if (var2 != null && !var2.isEmpty()) {
         StringBuilder var4 = new StringBuilder();

         for(net.minecraft.potion.PotionEffect var6 : var2) {
            int var7 = var6.func_76459_b() / 20;
            var4.append(StatCollector.func_74838_a(var6.func_76453_d()))
               .append(" ")
               .append(var6.func_76458_c() + 1)
               .append(" (")
               .append(var7 / 60)
               .append(String.format(":%02d", var7 % 60))
               .append(") ");
         }

         return var4.toString().trim();
      } else {
         return "";
      }
   }

   private int p() {
      EntityPlayerSP var1 = e.field_71439_g;
      if (var1 == null) {
         return -1;
      } else {
         ItemStack var2 = var1.func_70694_bm();
         if (var2 == null) {
            return -1;
         } else {
            Item var3 = var2.func_77973_b();
            int var4 = var2.func_77952_i();
            if (var3 instanceof ItemBow) {
               var3 = Items.field_151032_g;
               var4 = 0;
            }

            int var5 = Item.func_150891_b(var3);
            int var6 = 0;

            for(ItemStack var10 : var1.field_71071_by.field_70462_a) {
               if (var10 != null && Item.func_150891_b(var10.func_77973_b()) == var5 && var10.func_77952_i() == var4) {
                  var6 += var10.field_77994_a;
               }
            }

            return var6;
         }
      }
   }

   @HUDConfig(
      d = true,
      e = true,
      c = 2.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Item Info");
      @ModConfigAnnotation(
         a = "showTime",
         b = "Show Time",
         c = "15",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         a = 30
      )
      public int j;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh k = new eh("Count");
      @ModConfigAnnotation(
         a = "count",
         b = "Count",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean l;
      @ModConfigAnnotation(
         a = "countColor",
         b = "Count Color",
         c = "false/192/192/192",
         d = @dB(
   a = "count"
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public ChromaColor m;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh n = new eh("Enchants");
      @ModConfigAnnotation(
         a = "enchants",
         b = "Enchants",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean o;
      @ModConfigAnnotation(
         a = "enchantsColor",
         b = "Color",
         c = "false/192/192/192",
         d = @dB(
   a = "enchants"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public ChromaColor p;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh q = new eh("Fade Out");
      @ModConfigAnnotation(
         a = "fadeOut",
         b = "Fade Out",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean r;
      @ModConfigAnnotation(
         a = "fadeOutTime",
         b = "Time",
         c = "5",
         d = @dB(
   a = "fadeOut"
),
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      @IntegerRange(
         a = 20
      )
      public int s;

      @Override
      public double c() {
         return (double)hp.c() / 2.0 / hp.g();
      }

      @Override
      public double d() {
         return (double)hp.d() / hp.g() - 50.0;
      }
   }
}
