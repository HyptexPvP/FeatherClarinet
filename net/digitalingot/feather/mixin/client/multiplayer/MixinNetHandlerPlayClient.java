package net.digitalingot.feather.mixin.client.multiplayer;

import net.digitalingot.feather.event.HurtEvent;
import net.digitalingot.feather.event.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.S01PacketJoinGame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetHandlerPlayClient.class})
public abstract class MixinNetHandlerPlayClient implements INetHandlerPlayClient {
   @Shadow
   private Minecraft field_147299_f;
   private static final byte STATUS_HURT_ANIMATION = 2;

   @Redirect(
      method = {"handleEntityStatus"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/entity/Entity;handleStatusUpdate(B)V"
),
      require = 1,
      allow = 1
   )
   private void feather$entityHurtEvent(Entity var1, byte var2) {
      if (var2 == 2) {
         HurtEvent.a.a().hurt((EntityLivingBase)var1);
      }

      var1.func_70103_a(var2);
   }

   @Inject(
      method = {"handleJoinGame"},
      at = {@At("TAIL")}
   )
   public void feather$playerLoggedInEvent(S01PacketJoinGame var1, CallbackInfo var2) {
      PlayerEvent.a.a().on(this.field_147299_f.field_71439_g, (NetHandlerPlayClient)this);
   }

   @ModifyArg(
      method = {"handleJoinGame", "handleRespawn"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"
)
   )
   private GuiScreen feather$instantDimensionSwitch(GuiScreen var1) {
      return null;
   }
}
