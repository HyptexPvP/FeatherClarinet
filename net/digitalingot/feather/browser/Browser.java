package net.digitalingot.feather.browser;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.awt.Color;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.bA;
import net.digitalingot.feather.bB;
import net.digitalingot.feather.bC;
import net.digitalingot.feather.bE;
import net.digitalingot.feather.bG;
import net.digitalingot.feather.bI;
import net.digitalingot.feather.bJ;
import net.digitalingot.feather.bt;
import net.digitalingot.feather.ck;
import net.digitalingot.feather.iS;
import net.digitalingot.feather.is;
import net.digitalingot.feather.browserEvent.BrowserCall;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.config.ColorConfig;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.gui.GuiBrowser;
import net.digitalingot.feather.util.ChromaColor;
import net.digitalingot.feather.util.FeatherAssets;
import net.digitalingot.feather.util.FeatherBrowserButtons;
import net.digitalingot.feather.util.FeatherCommunication;
import net.digitalingot.feather.util.ServerAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Browser {
   @NotNull
   public static final Gson a = new GsonBuilder()
      .addSerializationExclusionStrategy(new bA())
      .enableComplexMapKeySerialization()
      .setFieldNamingStrategy(new bB())
      .registerTypeAdapterFactory(new bG())
      .registerTypeAdapter(Color.class, new bE())
      .registerTypeAdapter(ChromaColor.class, new ColorConfig())
      .registerTypeAdapter(InetSocketAddress.class, new ServerAddress())
      .registerTypeAdapter(byte[].class, new bC())
      .registerTypeAdapter(is.class, new bI())
      .registerTypeAdapter(FeatherAssets.class, new bJ.a())
      .registerTypeAdapter(FeatherBrowserButtons.class, new bJ.b())
      .registerTypeAdapter(ck.class, new bJ.c())
      .create();
   @NotNull
   private final Multimap<BrowserEvents, GuiBrowser<BrowserEvent, BrowserEvent, BrowserEvent>> b = ArrayListMultimap.create();
   @NotNull
   private final Map<Browser.a, bt<BrowserEvent, BrowserEvent>> c = new ConcurrentHashMap();
   @NotNull
   private final AtomicInteger d = new AtomicInteger();
   private final FeatherCommunication e = new FeatherCommunication();

   public <T extends BrowserEvent, S extends BrowserEvent, F extends BrowserEvent> void a(@NotNull BrowserEvents var1, @NotNull GuiBrowser<T, S, F> var2) {
      this.b.put(var1, var2);
   }

   public void a(@NotNull BrowserEvent var1) {
      this.a(var1, null, null, Browser.b.RUST_LAUNCHER);
   }

   public <S extends BrowserEvent, F extends BrowserEvent> void a(@NotNull BrowserEvent var1, @Nullable Consumer<S> var2, @Nullable Consumer<F> var3) {
      this.a(var1, var2, var3, Browser.b.RUST_LAUNCHER);
   }

   public void b(@NotNull BrowserEvent var1) {
      this.a(var1, null, null, Browser.b.FRONTEND);
   }

   public <S extends BrowserEvent, F extends BrowserEvent> void b(@NotNull BrowserEvent var1, @Nullable Consumer<S> var2, @Nullable Consumer<F> var3) {
      this.a(var1, var2, var3, Browser.b.FRONTEND);
   }

   private void a(@NotNull BrowserEvent var1, @NotNull Browser.b var2) {
      this.a(var1, null, null, var2);
   }

   private void b(@NotNull BrowserEvent var1, @NotNull Browser.b var2) {
      this.a(var1, null, null, var2);
   }

   private <S extends BrowserEvent, F extends BrowserEvent> void a(
      @NotNull BrowserEvent var1, @Nullable Consumer<S> var2, @Nullable Consumer<F> var3, @NotNull Browser.b var4
   ) {
      int var5 = this.d.incrementAndGet();
      if (var2 != null || var3 != null) {
         Browser.a var6 = new Browser.a(var4, var5);
         this.c.put(var6, new bt(var2, var3));
      }

      JsonElement var8 = a.toJsonTree(var1);
      BrowserCall var7 = new BrowserCall(var5, var1.a(), var8, null, null);
      this.b(var7, var4);
   }

   @VisibleForTesting
   public void a(@NotNull BrowserCall var1, @NotNull Browser.b var2) {
      if (var1.d() != null || var1.e() != null) {
         Browser.a var12 = new Browser.a(var2, var1.a());
         bt var13 = (bt)this.c.get(var12);
         if (var13 == null) {
            return;
         }

         Consumer var14 = var13.a();
         Consumer var15 = var13.b();
         if (var1.d() != null && var14 != null) {
            Class var17 = iS.a(var14.getClass(), 0, 0);
            BrowserEvent var19 = (BrowserEvent)a.fromJson(var1.d(), var17);
            var14.accept(var19);
         } else if (var1.e() != null && var15 != null) {
            Class var16 = iS.a(var15.getClass(), 0, 0);
            BrowserEvent var18 = (BrowserEvent)a.fromJson(var1.e(), var16);
            var15.accept(var18);
         }
      } else if (var1.b() != null) {
         BrowserEvents var3 = var1.b();
         Collection var4 = this.b.get(var3);
         if (var4.isEmpty()) {
            return;
         }

         BrowserEvent var5;
         if (var1.c() == null) {
            var5 = null;
         } else {
            var5 = (BrowserEvent)a.fromJson(var1.c(), var3.getModel());
         }

         for(GuiBrowser var7 : var4) {
            Consumer var8 = var3x -> {
               JsonElement var4x = a.toJsonTree(var3x);
               BrowserCall var5x = new BrowserCall(var1.a(), null, null, var4x, null);
               this.b(var5x, var2);
            };
            Consumer var9 = var3x -> {
               JsonElement var4x = a.toJsonTree(var3x);
               BrowserCall var5x = new BrowserCall(var1.a(), null, null, null, var4x);
               this.b(var5x, var2);
            };

            try {
               var7.a(var5, var8, var9);
            } catch (Exception var11) {
               FeatherLogger.a.error("Exception during executing a callback", var11);
               var9.accept(new BrowserNotification(var11.getClass().getName() + ": " + var11.getMessage()));
            }
         }
      }

   }

   private void b(@NotNull BrowserCall var1, @NotNull Browser.b var2) {
      String var3 = a.toJson(var1);
      switch(var2) {
         case FRONTEND:
            BrowserJavascript.a(var3);
            break;
         case RUST_LAUNCHER:
            this.e.a(var3);
      }

   }

   static class a {
      @NotNull
      private final Browser.b a;
      private final int b;

      a(@NotNull Browser.b var1, int var2) {
         this.a = var1;
         this.b = var2;
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            Browser.a var2 = (Browser.a)var1;
            return this.b == var2.b && this.a == var2.a;
         } else {
            return false;
         }
      }

      public int hashCode() {
         return Objects.hash(new Object[]{this.a, this.b});
      }
   }

   @VisibleForTesting
   public static enum b {
      FRONTEND,
      RUST_LAUNCHER;
   }
}
