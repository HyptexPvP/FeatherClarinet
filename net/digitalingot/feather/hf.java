package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hf {
   @NotNull
   private final hh a;
   @NotNull
   private final List<hg> b = new ArrayList();
   @Nullable
   private hd c;

   public hf(@NotNull hh var1) {
      this.a = var1;
   }

   @NotNull
   public he a() {
      return new he(this.a, this);
   }

   @NotNull
   public List<hg> b() {
      return this.b;
   }

   @Nullable
   public hd c() {
      return this.c;
   }

   public void a(@Nullable hd var1) {
      this.c = var1;
   }
}
