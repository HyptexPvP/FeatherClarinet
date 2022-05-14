package net.digitalingot.feather.http;

import io.netty.handler.codec.http.HttpMethod;
import java.net.URL;
import net.digitalingot.feather.util.SystemUtil;
import org.jetbrains.annotations.NotNull;

public enum HTTPURL {
   AUTH_TOKEN(HttpMethod.GET, "/game/auth-token"),
   SERVER_ID(HttpMethod.GET, "/minecraft/server-id"),
   HAS_JOINED(HttpMethod.GET, "/minecraft/has-joined/{}?token={}"),
   UPDATE_TOKEN(HttpMethod.GET, "/service/update-token"),
   ACCOUNT_SEARCH(HttpMethod.POST, "/minecraft/account-search");

   private static final String BASE = SystemUtil.a("FEATHER_API_URL", "https://api.feathermc.com/v1");
   @NotNull
   private final HttpMethod method;
   @NotNull
   private final String endpoint;

   private HTTPURL(@NotNull HttpMethod var3, @NotNull String var4) {
      this.method = var3;
      this.endpoint = var4;
   }

   public URL get(String... var1) {
      String var2 = this.endpoint;

      for(String var6 : var1) {
         var2 = var2.replaceFirst("\\{}", var6);
      }

      if (var2.contains("{}")) {
         throw new IllegalArgumentException("not all variables required were delivered");
      } else {
         return new URL(BASE + var2);
      }
   }

   @NotNull
   public HttpMethod getMethod() {
      return this.method;
   }
}
