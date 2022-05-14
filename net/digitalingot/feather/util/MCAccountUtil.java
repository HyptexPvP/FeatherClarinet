package net.digitalingot.feather.util;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class MCAccountUtil {
   private final int a;
   @NotNull
   private final List<MCAccountUtil.a> b;

   public MCAccountUtil(int var1, @NotNull List<MCAccountUtil.a> var2) {
      this.a = var1;
      this.b = var2;
   }

   public int a() {
      return this.a;
   }

   @NotNull
   public List<MCAccountUtil.a> b() {
      return this.b;
   }

   public static class a {
      @SerializedName("id")
      @NotNull
      private final UUID a;
      @SerializedName("mcID")
      @NotNull
      private final UUID b;
      @SerializedName("mcUsername")
      @NotNull
      private final String c;

      public a(@NotNull UUID var1, @NotNull UUID var2, @NotNull String var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      @NotNull
      public UUID a() {
         return this.a;
      }

      @NotNull
      public UUID b() {
         return this.b;
      }

      @NotNull
      public String c() {
         return this.c;
      }
   }
}
