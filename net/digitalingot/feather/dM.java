package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.FeatherError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dM<T> {
   private static final Map<Class<?>, String> a = ImmutableMap.builder()
      .put(Boolean.class, "false")
      .put(Double.class, "0.0")
      .put(Integer.class, "0")
      .put(String.class, "")
      .put(Color.class, "255/255/255")
      .put(ChromaColor.class, "false/255/255/255")
      .build();
   @NotNull
   private final dF b;
   @NotNull
   private final dL<T> c;
   @NotNull
   private String d;

   @Nullable
   private static String a(@NotNull Class<?> var0) {
      for(Entry var2 : a.entrySet()) {
         Class var3 = (Class)var2.getKey();
         String var4 = (String)var2.getValue();
         if (var3.isAssignableFrom(var0)) {
            return var4;
         }
      }

      return null;
   }

   public dM(@NotNull Class<T> var1, @NotNull String var2) {
      this(new dF(var1), var2);
   }

   public dM(@NotNull dF var1, @Nullable String var2) {
      this.b = var1;
      this.c = dO.a(var1.a());
      if (this.c == null) {
         throw new IllegalArgumentException("Type " + var1.a().getName() + " (" + var1 + ") not supported");
      } else {
         if (var2 == null) {
            if (var1.c() == null) {
               throw new IllegalStateException("Unannotated type with a null input (" + var1 + ")");
            }

            this.d = this.a(var1);
         } else {
            this.d = var2;
         }

      }
   }

   @NotNull
   private String a(@NotNull dF var1) {
      return !var1.c().c().isEmpty()
         ? var1.c().c()
         : (String)Objects.requireNonNull(a(var1.a()), "No default type for type " + var1.a().getName() + " (" + var1 + ")");
   }

   @NotNull
   public T a() {
      return this.a(false);
   }

   @NotNull
   private T a(boolean var1) {
      Class var2 = this.b.a();

      Object var3;
      try {
         var3 = this.c.a(this.d, var2);
      } catch (FeatherError var5) {
         if (!var1) {
            return this.b();
         }

         throw new FeatherError("Default value \"" + this.d + "\" of type  \"" + var2.getName() + "\" is invalid: " + this.b.b(), var5);
      }

      dH var4 = new dH(this.b);
      if (var4.a(var3)) {
         return (T)var3;
      } else if (var1) {
         throw new FeatherError("Default value \"" + this.d + "\" of type \"" + var2.getName() + "\" is invalid: " + this.b.b());
      } else {
         return this.b();
      }
   }

   @NotNull
   private T b() {
      if (this.b.c() == null) {
         throw new FeatherError("Unannotated type (" + this.b + ") couldn't be parsed.");
      } else {
         this.d = this.a(this.b);
         return this.a(true);
      }
   }
}
