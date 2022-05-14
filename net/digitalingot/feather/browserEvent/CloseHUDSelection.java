package net.digitalingot.feather.browserEvent;

import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class CloseHUDSelection implements BrowserEvent {
   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CLOSE_HUD_SELECTION;
   }
}
