package net.digitalingot.feather;

import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.mods.CoreMod;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class eV {
   private static final dl<CoreMod> a = ConfigManager.a(CoreMod.class);
   private static final String[] b = new String[]{
      "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light", "cyan", "purple", "blue", "brown", "green", "red", "black"
   };

   @NotNull
   public static ResourceLocation a(@NotNull ResourceLocation var0) {
      CoreMod var1 = a.a();
      if (var1 == null) {
         return var0;
      } else if (!var1.k().i) {
         return var0;
      } else if (var0.func_110623_a().contains("glass") && var0.func_110623_a().contains(".png")) {
         if (!var1.k().j) {
            for(String var5 : b) {
               if (var0.func_110623_a().contains(var5)) {
                  return var0;
               }
            }
         }

         return new ResourceLocation("feather", "textures/blocks/glass.png");
      } else {
         return var0;
      }
   }
}
