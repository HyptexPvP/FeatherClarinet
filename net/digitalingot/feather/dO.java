package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.util.Map;
import java.util.Map.Entry;
import net.digitalingot.feather.util.BooleanUtil;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.ColorUtil;
import net.digitalingot.feather.util.IntegerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dO {
   private static final Map<Class<?>, dL<?>> a = ImmutableMap.builder()
      .put(Boolean.class, new BooleanUtil())
      .put(Enum.class, new dT())
      .put(Double.class, new dS())
      .put(Integer.class, new IntegerUtil())
      .put(String.class, new dW())
      .put(Color.class, new ColorUtil())
      .put(ChromaColor.class, new dQ())
      .put(is.class, new dV())
      .build();

   @Nullable
   static <T> dL<T> a(@NotNull Class<T> var0) {
      for(Entry var2 : a.entrySet()) {
         Class var3 = (Class)var2.getKey();
         dL var4 = (dL)var2.getValue();
         if (var3.isAssignableFrom(var0)) {
            return var4;
         }
      }

      return null;
   }
}
