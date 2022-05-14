package net.digitalingot.feather;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class gi {
   public static gi.a a(ItemStack var0) {
      ItemFood var1 = (ItemFood)var0.func_77973_b();
      int var2 = var1.func_150905_g(var0);
      float var3 = var1.func_150906_h(var0);
      return new gi.a(var2, var3);
   }

   public static gi.a b(ItemStack var0) {
      return a(var0);
   }

   public static class a {
      public final int a;
      public final float b;

      public a(int var1, float var2) {
         this.a = var1;
         this.b = var2;
      }

      public float a() {
         return (float)this.a * this.b * 2.0F;
      }
   }
}
