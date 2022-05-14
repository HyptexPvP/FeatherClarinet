package net.digitalingot.feather.gui;

import net.digitalingot.feather.bg;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Mouse;

public class HUDEdiorUI extends GuiScreen {
   private final bg a = new bg();
   private final BrowserGUI b = BrowserUtils.INSTANCE.getScreen();
   private boolean c;

   public void func_73866_w_() {
      this.a.a(this.field_146294_l, this.field_146295_m);
      this.b.func_73866_w_();
   }

   public void func_146281_b() {
      this.a.a();
      this.b.func_146281_b();
   }

   public void func_73863_a(int var1, int var2, float var3) {
      this.a.a(new MatrixUtils());
      this.b.func_73863_a(var1, var2, var3);
   }

   protected void func_73869_a(char var1, int var2) {
      super.func_73869_a(var1, var2);
      this.a.a(var1, var2);
   }

   protected void func_73864_a(int var1, int var2, int var3) {
      if (this.a.a(var1, var2, var3)) {
         this.c = true;
      }

   }

   protected void func_146286_b(int var1, int var2, int var3) {
      this.a.b(var1, var2, var3);
   }

   protected void func_146273_a(int var1, int var2, int var3, long var4) {
      this.a.c(var1, var2, var3);
   }

   public void func_146274_d() {
      super.func_146274_d();
      if (Mouse.getEventButton() == -1) {
         int var1 = Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c;
         int var2 = this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1;
         this.a.a((double)var1, (double)var2);
      }

      if (this.c) {
         this.c = false;
      } else {
         this.b.func_146274_d();
      }
   }

   public void func_146280_a(@NotNull Minecraft var1, int var2, int var3) {
      super.func_146280_a(var1, var2, var3);
      this.b.func_146280_a(var1, var2, var3);
   }

   public boolean func_73868_f() {
      return false;
   }
}
