package net.digitalingot.feather.event;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.cG;
import net.digitalingot.feather.cI;
import net.digitalingot.feather.cg;
import net.digitalingot.feather.cv;
import net.digitalingot.feather.cw;
import net.digitalingot.feather.da;
import net.digitalingot.feather.db;
import net.digitalingot.feather.de;
import net.digitalingot.feather.browserEvent.AcceptP2PJoin;
import net.digitalingot.feather.browserEvent.AccountSwitchDetailEvent;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.browserEvent.BuildCosmeticMenuEvent;
import net.digitalingot.feather.browserEvent.BuildSideBarSettings;
import net.digitalingot.feather.browserEvent.ChangeAccountEvent;
import net.digitalingot.feather.browserEvent.CloneModProfile;
import net.digitalingot.feather.browserEvent.CloseHUDSelection;
import net.digitalingot.feather.browserEvent.CloseP2PEvent;
import net.digitalingot.feather.browserEvent.CreateNewProfile;
import net.digitalingot.feather.browserEvent.CreateUpdateMacro;
import net.digitalingot.feather.browserEvent.DRMRequestEvent;
import net.digitalingot.feather.browserEvent.DeleteMarco;
import net.digitalingot.feather.browserEvent.DeleteModProfile;
import net.digitalingot.feather.browserEvent.DoHUDSelection;
import net.digitalingot.feather.browserEvent.LoadAccountListEvent;
import net.digitalingot.feather.browserEvent.LoadCosmeticSettingsEvent;
import net.digitalingot.feather.browserEvent.LoadHomePageSelectionEvent;
import net.digitalingot.feather.browserEvent.LoadMarcoEvent;
import net.digitalingot.feather.browserEvent.LoadPreferences;
import net.digitalingot.feather.browserEvent.LoadSideBarModConfigEvent;
import net.digitalingot.feather.browserEvent.LoadWaypoints;
import net.digitalingot.feather.browserEvent.OpenAutoTextEvent;
import net.digitalingot.feather.browserEvent.OpenHomePage;
import net.digitalingot.feather.browserEvent.PageCloseEvent;
import net.digitalingot.feather.browserEvent.PageUpdateEvent;
import net.digitalingot.feather.browserEvent.PrepareP2PEvent;
import net.digitalingot.feather.browserEvent.PressButtonEvent;
import net.digitalingot.feather.browserEvent.PunchHoleEvent;
import net.digitalingot.feather.browserEvent.ReadyForMessageEvent;
import net.digitalingot.feather.browserEvent.RecordKeyEvent;
import net.digitalingot.feather.browserEvent.RequestP2PJoin;
import net.digitalingot.feather.browserEvent.ResetCosmeticsSettingEvent;
import net.digitalingot.feather.browserEvent.ResetModSettings;
import net.digitalingot.feather.browserEvent.UpdateCosmeticsEvent;
import net.digitalingot.feather.browserEvent.UpdateModSettings;
import net.digitalingot.feather.browserEvent.WayPointCreateUpdate;
import net.digitalingot.feather.browserEvent.renameProfileEvent;
import net.digitalingot.feather.config.ModProfileConfig;
import net.digitalingot.feather.gui.HUDEditButton;
import net.digitalingot.feather.gui.WaypointsMenu;
import net.digitalingot.feather.settings.BuildModCategory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum BrowserEvents {
   @SerializedName("callback")
   CALLBACK(null),
   @SerializedName("readyForMessages")
   READY_FOR_MESSAGES(ReadyForMessageEvent.class),
   @SerializedName("recordKeys")
   RECORD_KEYS(RecordKeyEvent.class),
   @SerializedName("pageUpdate")
   PAGE_UPDATE(PageUpdateEvent.class),
   @SerializedName("loadHomepageSelections")
   LOAD_HOMEPAGE_SELECTIONS(LoadHomePageSelectionEvent.class),
   @SerializedName("pressButton")
   PRESS_BUTTON(PressButtonEvent.class),
   @SerializedName("openFeatherMods")
   OPEN_FEATHER_MODS(HUDEditButton.class),
   @SerializedName("openHomepage")
   OPEN_HOMEPAGE(OpenHomePage.class),
   @SerializedName("closeHomepage")
   CLOSE_HOMEPAGE(PageCloseEvent.class),
   @SerializedName("loadClientPreferences")
   LOAD_CLIENT_PREFERENCES(LoadPreferences.class),
   @SerializedName("updateClientPreferences")
   UPDATE_CLIENT_PREFERENCES(cg.class),
   @SerializedName("loadModProfileList")
   LOAD_MOD_PROFILE_LIST(cG.class),
   @SerializedName("loadModProfile")
   LOAD_MOD_PROFILE(ModProfileConfig.class),
   @SerializedName("createModProfile")
   CREATE_MOD_PROFILE(CreateNewProfile.class),
   @SerializedName("selectModProfile")
   SELECT_MOD_PROFILE(cI.class),
   @SerializedName("renameModProfile")
   RENAME_MOD_PROFILE(renameProfileEvent.class),
   @SerializedName("cloneModProfile")
   CLONE_MOD_PROFILE(CloneModProfile.class),
   @SerializedName("deleteModProfile")
   DELETE_MOD_PROFILE(DeleteModProfile.class),
   @SerializedName("buildModSettings")
   BUILD_MOD_SETTINGS(BuildModCategory.class),
   @SerializedName("updateModSettings")
   UPDATE_MOD_SETTINGS(UpdateModSettings.class),
   @SerializedName("resetModSettings")
   RESET_MOD_SETTINGS(ResetModSettings.class),
   @SerializedName("buildSidebarSettings")
   BUILD_SIDEBAR_SETTINGS(BuildSideBarSettings.class),
   @SerializedName("loadSidebarSettings")
   LOAD_SIDEBAR_SETTINGS(LoadSideBarModConfigEvent.class),
   @SerializedName("updateSidebarSettings")
   UPDATE_SIDEBAR_SETTINGS(db.class),
   @SerializedName("resetSidebarSettings")
   RESET_SIDEBAR_SETTINGS(da.class),
   @SerializedName("buildCosmeticsMenu")
   BUILD_COSMETICS_MENU(BuildCosmeticMenuEvent.class),
   @SerializedName("loadCosmeticSettings")
   LOAD_COSMETICS_SETTINGS(LoadCosmeticSettingsEvent.class),
   @SerializedName("updateCosmetics")
   UPDATE_COSMETICS(UpdateCosmeticsEvent.class),
   @SerializedName("resetCosmeticsSettings")
   RESET_COSMETICS_SETTINGS(ResetCosmeticsSettingEvent.class),
   @SerializedName("openHudSelection")
   OPEN_HUD_SELECTION(cw.class),
   @SerializedName("closeHudSelection")
   CLOSE_HUD_SELECTION(CloseHUDSelection.class),
   @SerializedName("loadHudSelection")
   LOAD_HUD_SELECTION(cv.class),
   @SerializedName("doHudSelection")
   DO_HUD_SELECTION(DoHUDSelection.class),
   @SerializedName("drmRequest")
   DRM_REQUEST(DRMRequestEvent.class),
   @SerializedName("accountSwitchDetails")
   ACCOUNT_SWITCH_DETAILS(AccountSwitchDetailEvent.class),
   @SerializedName("loadAccountList")
   LOAD_ACCOUNT_LIST(LoadAccountListEvent.class),
   @SerializedName("changeAccount")
   CHANGE_ACCOUNT(ChangeAccountEvent.class),
   @SerializedName("openWaypointsMenu")
   OPEN_WAYPOINTS_MENU(WaypointsMenu.class),
   @SerializedName("loadWaypoints")
   LOAD_WAYPOINTS(LoadWaypoints.class),
   @SerializedName("createUpdateWaypoint")
   CREATE_UPDATE_WAYPOINT(WayPointCreateUpdate.class),
   @SerializedName("deleteWaypoint")
   DELETE_WAYPOINT(de.class),
   @SerializedName("openAutoTextMenu")
   OPEN_AUTO_TEXT_MENU(OpenAutoTextEvent.class),
   @SerializedName("loadMacros")
   LOAD_MACROS(LoadMarcoEvent.class),
   @SerializedName("createUpdateMacro")
   CREATE_UPDATE_MACRO(CreateUpdateMacro.class),
   @SerializedName("deleteMacro")
   DELETE_MACRO(DeleteMarco.class),
   @SerializedName("requestP2PJoin")
   REQUEST_P2P_JOIN(RequestP2PJoin.class),
   @SerializedName("acceptP2PJoin")
   ACCEPT_P2P_JOIN(AcceptP2PJoin.class),
   @SerializedName("prepareP2P")
   PREPARE_P2P(PrepareP2PEvent.class),
   @SerializedName("punchHole")
   PUNCH_HOLE(PunchHoleEvent.class),
   @SerializedName("closeP2P")
   CLOSE_P2P(CloseP2PEvent.class);

   @Nullable
   private final Class<? extends BrowserEvent> model;

   private BrowserEvents(@Nullable Class<? extends BrowserEvent> var3) {
      this.model = var3;
   }

   @NotNull
   public Class<? extends BrowserEvent> getModel() {
      return this.model;
   }
}
