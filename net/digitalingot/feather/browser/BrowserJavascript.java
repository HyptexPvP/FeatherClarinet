package net.digitalingot.feather.browser;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.feather.FeatherLogger;
import net.digitalingot.feather.e;
import net.digitalingot.feather.browserEvent.BrowserCall;
import net.digitalingot.feather.gui.BrowserUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jetbrains.annotations.NotNull;

public class BrowserJavascript {
   private static final List<String> a = new ArrayList();
   private static boolean b;

   static void a(@NotNull String var0) {
      FeatherLogger.a.debug("FE Channel <- " + var0);
      if (!b) {
         a.add(var0);
      } else {
         c(var0);
      }

   }

   private static void c(@NotNull String var0) {
      String var1 = StringEscapeUtils.escapeEcmaScript(var0);
      BrowserUtils.INSTANCE.getCefBrowser().executeJavaScript("window.toFe(\"" + var1 + "\");", "", 0);
   }

   public static void b(@NotNull String var0) {
      FeatherLogger.a.debug("FE Channel -> " + var0);
      BrowserCall var1 = (BrowserCall)Browser.a.fromJson(var0, BrowserCall.class);
      e.c().a().a(var1, Browser.b.FRONTEND);
   }

   public static void a() {
      FeatherLogger.a.debug("dumping queue to FE: " + a);

      for(String var1 : a) {
         c(var1);
      }

      b = true;
   }
}
