package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

@FeatherModule(
   a = ModsConfig.DIRECTION,
   b = @dn(
   a = "Direction",
   b = "https://assets.feathercdn.net/game/mods/direction.svg",
   c = "Display your cardinal direction",
   d = {ModsConponment.Category.HUD}
)
)
public class DirectionMod extends HUDMod<DirectionMod.a> {
   private static final float c = 33.33F;
   private static final float d = 33.335F;
   private static final float e = 0.33330002F;
   private static final float f = 0.33335F;
   private static final Minecraft g = Minecraft.func_71410_x();
   private ResourceLocation h;
   private int i;
   private int j;
   private float k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private float t;
   private float u;
   private int v;
   private int w;

   public DirectionMod() {
      this.v = (int)(0.33330002F * this.t);
      this.w = (int)(0.33335F * this.t);
   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      this.a(var2);
   }

   public void a(MatrixUtils var1) {
      this.b(var1);
      this.c(var1);
   }

   private void b(MatrixUtils var1) {
      boolean var2 = false;
      boolean var3 = false;
      float var4 = g.field_71439_g.field_70177_z;
      if (var4 < 0.0F) {
         var4 += 360.0F;
      }

      float var5 = (-this.u + var4 * this.k + 7.5F * this.k) % (float)this.i;
      RenderUtil.a(0, this.h);
      this.a.a(var1, 0, 0, this.s, this.q, this.l, this.m);
      this.a.a(var1, 0, 0, var5, 0.0F, this.w, this.j, this.s, this.q, (float)this.i, (float)this.j, this.n, this.o);
      this.a.a(var1, 0 + this.s, 0, this.r, this.q, this.m, this.m);
      this.a.a(var1, 0 + this.s, 0, var5 + (float)this.w, 0.0F, this.v, this.j, this.r, this.q, (float)this.i, (float)this.j, this.o, this.o);
      this.a.a(var1, 0 + this.s + this.r, 0, this.s, this.q, this.m, this.l);
      this.a
         .a(
            var1,
            0 + this.s + this.r,
            0,
            var5 + (float)this.w + (float)this.v,
            0.0F,
            this.w,
            this.j,
            this.s,
            this.q,
            (float)this.i,
            (float)this.j,
            this.o,
            this.n
         );
   }

   private void c(MatrixUtils var1) {
      float var2 = (float)(this.p - this.b.k) / 2.0F;
      float var3 = -1.0F;
      float var4 = var3 - (float)this.b.k;
      int var5 = this.b.r.getRed();
      int var6 = this.b.r.getGreen();
      int var7 = this.b.r.getBlue();
      boolean var8 = true;
      RenderUtil.i();
      RenderUtil.m();
      RenderUtil.a(770, 771, 1, 0);
      RenderUtil var9 = RenderUtil.r();
      var9.b(RenderUtil.a.TRIANGLE_FAN, DefaultVertexFormats.field_181706_f);
      var9.a(var1, (double)var2, (double)var3, 0.0).b(var5, var6, var7, 255).s();
      var9.a(var1, (double)(var2 + (float)this.b.k), (double)var4, 0.0).b(var5, var6, var7, 255).s();
      var9.a(var1, (double)(var2 - (float)this.b.k), (double)var4, 0.0).b(var5, var6, var7, 255).s();
      var9.t();
      RenderUtil.n();
      RenderUtil.j();
   }

   private void o() {
      this.h = this.b.j.texture;
      this.i = this.b.j.textureWidth;
      this.j = this.b.j.textureHeight;
      this.k = this.b.j.pixelsPerDegree;
   }

   private void p() {
      this.m = this.b.p.getRGB();
      this.l = this.m & 16777215;
      this.o = this.b.q.a();
      this.n = this.o & 16777215;
   }

   private void q() {
      this.p = this.b.n;
      this.q = (int)((double)this.b.k * 0.75 + 18.0);
      this.r = (int)(0.33330002F * (float)this.p);
      this.s = (int)(0.33335F * (float)this.p);
      this.t = (float)this.b.m * this.k;
      this.u = this.t / 2.0F;
      this.v = (int)(0.33330002F * this.t);
      this.w = (int)(0.33335F * this.t);
   }

   @Override
   public void i() {
      this.o();
      this.q();
      this.p();
   }

   @Override
   public int a() {
      return this.q;
   }

   @Override
   public int b() {
      return this.p;
   }

   @HUDConfig(
      d = true,
      b = 30.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Direction");
      @ModConfigAnnotation(
         a = "type",
         b = "Type",
         c = "default",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public DirectionMod.b j;
      @ModConfigAnnotation(
         a = "markerSize",
         b = "Marker Size",
         c = "3",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      @IntegerRange(
         b = 1,
         a = 9
      )
      public int k;
      @ModConfigAnnotation(
         a = "shadow",
         b = "Shadow",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean l;
      @ModConfigAnnotation(
         a = "visibleDegrees",
         b = "Visible Degrees",
         c = "200",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      @IntegerRange(
         b = 45,
         a = 360
      )
      public int m;
      @ModConfigAnnotation(
         a = "width",
         b = "Width",
         c = "200",
         e = @ModConfigValueAnnotation(
   a = 5
)
      )
      @IntegerRange(
         b = 50,
         a = 300
      )
      public int n;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh o = new eh("Colors");
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background Color",
         c = "7/7/7/100",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public Color p;
      @ModConfigAnnotation(
         a = "directionColor",
         b = "Direction Color",
         c = "false/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public ChromaColor q;
      @ModConfigAnnotation(
         a = "markerColor",
         b = "Marker Color",
         c = "255/255/255",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public Color r;

      @Override
      public double c() {
         return (double)hp.c() / hp.g() / 2.0;
      }
   }

   public static enum b {
      @dw(
         a = "default",
         b = "Default"
      )
      DEFAULT("default.png", 1728, 70, 4.8F),
      @dw(
         a = "simple",
         b = "Simple"
      )
      SIMPLE("simple.png", 1728, 84, 4.8F),
      @dw(
         a = "noTick",
         b = "No Tick"
      )
      NO_TICK("no_tick.png", 1728, 84, 4.8F);

      private static final String BASE_PATH = "textures/direction/";
      public final ResourceLocation texture;
      public final int textureWidth;
      public final int textureHeight;
      public final float pixelsPerDegree;

      private b(String var3, int var4, int var5, float var6) {
         this.texture = new ResourceLocation("feather", "textures/direction/" + var3);
         this.textureWidth = var4;
         this.textureHeight = var5;
         this.pixelsPerDegree = var6;
      }
   }
}
