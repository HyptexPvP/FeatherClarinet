package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class hd {
   @NotNull
   private final UUID a;
   @NotNull
   private final List<UUID> b;
   @NotNull
   private final hG.b c;

   public hd(@NotNull UUID var1, @NotNull List<UUID> var2, @NotNull hG.b var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   @NotNull
   public UUID a() {
      return this.a;
   }

   @NotNull
   public List<UUID> b() {
      return this.b;
   }

   @NotNull
   public hG.b c() {
      return this.c;
   }
}
