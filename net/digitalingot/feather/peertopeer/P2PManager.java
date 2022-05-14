package net.digitalingot.feather.peertopeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.gui.P2PJoinUI;
import net.digitalingot.feather.redstone.RedstoneManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class P2PManager {
   @NotNull
   private final List<Integer> a = new ArrayList();
   @NotNull
   private final Map<UUID, P2PManager.b> b = new HashMap();
   @NotNull
   private final Map<UUID, P2PManager.a> c = new HashMap();
   @Nullable
   private RedstoneManager d;

   private P2PManager() {
   }

   @NotNull
   public static P2PManager a() {
      P2PManager var0 = new P2PManager();
      Browser var1 = e.c().a();
      var1.a(BrowserEvents.REQUEST_P2P_JOIN, new P2PJoinUI.b(var0));
      var1.a(BrowserEvents.ACCEPT_P2P_JOIN, new P2PJoinUI.a(var0));
      return var0;
   }

   @NotNull
   public List<Integer> b() {
      return this.a;
   }

   @NotNull
   public Map<UUID, P2PManager.b> c() {
      return this.b;
   }

   @NotNull
   public Map<UUID, P2PManager.a> d() {
      return this.c;
   }

   @Nullable
   public RedstoneManager e() {
      return this.d;
   }

   public void a(@NotNull RedstoneManager var1) {
      this.d = var1;
   }

   public static class a {
      private final long a;
      private final int b;

      public a(long var1, int var3) {
         this.a = var1;
         this.b = var3;
      }

      public long a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }
   }

   public static class b {
      private final int a;
      private final long b;

      public b(int var1, long var2) {
         this.a = var1;
         this.b = var2;
      }

      public int a() {
         return this.a;
      }

      public long b() {
         return this.b;
      }
   }
}
