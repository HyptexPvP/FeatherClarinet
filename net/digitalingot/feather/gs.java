package net.digitalingot.feather;

import java.util.UUID;
import net.digitalingot.feather.voice.Audio;
import net.digitalingot.feather.voice.FeatherPlayback;
import net.digitalingot.feather.voice.Voice;
import org.jetbrains.annotations.NotNull;

class gs implements gr {
   @NotNull
   private final Voice b;

   public gs(@NotNull Voice var1) {
      this.b = var1;
   }

   @Override
   public void a() {
   }

   @Override
   public void a(UUID var1, long var2, byte[] var4, gT.c var5) {
      Audio var6 = (Audio)this.b.d().computeIfAbsent(var1, var0 -> new Audio());
      if (var6.b() + 500L < System.currentTimeMillis()) {
         var6.close();
         var6 = new Audio();
         this.b.d().put(var1, var6);
      }

      if (var2 >= var6.c()) {
         FeatherPlayback var7 = this.b.m();

         assert var7 != null;

         gx var8 = new gx(var6, var1, var5, var2, var4);
         var7.a().add(var8);
      }
   }
}
