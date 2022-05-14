package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class ChangeAccountEvent implements BrowserEvent {
   @SerializedName("account")
   @NotNull
   private final UUID a;

   public ChangeAccountEvent(@NotNull UUID var1) {
      this.a = var1;
   }

   @NotNull
   public UUID b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CHANGE_ACCOUNT;
   }
}
