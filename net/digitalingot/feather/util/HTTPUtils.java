package net.digitalingot.feather.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import net.digitalingot.feather.hN;
import net.digitalingot.feather.hO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HTTPUtils implements hN {
   @NotNull
   private final URL a;
   @Nullable
   private HttpURLConnection b;
   @Nullable
   private InputStream c;

   public HTTPUtils(@NotNull URL var1) {
      this.a = var1;
   }

   @NotNull
   @Override
   public InputStream a() {
      if (this.c != null) {
         return this.c;
      } else {
         try {
            this.b = (HttpURLConnection)this.a.openConnection();
            this.b.setRequestMethod("GET");
            this.b.setUseCaches(true);
            this.b.setRequestProperty("User-Agent", "Feather Client");
            this.b.setReadTimeout(15000);
            this.b.setConnectTimeout(15000);
            this.b.setDoOutput(true);
            this.c = this.b.getInputStream();
            return this.c;
         } catch (IOException var2) {
            throw new hO(var2);
         }
      }
   }

   public void close() {
      if (this.b != null) {
         this.b.disconnect();
      }

      CloseableUtil.a(this.c);
      this.c = null;
   }
}
