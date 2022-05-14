package net.digitalingot.feather.mods;

import java.awt.Color;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.mixin.core.IMixinContainerLocalRenderInformation;
import net.digitalingot.feather.mixin.core.IMixinRenderGlobal;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.Chunk;
import org.apache.commons.lang3.math.NumberUtils;

@FeatherModule(
   a = ModsConfig.COORDINATES,
   b = @dn(
   a = "Coordinates",
   b = "https://assets.feathercdn.net/game/mods/coordinates.svg",
   c = "Display your location and world info",
   d = {ModsConponment.Category.PVP, ModsConponment.Category.HUD}
)
)
public class CoordinateMod extends HUDMod<CoordinateMod.a> {
   private static final int c = 2;
   private static final String[] d = new String[]{"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
   private static final String[] e = new String[]{"", "+", "++", "+", "", "-", "--", "-"};
   private static final String[] f = new String[]{"--", "-", "", "+", "++", "+", "", "-"};
   private static final int g = 3;
   private static final int h = 10;
   private final Minecraft i = Minecraft.func_71410_x();
   private String j;
   private int k;

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      byte var3 = 12;
      int var4 = this.b.p ? 2 : 0;
      if (this.b.p) {
         byte var5 = 0;
         byte var6 = 0;
         int var7 = this.b();
         int var8 = this.a();
         this.a.b(var2, var5, var6, var7, var8, this.b.q.getRGB());
      }

      EntityPlayerSP var22 = Minecraft.func_71410_x().field_71439_g;
      int var23 = MathHelper.func_76128_c(var22.field_70169_q);
      int var24 = MathHelper.func_76128_c(var22.field_70167_r);
      int var25 = MathHelper.func_76128_c(var22.field_70166_s);
      int var9 = this.a(var22.field_70177_z);
      String var10 = d[var9];
      String var11 = e[var9];
      String var12 = f[var9];
      BlockPos var13 = new BlockPos(var23, var24, var25);
      Chunk var14 = this.i.field_71441_e.func_175726_f(var13);
      WorldChunkManager var15 = this.i.field_71441_e.func_72959_q();
      BiomeGenBase var16 = var14.func_177411_a(new BlockPos(var23 & 15, var24, var25 & 15), var15);
      this.j = var16.field_76791_y;
      switch(this.b.j) {
         case HORIZONTAL:
            String var26 = "(" + var23 + ", " + (this.b.m ? var24 + ", " : "") + var25 + ")";
            this.a.a(var2, var26, (float)var4, 2.0F, this.b.k.a(), this.b.n, this.b.k.b());
            int var27 = this.a.a(var26) + 3;
            if (this.b.s) {
               this.a.a(var2, this.j, (float)(var4 + var27), 2.0F, this.b.t, this.b.n);
               var27 += this.a.a(this.j) + 3;
            }

            if (this.b.v) {
               String var28 = this.o();
               this.a.a(var2, var28, (float)(var4 + var27), 2.0F, this.b.w, this.b.n);
               var27 += this.a.a(var28) + 3;
            }

            if (this.b.l) {
               this.a.a(var2, var11, (float)(var4 + var27), -1.0F, this.b.z, this.b.n);
               this.a.a(var2, var12, (float)(var4 + var27), 5.0F, this.b.z, this.b.n);
               var27 += this.a.a("++");
            }

            if (this.b.y) {
               this.a.a(var2, var10, (float)(var4 + var27), 2.0F, this.b.z, this.b.n);
               var27 += this.a.a("NW");
            }

            this.k = var27;
            break;
         case VERTICAL:
            String var17 = "X " + var23;
            String var18 = this.b.m ? "Y " + var24 : "";
            String var19 = "Z " + var25;
            int var20 = NumberUtils.max(new int[]{this.a.a(var17), this.a.a(var18), this.a.a(var19)});
            this.a.a(var2, var17, (float)var4, 2.0F, this.b.k, this.b.n);
            if (this.b.m) {
               this.a.a(var2, var18, (float)var4, (float)(var3 + 2), this.b.k, this.b.n);
            }

            if (this.b.y) {
               if (this.b.l && !this.b.m) {
                  this.a.a(var2, var10, (float)(var4 + var20 + 10 + 15), (float)var3 / 2.0F + 2.0F, this.b.z, this.b.n);
               } else {
                  this.a.a(var2, var10, (float)(var4 + var20 + 10), (float)(var3 + 2), this.b.z, this.b.n);
               }
            }

            if (this.b.l) {
               this.a.a(var2, var11, (float)(var4 + var20 + 10), 2.0F, this.b.z, this.b.n);
               this.a.a(var2, var12, (float)(var4 + var20 + 10), (float)((this.b.m ? 2 : 1) * var3 + 2), this.b.z, this.b.n);
            }

            this.a.a(var2, var19, (float)var4, (float)((this.b.m ? 2 : 1) * var3 + 2), this.b.k, this.b.n);
            if (this.b.s) {
               this.a.a(var2, this.j, (float)var4, (float)((this.b.m ? 3 : 2) * var3 + 2), this.b.t, this.b.n);
            }

            if (this.b.v) {
               int var21 = 0;
               if (this.b.m) {
                  ++var21;
               }

               if (this.b.s) {
                  ++var21;
               }

               this.a.a(var2, this.o(), (float)var4, (float)((2 + var21) * var3 + 2), this.b.w, this.b.n);
            }
      }

   }

