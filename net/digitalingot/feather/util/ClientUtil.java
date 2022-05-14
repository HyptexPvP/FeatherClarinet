package net.digitalingot.feather.util;

import java.io.File;
import net.digitalingot.feather.f;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.config.ClientPreferences;
import net.digitalingot.feather.config.ConfigManager;
import org.jetbrains.annotations.NotNull;

public class ClientUtil implements f {
   @NotNull
   private final Browser browser;
   @NotNull
   private final ConfigManager config;
   @NotNull
   private final ClientPreferences preferences;
   @NotNull
   private final File featherDir;
   @NotNull
   private final File miscDir;
   @NotNull
   private final String version;
   @NotNull
   private CurrentServer currentServer;

   public ClientUtil(
      @NotNull Browser var1, @NotNull ConfigManager var2, @NotNull ClientPreferences var3, @NotNull File var4, @NotNull File var5, @NotNull String var6
   ) {
      this.browser = var1;
      this.config = var2;
      this.preferences = var3;
      this.featherDir = var4;
      this.miscDir = var5;
      this.version = var6;
      this.currentServer = CurrentServer.NONE;
   }

   @NotNull
   public Browser getBrowser() {
      return this.browser;
   }

   @NotNull
   public ConfigManager getConfig() {
      return this.config;
   }

   @NotNull
   @Override
   public ClientPreferences c() {
      return this.preferences;
   }

   @NotNull
   public File getFeatherDir() {
      return this.featherDir;
   }

   @NotNull
   public File getMiscDir() {
      return this.miscDir;
   }

   @NotNull
   public String getVersion() {
      return this.version;
   }

   public void setServer(@NotNull CurrentServer var1) {
      this.currentServer = var1;
   }

   @NotNull
   @Override
   public CurrentServer g() {
      return this.currentServer;
   }
}
