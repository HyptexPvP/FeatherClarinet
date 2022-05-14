package net.digitalingot.feather.gui;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.browserEvent.BrowserEvent;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HUDEditButton implements BrowserEvent {
   @SerializedName("mod")
   @Nullable
   public String a;
   @SerializedName("hudEditButton")
   private boolean b;

   public HUDEditButton(@Nullable String var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   @Nullable
   public String b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.OPEN_FEATHER_MODS;
   }
}
