package net.digitalingot.feather.mods;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.gui.HUDEdiorUI;
import net.digitalingot.feather.gui.HUDPosition;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.EnumChatFormatting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FeatherModule(
   a = ModsConfig.SCOREBOARD,
   b = @dn(
   a = "Scoreboard",
   b = "https://assets.feathercdn.net/game/mods/scoreboard.svg",
   c = "Customize scoreboard",
   d = {ModsConponment.Category.HUD}
)
)
public class ScoreboardMod extends HUDMod<ScoreboardMod.a> {
   private static final String c = "§eFeather";
   private static final int d = 5;
   private static final int e = 15;
   private static final int f = 9;
   private static final String g = "#";
   private static final ScoreObjective h = o();
   private static final String i = "    ";

   public void a(MatrixUtils var1, @NotNull ScoreObjective var2) {
      if (this.m() && !(Minecraft.func_71410_x().field_71462_r instanceof HUDEdiorUI)) {
         var1.a((float)this.b.e().getStartX(this), (float)this.b.i().getStartY(this), 0.0F);
         double var3 = this.b.h();
         var1.b(var3, var3, 1.0);
         this.b(var1, var2);
      }
   }

   private void b(MatrixUtils var1, @NotNull ScoreObjective var2) {
      Scoreboard var3 = var2.func_96682_a();
      List var4 = d(var2);
      boolean var5 = true;
      int var6 = this.a(var2, var4);
      int var7 = a(var4);
      int var8 = 0;

      for(Score var10 : var4) {
         String var11 = var10.func_96653_e();
         ScorePlayerTeam var12 = var3.func_96509_i(var11);
         String var13 = a(var12, var11);
         ++var8;
         int var14 = var7 - var8 * 9;
         int var15 = var6 - 4;
         this.a.b(var1, 0, var14, var6, var14 + 9, this.b.m.getRGB());
         this.a.a(var1, var13, 2.0F, (float)var14, this.b.l, false);
         if (this.b.j) {
            String var16 = EnumChatFormatting.RED.toString() + var10.func_96652_c() + " ";
            this.a.a(var1, var16, (float)var15 - (float)this.a.a(var16) / 2.0F, (float)var14, this.b.l, false);
         }

         if (var8 == var4.size()) {
            String var17 = a(var2);
            this.a.b(var1, 0, var14 - 9 - 1, var6, var14, this.b.n.getRGB());
            this.a.a(var1, var17, 2.0F + (float)var6 / 2.0F - (float)this.a.a(var17) / 2.0F, (float)(var14 - 9), this.b.l, false);
         }
      }

   }

   @Override
   public void a(HUDMod.a var1, MatrixUtils var2) {
      if (var1 == HUDMod.a.MOD_LAYOUT) {
         this.b(var2, q());
      }

   }

   @Override
   public int a() {
      return b(q());
   }

   @Override
   public int b() {
      return this.c(q());
   }

   private static ScoreObjective o() {
      Scoreboard var0 = new Scoreboard();
      ScoreObjective var1 = var0.func_96535_a("dummy", IScoreObjectiveCriteria.field_96641_b);
      var1.func_96681_a("§eFeather");
      StringBuilder var2 = new StringBuilder("    ");

      for(int var3 = 5; var3 > 0; --var3) {
         var0.func_96529_a(var2.toString(), var1).func_96647_c(var3);
         var2.append(' ');
      }

      return var1;
   }

   private static String a(@Nullable Team var0, String var1) {
      return ScorePlayerTeam.func_96667_a(var0, var1);
   }

   private static String a(ScoreObjective var0) {
      return var0.func_96678_d();
   }

   private static ScoreObjective p() {
      Minecraft var0 = Minecraft.func_71410_x();
      if (var0.field_71439_g == null) {
         return null;
      } else {
         String var1 = var0.field_71439_g.func_70005_c_();
         Scoreboard var2 = var0.field_71441_e.func_96441_U();
         ScorePlayerTeam var3 = var2.func_96509_i(var1);
         ScoreObjective var4 = null;
         if (var3 != null) {
            int var5 = var3.func_178775_l().func_175746_b();
            if (var5 >= 0) {
               var4 = var2.func_96539_a(3 + var5);
            }
         }

         return var4 != null ? var4 : var2.func_96539_a(1);
      }
   }

   private static ScoreObjective q() {
      ScoreObjective var0 = p();
      return var0 != null ? var0 : h;
   }

   private static int b(ScoreObjective var0) {
      return a(d(var0));
   }

   private static int a(List<Score> var0) {
      return (var0.size() + 1) * 9 + 1;
   }

   private int c(ScoreObjective var1) {
      return this.a(var1, d(var1));
   }

   private int a(ScoreObjective var1, List<Score> var2) {
      Scoreboard var3 = var1.func_96682_a();
      hH var4 = hH.a();
      String var5 = a(var1);
      int var6 = var4.a(var5);
      int var7 = var4.a(": ");
      int var8 = var6;

      for(Score var10 : var2) {
         String var11 = var10.func_96653_e();
         String var12 = a(var3.func_96509_i(var11), var11);
         int var13 = 0;
         var13 += var4.a(var12);
         var13 += var7;
         if (this.b.j) {
            var13 += var7;
            var13 += var4.a(Integer.toString(var10.func_96652_c()));
         }

         var8 = Math.max(var8, var13);
      }

      return Math.max(0, var8 - 1);
   }

   private static List<Score> d(@NotNull ScoreObjective var0) {
      Collection var1 = var0.func_96682_a().func_96534_i(var0);
      List var2 = (List)var1.stream().filter(var0x -> var0x.func_96653_e() != null && !var0x.func_96653_e().startsWith("#")).collect(Collectors.toList());
      return (List<Score>)(var2.size() > 15 ? Lists.newArrayList(Iterables.skip(var2, var1.size() - 15)) : var2);
   }

   @HUDConfig(
      d = true,
      e = true
   )
   @dt(
      a = true
   )
   public static class a extends HUDPosition {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh i = new eh("Scoreboard");
      @ModConfigAnnotation(
         a = "showNumbers",
         b = "Show Numbers",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean j;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh k = new eh("Colors");
      @ModConfigAnnotation(
         a = "textColor",
         b = "Text Color",
         c = "false/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public ChromaColor l;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background",
         c = "0/0/0/80",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public Color m;
      @ModConfigAnnotation(
         a = "titleBackgroundColor",
         b = "Title Background",
         c = "0/0/0/96",
         e = @ModConfigValueAnnotation(
   a = 13
)
      )
      public Color n;

      @Override
      public double c() {
         return (double)hp.c() / hp.g();
      }

      @Override
      public double d() {
         return (double)hp.d() / 2.0 / hp.g();
      }
   }
}
