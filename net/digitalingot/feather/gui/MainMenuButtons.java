package net.digitalingot.feather.gui;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browserEvent.LoadHomePageSelectionEvent;
import net.digitalingot.feather.mods.ReplayMod;
import net.digitalingot.feather.util.FeatherAssets;
import net.digitalingot.feather.util.FeatherBrowserButtons;
import org.jetbrains.annotations.NotNull;

public class MainMenuButtons {
   public static void a() {
      List var0 = b();
      List var1 = c();
      LoadHomePageSelectionEvent var2 = new LoadHomePageSelectionEvent(var0, var1);
      e.c().a().b(var2);
   }

   @NotNull
   private static List<FeatherBrowserButtons> b() {
      ArrayList var0 = new ArrayList();
      var0.add(FeatherBrowserButtons.SINGLEPLAYER);
      var0.add(FeatherBrowserButtons.MULTIPLAYER);
      var0.add(FeatherBrowserButtons.QUIT_GAME);
      return var0;
   }

   @NotNull
   private static List<FeatherAssets> c() {
      ArrayList var0 = new ArrayList();
      var0.add(FeatherAssets.MC_SETTINGS);
      if (ReplayMod.a()) {
         var0.add(FeatherAssets.REPLAY_MOD);
      }

      return var0;
   }
}
