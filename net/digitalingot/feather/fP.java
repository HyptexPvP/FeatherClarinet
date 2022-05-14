package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fP {
   private static final long a = 1500L;
   private static final double b = 0.01;
   private final fP.a c;
   private final fP.b d = new fP.b();
   private final fP.b e = new fP.b();

   public fP(@NotNull Mod<?> var1) {
      this(var1, null);
   }

   public fP(@NotNull Mod<?> var1, @Nullable fP.a var2) {
      this.c = var2;
      Events.a.a(var2x -> {
         if (var1.m()) {
            if (var2x == Events.c.END) {
               this.c();
            }
         }
      });
      FeatherGUI.a.a((var2x, var3, var4) -> {
         if (var1.m()) {
            if (var3 != 0) {
               long var5 = System.currentTimeMillis();
               if (var2x == 0) {
                  this.d.a(var5);
               } else if (var2x == 1) {
                  this.e.a(var5);
               }

            }
         }
      });
   }

   private void c() {
      long var1 = System.currentTimeMillis() - 1500L;
      double var3 = this.d.b(var1);
      double var5 = this.e.b(var1);
      if ((var3 != 0.0 || var5 != 0.0) && this.c != null) {
         this.c.a(var3, var5);
      }

   }

   public double a() {
      return this.d.b;
   }

   public double b() {
      return this.e.b;
   }

   public interface a {
      void a(double var1, double var3);
   }

   static class b {
      private final List<Long> a = new ArrayList();
      private double b;
      private double c;

      private b() {
      }

      private void a(long var1) {
         this.a.add(var1);
      }

      private double b(long var1) {
         this.a.removeIf(var2 -> var2 < var1);
         this.b = (double)this.a.size() / 1.5;
         if (this.b != this.c) {
            double var3 = this.b - this.c;
            if (Math.abs(var3) > 0.01) {
               this.c = this.b;
               return var3;
            }
         }

         return 0.0;
      }
   }
}
