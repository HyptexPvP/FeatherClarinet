package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.browserEvent.SelectModProfileEvent;
import net.digitalingot.feather.browserEvent.UpdateCosmeticsEvent;
import net.digitalingot.feather.gui.CosmeticUI;
import net.digitalingot.feather.gui.GuiBrowser;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class z implements GuiBrowser<UpdateCosmeticsEvent, SelectModProfileEvent, BrowserNotification> {
   @NotNull
   private final CosmeticUI a;

   public z(@NotNull CosmeticUI var1) {
      this.a = var1;
   }

   public void a(UpdateCosmeticsEvent var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      UpdateCosmeticsEvent.a var4 = var1.b();
      if (var4 != null) {
         this.a.b().f().a(var4.a(), var4.b());
      }

      UpdateCosmeticsEvent.b var5 = var1.c();
      if (var5 != null) {
         List var6 = (List)var5.a().values().stream().map(var1x -> this.a.b().b(var1x)).collect(Collectors.toList());
         UUID var7 = Minecraft.func_71410_x().func_110432_I().func_148256_e().getId();
         this.a.c().put(var7, var6);
         this.a.a().a(var6);
      }

   }
}
