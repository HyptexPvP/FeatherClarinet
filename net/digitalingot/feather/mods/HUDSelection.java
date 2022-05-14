package net.digitalingot.feather.mods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.digitalingot.feather.dF;
import net.digitalingot.feather.dG;
import net.digitalingot.feather.dN;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.gui.HUD;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HUDSelection<T extends HUD> {
   @NotNull
   private final T b;
   @Nullable
   protected List<dF> a;

   public HUDSelection(@NotNull T var1) {
      this.b = var1;
   }

   @NotNull
   public Map<String, String> a() {
      this.b();
      return this.c();
   }

   private void b() {
      dG var1 = new dG(this.b.getClass());
      this.a = var1.a();
   }

   @NotNull
   private Map<String, String> c() {
      if (this.a == null) {
         throw new IllegalStateException("parseObject() called before parseAnnotations()");
      } else {
         HashMap var1 = new HashMap();
         Iterator var2 = this.a.iterator();

         while(true) {
            dF var3;
            dt var4;
            do {
               if (!var2.hasNext()) {
                  return var1;
               }

               var3 = (dF)var2.next();
               if (!var3.c().a().equals("hudSelection")) {
                  break;
               }

               var4 = (dt)this.b.getClass().getDeclaredAnnotation(dt.class);
            } while(var4 == null || var4.b().a().isEmpty());

            try {
               var4 = (dt)var3.b().get(this.b);
            } catch (IllegalAccessException var7) {
               throw new IllegalStateException(var7);
            }

            dN var5 = new dN<>(var3, var4);
            Entry var6 = var5.a();
            var1.put((String)var6.getKey(), (String)var6.getValue());
         }
      }
   }
}
