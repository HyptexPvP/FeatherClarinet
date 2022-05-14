package net.digitalingot.feather.mods;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ForkJoinPool;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.fW;
import net.digitalingot.feather.fY;
import net.digitalingot.feather.ga;
import net.digitalingot.feather.gb;
import net.digitalingot.feather.gc;
import net.digitalingot.feather.gd;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.components.TextLength;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.JoinLevelEvent;
import net.digitalingot.feather.event.RenderEvent2D;
import net.digitalingot.feather.event.Track;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.CurrentServer;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public class LevelHead extends fW<HypixelMod.a> {
   public static final int c = 9;
   private static final int d = 20;
   private static final int e = 100;
   private static final int f = 500;
   private static final int g = 100;
   private static final int h = 1;
   private static final long i = 1000L;
   private static final long j = 1000L;
   private Minecraft k;
   private final List<UUID> l = new ArrayList();
   private final Map<UUID, ga> m = Maps.newHashMap();
   private final List<ga> n = Lists.newArrayList();
   private final Map<UUID, fY> o = Collections.synchronizedMap(new LinkedHashMap());
   private long p = 0L;
   private int q = 0;
   private net.digitalingot.feather.util.LevelHead.a r = null;
   private boolean s = false;

   public LevelHead(@NotNull Mod<HypixelMod.a> var1) {
      super(var1);
   }

   @Override
   public boolean b() {
      return this.a.k().r;
   }

   @Override
   public void a() {
      this.k = Minecraft.func_71410_x();
      Track.a.a(var1 -> {
         if (this.g()) {
            if (var1 instanceof EntityPlayer) {
               if (net.digitalingot.feather.e.c().g() == CurrentServer.HYPIXEL) {
                  UUID var2 = var1.func_110124_au();
                  if (!this.m.containsKey(var2)) {
                     ga var3 = new ga(var2);
                     this.m.put(var2, var3);
                     this.n.add(var3);
                  }

               }
            }
         }
      });
      Track.b.a(var1 -> {
         if (this.g()) {
            if (var1 instanceof EntityPlayer) {
               if (net.digitalingot.feather.e.c().g() == CurrentServer.HYPIXEL) {
                  UUID var2 = var1.func_110124_au();
                  this.n.remove(this.m.remove(var2));
                  this.l.remove(var2);
               }
            }
         }
      });
      JoinLevelEvent.a.a((var1, var2) -> {
         if (this.g()) {
            if (var1 == this.k.field_71439_g) {
               this.m.clear();
               this.n.clear();
               this.l.clear();
               this.f();
            }
         }
      });
      Events.a.a(var1 -> {
         if (this.g()) {
            if (var1 == Events.c.END) {
               if (net.digitalingot.feather.e.c().g() == CurrentServer.HYPIXEL) {
                  if (this.r == null && !this.s) {
                     this.s = true;
                     ForkJoinPool.commonPool().execute(() -> this.r = net.digitalingot.feather.util.LevelHead.a());
                  }

                  Iterator var2 = this.n.iterator();

                  while(var2.hasNext()) {
                     ga var3 = (ga)var2.next();
                     if (var3.b() > 100) {
                        this.l.add(var3.a());
                        var2.remove();
                     }
                  }

                  if (this.p != 0L && System.currentTimeMillis() > this.p) {
                     this.p = 0L;
                  }

               }
            }
         }
      });
      RenderEvent2D.a.a((var1, var2) -> {
         if (this.g()) {
            if (net.digitalingot.feather.e.c().g() == CurrentServer.HYPIXEL) {
               UUID var3 = var1.func_110124_au();
               float var4 = 0.0F;
               var4 = var2.b();
               if (var3 != this.k.field_71439_g.func_110124_au()) {
                  if (!this.l.contains(var3)) {
                     return;
                  }
               } else if (!this.a.k().s) {
                  return;
               }

               fY var5 = (fY)this.o.get(var3);
               if (var5 == null) {
                  if (this.p == 0L) {
                     this.b(var3);
                  }

               } else if (!(var5.a() instanceof gc)) {
                  int var6 = this.a(var5.a(), (int)var4);
                  var2.b(var4 - (float)var6);
               }
            }
         }
      });
   }

   private void f() {
      if (this.o.size() > 500) {
         Iterator var1 = this.o.keySet().iterator();

         for(int var2 = 0; var2 < 500 && var1.hasNext(); ++var2) {
            var1.next();
            var1.remove();
         }
      }

   }

   public boolean a(UUID var1) {
      fY var2 = (fY)this.o.get(var1);
      return var2 != null && !(var2.a() instanceof gc);
   }

   private int a(gb var1, int var2) {
      hH var3 = hH.a();
      FontRenderer var4 = this.k.field_71466_p;
      Tessellator var5 = Tessellator.func_178181_a();
      WorldRenderer var6 = var5.func_178180_c();
      String var7 = this.a.k().v ? this.a.k().w.trim() + " " : "";
      String var8 = this.a.k().z ? " " + this.a.k().A.trim() : "";
      String var9 = var7 + var1.a() + var8;
      int var10 = var4.func_78256_a(var9);
      int var11 = var10 / 2;
      RenderUtil.m();
      var6.func_181668_a(7, DefaultVertexFormats.field_181706_f);
      var6.func_181662_b((double)(-var11 - 1), (double)var2, 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var6.func_181662_b((double)(-var11 - 1), (double)(9 + var2), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var6.func_181662_b((double)(var11 + 1), (double)(9 + var2), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var6.func_181662_b((double)(var11 + 1), (double)var2, 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var5.func_78381_a();
      RenderUtil.n();
      float var12 = (float)(-var10) / 2.0F;
      RenderUtil.e();
      RenderUtil.a(true);
      if (this.a.k().v) {
         var3.a(var7, var12, (float)var2, this.a.k().x.a(), false, this.a.k().x.b());
         var12 += (float)var4.func_78256_a(var7);
      }

      var3.a(var1.a(), var12, (float)var2, this.a.k().t.a(), false, this.a.k().t.b());
      var12 += (float)var4.func_78256_a(var1.a());
      if (this.a.k().z) {
         var3.a(var8, var12, (float)var2, this.a.k().B.a(), false, this.a.k().B.b());
      }

      RenderUtil.a(false);
      RenderUtil.f();
      return var4.field_78288_b;
   }

   private void b(UUID var1) {
      if (this.r != null && !this.r.a()) {
         if (this.q >= 100) {
            this.p = System.currentTimeMillis() + 1000L;
            this.q = 0;
         } else {
            ++this.q;
            this.o.put(var1, new fY(new gc(), ""));
            ForkJoinPool.commonPool().execute(() -> {
               gd var2 = net.digitalingot.feather.util.LevelHead.a(var1, this.r.c());
               if (!var2.g("success")) {
                  var2.b("strlevel", "Error");
               }

               gb var3 = new gb(var2.j("level"));
               this.o.put(var1, new fY(var3, var2.j("strlevel")));
            });
         }
      }
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("LevelHead");
      @ModConfigAnnotation(
         a = "showSelf",
         b = "Show Self",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b = false;
      @ModConfigAnnotation(
         a = "levelColor",
         b = "Nametag Color",
         c = "false/255/255/0",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public ChromaColor c;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh d = new eh("Prefix");
      @ModConfigAnnotation(
         a = "prefixEnabled",
         b = "Prefix",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "prefixText",
         b = "Text",
         c = "Level:",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String i;
      @ModConfigAnnotation(
         a = "prefixColor",
         b = "Color",
         c = "false/0/255/255",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public ChromaColor j;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh k = new eh("Suffix");
      @ModConfigAnnotation(
         a = "suffixEnabled",
         b = "Suffix",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean l;
      @ModConfigAnnotation(
         a = "suffixText",
         b = "Text",
         c = "Level",
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String m;
      @ModConfigAnnotation(
         a = "suffixColor",
         b = "Color",
         c = "false/0/255/255",
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      public ChromaColor n;
   }
}
