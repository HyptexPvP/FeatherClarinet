package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.digitalingot.feather.gui.HUD;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dI<T extends HUD> {
   @NotNull
   protected final Class<T> a;
   @Nullable
   protected final Map<String, String> b;
   @Nullable
   protected List<dF> c;
   @Nullable
   private Map<dF, Object> d;

   public dI(@NotNull Class<T> var1, @Nullable Map<String, String> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public T a() {
      this.b();
      this.f();
      this.g();
      return this.h();
   }

   protected void b() {
      dG var1 = new dG(this.a);
      this.c = var1.a();
   }

   private void f() {
      if (this.c == null) {
         throw new IllegalStateException("parseObjects() called before parseAnnotations()");
      } else {
         this.d = new HashMap();

         for(dF var2 : this.c) {
            String var3 = var2.c().a();
            String var4 = this.b == null ? null : (String)this.b.get(var3);
            if (var4 == null && var3.equals("enabled")) {
               dt var5 = this.c();
               if (var5 != null) {
                  this.d.put(var2, var5.a());
                  continue;
               }
            }

            dM var7 = new dM(var2, var4);
            Object var6 = var7.a();
            this.d.put(var2, var6);
         }

      }
   }

   private void g() {
      if (this.d == null) {
         throw new IllegalStateException("validateObjects() called before parseObjects()");
      } else {
         for(Entry var2 : this.d.entrySet()) {
            dF var3 = (dF)var2.getKey();
            Object var4 = var2.getValue();
            dE var5 = var3.i();
            if (var5 != null) {
               dH var6 = new dH(var3);
               if (!var6.a(var4)) {
                  dM var7 = new dM((dF)var2.getKey(), null);
                  var2.setValue(var7.a());
               }
            }
         }

      }
   }

   private T h() {
      try {
         HUD var1 = (HUD)this.a.getConstructor().newInstance();

         for(Entry var3 : this.d.entrySet()) {
            dF var4 = (dF)var3.getKey();
            Object var5 = var3.getValue();
            var4.b().set(var1, var5);
         }

         return (T)var1;
      } catch (NoSuchMethodException var6) {
         throw new IllegalStateException("The config class has no default constructor.", var6);
      } catch (InstantiationException | InvocationTargetException | IllegalAccessException var7) {
         throw new IllegalStateException(var7);
      }
   }

   @Nullable
   public dt c() {
      return (dt)this.a.getDeclaredAnnotation(dt.class);
   }

   @NotNull
   public Class<T> d() {
      return this.a;
   }

   @Nullable
   public List<dF> e() {
      return this.c;
   }
}
