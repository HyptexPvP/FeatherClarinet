package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.config.Config;
import net.digitalingot.feather.cosmetic.Cosmetic;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UpdateCosmeticsEvent implements BrowserEvent {
   @SerializedName("settings")
   @Nullable
   private final UpdateCosmeticsEvent.a a;
   @SerializedName("equipped")
   @Nullable
   private final UpdateCosmeticsEvent.b b;

   public UpdateCosmeticsEvent(@Nullable UpdateCosmeticsEvent.a var1, @Nullable UpdateCosmeticsEvent.b var2) {
      this.a = var1;
      this.b = var2;
   }

   @Nullable
   public UpdateCosmeticsEvent.a b() {
      return this.a;
   }

   @Nullable
   public UpdateCosmeticsEvent.b c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.UPDATE_COSMETICS;
   }

   public static class a {
      @SerializedName("cosmetic")
      @NotNull
      private final String a;
      @SerializedName("settings")
      @NotNull
      private final Config b;

      public a(@NotNull String var1, @NotNull Config var2) {
         this.a = var1;
         this.b = var2;
      }

      @NotNull
      public String a() {
         return this.a;
      }

      @NotNull
      public Config b() {
         return this.b;
      }
   }

   public static class b {
      @SerializedName("equipped")
      @NotNull
      private final Map<Cosmetic.a, String> a;

      public b(@NotNull Map<Cosmetic.a, String> var1) {
         this.a = var1;
      }

      @NotNull
      public Map<Cosmetic.a, String> a() {
         return this.a;
      }
   }
}
