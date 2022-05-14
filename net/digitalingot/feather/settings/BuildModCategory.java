package net.digitalingot.feather.settings;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.mods.ModsConponment;
import org.jetbrains.annotations.NotNull;

public class BuildModCategory implements BrowserEvent {
   @SerializedName("categories")
   @NotNull
   private final ModsConponment.Category[] a = ModsConponment.Category.values();
   @SerializedName("mods")
   @NotNull
   private final List<ModsConponment> b;

   public BuildModCategory(@NotNull List<ModsConponment> var1) {
      this.b = var1;
   }

   @NotNull
   public ModsConponment.Category[] b() {
      return this.a;
   }

   @NotNull
   public List<ModsConponment> c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.BUILD_MOD_SETTINGS;
   }
}
