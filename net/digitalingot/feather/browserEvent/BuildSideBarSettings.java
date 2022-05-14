package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModSetting;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class BuildSideBarSettings implements BrowserEvent {
   @SerializedName("tabs")
   @NotNull
   private final List<BuildSideBarSettings.a> a;

   public BuildSideBarSettings(@NotNull List<BuildSideBarSettings.a> var1) {
      this.a = var1;
   }

   @NotNull
   public List<BuildSideBarSettings.a> b() {
      return this.a;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.BUILD_SIDEBAR_SETTINGS;
   }

   public static class a {
      @SerializedName("name")
      @NotNull
      private final String a;
      @SerializedName("slug")
      @NotNull
      private final ModsConfig b;
      @SerializedName("sidebar")
      @NotNull
      private final String c;
      @SerializedName("icon")
      @NotNull
      private final String d;
      @SerializedName("description")
      @NotNull
      private final String e;
      @SerializedName("form")
      @NotNull
      private final List<ModSetting> f;

      public a(@NotNull String var1, @NotNull ModsConfig var2, @NotNull String var3, @NotNull String var4, @NotNull String var5, @NotNull List<ModSetting> var6) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
      }

      @NotNull
      public String a() {
         return this.a;
      }

      @NotNull
      public ModsConfig b() {
         return this.b;
      }

      @NotNull
      public String c() {
         return this.c;
      }

      @NotNull
      public String d() {
         return this.d;
      }

      @NotNull
      public String e() {
         return this.e;
      }

      @NotNull
      public List<ModSetting> f() {
         return this.f;
      }
   }
}
