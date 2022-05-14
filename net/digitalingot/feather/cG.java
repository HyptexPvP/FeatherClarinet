package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class cG implements BrowserEvent {
   @SerializedName("selected")
   @NotNull
   private final String a;
   @SerializedName("list")
   @NotNull
   private final List<String> b;

   public cG(@NotNull String var1, @NotNull List<String> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public String b() {
      return this.a;
   }

   @NotNull
   public List<String> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_MOD_PROFILE_LIST;
   }
}
