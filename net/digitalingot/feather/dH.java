package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public class dH<T> {
   @NotNull
   private final dF a;

   public dH(@NotNull dF var1) {
      this.a = var1;
   }

   public boolean a(@NotNull T var1) {
      if (this.a.i() != null) {
         for(Object var4 : this.a(this.a.i())) {
            if (var4.equals(var1)) {
               return true;
            }
         }

         return false;
      } else if (this.a.g() != null) {
         double var6 = (Double)var1;
         return !(var6 > this.a.g().a()) && !(var6 < this.a.g().b());
      } else if (this.a.h() != null) {
         int var5 = (Integer)var1;
         return var5 <= this.a.h().a() && var5 >= this.a.h().b();
      } else if (this.a.f() == null) {
         return true;
      } else {
         String var2 = (String)var1;
         return var2.length() <= this.a.f().b() && var2.length() >= this.a.f().a();
      }
   }

   @NotNull
   private Collection<T> a(@NotNull dE var1) {
      Method var2 = var1.c();
      if (!Collection.class.isAssignableFrom(var2.getReturnType())) {
         throw new IllegalStateException(var2.getName() + " does not return a Collection or a subtype of one");
      } else {
         Object var3;
         try {
            var3 = var2.invoke(null);
         } catch (InvocationTargetException | IllegalAccessException var6) {
            throw new IllegalStateException(var6);
         }

         Class var4 = iS.a((ParameterizedType)var2.getGenericReturnType(), 0);
         if (var4 == String.class) {
            Collection var5 = (Collection)var3;
            return this.a(var5, (Class<T>)var1.b());
         } else {
            return (Collection<T>)var3;
         }
      }
   }

   @NotNull
   private Collection<T> a(Collection<String> var1, Class<T> var2) {
      ArrayList var3 = new ArrayList();

      for(String var5 : var1) {
         dM var6 = new dM(var2, var5);
         Object var7 = var6.a();
         var3.add(var7);
      }

      return var3;
   }
}
