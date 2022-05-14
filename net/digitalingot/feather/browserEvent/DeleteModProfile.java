package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class DeleteModProfile implements BrowserEvent {
   @SerializedName("profile")
   @NotNull
   private final String a;

   public DeleteModProfile(@NotNull String var1) {
      this.a = var1;
   }

   @NotNull
   public String b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.DELETE_MOD_PROFILE;
   }
}
