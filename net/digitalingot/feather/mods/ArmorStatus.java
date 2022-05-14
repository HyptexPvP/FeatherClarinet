package net.digitalingot.feather.mods;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.ib;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@FeatherModule(
   a = ModsConfig.ARMOR_STATUS,
   b = @dn(
   a = "Armor Status",
   b = "https://assets.feathercdn.net/game/mods/armorstatus.svg",
   c = "Display your armor durability",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class ArmorStatus extends HUDMod<ArmorStatus.a> {
   private static final ItemStack[] c = new ItemStack[]{
      new ItemStack(Item.func_150899_d(313)),
      new ItemStack(Item.func_150899_d(312)),
      new ItemStack(Item.func_150899_d(311)),
      new ItemStack(Item.func_150899_d(310))
   };
   private final List<ArmorStatus.b> d = new ArrayList();

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      boolean var3 = var1 == HUDMod.a.MOD_LAYOUT;
      this.c(var3);
      this.a(var2);
   }

   @Override
   public int a() {
      return (this.b.l == ArmorStatus.a.c.HORIZONTAL ? 1 : (this.b.r ? 5 : 4)) * (this.b.o ? 21 : 18) + 5;
   }

   @Override
   public int b() {
      switch(this.b.l) {
         case VERTICAL:
            return this.b.o ? 130 : 65;
         case HORIZONTAL:
            int var1 = 0;

            for(ArmorStatus.b var3 : this.d) {
               var1 += var3.g;
            }

            return var1 + 5;
         default:
            throw new IllegalStateException();
      }
   }

   private ItemStack a(int var1, boolean var2) {
      if (var2) {
         if (var1 == -1 && this.b.r) {
            return new ItemStack(Item.func_150899_d(276));
         }

         if (var1 != -1) {
            return c[var1];
         }
      } else {
         EntityPlayerSP var3 = Minecraft.func_71410_x().field_71439_g;
         if (var1 == -1 && this.b.r) {
            return var3.func_70694_bm();
         }

         if (var1 != -1) {
            return var3.field_71071_by.field_70460_b[var1];
         }
      }

      return null;
   }

   private void c(boolean var1) {
      this.d.clear();

      for(int var2 = 3; var2 >= -1; --var2) {
         ItemStack var3 = this.a(var2, var1);
         if (var3 != null && var3 != null) {
            this.d.add(new ArmorStatus.b(var3, 16, 16, var2 > -1, this.b));
         }
      }

   }

   private void a(MatrixUtils var1) {
      if (!this.d.isEmpty()) {
         switch(this.b.l) {
            case VERTICAL:
               int var7 = 6;
               int var8 = this.b.o ? 21 : 16;
               if (this.b.k == ArmorStatus.a.b.LEFT) {
                  for(ArmorStatus.b var11 : this.d) {
                     var11.a(var1, var11.g + this.b.m, var7);
                     var7 += var8;
                  }

                  return;
               }

               int var9 = this.b();

               for(ArmorStatus.b var6 : this.d) {
                  var6.a(var1, var9, var7);
                  var7 += var8;
               }
               break;
            case HORIZONTAL:
               int var2 = 3;

               for(ArmorStatus.b var4 : this.d) {
                  var4.a(var1, var2 + var4.g + this.b.m, 6);
                  var2 += var4.g;
               }
         }

      }
   }

   @HUDConfig(
      a = 360.0,
      b = 130.0
   )
   public static class a extends HUDPosition {
      @ModConfigAnnotation(
         a = "color",
         b = "Text Color",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public ChromaColor i;
      @ModConfigAnnotation(
         a = "damageDisplayType",
         b = "Damage Display Type",
         c = "value",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public ArmorStatus.a.a j;
      @ModConfigAnnotation(
         a = "iconLocation",
         b = "Icon Location",
         c = "right",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public ArmorStatus.a.b k;
      @ModConfigAnnotation(
         a = "listMode",
         b = "List Mode",
         c = "vertical",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public ArmorStatus.a.c l;
      @ModConfigAnnotation(
         a = "padding",
         b = "Padding",
         c = "2",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      @IntegerRange(
         a = 5
      )
      public int m;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh n = new eh("Show");
      @ModConfigAnnotation(
         a = "enableItemName",
         b = "Enable Item Name",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean o;
      @ModConfigAnnotation(
         a = "showArmorDamage",
         b = "Show Armor Damage",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "showDamageOverlay",
         b = "Show Damage Overlay",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean q;
      @ModConfigAnnotation(
         a = "showEquippedItem",
         b = "Show Equipped Item",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 14
)
      )
      public boolean r;
      @ModConfigAnnotation(
         a = "showItemCount",
         b = "Show Item Count",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 15
)
      )
      public boolean s;
      @ModConfigAnnotation(
         a = "showItemDamage",
         b = "Show Item Damage",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 16
)
      )
      public boolean t;
      @ModConfigAnnotation(
         a = "showMaxDamage",
         b = "Show Max Damage",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 17
)
      )
      public boolean u;

      public static enum a {
         @dw(
            a = "value",
            b = "Value"
         )
         VALUE,
         @dw(
            a = "percent",
            b = "Percent"
         )
         PERCENT;
      }

      public static enum b {
         @dw(
            a = "left",
            b = "Left"
         )
         LEFT,
         @dw(
            a = "right",
            b = "Right"
         )
         RIGHT;
      }

      public static enum c {
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
   }

   class b {
      public final int a;
      public final int b;
      public final ItemStack c;
      private final boolean e;
      private final ArmorStatus.a f;
      private int g;
      private String h = "";
      private int i;
      private String j = "";
      private int k;

      public b(ItemStack var2, int var3, int var4, boolean var5, ArmorStatus.a var6) {
         this.c = var2;
         this.b = var3;
         this.a = var4;
         this.e = var5;
         this.f = var6;
         this.a();
      }

      private void a() {
         if (this.c != null) {
            if ((this.e && this.f.p || !this.e && this.f.t) && this.c.func_77984_f()) {
               int var2 = this.c.func_77958_k() + 1;
               int var1 = var2 - this.c.func_77952_i();
               switch(this.f.j) {
                  case VALUE:
                     this.h = var1 + (this.f.u ? "/" + var2 : "");
                     break;
                  case PERCENT:
                     this.h = var1 * 100 / var2 + "%";
               }
            }

            this.i = ArmorStatus.this.a.a(ib.a(this.h));
            this.g = ArmorStatus.this.b.m + this.b + ArmorStatus.this.b.m + this.i;
            if (this.f.o) {
               this.j = ib.a(this.c.func_82833_r());
               this.j = this.j.replace("Splash ", "").replace("Potion of ", "");
               this.g = ArmorStatus.this.b.m + this.b + ArmorStatus.this.b.m + Math.max(ArmorStatus.this.a.a(this.j), this.i);
            }

            this.k = ArmorStatus.this.a.a(this.j);
         }
      }

      public void a(MatrixUtils var1, int var2, int var3) {
         switch(this.f.k) {
            case LEFT:
               int var4 = Math.max(this.i, this.f.o ? this.k : 0);
               ArmorStatus.this.a.a(var1, this.c, var2 - (2 * ArmorStatus.this.b.m + this.b + var4), var3, this.f.q, this.f.s);
               if (this.f.o) {
                  ArmorStatus.this.a.a(var1, this.j + "§r", (float)(var2 - (var4 + ArmorStatus.this.b.m)), (float)(var3 - 3), ArmorStatus.this.b.i, true);
               }

               ArmorStatus.this.a
                  .a(var1, this.h + "§r", (float)(var2 - (var4 + ArmorStatus.this.b.m)), (float)(var3 + (this.f.o ? 8 : 2)), ArmorStatus.this.b.i, true);
               break;
            case RIGHT:
               ArmorStatus.this.a.a(var1, this.c, var2 - (this.b + ArmorStatus.this.b.m), var3, this.f.q, this.f.s);
               if (this.f.o) {
                  ArmorStatus.this.a
                     .a(
                        var1,
                        this.j + "§r",
                        (float)(var2 - (ArmorStatus.this.b.m + this.b + ArmorStatus.this.b.m) - this.k),
                        (float)(var3 - 3),
                        ArmorStatus.this.b.i,
                        true
                     );
               }

               ArmorStatus.this.a
                  .a(
                     var1,
                     this.h + "§r",
                     (float)(var2 - (ArmorStatus.this.b.m + this.b + ArmorStatus.this.b.m) - this.i),
                     (float)(var3 + (this.f.o ? 8 : 2)),
                     ArmorStatus.this.b.i,
                     true
                  );
         }

         RenderUtil.a(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
