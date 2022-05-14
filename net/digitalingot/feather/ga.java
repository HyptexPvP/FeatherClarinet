package net.digitalingot.feather;

import java.util.UUID;

class ga {
   private final UUID a;
   private int b;

   public ga(UUID var1) {
      this.a = var1;
      this.b = 0;
   }

   public UUID a() {
      return this.a;
   }

   public int b() {
      return ++this.b;
   }

   public int c() {
      return this.b;
   }
}
