package net.digitalingot.feather.cosmetic;

import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class CosmeticPlayer {
   @NotNull
   private final UUID a;
   @NotNull
   private final List<String> b;

   public CosmeticPlayer(@NotNull UUID var1, @NotNull List<String> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public UUID a() {
      return this.a;
   }

   @NotNull
   public List<String> b() {
      return this.b;
   }
}
