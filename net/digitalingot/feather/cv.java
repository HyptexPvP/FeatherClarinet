package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class cv implements BrowserEvent {
   @SerializedName("choices")
   @NotNull
   private final Map<Integer, cv.a> a;

   public cv(@NotNull Map<Integer, cv.a> var1) {
      this.a = var1;
   }

   @NotNull
   public Map<Integer, cv.a> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_HUD_SELECTION;
   }

   public static class a {
      @SerializedName("slug")
      @NotNull
      private final String a;
      @SerializedName("name")
      @NotNull
      private final String b;
      @SerializedName("icon")
      @NotNull
      private final String c;

      public a(@NotNull String var1, @NotNull String var2, @NotNull String var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      @NotNull
      public String a() {
         return this.a;
      }

      @NotNull
      public String b() {
         return this.b;
      }

      @NotNull
      public String c() {
         return this.c;
      }
   }
}
