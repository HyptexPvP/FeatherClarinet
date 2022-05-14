package net.digitalingot.feather.mixin.client.renderer.entity;

import net.digitalingot.feather.dl;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.CoreMod;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({RendererLivingEntity.class})
public abstract class MixinRendererLivingEntity<T extends EntityLivingBase> extends Render<T> {
   private static final dl<CoreMod> CORE_PROVIDER = ConfigManager.a(CoreMod.class);

   @Shadow
   protected abstract boolean func_177070_b(T var1);

   protected MixinRendererLivingEntity(RenderManager var1) {
      super(var1);
   }

   @Redirect(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RendererLivingEntity;canRenderName(Lnet/minecraft/entity/EntityLivingBase;)Z"
),
      require = 1,
      allow = 1
   )
   public boolean alwaysNametag$renderName$canRenderName(RendererLivingEntity<T> var1, T var2) {
      CoreMod var3 = CORE_PROVIDER.a();
      return var3.k().e && var2 == this.field_76990_c.field_78734_h && !var2.func_82150_aj() || this.func_177070_b((T)var2);
   }
}
