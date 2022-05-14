package net.digitalingot.feather.util;

import net.digitalingot.feather.mixin.core.IMixinAbstractGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.biome.BiomeGenBase;
import org.jetbrains.annotations.NotNull;

public class PlayerUtil {
   public static int a(@NotNull Gui var0) {
      return (int)((IMixinAbstractGui)var0).getBlitOffset();
   }

   public static Entity a(@NotNull RenderManager var0) {
      return var0.field_78734_h;
   }

   public static boolean a(@NotNull Minecraft var0) {
      return var0.field_71474_y.field_74320_O != 0;
   }

   public static float b(@NotNull Minecraft var0) {
      return var0.field_71439_g.field_71109_bG;
   }

   public static float c(@NotNull Minecraft var0) {
      return var0.field_71439_g.field_70726_aT;
   }

   public static boolean a(@NotNull ItemStack var0) {
      return var0.func_77973_b() instanceof ItemFood;
   }

   public static boolean a(@NotNull Item var0) {
      return var0 instanceof ItemFood;
   }

   public static boolean a(@NotNull EntityPlayer var0) {
      return var0.field_71075_bZ.field_75098_d;
   }

   public static void d(@NotNull Minecraft var0) {
      var0.func_175601_h();
   }

   public static void a(@NotNull KeyBinding var0, int var1) {
      var0.func_151462_b(var1);
   }

   public static boolean a(@NotNull Entity var0) {
      return var0.field_70122_E;
   }

   public static int a(@NotNull KeyBinding var0) {
      return var0.func_151463_i();
   }

   public static void a(@NotNull EntityPlayerSP var0, IChatComponent var1) {
      var0.func_145747_a(var1);
   }

   public static boolean e(@NotNull Minecraft var0) {
      return var0.field_71415_G;
   }

   public static int a(@NotNull Enchantment var0) {
      return var0.field_77352_x;
   }

   public static double f(@NotNull Minecraft var0) {
      return (double)new ScaledResolution(var0).func_78326_a();
   }

   public static int g(@NotNull Minecraft var0) {
      return new ScaledResolution(var0).func_78328_b();
   }

   public static double h(@NotNull Minecraft var0) {
      return (double)new ScaledResolution(var0).func_78325_e();
   }

   public static int i(@NotNull Minecraft var0) {
      return var0.field_71443_c;
   }

   public static int j(@NotNull Minecraft var0) {
      return var0.field_71440_d;
   }

   public static int b(@NotNull ItemStack var0) {
      return var0.field_77994_a;
   }

   public static ItemStack a(@NotNull EntityLivingBase var0) {
      return var0.func_70694_bm();
   }

   public static Entity b(@NotNull Entity var0) {
      return var0.field_70154_o;
   }

   public static String a(@NotNull BiomeGenBase var0) {
      return var0.field_76791_y;
   }

   public static Object b(@NotNull EntityPlayer var0) {
      return var0.field_71075_bZ;
   }

   public static void a(@NotNull Entity var0, float var1) {
      var0.field_70125_A = var1;
   }

   public static float c(@NotNull Entity var0) {
      return var0.field_70125_A;
   }

   public static void b(@NotNull Entity var0, float var1) {
      var0.field_70177_z = var1;
   }

   public static float d(@NotNull Entity var0) {
      return var0.field_70177_z;
   }

   public static IInventory c(@NotNull EntityPlayer var0) {
      return var0.field_71071_by;
   }

   public static boolean c(ItemStack var0) {
      return var0 == null;
   }
}
