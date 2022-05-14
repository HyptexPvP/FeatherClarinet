package net.digitalingot.feather.mixin.client.multiplayer;

import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import net.digitalingot.feather.event.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.IChatComponent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetworkManager.class})
public class MixinNetworkManager {
   @Shadow
   private Channel field_150746_k;
   @Shadow
   @Final
   public static AttributeKey<EnumConnectionState> field_150739_c;

   @Inject(
      method = {"closeChannel"},
      at = {@At(
   value = "INVOKE",
   target = "Lio/netty/channel/Channel;close()Lio/netty/channel/ChannelFuture;",
   remap = false
)}
   )
   public void feather$playerLoggedOutEvent(IChatComponent var1, CallbackInfo var2) {
      if (this.field_150746_k.attr(field_150739_c).get() == EnumConnectionState.PLAY) {
         PlayerEvent.b.a().on(Minecraft.func_71410_x().field_71439_g, Minecraft.func_71410_x().func_147114_u());
      }
   }
}
