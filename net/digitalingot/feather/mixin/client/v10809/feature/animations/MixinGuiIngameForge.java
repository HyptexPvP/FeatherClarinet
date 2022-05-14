package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraftforge.client.GuiIngameForge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;

@Mixin({GuiIngameForge.class})
public abstract class MixinGuiIngameForge extends GuiIngame {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);

   public MixinGuiIngameForge(Minecraft var1) {
      super(var1);
   }

   @Redirect(
      method = {"renderHUDText(II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawRect(IIIII)V"
),
      require = 2,
      allow = 2
   )
   private void feather$legacyDebugRect(int var1, int var2, int var3, int var4, int var5) {
      OldAnimations var6 = feather$ANIMATIONS_PROVIDER.a();
      if (!var6.m() || !var6.k().q) {
         func_73734_a(var1, var2, var3, var4, var5);
      }

   }

   @Redirect(
      method = {"renderHUDText(II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawString(Ljava/lang/String;III)I"
),
      require = 2,
      allow = 2
   )
   private int feather$legacyDebugString(FontRenderer var1, String var2, int var3, int var4, int var5) {
      OldAnimations var6 = feather$ANIMATIONS_PROVIDER.a();
      boolean var7 = var6.m() && var6.k().q;
      return var1.func_175065_a(var2, (float)var3, (float)var4, var5, var7);
   }

   @Redirect(
      method = {"renderHealth(II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V"
),
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V",
   shift = Shift.AFTER,
   ordinal = 0
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V",
   shift = Shift.BEFORE,
   ordinal = 3
)
),
      require = 2,
      allow = 2
   )
   private void feather$legacyHealth(GuiIngameForge var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      OldAnimations var8 = feather$ANIMATIONS_PROVIDER.a();
      if (!var8.m() || !var8.k().p) {
         this.func_73729_b(var2, var3, var4, var5, var6, var7);
      }

   }
}
