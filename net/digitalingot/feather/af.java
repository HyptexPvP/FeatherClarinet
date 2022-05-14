package net.digitalingot.feather;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

class af<T> extends ac<T> {
   private final Function<T[], T> b;
   private final Lock c = new ReentrantLock();
   private T[] d;

   af(Class<? super T> var1, Function<T[], T> var2) {
      this.b = var2;
      this.d = (T[])((Object[])Array.newInstance(var1, 0));
      this.b();
   }

   void b() {
      this.a = (T)this.b.apply(this.d);
   }

   @Override
   public void a(T var1) {
      Objects.requireNonNull(var1, "Tried to register a null listener!");
      this.c.lock();

      try {
         this.d = (T[])Arrays.copyOf(this.d, this.d.length + 1);
         this.d[this.d.length - 1] = (T)var1;
         this.b();
      } finally {
         this.c.unlock();
      }

   }
}
