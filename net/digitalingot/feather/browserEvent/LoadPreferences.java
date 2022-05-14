package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.config.FavoriteMods;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class LoadPreferences implements BrowserEvent {
   @SerializedName("colorPicker")
   @NotNull
   private final newProfileEvent a;
   @SerializedName("modMenu")
   @NotNull
   private final FavoriteMods b;
   @SerializedName("militaryTime")
   private boolean c;
   @SerializedName("version")
   @NotNull
   private final String d;

   public LoadPreferences(@NotNull newProfileEvent var1, @NotNull FavoriteMods var2, boolean var3, @NotNull String var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   @NotNull
   public newProfileEvent b() {
      return this.a;
   }

   @NotNull
   public FavoriteMods c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }

   @NotNull
   public String e() {
      return this.d;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.LOAD_CLIENT_PREFERENCES;
   }
}
