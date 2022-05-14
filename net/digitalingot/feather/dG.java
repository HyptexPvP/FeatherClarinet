package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.digitalingot.feather.components.Checkbox;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.components.Dropdown;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.components.TextLength;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dG<T> {
   @NotNull
   private final Class<T> a;

   public dG(@NotNull Class<T> var1) {
      this.a = var1;
   }

   @NotNull
   public List<dF> a() {
      ArrayList var1 = new ArrayList();

      for(Field var5 : this.a.getFields()) {
         dF var6 = this.a(var5);
         if (var6 != null) {
            var1.add(var6);
         }
      }

      return var1;
   }

   @Nullable
   private dF a(Field var1) {
      ModConfigAnnotation var2 = (ModConfigAnnotation)var1.getDeclaredAnnotation(ModConfigAnnotation.class);
      if (var2 == null) {
         return null;
      } else {
         Checkbox var3 = (Checkbox)var1.getDeclaredAnnotation(Checkbox.class);
         if (var3 != null && !ClassUtils.isAssignable(var1.getType(), Collection.class, true)) {
            throw new IllegalStateException("@Checkbox applied on a non-Collection field");
         } else {
            TextLength var4 = (TextLength)var1.getDeclaredAnnotation(TextLength.class);
            if (var4 != null && !ClassUtils.isAssignable(var1.getType(), String.class, true)) {
               throw new IllegalStateException("@TextLength applied on a non-String field");
            } else {
               DoubleRange var5 = (DoubleRange)var1.getDeclaredAnnotation(DoubleRange.class);
               if (var5 != null && !ClassUtils.isAssignable(var1.getType(), Double.TYPE, true)) {
                  throw new IllegalStateException("@DoubleRange applied on non-double field");
               } else {
                  IntegerRange var6 = (IntegerRange)var1.getDeclaredAnnotation(IntegerRange.class);
                  if (var6 != null && !ClassUtils.isAssignable(var1.getType(), Integer.TYPE, true)) {
                     throw new IllegalStateException("@IntegerRange applied on non-integer field");
                  } else {
                     dr var7 = (dr)var1.getDeclaredAnnotation(dr.class);
                     dE var8;
                     if (var7 != null) {
                        Method var9 = this.a(var7);
                        if (var9 == null) {
                           throw new IllegalStateException("No matching @AllowedValues found for value = \"" + var7.a() + "\" in class " + this.a.getName());
                        }

                        var8 = new dE(var7, ClassUtils.primitiveToWrapper(var1.getType()), var9);
                     } else {
                        var8 = null;
                     }

                     Dropdown var10 = (Dropdown)var1.getDeclaredAnnotation(Dropdown.class);
                     if (var10 != null) {
                        if (ClassUtils.isAssignable(var1.getType(), String.class, true)) {
                           if (var8 == null) {
                              throw new IllegalStateException("@Dropdown applied on String field without @AllowedValues");
                           }
                        } else if (!ClassUtils.isAssignable(var1.getType(), Enum.class, true)) {
                           throw new IllegalStateException("@Dropdown applied on non-enum or non-String field");
                        }
                     }

                     return new dF(var1, var2, var3, var10, var4, var5, var6, var8);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private Method a(@NotNull dr var1) {
      String var2 = var1.a();

      for(Method var6 : this.a.getMethods()) {
         dr var7 = (dr)var6.getDeclaredAnnotation(dr.class);
         if (var7 != null && Modifier.isStatic(var6.getModifiers()) && var7.a().equals(var2)) {
            return var6;
         }
      }

      return null;
   }
}
