package net.digitalingot.feather.event;

import java.io.File;
import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ChatEvent {
   ac<ChatEvent.b> a = ad.a(ChatEvent.b.class, var0 -> () -> {
         for(ChatEvent.b var4 : var0) {
            var4.screenshot();
         }

      });
   ac<ChatEvent.a> b = ad.a(ChatEvent.a.class, var0 -> (var1, var2) -> {
         IChatComponent var3 = var2;

         for(ChatEvent.a var7 : var0) {
            var3 = var7.screenshot(var1, var3);
         }

         return var3;
      });

   public interface a {
      @Nullable
      IChatComponent screenshot(@NotNull File var1, @Nullable IChatComponent var2);
   }

   public interface b {
      void screenshot();
   }
}
