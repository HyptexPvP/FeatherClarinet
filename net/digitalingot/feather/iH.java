package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public abstract class iH implements Serializable, iD {
   protected iH() {
   }

   @Override
   public final float h() {
      return (float)Math.sqrt((double)this.b());
   }

   @Override
   public abstract float b();

   public abstract iH a(FloatBuffer var1);

   public abstract iH c();

   public final iH i() {
      float var1 = this.h();
      if (var1 != 0.0F) {
         float var2 = 1.0F / var1;
         return this.a(var2);
      } else {
         throw new IllegalStateException("Zero length vector");
      }
   }

   @Override
   public abstract iH b(FloatBuffer var1);

   public abstract iH a(float var1);
}
