package net.digitalingot.feather.browserEvent;

import java.util.function.Consumer;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.gui.BrowserGUI;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.GuiBrowser;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.Nullable;

public class PageUpdateEvent implements GuiBrowser<PageUpdateEvent, SelectModProfileEvent, BrowserNotification> {
   public void a(PageUpdateEvent var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      boolean var4 = var1.b().isEmpty();
      BrowserUtils.INSTANCE.getScreen().b(!var4);
      if (var4 && a() instanceof BrowserGUI) {
         b();
      }

   }

   @Nullable
   private static GuiScreen a() {
      return Minecraft.func_71410_x().field_71462_r;
   }

   private static void b() {
      Minecraft.func_71410_x().func_147108_a(null);
   }
}
