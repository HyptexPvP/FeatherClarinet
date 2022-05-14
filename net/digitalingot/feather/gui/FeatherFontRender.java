package net.digitalingot.feather.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

public class FeatherFontRender extends FontRenderer {
   private final FontRenderer a = Minecraft.func_71410_x().field_71466_p;

   public FeatherFontRender() {
      super(Minecraft.func_71410_x().field_71474_y, new ResourceLocation("textures/font/ascii.png"), Minecraft.func_71410_x().func_110434_K(), false);
   }

   public int func_175065_a(String var1, float var2, float var3, int var4, boolean var5) {
      return this.a.func_175065_a(var1, var2 + 1.0F, var3 + 1.0F, var4, var5);
   }

   public int a(String var1) {
      return this.func_78256_a(var1);
   }

   public int func_78256_a(String var1) {
      return this.a.func_78256_a(var1);
   }

   public int func_78263_a(char var1) {
      return this.a.func_78263_a(var1);
   }

   public int a(String var1, float var2, float var3, int var4, boolean var5) {
      return this.a.func_175065_a(var1, var2, var3, var4, var5);
   }
}
