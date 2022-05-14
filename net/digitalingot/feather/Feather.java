package net.digitalingot.feather;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.CloneProfile;
import net.digitalingot.feather.browserEvent.CreateModProfile;
import net.digitalingot.feather.browserEvent.DeleteModProfileEvent;
import net.digitalingot.feather.browserEvent.DoHUDSelection;
import net.digitalingot.feather.browserEvent.PageUpdateEvent;
import net.digitalingot.feather.browserEvent.ReadyForMessages;
import net.digitalingot.feather.browserEvent.RenameModProfile;
import net.digitalingot.feather.browserEvent.ResetModProfile;
import net.digitalingot.feather.browserEvent.ResetSideBarSettings;
import net.digitalingot.feather.browserEvent.SelectProfile;
import net.digitalingot.feather.browserEvent.UpdateClientPreferences;
import net.digitalingot.feather.browserEvent.UpdateKey;
import net.digitalingot.feather.browserEvent.UpdateMod;
import net.digitalingot.feather.browserEvent.UpdateSideBarSettings;
import net.digitalingot.feather.config.ClientPreferences;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.config.Preferences;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.event.EventManager;
import net.digitalingot.feather.event.SelectEvent;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.HUDButtonEdit;
import net.digitalingot.feather.gui.MainMenuButtons;
import net.digitalingot.feather.gui.MainMenuUI;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.ModManager;
import net.digitalingot.feather.profile.ProfileManager;
import net.digitalingot.feather.profile.Profiler;
import net.digitalingot.feather.settings.BuildModConfig;
import net.digitalingot.feather.settings.BuildModProfile;
import net.digitalingot.feather.settings.BuildModSettings;
import net.digitalingot.feather.util.ClientUtil;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class Feather {
   @NotNull
   private final Path featherDir;

   public Feather(@NotNull Minecraft var1) {
      Path var2 = var1.field_71412_D.toPath();
      this.featherDir = var2.resolve("feather");
   }

   public void start(@NotNull List<Class<? extends Mod<?>>> var1) {
      ClientPreferences var2 = new ClientPreferences(this.featherDir.toFile());
      Profiler var3 = this.currentProfile();
      ConfigManager var4 = this.a(var1, var3, var2);
      Browser var5 = new Browser();
      ClientUtil var6 = new ClientUtil(var5, var4, var2, this.featherDir.toFile(), this.featherDir.resolve("misc").toFile(), this.getVersion());
      e var7 = new e();
      var7.a(var6);
      e.a(var7);
      BrowserUtils.INSTANCE.initialize();
      var4.b();
      var3.b(var4.f());
      EventManager.init();
      ModManager.INSTANCE.init();
      this.startBrowser();
      FeatherLogger.a.info("Started Feather (" + var6.getVersion() + ")");
   }

   private void startBrowser() {
      ConfigManager var1 = e.c().b();
      Browser var2 = e.c().a();
      ClientPreferences var3 = e.c().c();
      var2.a(BrowserEvents.READY_FOR_MESSAGES, new ReadyForMessages());
      var2.a(BrowserEvents.RECORD_KEYS, new UpdateKey());
      var2.a(BrowserEvents.PAGE_UPDATE, new PageUpdateEvent());
      var2.a(BrowserEvents.PRESS_BUTTON, new MainMenuUI());
      var2.a(BrowserEvents.UPDATE_CLIENT_PREFERENCES, new UpdateClientPreferences(var3));
      var2.a(BrowserEvents.CREATE_MOD_PROFILE, new CreateModProfile());
      var2.a(BrowserEvents.DELETE_MOD_PROFILE, new DeleteModProfileEvent());
      var2.a(BrowserEvents.RENAME_MOD_PROFILE, new RenameModProfile());
      var2.a(BrowserEvents.CLONE_MOD_PROFILE, new CloneProfile());
      var2.a(BrowserEvents.SELECT_MOD_PROFILE, new SelectProfile());
      var2.a(BrowserEvents.RESET_MOD_SETTINGS, new ResetModProfile());
      var2.a(BrowserEvents.UPDATE_MOD_SETTINGS, new UpdateMod(var3));
      var2.a(BrowserEvents.RESET_SIDEBAR_SETTINGS, new ResetSideBarSettings());
      var2.a(BrowserEvents.UPDATE_SIDEBAR_SETTINGS, new UpdateSideBarSettings());
      var2.a(BrowserEvents.DO_HUD_SELECTION, new DoHUDSelection());
      SelectEvent.a.a(var0 -> {
         if (var0.equals("featherMods")) {
            BrowserUtils.INSTANCE.show();
            HUDButtonEdit.a(true);
         }

      });
      MainMenuButtons.a();
      Preferences.a(var3);
      BuildModSettings.a(var1);
      et.a(var1);
      BuildModConfig.a(var1);
      BuildModProfile.a(var1);
      BuildModProfile.a(var1);
      aM.a(var1);
   }

   @NotNull
   private ConfigManager a(@NotNull List<Class<? extends Mod<?>>> var1, @NotNull Profiler var2, ClientPreferences var3) {
      ConfigManager var4 = new ConfigManager(var1, var2, var3);
      var4.a();
      return var4;
   }

   @NotNull
   private Profiler currentProfile() {
      ProfileManager var1 = new ProfileManager(this.featherDir.resolve("configuration"));
      Profiler var2 = new Profiler(var1);
      if (var2.a() == null) {
         var2.a(new HashMap());
         var2.a();
      }

      return var2;
   }

   @NotNull
   private String getVersion() {
      return hP.c("git.hash").c();
   }
}
