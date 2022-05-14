package net.digitalingot.feather.browserEvent;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModsConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UpdateModSettings implements BrowserEvent {
   @SerializedName("mod")
   @NotNull
   private final ModsConfig a;
   @SerializedName("enabled")
   @Nullable
   private final Boolean b;
   @SerializedName("favorite")
   @Nullable
   private final Boolean c;
   @SerializedName("settings")
   @Nullable
   private final Map<String, JsonElement> d;

   public UpdateModSettings(@NotNull ModsConfig var1, @Nullable Boolean var2, @Nullable Boolean var3, @Nullable Map<String, JsonElement> var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   @NotNull
   public ModsConfig b() {
      return this.a;
   }

   @Nullable
   public Boolean c() {
      return this.b;
   }

   @Nullable
   public Boolean d() {
      return this.c;
   }

   @Nullable
   public Map<String, JsonElement> e() {
      return this.d;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.UPDATE_MOD_SETTINGS;
   }
}
