package net.digitalingot.feather.browserEvent;

import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class CallBack implements BrowserEvent {
   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CALLBACK;
   }
}
