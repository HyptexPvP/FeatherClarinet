package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class CreateNewProfile implements BrowserEvent {
   @SerializedName("profile")
   @NotNull
   private final String a;

   public CreateNewProfile(@NotNull String var1) {
      this.a = var1;
   }

   @NotNull
   public String b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CREATE_MOD_PROFILE;
   }
}
