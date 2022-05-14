package net.digitalingot.feather.cosmetic;

import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.t;
import org.jetbrains.annotations.NotNull;

public interface CosmeticManager {
   void a(UUID var1, t var2);

   void a(List<CosmeticManager.a> var1);

   public static class a {
      @NotNull
      private final UUID a;
      @NotNull
      private final List<Cosmetic> b;

      public a(@NotNull UUID var1, @NotNull List<Cosmetic> var2) {
         this.a = var1;
         this.b = var2;
      }

      @NotNull
      public UUID a() {
         return this.a;
      }

      @NotNull
      public List<Cosmetic> b() {
         return this.b;
      }
   }
}
