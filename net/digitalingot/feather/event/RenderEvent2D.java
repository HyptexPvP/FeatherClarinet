package net.digitalingot.feather.event;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface RenderEvent2D {
   ac<RenderEvent2D> a = ad.a(RenderEvent2D.class, var0 -> (var1, var2) -> {
         for(RenderEvent2D var6 : var0) {
            var6.render(var1, var2);
         }

      });

   void render(@NotNull Entity var1, @NotNull RenderEvent2D.a var2);

   public static class a {
      private float a;
      private float b;

      public a(float var1, float var2) {
         this.a = var1;
         this.b = var2;
      }

      public float a() {
         return this.a;
      }

      public void a(float var1) {
         this.a = var1;
      }

      public float b() {
         return this.b;
      }

      public void b(float var1) {
         this.b = var1;
      }
   }
}
