package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.mods.CustomCrosshairMod;

public class fy implements ft {
   @Override
   public void a(CustomCrosshairMod.a var1, int var2, int var3, int var4, Color var5) {
      int var6 = -var1.e / 2;
      if (var1.n) {
         fs.a(var6 + var2 - var1.c - var1.o, var6 + var3 - var1.c - var1.o, var6 + var2 + var1.c + var1.e, var6 + var3 + var1.c + var1.e, var1.p, var1.o);
         fs.a(var6 + var2 - var1.c + var1.e, var6 + var3 - var1.c + var1.e, var6 + var2 + var1.c - var1.o, var6 + var3 + var1.c - var1.o, var1.p, var1.o);
      }

      fs.a(var6 + var2 - var1.c, var6 + var3 - var1.c, var6 + var2 + var1.c, var6 + var3 + var1.c, var5, var1.e);
   }
}
