package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.UUID;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.gui.ChangeAccount;
import org.jetbrains.annotations.NotNull;

public class LoadAccountListEvent implements BrowserEvent {
   @SerializedName("selected")
   @NotNull
   private final UUID a;
   @SerializedName("list")
   @NotNull
   private final List<LoadAccountListEvent.a> b;

   public LoadAccountListEvent(@NotNull UUID var1, @NotNull List<LoadAccountListEvent.a> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public UUID b() {
      return this.a;
   }

   @NotNull
   public List<LoadAccountListEvent.a> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_ACCOUNT_LIST;
   }

   public static class a {
      @SerializedName("mcID")
      @NotNull
      private final UUID a;
      @SerializedName("mcUsername")
      @NotNull
      private final String b;

      public static LoadAccountListEvent.a a(ChangeAccount.a var0) {
         return new LoadAccountListEvent.a(var0.b(), var0.c());
      }

      public a(@NotNull UUID var1, @NotNull String var2) {
         this.a = var1;
         this.b = var2;
      }

      @NotNull
      public UUID a() {
         return this.a;
      }

      @NotNull
      public String b() {
         return this.b;
      }
   }
}
