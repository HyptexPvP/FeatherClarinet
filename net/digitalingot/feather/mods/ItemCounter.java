package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.if;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.ITEM_COUNTER,
   b = @dn(
   a = "Item Counter",
   b = "https://assets.feathercdn.net/game/mods/itemcounter.svg",
   c = "Count items in your inventory",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class ItemCounter extends HUDMod<ItemCounter.a> {
   private static final int c = 16;
   private static final int d = 16;
   private static final int e = 2;
   private static final int f = 2;
   private static final ItemStack g = a(Items.field_151068_bn, 1, 8197);
   private static final ItemStack h = a(Items.field_151068_bn, 1, 8229);
   private static final Item i = Items.field_151068_bn;
   private static final ItemStack j = a(i, 1, 16389);
   private static final ItemStack k = a(i, 1, 16421);
   private static final ItemStack l = a(Items.field_151153_ao, 1, 0);
   private static final ItemStack m = a(Items.field_151153_ao, 1, 1);
   private static final Minecraft n = Minecraft.func_71410_x();
   private int o = 0;

   private static void a(ItemStack var0, String var1) {
   }

   @NotNull
   private static ItemStack a(@NotNull Item var0, int var1, int var2) {
      ItemStack var3 = new ItemStack(var0, var1);
      var3.func_77964_b(var2);
      switch(var2) {
         case 8197:
         case 16389:
            a(var3, "minecraft:healing");
            break;
         case 8229:
         case 16421:
            a(var3, "minecraft:strong_healing");
      }

      return var3;
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      int var3 = if.a(n.field_71439_g, Items.field_151032_g);
      int var4 = if.a(n.field_71439_g, Items.field_151083_be, Items.field_151157_am, Items.field_151150_bK);
      int var5 = if.a(n.field_71439_g, l);
      int var6 = if.a(n.field_71439_g, m);
      int var7 = if.a(n.field_71439_g, g, h, j, k);
      int var8 = if.a(n.field_71439_g, Items.field_151009_A);
      if (this.b.m) {
         this.a.b(var2, 0, 0, this.b(), this.a(), this.b.n.getRGB());
      }

      switch(this.b.j) {
         case HORIZONTAL:
            int var11 = 0;
            boolean var10 = true;
            if (this.b.p) {
               this.a(var2, var11, 2, Items.field_151032_g, var3, this.b.k, this.b.q);
               var11 += this.b(var3) + 2;
            }

            if (this.b.s) {
               this.a(var2, var11, 2, Items.field_151083_be, var4, this.b.k, this.b.t);
               var11 += this.b(var4) + 2;
            }

            if (this.b.y) {
               this.a(var2, var11, 2, Items.field_151153_ao, var5, this.b.k, this.b.z);
               var11 += this.b(var5) + 2;
            }

            if (this.b.B) {
               this.a(var2, var11, 2, m, var6, this.b.k, this.b.C);
               var11 += this.b(var6) + 2;
            }

            if (this.b.v) {
               this.a(var2, var11, 2, h, var7, this.b.k, this.b.w);
               var11 += this.b(var7) + 2;
            }

            if (this.b.E) {
               this.a(var2, var11, 2, Items.field_151009_A, var8, this.b.k, this.b.F);
               var11 += this.b(var8);
            }

            this.o = var11;
            break;
         case VERTICAL:
            int var9 = 0;
            if (this.b.p) {
               this.a(var2, 0, var9, Items.field_151032_g, var3, this.b.k, this.b.q);
               var9 += this.p();
            }

            if (this.b.s) {
               this.a(var2, 0, var9, Items.field_151083_be, var4, this.b.k, this.b.t);
               var9 += this.p();
            }

            if (this.b.y) {
               this.a(var2, 0, var9, Items.field_151153_ao, var5, this.b.k, this.b.z);
               var9 += this.p();
            }

            if (this.b.B) {
               this.a(var2, 0, var9, m, var6, this.b.k, this.b.C);
               var9 += this.p();
            }

            if (this.b.v) {
               this.a(var2, 0, var9, h, var7, this.b.k, this.b.w);
               var9 += this.p();
            }

            if (this.b.E) {
               this.a(var2, 0, var9, Items.field_151009_A, var8, this.b.k, this.b.F);
            }
      }

   }

   @Override
   public int a() {
      if (this.b.j == ItemCounter.a.a.HORIZONTAL) {
         return this.b.k != ItemCounter.a.b.TOP && this.b.k != ItemCounter.a.b.BOTTOM ? 16 : 30;
      } else {
         return this.b.k != ItemCounter.a.b.TOP && this.b.k != ItemCounter.a.b.BOTTOM ? this.o() * 18 - 2 : this.o() * 30 - 2;
      }
   }

   @Override
   public int b() {
      return this.b.j == ItemCounter.a.a.HORIZONTAL ? this.o : this.b(99);
   }

   private int p() {
      return this.b.k != ItemCounter.a.b.BOTTOM && this.b.k != ItemCounter.a.b.TOP ? 18 : 30;
   }

   private int a(int var1) {
      return (16 - this.a.a(String.valueOf(var1))) / 2;
   }

   private int b(int var1) {
      return this.b.k != ItemCounter.a.b.BOTTOM && this.b.k != ItemCounter.a.b.TOP ? 18 + this.a.a(String.valueOf(var1)) : 16;
   }

   public void a(MatrixUtils var1, int var2, int var3, Item var4, int var5, ItemCounter.a.b var6, ChromaColor var7) {
      ItemStack var8 = new ItemStack(var4);
      this.a(var1, var2, var3, var8, var5, var6, var7);
   }

   public void a(MatrixUtils var1, int var2, int var3, ItemStack var4, int var5, ItemCounter.a.b var6, ChromaColor var7) {
      int var8;
      int var9;
      int var10;
      int var11;
      switch(var6) {
         case BOTTOM:
            var8 = var2;
            var9 = var3;
            var10 = var2 + this.a(var5);
            var11 = var3 + 16;
            break;
         case TOP:
            var8 = var2;
            var9 = var3 + 12;
            var10 = var2 + this.a(var5);
            var11 = var3;
            break;
         case LEFT:
            var8 = var2 + this.a.a(String.valueOf(var5)) + 2;
            var9 = var3;
            var10 = var2;
            var11 = var3 + 2;
            break;
         case RIGHT:
            var8 = var2;
            var9 = var3;
            var10 = var2 + 16 + 2;
            var11 = var3 + 2;
            break;
         default:
            throw new IllegalStateException();
      }

      this.a.a(var1, var4, var8, var9, false, false);
      this.a.a(var1, String.valueOf(var5), (float)var10, (float)var11, var7, !this.b.m);
      RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public int o() {
      int var1 = 0;

      for(boolean var5 : new boolean[]{this.b.p, this.b.s, this.b.v, this.b.y, this.b.B, this.b.E}) {
         if (var5) {
            ++var1;
         }
      }

      return var1;
   }

   @HUDConfig(
      a = 33.0,
      b = 8.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Item Counter");
      @ModConfigAnnotation(
         a = "displayMode",
         b = "Display Mode",
         c = "horizontal",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public ItemCounter.a.a j;
      @ModConfigAnnotation(
         a = "textAlignment",
         b = "Text Alignment",
         c = "top",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public ItemCounter.a.b k;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh l = new eh("Background");
      @ModConfigAnnotation(
         a = "background",
         b = "Background",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean m;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Color",
         d = @dB(
   a = "background"
),
         c = "7/7/7/146",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color n;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh o = new eh("Arrows");
      @ModConfigAnnotation(
         a = "arrows",
         b = "Arrows",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "arrowsColor",
         b = "Color",
         d = @dB(
   a = "arrows"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public ChromaColor q;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh r = new eh("Food");
      @ModConfigAnnotation(
         a = "food",
         b = "Food",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean s;
      @ModConfigAnnotation(
         a = "foodColor",
         b = "Color",
         d = @dB(
   a = "food"
),
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      public ChromaColor t;
      @ModConfigValueAnnotation(
         a = 40
      )
      public eh u = new eh("Potions");
      @ModConfigAnnotation(
         a = "potions",
         b = "Potions",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 41
)
      )
      public boolean v;
      @ModConfigAnnotation(
         a = "potionsColor",
         b = "Color",
         d = @dB(
   a = "potions"
),
         e = @ModConfigValueAnnotation(
   a = 42
)
      )
      public ChromaColor w;
      @ModConfigValueAnnotation(
         a = 50
      )
      public eh x = new eh("Golden Apples");
      @ModConfigAnnotation(
         a = "goldenApples",
         b = "Golden Apples",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 51
)
      )
      public boolean y;
      @ModConfigAnnotation(
         a = "goldenApplesColor",
         b = "Color",
         d = @dB(
   a = "goldenApples"
),
         e = @ModConfigValueAnnotation(
   a = 52
)
      )
      public ChromaColor z;
      @ModConfigValueAnnotation(
         a = 60
      )
      public eh A = new eh("God Apples");
      @ModConfigAnnotation(
         a = "godApples",
         b = "God Apples",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 61
)
      )
      public boolean B;
      @ModConfigAnnotation(
         a = "godApplesColor",
         b = "Color",
         d = @dB(
   a = "godApples"
),
         e = @ModConfigValueAnnotation(
   a = 62
)
      )
      public ChromaColor C;
      @ModConfigValueAnnotation(
         a = 70
      )
      public eh D = new eh("Soup");
      @ModConfigAnnotation(
         a = "soup",
         b = "Soup",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 71
)
      )
      public boolean E;
      @ModConfigAnnotation(
         a = "soupColor",
         b = "Color",
         e = @ModConfigValueAnnotation(
   a = 72
)
      )
      public ChromaColor F;

      public static enum a {
         @dw(
            a = "horizontal",
            b = "Horizontal"
         )
         HORIZONTAL,
         @dw(
            a = "vertical",
            b = "Vertical"
         )
         VERTICAL;
      }

      public static enum b {
         @dw(
            a = "bottom",
            b = "Bottom"
         )
         BOTTOM,
         @dw(
            a = "left",
            b = "Left"
         )
         LEFT,
         @dw(
            a = "right",
            b = "Right"
         )
         RIGHT,
         @dw(
            a = "top",
            b = "Top"
         )
         TOP;
      }
   }
}
