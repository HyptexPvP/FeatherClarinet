package net.digitalingot.feather.gui;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.digitalingot.feather.ix;
import net.digitalingot.feather.browserEvent.UpdateKey;
import net.digitalingot.feather.event.OnKey;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import org.cef.CefApp;
import org.cef.ICefRenderer;
import org.cef.browser.CefBrowser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class BrowserGUI extends GuiScreen {
   private static final Component a = new Component() {
   };
   private final CefApp b;
   private final CefBrowser c;
   private final ICefRenderer d;
   private final MainMenuGUI e;
   private final Map<Integer, BrowserGUI.a> f = new HashMap();
   private final Set<Integer> g = new HashSet();
   private int h;
   private boolean i;
   private boolean j;
   private boolean k;
   @Nullable
   private UpdateKey.a l;
   private long m;

   public BrowserGUI(CefApp var1, CefBrowser var2, ICefRenderer var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = new MainMenuGUI(this);
   }

   private static int a(int var0) {
      if (func_146271_m()) {
         var0 |= 128;
      }

      if (func_146272_n()) {
         var0 |= 64;
      }

      if (func_175283_s()) {
         var0 |= 512;
      }

      return var0;
   }

   private static int b(int var0) {
      switch(var0) {
         case 29:
         case 42:
         case 56:
         case 219:
            return 2;
         case 54:
         case 157:
         case 184:
         case 220:
            return 3;
         case 55:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 141:
         case 156:
         case 179:
         case 181:
            return 4;
         default:
            return 1;
      }
   }

   private static int c(int var0) {
      return var0 >= 0 && var0 <= 4 ? var0 + 1 : 0;
   }

   private static int d(int var0) {
      if (Mouse.isButtonDown(0)) {
         var0 |= 1024;
      }

      if (Mouse.isButtonDown(1)) {
         var0 |= 2048;
      }

      if (Mouse.isButtonDown(3)) {
         var0 |= 4096;
      }

      return var0;
   }

   public void func_73866_w_() {
      this.c.setFocus(true);
      GlStateManager.func_179090_x();
      GlStateManager.func_179098_w();
      this.b();
   }

   public void func_146281_b() {
      this.c.setFocus(false);
      this.a(null);
      this.f.clear();
   }

   public void func_73863_a(int var1, int var2, float var3) {
      if (!this.k && this.j) {
         this.b();
         this.k = true;
      }

      if (this.i) {
         this.e.a(var3);
      }

      long var4 = System.currentTimeMillis();
      boolean var6 = this.a(var4);
      if (var6 || var4 - this.m >= 20L) {
         this.b.N_DoMessageLoopWork();
         this.m = var4;
      }

      this.d.render();
   }

   private boolean a(long var1) {
      if (!this.j) {
         return false;
      } else {
         boolean var3 = false;
         if (Mouse.isCreated()) {
            while(Mouse.next()) {
               var3 = true;

               try {
                  this.field_146297_k.field_71462_r.func_146274_d();
               } catch (IOException var8) {
               }
            }
         }

         if (Keyboard.isCreated()) {
            while(Keyboard.next()) {
               var3 = true;

               try {
                  this.field_146297_k.field_71462_r.func_146282_l();
               } catch (IOException var7) {
               }
            }
         }

         Iterator var4 = this.f.entrySet().iterator();

         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            if (!Keyboard.isKeyDown(var5.getKey())) {
               var4.remove();
            } else {
               BrowserGUI.a var6 = (BrowserGUI.a)var5.getValue();
               var6.a(var1);
            }
         }

         return var3;
      }
   }

   protected void func_73869_a(char var1, int var2) {
   }

   protected void func_73864_a(int var1, int var2, int var3) {
   }

   protected void func_146286_b(int var1, int var2, int var3) {
   }

   protected void func_146273_a(int var1, int var2, int var3, long var4) {
   }

   public void func_146282_l() {
      if (this.j) {
         boolean var1 = Keyboard.getEventKeyState();
         char var2 = Keyboard.getEventCharacter();
         int var3 = Keyboard.getEventKey();
         long var4 = Keyboard.getEventNanoseconds() / 1000000L;
         int var6 = a(0);
         int var7 = ix.a(var3).c();
         int var8 = b(var3);
         if (var1) {
            if (this.l != null) {
               if (var3 != 1) {
                  this.g.add(var3);
               } else {
                  this.l.respond(new int[]{var3});
                  this.a(null);
               }

               return;
            }

            char var9 = var2 != 0 && Character.isDefined(var2) ? var2 : '\uffff';
            KeyEvent var10 = new KeyEvent(a, 401, var4, var6, var7, var9, var8);
            OnKey.a(var10, var3);
            this.c.sendKeyEvent(var10);
            if (var9 != '\uffff') {
               KeyEvent var11 = new KeyEvent(a, 400, var4, var6, 0, var9);
               if (!Character.isIdentifierIgnorable(var9)) {
                  var10 = var11;
               }

               this.c.sendKeyEvent(var11);
            }

            this.f.put(var3, new BrowserGUI.a(var9 != '\uffff' ? var2 : null, var10, System.currentTimeMillis()));
         } else {
            if (this.l != null) {
               this.l.respond(this.g.stream().mapToInt(var0 -> var0).toArray());
               this.a(null);
               return;
            }

            BrowserGUI.a var12 = (BrowserGUI.a)this.f.remove(var3);
            char var13 = var12 != null ? (var12.a() != null ? var12.a() : '\uffff') : '\uffff';
            KeyEvent var14 = new KeyEvent(a, 402, var4, var6, var7, var13, var8);
            OnKey.a(var14, var3);
            this.c.sendKeyEvent(var14);
         }

         super.func_146282_l();
      }
   }

   public void func_146274_d() {
      if (this.j || this.l == null) {
         int var1 = Math.min(BrowserUtils.INSTANCE.getPreferredWidth(), this.field_146297_k.field_71443_c);
         int var2 = Math.min(BrowserUtils.INSTANCE.getPreferredHeight(), this.field_146297_k.field_71440_d);
         int var3 = Mouse.getEventX() * var1 / this.field_146297_k.field_71443_c;
         int var4 = var2 - Mouse.getEventY() * var2 / this.field_146297_k.field_71440_d - 1;
         long var5 = Mouse.getEventNanoseconds() / 1000000L;
         int var7 = Mouse.getEventButton();
         int var8 = a(d(0));
         if (var7 == -1) {
            int var9 = Mouse.getEventDWheel();
            if (var9 != 0) {
               this.c.sendMouseWheelEvent(new MouseWheelEvent(a, 507, var5, var8, var3, var4, 0, false, 0, 1, var9));
            } else {
               boolean var10 = this.h != -1;
               this.c.sendMouseEvent(new MouseEvent(a, var10 ? 506 : 503, var5, var8, var3, var4, 0, false, 0));
            }
         } else {
            int var11 = c(var7);
            if (var11 != 0) {
               boolean var12 = Mouse.getEventButtonState();
               if (var12) {
                  this.h = var7;
                  if (this.l != null) {
                     this.g.add(var7 + 100001);
                     return;
                  }

                  this.c.sendMouseEvent(new MouseEvent(a, 501, var5, var8, var3, var4, 1, false, var11));
               } else {
                  this.h = -1;
                  if (this.l != null) {
                     this.l.respond(this.g.stream().mapToInt(var0 -> var0).toArray());
                     this.a(null);
                     return;
                  }

                  this.c.sendMouseEvent(new MouseEvent(a, 502, var5, var8, var3, var4, 1, false, var11));
                  this.c.sendMouseEvent(new MouseEvent(a, 500, var5, var8, var3, var4, 1, false, var11));
               }
            }
         }

      }
   }

   public void func_146280_a(@NotNull Minecraft var1, int var2, int var3) {
      super.func_146280_a(var1, var2, var3);
      this.c();
   }

   public void a(boolean var1) {
      this.i = var1;
   }

   public boolean a() {
      return this.i;
   }

   public void b(boolean var1) {
      this.j = var1;
   }

   public void a(@Nullable UpdateKey.a var1) {
      this.g.clear();
      this.l = var1;
   }

   public void b() {
      int var1 = BrowserUtils.INSTANCE.getPreferredWidth();
      int var2 = this.field_146297_k.field_71443_c;
      int var3 = Math.min(var1, var2);
      float var4;
      if (var1 != var2) {
         var4 = (float)var2 / (float)var1;
      } else {
         var4 = 1.0F;
      }

      this.c.setZoomLevel((double)var4 * (7.223264540337711E-4 * ((double)var3 - 854.0) + 0.23) * 4.0 - 4.0);
   }

   public void c() {
      if (this.field_146297_k != null) {
         int var1 = Math.min(BrowserUtils.INSTANCE.getPreferredWidth(), this.field_146297_k.field_71443_c);
         int var2 = Math.min(BrowserUtils.INSTANCE.getPreferredHeight(), this.field_146297_k.field_71440_d);
         Rectangle var3 = this.c.getRenderHandler().getViewRect(this.c);
         if (var3.width != var1 || var3.height != var2) {
            this.b();
            this.c.wasResized(var1, var2);
         }

      }
   }

   public float d() {
      return this.field_73735_i;
   }

   class a {
      @Nullable
      private final Character b;
      @NotNull
      private final KeyEvent c;
      private int d;
      private long e;

      private a(@Nullable Character var2, @NotNull KeyEvent var3, long var4) {
         this.b = var2;
         this.c = var3;
         this.e = var4;
      }

      public void a(long var1) {
         if (var1 - this.e >= (this.d == 0 ? 500L : 30L)) {
            BrowserGUI.this.c.sendKeyEvent(this.c);
            this.e = var1;
            ++this.d;
         }
      }

      public Character a() {
         return this.b;
      }

      @NotNull
      public KeyEvent b() {
         return this.c;
      }
   }
}
