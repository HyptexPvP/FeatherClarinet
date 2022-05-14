package net.digitalingot.feather.mods;

import java.awt.Color;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.UUID;
import net.digitalingot.feather.FeatherDRM;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.bc;
import net.digitalingot.feather.d;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.f;
import net.digitalingot.feather.fq;
import net.digitalingot.feather.hE;
import net.digitalingot.feather.hH;
import net.digitalingot.feather.hI;
import net.digitalingot.feather.is;
import net.digitalingot.feather.l;
import net.digitalingot.feather.browserEvent.ChannelCallBackEvent;
import net.digitalingot.feather.command.CommandHandler;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.config.Preferences;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.OpenHome;
import net.digitalingot.feather.event.PlayerEvent;
import net.digitalingot.feather.event.RenderEVent;
import net.digitalingot.feather.event.RenderEvent2D;
import net.digitalingot.feather.event.openScreen;
import net.digitalingot.feather.gui.BrowserGUI;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.ChangeAccount;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.gui.GuiIngameMenu;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.gui.HUDEdiorUI;
import net.digitalingot.feather.peertopeer.BrowserTest;
import net.digitalingot.feather.server.ServerPacketPlugin;
import net.digitalingot.feather.util.Account;
import net.digitalingot.feather.util.CurrentServer;
import net.digitalingot.feather.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;

@FeatherModule(
   a = ModsConfig.CORE,
   b = @dn(
   a = "General",
   b = "https://assets.feathercdn.net/game/sidebar/general.svg",
   c = "General",
   d = {},
   e = @dn.a(
   a = "General",
   b = @ModConfigValueAnnotation(
   a = 0
)
)
)
)
public class CoreMod extends Mod<CoreMod.a> {
   private static final ResourceLocation a = new ResourceLocation("feather:textures/gui/feather_logo.png");
   private static final int c = 322;
   private static final int d = 97;
   private static final ResourceLocation e = new ResourceLocation("feather:textures/gui/feather_icon.png");
   private static final int f = 173;
   private static final int g = 257;
   private Minecraft h;
   @Nullable
   private fq i;
   @Nullable
   private Account j;
   private int k;
   private boolean l;
   private boolean m;

   @Override
   public void f() {
      if (FeatherDRM.b() != ChannelCallBackEvent.a.IDE) {
         FeatherDRM.DRMThread();
      }

      net.digitalingot.feather.d.a();
      ChangeAccount.a();
      ServerPacketPlugin.a.a();

      try {
         this.j = new Account();
         this.i = fq.a(this.j);
      } catch (l | IOException var2) {
         FeatherLogger.a.error("Error while trying to authenticate with core backend", var2);
         FeatherLogger.a.error("For the time being, you need to be authenticated in order to participate in our beta.");
         Minecraft.func_71410_x().func_71400_g();
         return;
      }

      this.h = Minecraft.func_71410_x();
      if (this.h.field_71462_r != null && this.h.field_71462_r instanceof GuiMainMenu) {
         OpenHome.a(true);
         BrowserGUI var1 = BrowserUtils.INSTANCE.getScreen();
         var1.a(true);
         this.h.func_147108_a(var1);
      }

      openScreen.a.a(var0 -> {
         BrowserGUI var1x = BrowserUtils.INSTANCE.getScreen();
         if (var0 instanceof GuiMainMenu) {
            if (!var1x.a()) {
               OpenHome.a(true);
               var1x.a(true);
            }

            return var1x;
         } else {
            if (var1x.a()) {
               OpenHome.a(false);
               var1x.a(false);
            }

            return var0;
         }
      });
      CommandHandler.a.a(var0 -> {
         if (System.getenv("FEATHER_TEST") != null) {
            new BrowserTest().a(var0);
         }
      });
      RenderEVent.b.a((var0, var1x) -> {
         if (var1x == RenderEVent.c.ALL) {
            RenderEVent.c.a().render(var0, var1x);
         }

      });
      PlayerEvent.a.a((var1x, var2x) -> {
         NetworkManager var3 = var2x.func_147298_b();
         if (!var3.func_150731_c()) {
            if (!Minecraft.func_71410_x().func_71356_B()) {
               this.k = 40;
               InetSocketAddress var4 = (InetSocketAddress)var3.func_74430_c();
               String var5 = var4.getHostName();
               var5 = var5.endsWith(".") ? var5.substring(0, var5.length() - 1) : var5;
               f var6 = net.digitalingot.feather.e.c();
               if (var5.toLowerCase().contains("hypixel.net")) {
                  var6.a(CurrentServer.HYPIXEL);
               } else {
                  var6.a(CurrentServer.OTHER);
               }

            }
         }
      });
      PlayerEvent.b.a((var0, var1x) -> {
         f var2x = net.digitalingot.feather.e.c();
         var2x.b().d();
         var2x.a(CurrentServer.NONE);
      });
      Events.a.a(var1x -> {
         if (this.k > 0 && --this.k == 0) {
            ServerPacketPlugin.a.b();
         }

      });
      FeatherGUI.b.a((var1x, var2x, var3, var4) -> {
         if (this.h.field_71462_r == null) {
            if (this.b.u.b()) {
               this.h.func_147108_a(new HUDEdiorUI());
            }

         }
      });
      RenderEvent2D.a.a((var1x, var2x) -> {
         int var3 = (int)var2x.a();
         int var4 = (int)var2x.b();
         this.b(var1x.func_110124_au(), var3, var4);
      });
      new GuiIngameMenu().a();
      this.l = this.b.i;
      this.m = this.b.j;
   }

