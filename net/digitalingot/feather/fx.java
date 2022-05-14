package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.feather.mods.CustomCrosshairMod;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.gui.Gui;

public class fx implements ft {
   @Override
   public void a(CustomCrosshairMod.a var1, int var2, int var3, int var4, Color var5) {
      RenderUtil.a(775, 769, 1, 0);
      RenderUtil.b();
      RenderUtil.i();
      RenderUtil.a(0, Gui.field_110324_m);
      fs.a(var2 - 7, var3 - 7, 0, 0, 16, 16);
      RenderUtil.a();
      RenderUtil.j();
   }
}
