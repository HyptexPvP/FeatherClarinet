package net.digitalingot.feather.util;

import java.io.Closeable;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.FeatherLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CoreAPI implements Closeable {
   @NotNull
   private final Account account;
   @NotNull
   private final Timer timer = new Timer();
   @Nullable
   private String c;
   private long time;
   @Nullable
   private String e;
   private long f;

   public CoreAPI(@NotNull Account var1) {
      this.account = var1;
      this.timer.scheduleAtFixedRate(new TimerTask() {
         public void run() {
            CoreAPI.this.e = CoreAPI.this.e();
         }
      }, TimeUnit.MINUTES.toMillis(14L), TimeUnit.MINUTES.toMillis(14L));
   }

   public void a() {
      this.c = this.d();
      this.e = this.e();
      this.timer.purge();
      this.timer.scheduleAtFixedRate(new TimerTask() {
         public void run() {
            CoreAPI.this.e = CoreAPI.this.e();
         }
      }, TimeUnit.MINUTES.toMillis(14L), TimeUnit.MINUTES.toMillis(14L));
      this.account.d();
   }

   @Nullable
   public String b() {
      if (System.currentTimeMillis() > this.time + TimeUnit.HOURS.toMillis(23L)) {
         this.c = this.d();
      }

      return this.c;
   }

   void authenticated(@NotNull String var1) {
      FeatherLogger.a.info("Authenticated with CoreAPI");
      this.time = System.currentTimeMillis();
      this.c = var1;
   }

   @Nullable
   private String d() {
      this.time = System.currentTimeMillis();

      try {
         return this.account.a();
      } catch (IOException var2) {
         FeatherLogger.a.error("Error during fetching JWT Token", var2);
         return null;
      }
   }

   @Nullable
   public String c() {
      if (System.currentTimeMillis() > this.f + TimeUnit.SECONDS.toMillis(870L)) {
         this.e = this.e();
      }

      return this.e;
   }

   @Nullable
   private String e() {
      this.f = System.currentTimeMillis();

      try {
         FeatherLogger.a.debug("Fetching new game token...");
         return this.account.b();
      } catch (IOException var2) {
         FeatherLogger.a.error("Error during fetching game token", var2);
         return null;
      }
   }

   public void close() {
      this.timer.cancel();
   }
}
