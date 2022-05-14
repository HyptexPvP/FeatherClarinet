package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class he implements hA {
   @NotNull
   private final hh a;
   @NotNull
   private final hf b;

   he(@NotNull hh var1, @NotNull hf var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void a(UUID var1, List<UUID> var2, hG.b var3) {
      hd var4 = new hd(var1, var2, var3);
      this.b.a(var4);
      this.a.a(var4);
   }

   @Override
   public void a(int var1, UUID var2) {
      hg var3 = new hg(var1, var2);
      this.b.b().add(var3);
      this.a.a(var3);
   }

   @Override
   public void a(UUID var1) {
      this.a.a(var1);
   }

   @Override
   public void a() {
      this.b.a(null);
      this.a.a();
   }
}
