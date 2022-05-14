package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.util.Account;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fb {
   @NotNull
   private final hf a;
   @NotNull
   private final Account b;
   private long c;

   public fb(@NotNull Account var1) {
      this.a = new hf(new fc(var1, this));
      this.b = var1;
   }

   @Nullable
   public hg a(@Nullable String var1) {
      hg var2 = null;
      List var3 = this.a.b();
      if (var1 == null) {
         var2 = var3.size() != 0 ? (hg)var3.remove(0) : null;
      } else {
         UUID var4 = this.b.addAccount(var1);
         if (var4 == null) {
            return null;
         }

         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            hg var6 = (hg)var5.next();
            if (var6.b().equals(var4)) {
               var2 = var6;
               var5.remove();
               break;
            }
         }
      }

      return var2;
   }

   @NotNull
   public hf a() {
      return this.a;
   }

   @NotNull
   public Account b() {
      return this.b;
   }

   public void a(long var1) {
      this.c = var1;
   }

   public boolean c() {
      return System.currentTimeMillis() - this.c < TimeUnit.SECONDS.toMillis(3L);
   }
}
