package net.digitalingot.feather;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import net.digitalingot.feather.mods.ModConfigValueAnnotation;
import net.digitalingot.feather.mods.ModSetting;
import net.digitalingot.feather.util.ChromaColor;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class eg {
   public static final Pattern a = Pattern.compile("(:?true|false/)?\\d+/\\d+/\\d+/\\d+");

   @NotNull
   public static <T> List<ModSetting> a(@NotNull T var0) {
      HashMap var1 = new HashMap();
      a(var0, var1);
      b(var0, var1);
      return (List<ModSetting>)var1.entrySet()
         .stream()
         .sorted(Entry.comparingByValue(Comparator.comparingInt(ModConfigValueAnnotation::a)))
         .map(Entry::getKey)
         .collect(Collectors.toList());
   }

   private static <T> void a(@NotNull T var0, @NotNull Map<ModSetting, ModConfigValueAnnotation> var1) {
      dG var2 = new dG(var0.getClass());
      List var3 = var2.a();
      Iterator var4 = var3.iterator();

      while(true) {
         dF var5;
         ModConfigValueAnnotation var7;
         while(true) {
            if (!var4.hasNext()) {
               return;
            }

            var5 = (dF)var4.next();
            ModConfigAnnotation var6 = var5.c();
            var7 = var6.e();
            if (var7.a() > -10) {
               if (!var6.a().equals("hudSelection")) {
                  break;
               }

               dt var8 = (dt)var0.getClass().getDeclaredAnnotation(dt.class);
               if (var8 != null && !var8.b().a().isEmpty()) {
                  break;
               }
            }
         }

         ModSetting var9 = a(var5);
         var1.put(var9, var7);
      }
   }

   @NotNull
   private static ModSetting a(@NotNull dF var0) {
      ModConfigAnnotation var1 = var0.c();
      String var2 = var1.b();
      String var3 = var1.a();
      cL var4 = a(var1);
      Class var5 = var0.a();
      if (ClassUtils.isAssignable(var5, Enum.class, true)) {
         ModSetting.a var9 = var0.e() != null ? ModSetting.a.DROPDOWN : ModSetting.a.RADIO;
         return new ModSetting(var9, var2, var3, var4, new cN(a(var5)), null, null);
      } else {
         if (ClassUtils.isAssignable(var5, String.class, true)) {
            if (var0.i() != null) {
               ModSetting.a var6 = var0.e() != null ? ModSetting.a.DROPDOWN : ModSetting.a.RADIO;
               return new ModSetting(var6, var2, var3, var4, new cN(a(var0.i())), null, null);
            }

            if (var0.f() != null) {
               return new ModSetting(ModSetting.a.TEXT, var2, var3, var4, null, null, null);
            }
         } else {
            if (ClassUtils.isAssignable(var5, Boolean.TYPE, true)) {
               return new ModSetting(ModSetting.a.BOOLEAN, var2, var3, var4, null, null, null);
            }

            if (ClassUtils.isAssignable(var5, Integer.TYPE, true)) {
               if (var0.h() == null) {
                  throw new IllegalArgumentException(var0.b() + " is not annotated with @IntRange");
               }

               return new ModSetting(ModSetting.a.SLIDER, var2, var3, var4, a(var0.h()), null, null);
            }

            if (ClassUtils.isAssignable(var5, Double.TYPE, true)) {
               if (var0.g() == null) {
                  throw new IllegalArgumentException(var0.b() + " is not annotated with @DoubleRange");
               }

               return new ModSetting(ModSetting.a.SLIDER, var2, var3, var4, a(var0.g()), null, null);
            }

            if (ClassUtils.isAssignable(var5, Collection.class, true)) {
               if (var0.d() == null) {
                  throw new IllegalArgumentException(var0.b() + " is not annotated with @Checkbox");
               }

               int var8 = var0.d().a();
               Class var7 = iS.a(var5, 0, 0);
               if (ClassUtils.isAssignable(var7, Enum.class, true)) {
                  return new ModSetting(ModSetting.a.CHECKBOX, var2, var3, var4, new cM(var8, a(var7)), null, null);
               }

               if (var0.i() != null) {
                  return new ModSetting(ModSetting.a.CHECKBOX, var2, var3, var4, new cM(var8, a(var0.i())), null, null);
               }
            } else {
               if (ClassUtils.isAssignable(var5, is.class, true)) {
                  return new ModSetting(ModSetting.a.KEY_PICKER, var2, var3, var4, null, null, null);
               }

               if (ClassUtils.isAssignable(var5, Color.class, true)) {
                  return new ModSetting(ModSetting.a.COLOR_PICKER, var2, var3, var4, null, false, a.matcher(var0.c().c()).find());
               }

               if (ClassUtils.isAssignable(var5, ChromaColor.class, true)) {
                  return new ModSetting(ModSetting.a.COLOR_PICKER, var2, var3, var4, null, true, a.matcher(var0.c().c()).find());
               }
            }
         }

         throw new IllegalArgumentException(var0.b() + " not supported in a config");
      }
   }

   @NotNull
   private static List<cJ> a(@NotNull dE var0) {
      List var1;
      try {
         var1 = (List)var0.c().invoke(null);
      } catch (InvocationTargetException | IllegalAccessException var3) {
         throw new IllegalStateException("Exception while trying to invoke @AllowedValues method", var3);
      }

      return (List<cJ>)var1.stream().map(var0x -> new cJ(var0x, var0x)).collect(Collectors.toList());
   }

   @NotNull
   private static List<cJ> a(@NotNull Class<? extends Enum<?>> var0) {
      Enum[] var1 = (Enum[])var0.getEnumConstants();
      ArrayList var2 = new ArrayList(var1.length);

      for(Enum var6 : var1) {
         Field var7;
         try {
            var7 = var0.getDeclaredField(var6.name());
         } catch (NoSuchFieldException var12) {
            throw new IllegalStateException(var12);
         }

         dw var8 = (dw)var7.getDeclaredAnnotation(dw.class);
         String var9 = var8.a();
         String var10 = var8.b();
         cJ var11 = new cJ(var9, var10);
         var2.add(var11);
      }

      return var2;
   }

   @NotNull
   private static cQ a(@NotNull IntegerRange var0) {
      return new cQ(var0.b(), var0.a(), var0.c());
   }

   @NotNull
   private static cO a(@NotNull DoubleRange var0) {
      return new cO(var0.b(), var0.a(), var0.c());
   }

   private static <T> void b(@NotNull T var0, @NotNull Map<ModSetting, ModConfigValueAnnotation> var1) {
      for(Field var5 : var0.getClass().getFields()) {
         if (var5.getType() == eh.class) {
            eh var6;
            try {
               var6 = (eh)var5.get(var0);
            } catch (IllegalAccessException var10) {
               throw new IllegalStateException(var10);
            }

            String var7 = var6.a();
            ModSetting var8 = new ModSetting(ModSetting.a.TITLE, var7, null, null, null, null, null);
            ModConfigValueAnnotation var9 = (ModConfigValueAnnotation)var5.getDeclaredAnnotation(ModConfigValueAnnotation.class);
            if (var9 == null) {
               throw new IllegalStateException(var5 + " isn't annotated with @Ordering");
            }

            var1.put(var8, var9);
         }
      }

   }

   @Nullable
   private static cL a(@NotNull ModConfigAnnotation var0) {
      dB var1 = var0.d();
      if (var1.a().isEmpty()) {
         return null;
      } else {
         List var2;
         if (var1.b().length == 0) {
            var2 = null;
         } else {
            var2 = Arrays.asList(var1.b());
         }

         return new cL(var1.a(), var2);
      }
   }
}
