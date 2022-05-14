package net.digitalingot.feather;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class ag {
   private static final List<af<?>> a = new ArrayList();

   private ag() {
   }

   public static void a() {
      a.forEach(af::b);
   }

   public static <T> ac<T> a(Class<? super T> var0, Function<T[], T> var1) {
      af var2 = new af(var0, var1);
      a.add(var2);
      return var2;
   }

   private static <T> T b(Class<T> var0, Function<T[], T> var1) {
      Method var2 = null;

      for(Method var6 : var0.getMethods()) {
         if ((var6.getModifiers() & 2050) == 0) {
            if (var2 != null) {
               throw new IllegalStateException("Multiple virtual methods in " + var0 + "; cannot build empty invoker!");
            }

            var2 = var6;
         }
      }

      if (var2 == null) {
         throw new IllegalStateException("No virtual methods in " + var0 + "; cannot build empty invoker!");
      } else {
         Object var10 = null;

         try {
            MethodHandle var11 = MethodHandles.lookup().unreflect(var2);
            MethodType var13 = var11.type().dropParameterTypes(0, 1);
            if (var13.returnType() != Void.TYPE) {
               MethodType var14 = MethodType.genericMethodType(var13.parameterCount())
                  .changeReturnType(var13.returnType())
                  .insertParameterTypes(0, new Class[]{var11.type().parameterType(0)});
               MethodHandle var7 = MethodHandles.explicitCastArguments(var11, var14);
               Object[] var8 = new Object[var11.type().parameterCount()];
               var8[0] = var1.apply(Array.newInstance(var0, 0));
               var10 = var7.invokeWithArguments(var8);
            }
         } catch (Throwable var9) {
            throw new RuntimeException(var9);
         }

         Object var12 = var10;
         return (T)Proxy.newProxyInstance(ag.class.getClassLoader(), new Class[]{var0}, (var1x, var2x, var3) -> var12);
      }
   }
}
