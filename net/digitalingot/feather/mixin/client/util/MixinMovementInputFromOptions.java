package net.digitalingot.feather.mixin.client.util;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.Togglesprint;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MovementInputFromOptions.class})
public abstract class MixinMovementInputFromOptions extends MovementInput {
   @Unique
   private static final dl<Togglesprint> TOGGLE_SPRINT_PROVIDER = ConfigManager.a(Togglesprint.class);
   @Unique
   private static final Minecraft minecraft = Minecraft.func_71410_x();

   @Inject(
      method = {"updatePlayerMoveState"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/util/MovementInputFromOptions;sneak:Z",
   shift = Shift.AFTER,
   opcode = 181,
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void feather$toggleSneak(CallbackInfo var1) {
      Togglesprint var2 = TOGGLE_SPRINT_PROVIDER.a();
      if (var2 != null) {
         if (minecraft.field_71439_g.field_71075_bZ.field_75100_b) {
            var2.c(false);
         }

         this.field_78899_d |= var2.p();
      }

      if (this.field_78899_d) {
         minecraft.field_71439_g.func_70031_b(false);
      }

   }
}
