package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.Set;
import net.digitalingot.feather.eO;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class LoadMarcoEvent implements BrowserEvent {
   @SerializedName("macros")
   @NotNull
   private final Set<eO> a;

   public LoadMarcoEvent(@NotNull Set<eO> var1) {
      this.a = var1;
   }

   @NotNull
   public Set<eO> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_MACROS;
   }
}
