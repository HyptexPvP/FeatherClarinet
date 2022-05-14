package net.digitalingot.feather.mixin.client.multiplayer;

import java.util.Set;
import net.digitalingot.feather.e;
import net.digitalingot.feather.event.Track;
import net.digitalingot.feather.mods.TimeChanger;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WorldClient.class})
public abstract class MixinWorldClient extends World {
   @Shadow
   @Final
   private Set<Entity> field_73032_d;

   protected MixinWorldClient(ISaveHandler var1, WorldInfo var2, WorldProvider var3, Profiler var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Redirect(
      method = {"tick"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/GameRules;getBoolean(Ljava/lang/String;)Z"
),
      require = 1,
      allow = 1
   )
   private boolean feather$mod$timeChanger$skipCond(GameRules var1, String var2) {
      TimeChanger var3 = e.c().b().b(TimeChanger.class);
      return var3.m() || var1.func_82766_b(var2);
   }

   @ModifyVariable(
      method = {"setWorldTime"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 1,
      allow = 1
   )
   private long feather$mod$timeChanger$setTime(long var1) {
      TimeChanger var3 = e.c().b().b(TimeChanger.class);
      return var3.m() ? var3.b() : var1;
   }

   @Inject(
      method = {"addEntityToWorld"},
      at = {@At("HEAD")}
   )
   public void feather$startTrackingEvent$addEntityToWorld(int var1, Entity var2, CallbackInfo var3) {
      Track.a.a().track(var2);
   }

   @Redirect(
      method = {"removeEntityFromWorld"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/Set;remove(Ljava/lang/Object;)Z",
   remap = false
)
   )
   public boolean feather$stopTrackingEvent$removeEntityFromWorld(Set<Entity> var1, Object var2) {
      Entity var3 = (Entity)var2;
      Track.b.a().track(var3);
      return this.field_73032_d.remove(var3);
   }
}
