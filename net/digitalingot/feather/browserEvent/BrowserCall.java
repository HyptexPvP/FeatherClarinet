package net.digitalingot.feather.browserEvent;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
public class BrowserCall {
   @SerializedName("requestId")
   private final int a;
   @SerializedName("callType")
   @Nullable
   private final BrowserEvents b;
   @SerializedName("message")
   @Nullable
   private final JsonElement c;
   @SerializedName("success")
   @Nullable
   private final JsonElement d;
   @SerializedName("failure")
   @Nullable
   private final JsonElement e;

   public BrowserCall(int var1, @Nullable BrowserEvents var2, @Nullable JsonElement var3, @Nullable JsonElement var4, @Nullable JsonElement var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public BrowserEvents b() {
      return this.b;
   }

   @Nullable
   public JsonElement c() {
      return this.c;
   }

   @Nullable
   public JsonElement d() {
      return this.d;
   }

   @Nullable
   public JsonElement e() {
      return this.e;
   }
}
