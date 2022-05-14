package net.digitalingot.feather.mixin.client.entity;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.mods.Togglesprint;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({EntityPlayerSP.class})
public abstract class MixinEntityPlayerSP extends AbstractClientPlayer {
   @Unique
   private static final dl<Togglesprint> TOGGLE_SPRINT_PROVIDER = ConfigManager.a(Togglesprint.class);
   @Shadow
   @Final
   public NetHandlerPlayClient field_71174_a;

   public MixinEntityPlayerSP(World var1, GameProfile var2) {
      super(var1, var2);
   }

   @ModifyVariable(
      method = {"onLivingUpdate()V"},
      at = @At(
   value = "STORE",
   ordinal = 0,
   opcode = 54
),
      ordinal = 3,
      require = 1,
      allow = 1
   )
   private boolean toggleSprint$enoughEnergy(boolean var1) {
      if ((float)this.func_71024_bL().func_75116_a() > 6.0F && !this.field_71075_bZ.field_75100_b) {
         return true;
      } else {
         Togglesprint var2 = TOGGLE_SPRINT_PROVIDER.a();
         if (!this.field_71075_bZ.field_75101_c) {
            return false;
         } else {
            return var2 == null || var2.q();
         }
      }
   }

   @Redirect(
      method = {"onLivingUpdate()V"},
      slice = @Slice(
   from = @At(
   value = "CONSTANT",
   opcode = 16,
   args = {"intValue=7"}
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z"
),
      require = 1,
      allow = 1
   )
   private boolean toggleSprint$alwaysSprint(KeyBinding var1) {
      if (var1.func_151470_d()) {
         return true;
      } else {
         Togglesprint var2 = TOGGLE_SPRINT_PROVIDER.a();
         return var2 != null && var2.o();
      }
   }

   @Redirect(
      method = {"onLivingUpdate()V"},
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;isCurrentViewEntity()Z"
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;isRidingHorse()Z"
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/entity/player/PlayerCapabilities;getFlySpeed()F",
   opcode = 180
),
      require = 2,
      allow = 2
   )
   private float toggleSprint$getFlySpeed(PlayerCapabilities var1) {
      Togglesprint var2 = TOGGLE_SPRINT_PROVIDER.a();
      return var2 == null ? var1.func_75093_a() : 0.05F * (var2.r() ? (float)var2.s() : 1.0F);
   }

   @Overwrite
   public void func_71165_d(String var1) {
      var1 = ((ChatEvent)ChatEvent.a.a()).sendChat(var1);
      if (var1 != null) {
         this.field_71174_a.func_147297_a(new C01PacketChatMessage(var1));
      }

   }
}
