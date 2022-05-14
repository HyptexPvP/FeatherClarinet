package net.digitalingot.feather.gui;

import java.util.function.Consumer;
import net.digitalingot.feather.browserEvent.BrowserEvent;

public interface GuiBrowser<T extends BrowserEvent, S extends BrowserEvent, F extends BrowserEvent> {
   void a(T var1, Consumer<S> var2, Consumer<F> var3);
}
