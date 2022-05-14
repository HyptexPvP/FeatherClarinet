package net.digitalingot.feather.mixin.client;

import com.google.common.util.concurrent.ListenableFuture;
import net.digitalingot.feather.d;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.GUIUtil;
import net.digitalingot.feather.mods.CoreMod;
import net.minecraft.client.LoadingScreenRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.profiler.IPlayerUsage;
import net.minecraft.util.IThreadListener;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Minecraft.class})
public abstract class MixinMinecraft implements IPlayerUsage, IThreadListener {
   @Unique
   private static final dl<CoreMod> CORE_PROVIDER = ConfigManager.a(CoreMod.class);
   @Shadow
   private boolean field_71431_Q;
   @Shadow
   public GuiScreen field_71462_r;
   @Shadow
   public boolean field_71415_G;
   @Shadow
   public EntityPlayerSP field_71439_g;

   @Shadow
   public abstract ListenableFuture<Object> func_152344_a(Runnable var1);

   @Shadow
   public abstract void func_71352_k();

   @Inject(
      method = {"toggleFullscreen()V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$borderlessFullscreen$checkCore(CallbackInfo var1) {
      if (CORE_PROVIDER.a() == null) {
         var1.cancel();
         d.a(this::func_71352_k);
      }

   }

   @Inject(
      method = {"toggleFullscreen()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/client/settings/GameSettings;fullScreen:Z",
   ordinal = 0,
   opcode = 181,
   shift = Shift.AFTER
)},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$borderlessFullscreen(CallbackInfo var1) {
      if (CORE_PROVIDER.a().k().c) {
         GUIUtil.a(this.field_71431_Q);
         var1.cancel();
      }

   }

   @Inject(
      method = {"toggleFullscreen()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lorg/lwjgl/opengl/Display;setFullscreen(Z)V",
   shift = Shift.AFTER,
   remap = false
)},
      require = 1,
      allow = 1
   )
   private void feather$resizeFix(CallbackInfo var1) {
      if (!this.field_71431_Q) {
         Display.setResizable(false);
         Display.setResizable(true);
      }

   }

   @Inject(
      method = {"isFramerateLimitBelowMax"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$frameLimit(CallbackInfoReturnable<Boolean> var1) {
      if (this.field_71415_G && BrowserUtils.INSTANCE.isOpen()) {
         var1.setReturnValue(false);
         var1.cancel();
      }

   }

   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/LoadingScreenRenderer;resetProgressAndMessage(Ljava/lang/String;)V"
)
   )
   public void feather$instantDimensionSwap$loadWorld$resetProgressAndMessage(LoadingScreenRenderer var1, String var2) {
   }

   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/LoadingScreenRenderer;displayLoadingString(Ljava/lang/String;)V"
)
   )
   public void feather$instantDimensionSwap$loadWorld$displayLoadingString(LoadingScreenRenderer var1, String var2) {
   }

   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/lang/System;gc()V",
   remap = false
),
      require = 1,
      allow = 1
   )
   public void feather$instantDimensionSwap() {
   }
}
