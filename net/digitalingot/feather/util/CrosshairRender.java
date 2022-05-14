package net.digitalingot.feather.util;

import java.awt.Color;
import net.digitalingot.feather.fs;
import net.digitalingot.feather.ft;
import net.digitalingot.feather.mods.CustomCrosshairMod;

public class CrosshairRender implements ft {
   @Override
   public void a(CustomCrosshairMod.a var1, int var2, int var3, int var4, Color var5) {
      int var6 = var1.d / 2;
      int var7 = var1.d / 2;
      if (var1.n) {
         int var8 = var1.e / 2 + var1.o;
         int var9 = (var1.e + 1) / 2 + var1.o;
         fs.a(var2 - var1.c - var6 - var1.o, var3 - var8, var2 - var6 + var1.o, var3 + var9, var1.p);
         fs.a(var2 + var7 - var1.o, var3 - var8, var2 + var1.c + var7 + var1.o, var3 + var9, var1.p);
         fs.a(var2 - var8, var3 - var6 - var1.c - var1.o, var2 + var9, var3 - var6 + var1.o, var1.p);
         fs.a(var2 - var8, var3 + var7 - var1.o, var2 + var9, var3 + var7 + var1.c + var1.o, var1.p);
      }

      int var10 = var1.e / 2;
      int var11 = (var1.e + 1) / 2;
      fs.a(var2 - var1.c - var6, var3 - var10, var2 - var6, var3 + var11, var5);
      fs.a(var2 + var7, var3 - var10, var2 + var1.c + var7, var3 + var11, var5);
      fs.a(var2 - var10, var3 - var6 - var1.c, var2 + var11, var3 - var6, var5);
      fs.a(var2 - var10, var3 + var7, var2 + var11, var3 + var7 + var1.c, var5);
   }
}
