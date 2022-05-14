package net.digitalingot.feather.mods;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.LocationUtil;

@FeatherModule(
   a = ModsConfig.TIME_CHANGER,
   b = @dn(
   a = "Time Changer",
   b = "https://assets.feathercdn.net/game/mods/timechanger.svg",
   c = "Change the time locally",
   d = {}
)
)
public class TimeChanger extends Mod<TimeChanger.a> {
   private static final int a = 21000;
   private boolean c;
   private long d = 21600L;
   private long e = 64800L;
   private int f;

   @Override
   public void f() {
      if (this.b.b) {
         ForkJoinPool.commonPool().execute(this::a);
      }

   }

   @Override
   public void i() {
      this.f = 21000 - (int)((float)this.b.a / 100.0F * 21000.0F);
      if (this.b.b && !this.c) {
         ForkJoinPool.commonPool().execute(this::a);
      }

   }

   public void a() {
      if (!this.c) {
         this.c = true;

         try {
            LocationUtil var1 = LocationUtil.a();
            String var2 = hP.a("http://api.sunrise-sunset.org/json?lat=" + var1.b() + "&lng=" + var1.c() + "&formatted=0").c();
            JsonParser var3 = new JsonParser();
            JsonElement var4 = var3.parse(var2);
            JsonObject var5 = var4.getAsJsonObject().get("results").getAsJsonObject();
            Calendar var6 = Calendar.getInstance();
            var6.set(11, 0);
            var6.set(12, 0);
            var6.set(13, 0);
            SimpleDateFormat var7 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssX");
            Date var8 = var7.parse(var5.get("sunrise").getAsString());
            Date var9 = var7.parse(var5.get("sunset").getAsString());
            this.d = (long)LocalTime.ofInstant(var8.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
            this.e = (long)LocalTime.ofInstant(var9.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
         } catch (Exception var10) {
            FeatherLogger.a.info("Failed to fetch sunrise & sunset time for TimeChanger", var10);
         }

      }
   }

   public long b() {
      return this.b.b ? this.c() : (long)this.f;
   }

   public long c() {
      long var1 = (long)LocalTime.now().toSecondOfDay();
      long var3;
      if (var1 < this.d) {
         var3 = (long)(18000.0 + (double)var1 * (6000.0 / (double)this.d));
      } else if (var1 < this.e) {
         long var5 = Math.abs(this.e - this.d);
         long var7 = var1 - this.d;
         var3 = (long)(0.0 + (double)var7 * (12000.0 / (double)var5));
      } else {
         long var9 = TimeUnit.DAYS.toSeconds(1L) - this.e;
         long var10 = var1 - this.e;
         var3 = (long)(12000.0 + (double)var10 * (6000.0 / (double)var9));
      }

      return var3;
   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "percentage",
         b = "",
         c = "100",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         b = 0,
         a = 100
      )
      public int a;
      @ModConfigAnnotation(
         a = "useRealWorldTime",
         b = "Use Real World Time",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 3
)
      )
      public boolean b;
   }
}
