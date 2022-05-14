package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;

public class db implements BrowserEvent {
   @SerializedName("sidebar")
   @NotNull
   private final ModsConfig a;
   @SerializedName("settings")
   @NotNull
   private final Map<String, JsonElement> b;

   public db(@NotNull ModsConfig var1, @NotNull Map<String, JsonElement> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public ModsConfig b() {
      return this.a;
   }

   @NotNull
   public Map<String, JsonElement> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.UPDATE_SIDEBAR_SETTINGS;
   }
}
