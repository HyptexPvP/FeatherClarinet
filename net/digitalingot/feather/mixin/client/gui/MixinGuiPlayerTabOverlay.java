package net.digitalingot.feather.mixin.client.gui;

import java.util.UUID;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.mods.PingMod;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({GuiPlayerTabOverlay.class})
public abstract class MixinGuiPlayerTabOverlay extends Gui {
   @Unique
   private static final String RENDER_PLAYER_LIST = "renderPlayerlist";
   @Unique
   private static final String DRAW_STRING_WITH_SHADOW = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I";
   @Unique
   private static final String GET_PLAYER_NAME = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;";
   @Unique
   private static final String DRAW_PING = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawPing(IIILnet/minecraft/client/network/NetworkPlayerInfo;)V";
   @Unique
   private static final dl<CoreMod> CORE_PROVIDER = ConfigManager.a(CoreMod.class);
   @Unique
   private static final dl<PingMod> PING_PROVIDER = ConfigManager.a(PingMod.class);
   @Unique
   private static UUID feather$tabList$uuid = null;

   @ModifyArg(
      method = {"renderPlayerlist"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;",
   ordinal = 1
),
      index = 0,
      require = 1,
      allow = 1
   )
   private NetworkPlayerInfo feather$tabList$uuid(NetworkPlayerInfo var1) {
      feather$tabList$uuid = var1.func_178845_a().getId();
      return var1;
   }

   @ModifyArgs(
      method = {"renderPlayerlist"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"
),
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;",
   ordinal = 1
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawPing(IIILnet/minecraft/client/network/NetworkPlayerInfo;)V"
)
),
      require = 2,
      allow = 2
   )
   private void feather$tabList$renderName(Args var1) {
      CoreMod var2 = CORE_PROVIDER.a();
      if (var2 != null) {
         float var3 = (float)((Float)var1.get(1)).intValue();
         float var4 = (float)((Float)var1.get(2)).intValue();
         int var5 = var2.a(feather$tabList$uuid, (int)var3, (int)var4);
         if (var5 != 0) {
            var1.set(1, var3 + (float)var5);
         }
      }

   }

   @Inject(
      method = {"drawPing"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$ping$tabList(int var1, int var2, int var3, NetworkPlayerInfo var4, CallbackInfo var5) {
      PingMod var6 = PING_PROVIDER.a();
      if (var6 != null && var6.m()) {
         PingMod.a var7 = var6.k();
         if (var7.s) {
            var5.cancel();
            int var8 = var4.func_178853_c();
            if (var8 != 0) {
               String var9 = String.valueOf(var8);
               int var10 = (int)((float)(var2 + var1 - 14) / 0.6F);
               int var11 = (int)((float)var3 / 0.6F) + 1;
               int var12;
               if (var7.t) {
                  var12 = var6.a(var8);
               } else {
                  var12 = var7.u.getRGB();
               }

               GlStateManager.func_179094_E();
               GL11.glTranslatef(0.0F, 1.0F, 0.0F);
               GL11.glScalef(0.6F, 0.6F, 0.6F);
               hH.a().a(var9, (float)var10, (float)var11, var12, true, false);
               GlStateManager.func_179121_F();
            }
         }
      }
   }
}
