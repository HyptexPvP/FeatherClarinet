package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.eO;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CreateUpdateMacro implements BrowserEvent {
   @SerializedName("macro")
   @Nullable
   private final String a;
   @SerializedName("payload")
   @NotNull
   private final eO b;

   public CreateUpdateMacro(@Nullable String var1, @NotNull eO var2) {
      this.a = var1;
      this.b = var2;
   }

   @Nullable
   public String b() {
      return this.a;
   }

   @NotNull
   public eO c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CREATE_UPDATE_MACRO;
   }
}
