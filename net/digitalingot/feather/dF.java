package net.digitalingot.feather;

import java.lang.reflect.Field;
import net.digitalingot.feather.components.Checkbox;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.components.Dropdown;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.components.TextLength;
import net.digitalingot.feather.mods.ModConfigAnnotation;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dF {
   @Nullable
   private final Field a;
   @NotNull
   private final Class<?> b;
   @Nullable
   private final ModConfigAnnotation c;
   @Nullable
   private final Checkbox d;
   @Nullable
   private final Dropdown e;
   @Nullable
   private final TextLength f;
   @Nullable
   private final DoubleRange g;
   @Nullable
   private final IntegerRange h;
   @Nullable
   private final dE i;

   public dF(@NotNull Class<?> var1) {
      this.b = ClassUtils.primitiveToWrapper(var1);
      this.a = null;
      this.c = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
   }

   public dF(
      @NotNull Field var1,
      @NotNull ModConfigAnnotation var2,
      @Nullable Checkbox var3,
      @Nullable Dropdown var4,
      @Nullable TextLength var5,
      @Nullable DoubleRange var6,
      @Nullable IntegerRange var7,
      @Nullable dE var8
   ) {
      this.a = var1;
      this.b = ClassUtils.primitiveToWrapper(var1.getType());
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
      this.i = var8;
   }

   @NotNull
   public Class<?> a() {
      return this.b;
   }

   @Nullable
   public Field b() {
      return this.a;
   }

   @Nullable
   public ModConfigAnnotation c() {
      return this.c;
   }

   @Nullable
   public Checkbox d() {
      return this.d;
   }

   @Nullable
   public Dropdown e() {
      return this.e;
   }

   @Nullable
   public TextLength f() {
      return this.f;
   }

   @Nullable
   public DoubleRange g() {
      return this.g;
   }

   @Nullable
   public IntegerRange h() {
      return this.h;
   }

   @Nullable
   public dE i() {
      return this.i;
   }

   public String toString() {
      return this.a == null ? "" : this.a.getDeclaringClass().getName() + "." + this.a.getName();
   }
}
