package net.digitalingot.feather.util;

import net.digitalingot.feather.gv;
import net.digitalingot.feather.iI;
import net.digitalingot.feather.iJ;
import net.minecraft.util.MathHelper;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;

public class MathUtils {
   @NotNull
   public static Pair<Float, Float> a(@NotNull iJ var0, @NotNull gv.a var1) {
      iJ var2 = var1.a();
      iJ var3 = iJ.b(var0, var2, null);
      var3.b(var3);
      iI var4 = new iI(var3.a, var3.c);
      float var5 = (float)Math.toDegrees((double)iI.b(var4, new iI(-1.0F, 0.0F)));
      float var6 = a(var5 - var1.c() % 360.0F);
      float var7 = (float)((double)Math.abs(var2.b - var0.b) / 32.0);
      float var8 = var6 / 180.0F;
      float var9 = var8;
      if (var8 < -0.5F) {
         var9 = -(0.5F + var8 + 0.5F);
      } else if (var8 > 0.5F) {
         var9 = 0.5F - (var8 - 0.5F);
      }

      var9 *= 1.0F - var7;
      float var10 = var9 < 0.0F ? Math.abs(var9 * 1.4F) + 0.3F : 0.3F;
      float var11 = var9 >= 0.0F ? var9 * 1.4F + 0.3F : 0.3F;
      float var12 = 1.0F - Math.max(var10, var11);
      var10 += var12;
      var11 += var12;
      return var1.b() ? new ImmutablePair(var11, var10) : new ImmutablePair(var10, var11);
   }

   private static float a(float var0) {
      var0 %= 360.0F;
      if (var0 <= -180.0F) {
         var0 += 360.0F;
      } else if (var0 > 180.0F) {
         var0 -= 360.0F;
      }

      return var0;
   }

   private float a(iI var1, iI var2) {
      return (float)Math.toDegrees(Math.atan2((double)(var1.a * var2.a + var1.b * var2.b), (double)(var1.a * var2.b - var1.b * var2.a)));
   }

   private float a(iI var1) {
      return (float)Math.sqrt(Math.pow((double)var1.a, 2.0) + Math.pow((double)var1.b, 2.0));
   }

   private float b(iI var1, iI var2) {
      return var1.a * var2.a + var1.b * var2.b;
   }

   private iI a(iI var1, float var2) {
      return new iI(
         var1.a * MathHelper.func_76134_b(var2) - var1.b * MathHelper.func_76126_a(var2),
         var1.a * MathHelper.func_76126_a(var2) + var1.b * MathHelper.func_76134_b(var2)
      );
   }
}