   @Override
   public void h() {
      if (this.j != null) {
         this.j.close();
         this.j = null;
      }

   }

   @Override
   public void i() {
      BrowserUtils.INSTANCE.getScreen().c();
      Preferences.a(net.digitalingot.feather.e.c().c());
      if (this.b.i != this.l || this.b.j != this.m) {
         this.h.func_110436_a();
         this.l = this.b.i;
         this.m = this.b.j;
      }

   }

   @Nullable
   private Integer a(UUID var1) {
      if (this.i != null) {
         hE.a.c.b.c var2 = (hE.a.c.b.c)this.i.a().b().get(var1);
         if (var2 != null && var2.b()) {
            switch(var2.d().a()) {
               case OWNER:
                  return -65531;
               case STAFF:
                  return -16762625;
               case DEVELOPER:
                  return -2669828;
               case PRO:
                  return -459710;
               case PARTNER:
                  return -16711880;
               case CREATOR:
                  return -13445665;
               default:
                  return -1;
            }
         }
      }

      return null;
   }

   public int a(UUID var1, int var2, int var3) {
      Integer var4 = this.a(var1);
      if (var4 != null) {
         RenderUtil.a(0, e);
         hH.a().a(var2, var3, 0.0F, 0.0F, 173, 257, 6, 8, 173.0F, 257.0F, var4);
         return 9;
      } else {
         return 0;
      }
   }

   private void b(UUID var1, int var2, int var3) {
      Integer var4 = this.a(var1);
      if (var4 != null) {
         RenderUtil.e();
         RenderUtil.a(true);
         var2 = -var2;
         var3 = -var3;
         if (b(var1)) {
            var3 = (int)((double)var3 - 6.0);
         }

         RenderUtil.a(0, e);
         hH.a().a(var2 - 12, var3 - 3, 0.0F, 0.0F, 173, 257, 9, 13, 173.0F, 257.0F, var4);
         RenderUtil.a(false);
         RenderUtil.f();
      }

   }

   private static boolean b(UUID var0) {
      f var1 = net.digitalingot.feather.e.c();
      if (var1.g() != CurrentServer.HYPIXEL) {
         return false;
      } else {
         HypixelMod var2 = (HypixelMod)var1.b().a(ModsConfig.HYPIXEL);
         if (var2.m() && var2.k().j()) {
            LevelHead var3 = var2.a();
            return !var3.b() ? false : var3.a(var0);
         } else {
            return false;
         }
      }
   }

   public void a(int var1, int var2) {
      boolean var3 = true;
      boolean var4 = true;
      RenderUtil.d();
      RenderUtil.f();
      RenderUtil.a(0, a);
      hH.a().a(var1 - 80 - 5, var2 - 24 - 5, 0.0F, 0.0F, 322, 257, 80, 24, 322.0F, 257.0F, -1);
      RenderUtil.c();
      RenderUtil.e();
   }

