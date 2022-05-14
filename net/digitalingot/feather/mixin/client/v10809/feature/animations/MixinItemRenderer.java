package net.digitalingot.feather.mixin.client.v10809.feature.animations;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.OldAnimations;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ItemRenderer.class})
public abstract class MixinItemRenderer {
   @Unique
   private static final dl<OldAnimations> feather$ANIMATIONS_PROVIDER = ConfigManager.a(OldAnimations.class);
   @Shadow
   @Final
   private Minecraft field_78455_a;
   @Shadow
   private ItemStack field_78453_b;
   @Shadow
   private float field_78454_c;
   @Shadow
   private float field_78451_d;
   @Shadow
   private int field_78450_g;
   @Unique
   private float feather$blockHitSwingProgress;

   @Inject(
      method = {"transformFirstPersonItem(FF)V"},
      at = {@At("HEAD")},
      require = 1,
      allow = 1
   )
   private void feather$legacyAnimations(float var1, float var2, CallbackInfo var3) {
      OldAnimations var4 = feather$ANIMATIONS_PROVIDER.a();
      if (var4.m()) {
         OldAnimations.a var5 = var4.k();
         if (this.field_78453_b != null) {
            if (var5.e) {
               Item var6 = this.field_78453_b.func_77973_b();
               if (var6 == Items.field_151146_bM || var6 == Items.field_151112_aM) {
                  GlStateManager.func_179109_b(0.08F, -0.027F, -0.33F);
                  GlStateManager.func_179152_a(0.93F, 1.0F, 1.0F);
               }
            }

            if (var5.d) {
               ItemStack var7 = this.field_78455_a.field_71439_g.func_71011_bu();
               if (var7 != null && var7.func_77973_b() == Items.field_151031_f) {
                  GlStateManager.func_179109_b(-0.01F, 0.05F, -0.06F);
               }
            }
         }

         if (var5.o && var2 != 0.0F) {
            EntityPlayerSP var8 = this.field_78455_a.field_71439_g;
            if (!var8.func_70632_aY() && !var8.func_70113_ah() && !var8.func_71039_bw()) {
               GlStateManager.func_179152_a(0.85F, 0.85F, 0.85F);
               GlStateManager.func_179109_b(-0.06F, 0.003F, 0.05F);
            }
         }

      }
   }

   @Inject(
      method = {"updateEquippedItem()V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void feather$legacyItemUpdate(CallbackInfo var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      if (var2.m() && var2.k().n) {
         var1.cancel();
         this.field_78451_d = this.field_78454_c;
         EntityPlayerSP var3 = this.field_78455_a.field_71439_g;
         ItemStack var4 = var3.field_71071_by.func_70448_g();
         boolean var5 = this.field_78450_g == var3.field_71071_by.field_70461_c && var4 == this.field_78453_b;
         if (this.field_78453_b == null && var4 == null) {
            var5 = true;
         }

         if (var4 != null
            && this.field_78453_b != null
            && var4 != this.field_78453_b
            && var4.func_77973_b() == this.field_78453_b.func_77973_b()
            && var4.func_77952_i() == this.field_78453_b.func_77952_i()) {
            this.field_78453_b = var4;
            var5 = true;
         }

         float var6 = (var5 ? 1.0F : 0.0F) - this.field_78454_c;
         if (var6 < -0.4F) {
            var6 = -0.4F;
         } else if (var6 > 0.4F) {
            var6 = 0.4F;
         }

         this.field_78454_c += var6;
         if (this.field_78454_c < 0.1F) {
            this.field_78453_b = var4;
            this.field_78450_g = var3.field_71071_by.field_70461_c;
         }

      }
   }

   @Inject(
      method = {"renderItemInFirstPerson(F)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/item/ItemStack;getItemUseAction()Lnet/minecraft/item/EnumAction;",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void feather$blockHitSwingProgress(float var1, CallbackInfo var2) {
      OldAnimations var3 = feather$ANIMATIONS_PROVIDER.a();
      if (var3.m() && var3.k().b) {
         this.feather$blockHitSwingProgress = this.field_78455_a.field_71439_g.func_70678_g(var1);
      } else {
         this.feather$blockHitSwingProgress = 0.0F;
      }

   }

   @ModifyArg(
      method = {"renderItemInFirstPerson(F)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V",
   ordinal = 1
),
      index = 1,
      require = 1,
      allow = 1
   )
   private float feather$legacyBlockHit$eat(float var1) {
      return this.feather$blockHitSwingProgress;
   }

   @Inject(
      method = {"renderItemInFirstPerson(F)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V",
   ordinal = 1,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void feather$legacyEat(CallbackInfo var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      if (var2.m() && var2.k().i) {
         GlStateManager.func_179152_a(0.8F, 1.0F, 1.0F);
         GlStateManager.func_179109_b(-0.2F, -0.1F, 0.0F);
      }

   }

   @ModifyArg(
      method = {"renderItemInFirstPerson(F)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V",
   ordinal = 2
),
      index = 1,
      require = 1,
      allow = 1
   )
   private float feather$legacyBlockHit$block(float var1) {
      return this.feather$blockHitSwingProgress;
   }

   @Inject(
      method = {"renderItemInFirstPerson(F)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/ItemRenderer;doBlockTransformations()V",
   ordinal = 0,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void feather$legacyBlockHit(CallbackInfo var1) {
      OldAnimations var2 = feather$ANIMATIONS_PROVIDER.a();
      if (var2.m() && var2.k().b) {
         GlStateManager.func_179152_a(0.83F, 0.88F, 0.85F);
         GlStateManager.func_179109_b(-0.3F, 0.1F, 0.0F);
      }

   }

   @ModifyArg(
      method = {"renderItemInFirstPerson(F)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/ItemRenderer;transformFirstPersonItem(FF)V",
   ordinal = 3
),
      index = 1,
      require = 1,
      allow = 1
   )
   private float feather$legacyBlockHit$bow(float var1) {
      return this.feather$blockHitSwingProgress;
   }
}
