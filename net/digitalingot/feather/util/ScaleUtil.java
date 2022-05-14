package net.digitalingot.feather.util;

import net.minecraft.client.renderer.GlStateManager;

public final class ScaleUtil {
   private ScaleUtil() {
      throw new AssertionError();
   }

   public static void a() {
      GlStateManager.func_179094_E();
   }

   public static void b() {
      GlStateManager.func_179121_F();
   }

   public static void a(float var0, float var1, float var2) {
      a((double)var0, (double)var1, (double)var2);
   }

   public static void a(double var0, double var2, double var4) {
      GlStateManager.func_179137_b(var0, var2, var4);
   }

   public static void a(float var0, float var1, float var2, float var3) {
      GlStateManager.func_179114_b(var0, var1, var2, var3);
   }

   public static void b(float var0, float var1, float var2) {
      b((double)var0, (double)var1, (double)var2);
   }

   public static void b(double var0, double var2, double var4) {
      GlStateManager.func_179139_a(var0, var2, var4);
   }
}
