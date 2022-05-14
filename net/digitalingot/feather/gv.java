package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface gv {
   float a();

   float b();

   float c();

   @NotNull
   gT.a d();

   @NotNull
   List<UUID> e();

   @Nullable
   gT.c[] f();

   @Nullable
   gv.a g();

   @Nullable
   iJ a(UUID var1);

   public static class a {
      @NotNull
      private final iJ a;
      private final boolean b;
      private final float c;
      private final float d;

      public a(@NotNull iJ var1, boolean var2, float var3, float var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
      }

      @NotNull
      public iJ a() {
         return this.a;
      }

      public boolean b() {
         return this.b;
      }

      public float c() {
         return this.c;
      }

      public float d() {
         return this.d;
      }
   }
}
