package net.digitalingot.feather.mixin.client.renderer;

import java.awt.Color;
import net.digitalingot.feather.ae;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.event.OrientEvent;
import net.digitalingot.feather.event.TurnEvent;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.mods.WeatherChanger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class MixinEntityRenderer implements IResourceManagerReloadListener {
   @Shadow
   private Minecraft field_78531_r;
   @Shadow
   @Final
   private int[] field_78504_Q;
   @Shadow
   @Final
   private DynamicTexture field_78513_d;
   @Shadow
   private boolean field_78536_aa;
   @Unique
   private static final dl<CoreMod> CORE_PROVIDER = ConfigManager.a(CoreMod.class);
   @Unique
   private static final dl<WeatherChanger> WEATHER_CHANGER_PROVIDER = ConfigManager.a(WeatherChanger.class);

   @Inject(
      method = {"orientCamera"},
      at = {@At("HEAD")}
   )
   private void feather$impl$OrientCameraEventPre(float var1, CallbackInfo var2) {
      OrientEvent.a.a().orient(this.field_78531_r.func_175606_aa());
   }

   @Inject(
      method = {"orientCamera"},
      at = {@At("TAIL")}
   )
   private void feather$impl$OrientCameraEventPost(CallbackInfo var1) {
      OrientEvent.b.a().orient(this.field_78531_r.func_175606_aa());
   }

   @Redirect(
      method = {"updateCameraAndRender"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;setAngles(FF)V"
),
      require = 2,
      allow = 2
   )
   private void feather$cameraAnglesEvent(EntityPlayerSP var1, float var2, float var3) {
      ae var4 = TurnEvent.a.a().turn(var2, var3);
      if (var4 != ae.FAIL) {
         var1.func_70082_c(var2, var3);
      }

   }

   @Redirect(
      method = {"renderRainSnow"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;"
),
      require = 8,
      allow = 8
   )
   public WorldRenderer feather$weatherChanger$renderRainSnow(WorldRenderer var1, float var2, float var3, float var4, float var5) {
      WeatherChanger var6 = WEATHER_CHANGER_PROVIDER.a();
      if (var6 != null && var6.m()) {
         Color var7 = var6.k().b;
         return var1.func_181669_b(var7.getRed(), var7.getGreen(), var7.getBlue(), (int)(var5 * 255.0F));
      } else {
         return var1.func_181666_a(var2, var3, var4, var5);
      }
   }

   @Inject(
      method = {"updateLightmap"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/profiler/Profiler;startSection(Ljava/lang/String;)V",
   shift = Shift.BEFORE,
   ordinal = 0
)},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$fullbright(CallbackInfo var1) {
      if (this.field_78531_r.field_71441_e != null) {
         CoreMod var2 = CORE_PROVIDER.a();
         if (var2 != null && var2.m() && var2.k().d) {
            var1.cancel();

            for(int var3 = 0; var3 < 256; ++var3) {
               this.field_78504_Q[var3] = -1;
            }

            this.field_78513_d.func_110564_a();
            this.field_78536_aa = false;
         }
      }
   }
}
