package net.digitalingot.feather.mods;

import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

@FeatherModule(
   a = ModsConfig.BOSS_BAR,
   b = @dn(
   a = "Boss Bar",
   b = "https://assets.feathercdn.net/game/mods/bossbar.svg",
   c = "",
   d = {ModsConponment.Category.HUD}
)
)
public class BossBarMod extends HUDMod<BossBarMod.a> {
   @Override
   public int a() {
      return 20;
   }

   @Override
   public int b() {
      return 182;
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      if (var1 == HUDMod.a.MOD_LAYOUT) {
         this.a(var2);
      }

   }

   private void a(MatrixUtils var1) {
      ModPosition var2 = this.e();
      Minecraft var3 = Minecraft.func_71410_x();
      int var4 = this.b();
      int var5 = (int)(0.8 * (double)((float)(var4 + 1)));
      boolean var6 = false;
      boolean var7 = true;
      RenderUtil.a(0, GuiIngame.field_110324_m);
      var2.b(var1, 0, 12, 0, 74, var4, 5);
      var2.b(var1, 0, 12, 0, 74, var4, 5);
      if (var5 > 0) {
         var2.b(var1, 0, 12, 0, 79, var5, 5);
      }

      String var8 = "Feather";
      int var9 = (var4 - var2.a("Feather")) / 2;
      var2.a(var1, "Feather", (float)var9, 2.0F, 16777215, true, false);
   }

   @HUDConfig(
      b = 11.0,
      d = true
   )
   @dt(
      a = true
   )
   public static class a extends HUDPosition {
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text Color",
         c = "false/22/119/114/255",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public ChromaColor i;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean j;

      @Override
      public double c() {
         return (double)hp.c() / 2.0 / hp.g();
      }
   }
}
