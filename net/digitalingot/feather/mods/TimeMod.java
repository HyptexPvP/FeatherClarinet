package net.digitalingot.feather.mods;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;

@FeatherModule(
   a = ModsConfig.TIME,
   b = @dn(
   a = "Time",
   b = "https://assets.feathercdn.net/game/mods/time.svg",
   c = "Display the current time",
   d = {ModsConponment.Category.HUD}
)
)
public class TimeMod extends HUDMod<TimeMod.a> {
   private static final int c = 10;
   private static final float d = 0.3239F;
   private static final DateTimeFormatter e = DateTimeFormatter.ofPattern("hh:mm a");
   private static final DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
   private static final int g = RenderUtil.a("00:00 AM");
   private static final int h = RenderUtil.a("00:00");
   private static final Minecraft i = Minecraft.func_71410_x();
   private float j;
   private int k;
   private String l;
   private int m;
   private float n;
   private float o;

   @Override
   public void f() {
      Events.a.a(var1 -> {
         if (var1 == Events.c.START && i.field_71439_g != null && this.m()) {
            if (++this.m % 20 == 0) {
               this.o();
            }

         }
      });
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      if (this.b.j == HUDPosition.a.BACKGROUND) {
         this.a.b(var2, 0, 0, (int)this.j, this.k, this.b.n.getRGB());
      }

      this.a.a(var2, this.l, this.n, this.o, this.b.m, this.b.o);
   }

   @Override
   public int a() {
      return this.k;
   }

   @Override
   public int b() {
      return (int)this.j;
   }

   @Override
   public void i() {
      this.o();
      this.p();
   }

   private void o() {
      StringBuilder var1 = new StringBuilder();
      if (this.b.j == HUDPosition.a.BRACKETS) {
         var1.append('[');
      }

      DateTimeFormatter var2 = this.b.k == TimeMod.a.a.HOUR_12 ? e : f;
      String var3 = LocalDateTime.now().format(var2);
      var1.append(var3);
      if (this.b.j == HUDPosition.a.BRACKETS) {
         var1.append(']');
      }

      this.l = var1.toString();
   }

   private void p() {
      int var1 = this.b.k == TimeMod.a.a.HOUR_12 ? g : h;
      if (this.b.j == HUDPosition.a.BACKGROUND) {
         this.j = (float)(var1 + 10);
         this.k = Math.round(this.j * 0.3239F);
      } else {
         this.k = Math.round(RenderUtil.b(this.b.o));
         if (this.b.j == HUDPosition.a.BRACKETS) {
            var1 += RenderUtil.a("[]");
         }

         this.j = (float)var1;
      }

      this.n = (this.j - (float)var1) / 2.0F;
      this.o = ((float)this.k - RenderUtil.b(this.b.o)) / 2.0F;
   }

   @HUDConfig(
      a = 33.0,
      b = 8.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Time");
      @ModConfigAnnotation(
         a = "displayMode",
         b = "Display Mode",
         c = "background",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public HUDPosition.a j;
      @ModConfigAnnotation(
         a = "timeFormat",
         b = "Time Format",
         c = "12",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public TimeMod.a.a k;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh l = new eh("Style");
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public ChromaColor m;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background",
         c = "7/7/7/146",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color n;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public boolean o;

      public static enum a {
         @dw(
            a = "24",
            b = "24h"
         )
         HOUR_24,
         @dw(
            a = "12",
            b = "12h"
         )
         HOUR_12;
      }
   }
}