   @Override
   public int a() {
      return this.b.j == CoordinateMod.a.a.HORIZONTAL ? 14 : (2 + (this.b.s ? 1 : 0) + (this.b.m ? 1 : 0) + (this.b.v ? 1 : 0)) * 12 + 2;
   }

   @Override
   public int b() {
      try {
         int var1;
         if (this.b.j == CoordinateMod.a.a.VERTICAL) {
            int var2 = this.a.a("X -17777");
            var2 += this.b.y ? 10 + this.a.a("NW") : 0;
            int var3 = this.b.v ? this.a.a(this.o()) : 0;
            int var4 = this.b.s ? this.a.a(this.j) : 0;
            var1 = NumberUtils.max(new int[]{var2, var3, var4});
         } else {
            var1 = this.k;
         }

         return this.b.p ? 4 + var1 : var1;
      } catch (NullPointerException var5) {
         return 0;
      }
   }

   private int a(float var1) {
      double var2 = (double)MathHelper.func_76142_g(var1) + 180.0;
      var2 += 22.5;
      var2 %= 360.0;
      var2 /= 45.0;
      return MathHelper.func_76128_c(var2);
   }

   private String o() {
      int var1 = ((IMixinRenderGlobal)this.i.field_71438_f).getViewFrustum().field_178164_f.length;
      int var2 = 0;

      for(Object var4 : ((IMixinRenderGlobal)this.i.field_71438_f).getRenderInfos()) {
         IMixinContainerLocalRenderInformation var5 = (IMixinContainerLocalRenderInformation)var4;
         CompiledChunk var6 = CompiledChunk.field_178502_a;
         CompiledChunk var7 = var5.getRenderChunk().field_178590_b;
         boolean var8 = var7.func_178489_a();
         if (var7 != var6 && !var8) {
            ++var2;
         }
      }

      return String.format("C %d/%d %s", var2, var1, this.i.field_175612_E ? "(s)" : "");
   }

   @HUDConfig(
      d = true,
      b = 28.0
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("General");
      @ModConfigAnnotation(
         a = "orientation",
         b = "Orientation",
         c = "vertical",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public CoordinateMod.a.a j;
      @ModConfigAnnotation(
         a = "coordinatesColor",
         b = "Color",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public ChromaColor k;
      @ModConfigAnnotation(
         a = "directionDetails",
         b = "Direction Details",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean l;
      @ModConfigAnnotation(
         a = "yCoordinate",
         b = "Y Coordinate",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      public boolean m;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 5
)
      )
      public boolean n;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh o = new eh("Background");
      @ModConfigAnnotation(
         a = "background",
         b = "Background",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Color",
         c = "7/7/7/146",
         d = @dB(
   a = "background"
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color q;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh r = new eh("Biome");
      @ModConfigAnnotation(
         a = "biome",
         b = "Biome",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean s;
      @ModConfigAnnotation(
         a = "biomeColor",
         b = "Color",
         d = @dB(
   a = "biome"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      public ChromaColor t;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh u = new eh("Chunk Counter");
      @ModConfigAnnotation(
         a = "chunkCounter",
         b = "Chunk Counter",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean v;
      @ModConfigAnnotation(
         a = "chunkCounterColor",
         b = "Color",
         d = @dB(
   a = "chunkCounter"
),
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      public ChromaColor w;
      @ModConfigValueAnnotation(
         a = 40
      )
      public eh x = new eh("Directions");
      @ModConfigAnnotation(
         a = "directions",
         b = "Directions",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 41
)
      )
      public boolean y;
      @ModConfigAnnotation(
         a = "directionsColor",
         b = "Color",
         c = "false/0/255/255",
         d = @dB(
   a = "directions"
),
         e = @ModConfigValueAnnotation(
   a = 42
)
      )
      public ChromaColor z;

      public static enum a {
         @dw(
            a = "horizontal",
            b = "Horizontal"
         )
         HORIZONTAL,
         @dw(
            a = "vertical",
            b = "Vertical"
         )
         VERTICAL;
      }
   }
}
