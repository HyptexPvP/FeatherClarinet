package net.digitalingot.feather.mixin;

import java.io.File;
import java.util.List;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;

public class FeatherTweaker implements ITweaker {
   public final void acceptOptions(List<String> var1, File var2, File var3, String var4) {
   }

   public final void injectIntoClassLoader(LaunchClassLoader var1) {
      var1.registerTransformer("net.digitalingot.feather.bl");
   }

   public String getLaunchTarget() {
      return "net.minecraft.client.main.Main";
   }

   public String[] getLaunchArguments() {
      return new String[0];
   }
}
