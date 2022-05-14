package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.digitalingot.feather.event.Events;
import org.jetbrains.annotations.NotNull;

public class d {
   private static final List<d.a> a = new ArrayList(1024);

   public static void a() {
      Events.a.a(var0 -> {
         if (var0 == Events.c.START) {
            Iterator var1 = a.iterator();

            while(var1.hasNext()) {
               d.a var2 = (d.a)var1.next();
               if (var2.a()) {
                  var2.b().run();
                  var1.remove();
               }
            }

         }
      });
   }

   public static void a(@NotNull Runnable var0) {
      a.add(new d.a(var0, 1));
   }

   public static void a(@NotNull Runnable var0, int var1) {
      a.add(new d.a(var0, var1));
   }

   static class a {
      @NotNull
      private final Runnable a;
      private int b;

      private a(@NotNull Runnable var1, int var2) {
         this.a = var1;
         this.b = var2;
      }

      public boolean a() {
         return --this.b <= 0;
      }

      @NotNull
      public Runnable b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
