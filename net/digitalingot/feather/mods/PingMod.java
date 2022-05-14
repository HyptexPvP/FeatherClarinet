package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;

@FeatherModule(
   a = ModsConfig.PING,
   b = @dn(
   a = "Ping",
   b = "https://assets.feathercdn.net/game/mods/ping.svg",
   c = "Display your ping to the server",
   d = {ModsConponment.Category.HUD}
)
)
public class PingMod extends HUDMod<PingMod.a> {
   private static final int c = 59;
   private static final int d = 19;
   private static final Minecraft e = Minecraft.func_71410_x();
   private int f = 0;
   private String g;
   private float h;
   private float i;
   private int j = -1;
   private int k;
   private int l;
   private int m;

   @Override
   public void f() {
      Events.a.a(var1 -> {
         if (var1 == Events.c.END && e.field_71439_g != null && this.m()) {
            if (this.f++ % 20 == 0) {
               this.p();
            }

         }
      });
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      if (this.b.l) {
         int var3 = this.o();
         if (var3 > 0 || var1 == HUDMod.a.MOD_LAYOUT) {
            if (this.b.m == HUDPosition.a.BACKGROUND) {
               this.a.b(var2, 0, 0, this.l, this.m, this.b.n.getRGB());
            }

            this.a.a(var2, this.g, this.h, this.i, this.k, this.b.q, this.b.p.b());
         }
      }
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public int b() {
      return this.l;
   }

   public int a(int var1) {
      return Color.getHSBColor(Math.max((125.0F - (float)var1 * 10.0F / (float)this.b.j) / 360.0F, 0.0F), 1.0F, 1.0F).getRGB();
   }

   public int o() {
      if (e.field_71439_g == null) {
         return 0;
      } else {
         NetHandlerPlayClient var1 = e.func_147114_u();
         if (var1 == null) {
            return 0;
         } else {
            NetworkPlayerInfo var2 = var1.func_175102_a(e.field_71439_g.func_146103_bH().getId());
            return var2 == null ? 0 : var2.func_178853_c();
         }
      }
   }

   @Override
   public void i() {
      if (this.b.m == HUDPosition.a.BACKGROUND) {
         this.m = 19;
         this.l = 59;
      } else {
         this.m = Math.round(RenderUtil.b(this.b.q));
         this.l = RenderUtil.a("888 ms");
         if (this.b.m == HUDPosition.a.BRACKETS) {
            this.l += RenderUtil.a("[]");
         }
      }

      this.j = -1;
      this.p();
      this.i = ((float)this.m - RenderUtil.b(this.b.q)) / 2.0F;
   }

   private void p() {
      int var1 = this.o();
      if (var1 != this.j) {
         this.j = var1;
         StringBuilder var2 = new StringBuilder();
         if (this.b.m == HUDPosition.a.BRACKETS) {
            var2.append('[');
         }

         var2.append(this.o());
         var2.append(" ms");
         if (this.b.m == HUDPosition.a.BRACKETS) {
            var2.append(']');
         }

         this.g = var2.toString();
         this.h = (float)(this.l - RenderUtil.a(this.g)) / 2.0F;
         this.k = this.b.o ? this.a(var1) : this.b.p.a();
      }
   }

   @HUDConfig(
      a = 33.0,
      b = 8.0
   )
   @dt(
      a = true
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("General");
      @ModConfigAnnotation(
         a = "badPingColorChangeRate",
         b = "Bad Ping Color Change Rate",
         c = "25",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         b = 10,
         a = 40
      )
      public int j;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh k = new eh("HUD");
      @ModConfigAnnotation(
         a = "hud",
         b = "HUD",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean l;
      @ModConfigAnnotation(
         a = "displayMode",
         b = "Display Mode",
         c = "background",
         d = @dB(
   a = "hud"
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public HUDPosition.a m;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background Color",
         c = "7/7/7/146",
         d = @dB(
   a = "displayMode",
   b = {"background"}
),
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public Color n;
      @ModConfigAnnotation(
         a = "dynamicColor",
         b = "Dynamic Color",
         c = "true",
         d = @dB(
   a = "hud"
),
         e = @ModConfigValueAnnotation(
   a = 14
)
      )
      public boolean o;
      @ModConfigAnnotation(
         a = "color",
         b = "Color",
         c = "false/255/255/255",
         d = @dB(
   a = "hud"
),
         e = @ModConfigValueAnnotation(
   a = 15
)
      )
      public ChromaColor p;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         d = @dB(
   a = "hud"
),
         e = @ModConfigValueAnnotation(
   a = 16
)
      )
      public boolean q;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh r = new eh("Tab List");
      @ModConfigAnnotation(
         a = "tabList",
         b = "Tablist",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean s;
      @ModConfigAnnotation(
         a = "tabListDynamicColor",
         b = "Tab List Dynamic Color",
         c = "true",
         d = @dB(
   a = "tabList"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public boolean t;
      @ModConfigAnnotation(
         a = "tabListColor",
         b = "Tab List Color",
         c = "255/255/255",
         d = @dB(
   a = "tabList"
),
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      public Color u;
   }
}
