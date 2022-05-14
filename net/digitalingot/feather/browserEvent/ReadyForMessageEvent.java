package net.digitalingot.feather.browserEvent;

import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class ReadyForMessageEvent implements BrowserEvent {
   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.READY_FOR_MESSAGES;
   }
}
