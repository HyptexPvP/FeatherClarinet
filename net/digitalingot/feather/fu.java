package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.mods.CustomCrosshairMod;
import net.digitalingot.feather.util.RenderUtil;
import org.lwjgl.opengl.GL11;

public class fu implements ft {
   @Override
   public void a(CustomCrosshairMod.a var1, int var2, int var3, int var4, Color var5) {
      GL11.glDisable(2848);
      GL11.glDisable(2832);
      RenderUtil.a();
      RenderUtil.j();
      if (var1.n) {
         GL11.glLineWidth((float)(var1.e + var1.o * 2));
         fs.b(var2 - var1.c, var3 + var1.c, var2, var3, var1.p);
         fs.b(var2, var3, var2 + var1.c, var3 + var1.c, var1.p);
      }

      GL11.glLineWidth((float)var1.e);
      fs.b(var2 - var1.c, var3 + var1.c, var2, var3, var5);
      fs.b(var2, var3, var2 + var1.c, var3 + var1.c, var5);
   }
}
