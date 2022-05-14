package net.digitalingot.feather.util;

import com.google.gson.annotations.SerializedName;
import java.util.Collection;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public class AccountSwitcher {
   @SerializedName("id")
   @Nullable
   private final Collection<UUID> a;
   @SerializedName("mcID")
   @Nullable
   private final Collection<UUID> b;
   @SerializedName("mcUsername")
   @Nullable
   private final Collection<String> c;
   private final int d;

   public AccountSwitcher(@Nullable Collection<UUID> var1, @Nullable Collection<UUID> var2, @Nullable Collection<String> var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = (var1 != null ? var1.size() : 0) + (var2 != null ? var2.size() : 0) + (var3 != null ? var3.size() : 0);
   }

   @Nullable
   public Collection<UUID> a() {
      return this.a;
   }

   @Nullable
   public Collection<UUID> b() {
      return this.b;
   }

   @Nullable
   public Collection<String> c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
