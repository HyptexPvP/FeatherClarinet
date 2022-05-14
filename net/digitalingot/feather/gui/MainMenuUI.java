package net.digitalingot.feather.gui;

import java.util.Arrays;
import java.util.function.Consumer;
import net.digitalingot.feather.ck;
import net.digitalingot.feather.browser.BrowserNotification;
import net.digitalingot.feather.browserEvent.PressButtonEvent;
import net.digitalingot.feather.browserEvent.SelectModProfileEvent;
import net.digitalingot.feather.mods.ReplayMod;
import net.digitalingot.feather.util.FeatherAssets;
import net.digitalingot.feather.util.FeatherBrowserButtons;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiSelectWorld;

public class MainMenuUI implements GuiBrowser<PressButtonEvent, SelectModProfileEvent, BrowserNotification> {
   public void a(PressButtonEvent var1, Consumer<SelectModProfileEvent> var2, Consumer<BrowserNotification> var3) {
      Minecraft var4 = Minecraft.func_71410_x();
      FeatherBrowserButtons var5 = (FeatherBrowserButtons)Arrays.stream(FeatherBrowserButtons.values())
         .filter(var1x -> var1x.getSlug().equals(var1.b()))
         .findAny()
         .orElse(null);
      if (var5 != null) {
         switch(var5) {
            case SINGLEPLAYER:
               var4.func_147108_a(new GuiSelectWorld(new GuiMainMenu()));
               break;
            case MULTIPLAYER:
               var4.func_147108_a(new GuiMultiplayer(new GuiMainMenu()));
               break;
            case QUIT_GAME:
               Minecraft.func_71410_x().func_71400_g();
         }

         var2.accept(new SelectModProfileEvent("success"));
      } else {
         FeatherAssets var6 = (FeatherAssets)Arrays.stream(FeatherAssets.values()).filter(var1x -> var1x.getSlug().equals(var1.b())).findAny().orElse(null);
         if (var6 != null) {
            switch(var6) {
               case MC_SETTINGS:
                  var4.func_147108_a(new GuiOptions(new GuiMainMenu(), var4.field_71474_y));
                  break;
               case REALMS:
                  throw new IllegalStateException("Realms only supported on the latest minecraft version");
               case REPLAY_MOD:
                  ReplayMod.b();
            }

            var2.accept(new SelectModProfileEvent("success"));
         } else {
            ck var7 = (ck)Arrays.stream(ck.values()).filter(var1x -> var1x.getSlug().equals(var1.b())).findAny().orElse(null);
            if (var7 != null) {
               switch(var7) {
                  case HUD_EDITOR:
                     Minecraft.func_71410_x().func_147108_a(new HUDEdiorUI());
                  default:
                     var2.accept(new SelectModProfileEvent("success"));
               }
            } else {
               throw new IllegalStateException("Selection not found");
            }
         }
      }
   }
}
