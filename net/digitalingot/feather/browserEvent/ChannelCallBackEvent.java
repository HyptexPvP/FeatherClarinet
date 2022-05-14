package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class ChannelCallBackEvent implements BrowserEvent {
   @SerializedName("channel")
   @NotNull
   private final ChannelCallBackEvent.a a;

   public ChannelCallBackEvent(@NotNull ChannelCallBackEvent.a var1) {
      this.a = var1;
   }

   @NotNull
   public ChannelCallBackEvent.a b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CALLBACK;
   }

   public static enum a {
      @SerializedName("ide")
      IDE(4),
      @SerializedName("development")
      DEVELOPMENT(3),
      @SerializedName("beta")
      BETA(2),
      @SerializedName("release")
      RELEASE(1);

      private final int priority;

      private a(int var3) {
         this.priority = var3;
      }

      public int getPriority() {
         return this.priority;
      }
   }
}
