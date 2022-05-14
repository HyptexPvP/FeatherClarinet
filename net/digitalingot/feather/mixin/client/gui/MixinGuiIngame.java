package net.digitalingot.feather.mixin.client.gui;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.HUDEdiorUI;
import net.digitalingot.feather.mods.BossBarMod;
import net.digitalingot.feather.mods.ModPosition;
import net.digitalingot.feather.mods.ScoreboardMod;
import net.digitalingot.feather.util.MatrixUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.scoreboard.ScoreObjective;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngame.class})
public abstract class MixinGuiIngame extends Gui {
   @Unique
   private static final dl<ScoreboardMod> SCOREBOARD_PROVIDER = ConfigManager.a(ScoreboardMod.class);
   @Unique
   private static final dl<BossBarMod> BOSS_BAR_PROVIDER = ConfigManager.a(BossBarMod.class);
   @Final
   @Shadow
   protected Minecraft field_73839_d;

   @Inject(
      method = {"renderScoreboard"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$renderScoreboard(ScoreObjective var1, ScaledResolution var2, CallbackInfo var3) {
      var3.cancel();
      ScoreboardMod var4 = SCOREBOARD_PROVIDER.a();
      if (var4 != null) {
         var4.a(new MatrixUtils(), var1);
      }

   }

   @Inject(
      method = {"renderBossHealth()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/entity/boss/BossStatus;statusBarTime:I",
   opcode = 179,
   ordinal = 0,
   shift = Shift.AFTER
)},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$renderBossHealth(CallbackInfo var1) {
      var1.cancel();
      BossBarMod var2 = BOSS_BAR_PROVIDER.a();
      if (var2.m() && !(this.field_73839_d.field_71462_r instanceof HUDEdiorUI)) {
         ModPosition var3 = var2.e();
         var3.f();
         BossBarMod.a var4 = var2.k();
         int var5 = var2.b();
         int var6 = (int)(BossStatus.field_82828_a * (float)(var5 + 1));
         int var7 = (int)((double)var4.e().getStartX(var2) / var4.d);
         int var8 = (int)((double)(var4.i().getStartY(var2) + 12) / var4.d);
         this.func_73729_b(var7, var8, 0, 74, 182, 5);
         this.func_73729_b(var7, var8, 0, 74, 182, 5);
         if (var6 > 0) {
            this.func_73729_b(var7, var8, 0, 79, var6, 5);
         }

         String var9 = BossStatus.field_82827_c;
         var3.a(var9, (float)((var5 - var3.a(var9)) / 2), 2.0F, var4.i, var4.j);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_73839_d.func_110434_K().func_110577_a(field_110324_m);
         var3.e();
      }
   }
}
