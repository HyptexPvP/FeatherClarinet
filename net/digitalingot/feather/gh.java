package net.digitalingot.feather;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.digitalingot.feather.gui.Blur;
import net.digitalingot.feather.mods.MotionBlur;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class gh extends FallbackResourceManager {
   private final MotionBlur a;

   public gh(MotionBlur var1) {
      super(null);
      this.a = var1;
   }

   @NotNull
   public Set<String> func_135055_a() {
      return Collections.emptySet();
   }

   @NotNull
   public IResource func_110536_a(@NotNull ResourceLocation var1) {
      return new Blur(this.a);
   }

   @NotNull
   public List<IResource> func_135056_b(ResourceLocation var1) {
      return Collections.emptyList();
   }
}
