package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.mods.CustomCrosshairMod;
import net.digitalingot.feather.util.RenderUtil;

public class fv implements ft {
   @Override
   public void a(CustomCrosshairMod.a var1, int var2, int var3, int var4, Color var5) {
      if (var1.n) {
         RenderUtil.a((float)(var1.e + var1.o));
         fs.a((double)var2 + 0.5, (double)var3 + 0.5, var4 - var1.o / 2 + 1, var1.p);
         fs.a((double)var2 + 0.5, (double)var3 + 0.5, var4 + var1.o / 2 + 1, var1.p);
      }

      RenderUtil.a((float)var1.e);
      fs.a((double)var2 + 0.5, (double)var3 + 0.5, var4 + 1, var5);
      RenderUtil.a(1.0F);
   }
}
