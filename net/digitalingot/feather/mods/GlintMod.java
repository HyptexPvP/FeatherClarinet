package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.gui.HUD;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;

@FeatherModule(
   a = ModsConfig.GLINT,
   b = @dn(
   a = "Glint",
   b = "https://assets.feathercdn.net/game/mods/glint.svg",
   c = "Customize color of enchants and other settings",
   d = {}
)
)
public class GlintMod extends Mod<GlintMod.a> {
   private static final int a = -8372020;

   public int a(ItemStack var1) {
      boolean var2 = b(var1);
      GlintMod.a.a var3 = var2 ? this.b.d : this.b.j;
      switch(var3) {
         case OFF:
            return 0;
         case DEFAULT_COLOR:
            return -8372020;
         case CUSTOM_COLOR:
            return var2 ? this.b.e.getRGB() : this.b.k.getRGB();
         default:
            return hH.a().c();
      }
   }

   public static boolean b(ItemStack var0) {
      return var0 == null ? false : var0.func_77973_b() instanceof ItemArmor;
   }

   public boolean c(ItemStack var1) {
      return this.m() && this.b.b && this.a(var1) != 0 && var1.func_77973_b() instanceof ItemPotion;
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("General");
      @ModConfigAnnotation(
         a = "shinyPots",
         b = "Shiny Pots",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh c = new eh("Armor");
      @ModConfigAnnotation(
         a = "mode",
         b = "Mode",
         c = "defaultColor",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public GlintMod.a.a d;
      @ModConfigAnnotation(
         a = "armorColor",
         b = "Color",
         c = "128/64/204",
         d = @dB(
   a = "mode",
   b = {"customColor"}
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color e;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh i = new eh("Item");
      @ModConfigAnnotation(
         a = "item",
         b = "Mode",
         c = "defaultColor",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public GlintMod.a.a j = GlintMod.a.a.DEFAULT_COLOR;
      @ModConfigAnnotation(
         a = "itemColor",
         b = "Color",
         c = "128/64/204",
         d = @dB(
   a = "item",
   b = {"customColor"}
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public Color k;

      public static enum a {
         @dw(
            a = "off",
            b = "Off"
         )
         OFF,
         @dw(
            a = "defaultColor",
            b = "Default Color"
         )
         DEFAULT_COLOR,
         @dw(
            a = "customColor",
            b = "Custom Color"
         )
         CUSTOM_COLOR,
         @dw(
            a = "chroma",
            b = "Chroma"
         )
         CHROMA;
      }

      public static enum b {
         @dw(
            a = "item",
            b = "Item"
         )
         ITEM,
         @dw(
            a = "model",
            b = "Model"
         )
         MODEL;
      }
   }
}