   @Nullable
   public fq a() {
      return this.i;
   }

   @Nullable
   public Account b() {
      return this.j;
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("General Settings");
      @ModConfigAnnotation(
         a = "mainColor",
         b = "Main Color",
         c = "221/53/56",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public Color b;
      @ModConfigAnnotation(
         a = "borderlessFullscreen",
         b = "Borderless Fullscreen",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public boolean c;
      @ModConfigAnnotation(
         a = "fullBright",
         b = "Full Bright",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean d;
      @ModConfigAnnotation(
         a = "alwaysNametag",
         b = "Nametag in perspective",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "clearGlass",
         b = "Clear Glass",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 5
)
      )
      public boolean i;
      @ModConfigAnnotation(
         a = "clearColoredGlass",
         b = "Clear Colored Glass",
         c = "false",
         d = @dB(
   a = "clearGlass"
),
         e = @ModConfigValueAnnotation(
   a = 6
)
      )
      public boolean j;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh k = new eh("Chroma Settings");
      @ModConfigAnnotation(
         a = "chromaMode",
         b = "Type",
         c = "normal",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public hI l;
      @ModConfigAnnotation(
         a = "chromaSpeed",
         b = "Speed",
         c = "10",
         d = @dB(
   a = "chromaMode",
   b = {"breathing"}
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      @DoubleRange(
         b = 1.0,
         a = 25.0
      )
      public double m;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh n = new eh("Mods");
      @ModConfigAnnotation(
         a = "showModsInChat",
         b = "Show Mods in Chat",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean o;
      @ModConfigAnnotation(
         a = "showModsInInventory",
         b = "Show Mods in Inventory",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      public boolean p;
      @ModConfigValueAnnotation(
         a = 40
      )
      public eh q = new eh("UI");
      @ModConfigAnnotation(
         a = "uiQuality",
         b = "Quality",
         c = "ultra",
         e = @ModConfigValueAnnotation(
   a = 42
)
      )
      public bc r;
      @ModConfigAnnotation(
         a = "militaryTime",
         b = "24 Hour Close",
         e = @ModConfigValueAnnotation(
   a = 43
)
      )
      public boolean s;
      @ModConfigValueAnnotation(
         a = 50
      )
      public eh t = new eh("HUD Editor");
      @ModConfigAnnotation(
         a = "keyHudEditor",
         b = "Open HUD Editor",
         c = "10016",
         e = @ModConfigValueAnnotation(
   a = 51
)
      )
      public is u;
      @ModConfigAnnotation(
         a = "snappingLineColor",
         b = "Line Color",
         c = "128/255/255/255",
         e = @ModConfigValueAnnotation(
   a = 52
)
      )
      public Color v;
      @ModConfigAnnotation(
         a = "snappingLineWidth",
         b = "Line Width",
         c = "1",
         e = @ModConfigValueAnnotation(
   a = 53
)
      )
      @IntegerRange(
         b = 1,
         a = 7
      )
      public int w;
      @ModConfigAnnotation(
         a = "snappingMagnetRadius",
         b = "Magnet Radius",
         c = "6",
         e = @ModConfigValueAnnotation(
   a = 54
)
      )
      @IntegerRange(
         b = 1,
         a = 15
      )
      public int x;
      @ModConfigValueAnnotation(
         a = 60
      )
      public eh y = new eh("Blur Settings");
      @ModConfigAnnotation(
         a = "inventoryBlur",
         b = "Inventory",
         e = @ModConfigValueAnnotation(
   a = 61
)
      )
      public boolean z;
      @ModConfigAnnotation(
         a = "menusBlur",
         b = "Menu",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 62
)
      )
      public boolean A;
      @ModConfigValueAnnotation(
         a = 70
      )
      public eh B = new eh("Sound");
      @ModConfigAnnotation(
         a = "portalSound",
         b = "Portal Sounds",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 71
)
      )
      public boolean C;

      @Override
      public boolean j() {
         return true;
      }
   }
}
