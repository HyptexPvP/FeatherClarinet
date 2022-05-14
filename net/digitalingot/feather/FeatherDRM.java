package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.feather.browserEvent.ChannelCallBackEvent;
import net.digitalingot.feather.browserEvent.DRMRequestEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherDRM {
   @Nullable
   private static ChannelCallBackEvent.a a;

   public static void DRMThread() {
      (new Thread(null, null, "Feather-DRM") {
         public void run() {
         }
      }).start();
      e.c().a().a(new DRMRequestEvent(), new Consumer<ChannelCallBackEvent>() {
         public void a(ChannelCallBackEvent var1) {
            FeatherDRM.a = var1.b();
         }
      }, null);
   }

   @NotNull
   public static ChannelCallBackEvent.a b() {
      return ChannelCallBackEvent.a.RELEASE;
   }
}
