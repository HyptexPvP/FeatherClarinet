package net.digitalingot.feather.mixin.client.network;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.digitalingot.feather.e;
import net.digitalingot.feather.mods.NickHider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({NetworkPlayerInfo.class})
public abstract class MixinNetworkPlayerInfo {
   @Shadow
   @Final
   private GameProfile field_178867_a;

   @Inject(
      method = {"getLocationSkin()Lnet/minecraft/util/ResourceLocation;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void nickHider$changePlayerSkin(CallbackInfoReturnable<ResourceLocation> var1) {
      NickHider var2 = e.c().b().b(NickHider.class);
      if (var2.m()) {
         NickHider.b var3 = var2.k();
         UUID var4 = this.field_178867_a.getId();
         UUID var5 = Minecraft.func_71410_x().field_71439_g.func_110124_au();
         ResourceLocation var6 = DefaultPlayerSkin.func_177334_a(var4);
         ResourceLocation var7 = var2.a();
         if (var4.equals(var5)) {
            if (var3.e) {
               var1.setReturnValue(var3.i && var7 != null ? var7 : var6);
            }
         } else if (var3.j) {
            var1.setReturnValue(var6);
         }

      }
   }

   @Inject(
      method = {"getSkinType"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void nickHider$changeSkinType(CallbackInfoReturnable<String> var1) {
      NickHider var2 = e.c().b().b(NickHider.class);
      if (var2.m()) {
         NickHider.b var3 = var2.k();
         if (var3.e && var3.i) {
            ResourceLocation var4 = var2.a();
            if (var4 != null) {
               UUID var5 = this.field_178867_a.getId();
               UUID var6 = Minecraft.func_71410_x().field_71439_g.func_110124_au();
               if (var5.equals(var6)) {
                  var1.setReturnValue(var2.b());
               }

            }
         }
      }
   }

   @Inject(
      method = {"getLocationCape"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void nickHider$changeCape(CallbackInfoReturnable<ResourceLocation> var1) {
      if (var1.getReturnValue() == null) {
         NickHider var2 = e.c().b().b(NickHider.class);
         if (var2.m()) {
            NickHider.b var3 = var2.k();
            if (var3.e && var3.i) {
               UUID var4 = this.field_178867_a.getId();
               UUID var5 = Minecraft.func_71410_x().field_71439_g.func_110124_au();
               if (var4.equals(var5)) {
                  var1.setReturnValue(var2.c());
               }

            }
         }
      }
   }
}
