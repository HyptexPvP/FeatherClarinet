package net.digitalingot.feather.cosmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.t;
import net.digitalingot.feather.emote.Emote;
import org.jetbrains.annotations.NotNull;

public class CosmeticPacket implements Emote {
   @NotNull
   private final CosmeticManager b;
   @NotNull
   private final CosmeticAPI c;

   CosmeticPacket(@NotNull CosmeticManager var1, @NotNull CosmeticAPI var2) {
      this.b = var1;
      this.c = var2;
   }

   @Override
   public void a(UUID var1, String var2) {
      t var3 = this.c.c(var2);
      if (var3 == null) {
         FeatherLogger.a.info("received an unknown slug as an incoming emote: {}", new Object[]{var2});
      } else {
         this.b.a(var1, var3);
      }
   }

   @Override
   public void a(List<CosmeticPlayer> var1) {
      ArrayList var2 = new ArrayList(var1.size());

      for(CosmeticPlayer var4 : var1) {
         ArrayList var5 = new ArrayList(var4.b().size());

         for(String var7 : var4.b()) {
            Cosmetic var8 = this.c.b(var7);
            if (var8 == null) {
               FeatherLogger.a.info("received an unknown slug as an incoming cosmetic: {}", new Object[]{var7});
            } else {
               var5.add(var8);
            }
         }

         var2.add(new CosmeticManager.a(var4.a(), var5));
      }

      this.b.a(var2);
   }

   @Override
   public void b(List<String> var1) {
      this.c.d().clear();
      this.c.e().clear();

      for(String var3 : var1) {
         switch(this.c.a(var3)) {
            case COSMETIC:
               Cosmetic var4 = this.c.b(var3);

               assert var4 != null;

               this.c.d().put(var3, var4);
               break;
            case EMOTE:
               t var5 = this.c.c(var3);

               assert var5 != null;

               this.c.e().put(var3, var5);
               break;
            case NONE:
               FeatherLogger.a.info("received an unknown slug as an owned cosmetic: {}", new Object[]{var3});
         }
      }

   }
}
