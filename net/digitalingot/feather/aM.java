package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

public class aM {
   @NotNull
   private static final ImmutableMap<Integer, Integer> a = ImmutableMap.builder()
      .put(0, 6)
      .put(1, 2)
      .put(2, 4)
      .put(3, 0)
      .put(4, 1)
      .put(5, 3)
      .put(6, 5)
      .put(7, 7)
      .build();

   public static void a(@NotNull ConfigManager var0) {
      cv var1 = new cv(b(var0));
      e.c().a().b(var1);
   }

   @NotNull
   private static Map<Integer, cv.a> b(@NotNull ConfigManager var0) {
      TreeMap var1 = new TreeMap();

      for(Mod var3 : var0.f().values()) {
         HUD var4 = var3.k();
         dt var5 = (dt)var4.getClass().getDeclaredAnnotation(dt.class);
         if (var5 != null) {
            dy var6 = var5.b();
            if (!var6.a().isEmpty() && var4.g && var4.f) {
               cv.a var7 = new cv.a(var6.a(), var6.b(), var6.c());
               var1.put(var6.d(), var7);
            }
         }
      }

      HashMap var8 = new HashMap(var1.size());
      int var9 = 0;

      for(cv.a var11 : var1.values()) {
         var8.put((Integer)a.get(var9++), var11);
      }

      return var8;
   }
}
