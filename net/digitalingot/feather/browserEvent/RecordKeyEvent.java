package net.digitalingot.feather.browserEvent;

import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class RecordKeyEvent implements BrowserEvent {
   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.RECORD_KEYS;
   }
}
