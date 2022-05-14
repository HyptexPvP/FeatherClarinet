package net.digitalingot.feather.gui;

import java.io.File;
import net.digitalingot.feather.FeatherDRM;
import net.digitalingot.feather.aW;
import net.digitalingot.feather.dl;
import net.digitalingot.feather.e;
import net.digitalingot.feather.hp;
import net.digitalingot.feather.browser.BrowserJavascript;
import net.digitalingot.feather.config.ConfigManager;
import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.mods.CoreMod;
import net.digitalingot.feather.mods.OofMod;
import net.digitalingot.feather.settings.BuildModConfig;
import net.minecraft.client.Minecraft;
import org.cef.Async;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.ICefPlatform;
import org.cef.Async.Impl;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.browser.CefMessageRouter;
import org.cef.browser.CefMessageRouter.CefMessageRouterConfig;
import org.cef.callback.CefContextMenuParams;
import org.cef.callback.CefMenuModel;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefAppHandlerAdapter;
import org.cef.handler.CefContextMenuHandlerAdapter;
import org.cef.handler.CefLifeSpanHandlerAdapter;
import org.cef.handler.CefMessageRouterHandlerAdapter;
import org.jetbrains.annotations.NotNull;

public enum BrowserUtils implements Events.a {
   INSTANCE;

   private static final String URL = getUrl();
   private final dl<CoreMod> coreGetter = ConfigManager.a(CoreMod.class);
   private Minecraft minecraft;
   private CefApp cefApp;
   private CefClient cefClient;
   private CefBrowser cefBrowser;
   private aW renderer;
   private CefMessageRouter messageRouter;
   private BrowserGUI screen;
   private int tickCount = 0;

   private static String getUrl() {
      if (System.getenv("FEATHER_TEST") != null) {
         return System.getenv("FEATHER_LOCAL_TEST") != null ? "http://127.0.0.1:4200/" : "https://ig-client.feathermc.com/";
      } else {
         switch(FeatherDRM.b()) {
            case IDE:
               return "https://ig-client.feathermc.com/";
            case DEVELOPMENT:
               return "https://dev.mc-webapp.feathermc.com/";
            case BETA:
               return "https://beta.mc-webapp.feathermc.com/";
            case RELEASE:
               return "https://mc-webapp.feathermc.com/";
            default:
               return System.getenv("FEATHER_TEST") == null
                  ? "https://mc-webapp.feathermc.com/"
                  : (System.getenv("FEATHER_LOCAL_TEST") == null ? "https://ig-client.feathermc.com/" : "http://127.0.0.1:4200");
         }
      }
   }

   public void initialize() {
      this.minecraft = Minecraft.func_71410_x();
      this.initializeCef();
      this.registerEvents();
   }

   private void initializeCef() {
      Async.setImpl(new Impl() {
         public void invokeLater(Runnable var1) {
            BrowserUtils.this.minecraft.func_152344_a(var1);
         }

         public void invokeAndWait(Runnable var1) {
            if (BrowserUtils.this.minecraft.func_152345_ab()) {
               var1.run();
            } else {
               BrowserUtils.this.minecraft.func_152344_a(var1).get();
            }

         }
      });
      if (!CefApp.startup(null)) {
         throw new RuntimeException();
      } else {
         CefSettings var1 = new CefSettings();
         var1.windowless_rendering_enabled = true;
         var1.cache_path = new File(e.c().d(), "cef_cache").getAbsolutePath();
         var1.locale = "en-US";
         if (System.getenv("FEATHER_TEST") != null) {
            var1.remote_debugging_port = 9222;
         }

         this.cefApp = CefApp.getInstance(null, var1);
         CefApp.addAppHandler(new CefAppHandlerAdapter(new String[]{"--external-message-pump"}) {
            public void onScheduleMessagePumpWork(long var1) {
            }
         });
         this.cefClient = this.cefApp.createClient();
         this.cefClient.addContextMenuHandler(new CefContextMenuHandlerAdapter() {
            public void onBeforeContextMenu(CefBrowser var1, CefFrame var2, CefContextMenuParams var3, CefMenuModel var4) {
               var4.clear();
            }
         });
         this.cefClient.removeLifeSpanHandler();
         this.cefClient.addLifeSpanHandler(new CefLifeSpanHandlerAdapter() {
            public void onAfterCreated(CefBrowser var1) {
               var1.setWindowlessFrameRate(144);
               super.onAfterCreated(var1);
            }
         });
         this.messageRouter = CefMessageRouter.create(new CefMessageRouterConfig());
         this.cefClient.addMessageRouter(this.messageRouter);
         this.messageRouter.addHandler(new CefMessageRouterHandlerAdapter() {
            public boolean onQuery(CefBrowser var1, CefFrame var2, long var3, String var5, boolean var6, CefQueryCallback var7) {
               BrowserJavascript.b(var5);
               return true;
            }
         }, true);
         this.renderer = new aW();
         this.cefBrowser = this.cefClient.createBrowser(URL, true, true, this.renderer, new ICefPlatform() {
         });
         this.cefBrowser.createImmediately();
         this.screen = new BrowserGUI(this.cefApp, this.cefBrowser, this.renderer);
      }
   }

   private void registerEvents() {
      Events.a.a(this);
      ChatEvent.a.a(() -> {
         if (this.isOpen()) {
            this.renderer.render();
         }

      });
   }

   public void show() {
      this.minecraft.func_147108_a(this.screen);
      OofMod var1 = e.c().b().b(OofMod.class);
      if (var1.a()) {
         BuildModConfig.a(e.c().b());
      }

   }

   @Override
   public void tick(@NotNull Events.c var1) {
      if (var1 == Events.c.END && this.cefBrowser != null && !(this.minecraft.field_71462_r instanceof BrowserGUI) && ++this.tickCount % 20 == 0) {
         this.screen.c();
         this.cefApp.N_DoMessageLoopWork();
      }

   }

   public int getPreferredWidth() {
      int var1 = hp.c();
      CoreMod var2 = this.coreGetter.a();
      return (int)((float)var1 * (var2 != null ? var2.k().r.getScale() : 1.0F));
   }

   public int getPreferredHeight() {
      int var1 = hp.d();
      CoreMod var2 = this.coreGetter.a();
      return (int)((float)var1 * (var2 != null ? var2.k().r.getScale() : 1.0F));
   }

   public CefBrowser getCefBrowser() {
      return this.cefBrowser;
   }

   public BrowserGUI getScreen() {
      return this.screen;
   }

   public boolean isOpen() {
      return this.minecraft != null && (this.minecraft.field_71462_r instanceof BrowserGUI || this.minecraft.field_71462_r instanceof HUDEdiorUI);
   }
}
