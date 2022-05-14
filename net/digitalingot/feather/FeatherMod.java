package net.digitalingot.feather;

import net.digitalingot.feather.command.CommandHandler;
import net.digitalingot.feather.mods.FeatherRegistry;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(
   modid = "feather",
   name = "Feather Client",
   version = "1.0.0-SNAPSHOT",
   clientSideOnly = true
)
public class FeatherMod {
   @EventHandler
   public void a(FMLInitializationEvent var1) {
      if (var1.getSide() == Side.CLIENT) {
         Feather var2 = new Feather(Minecraft.func_71410_x());
         var2.start(FeatherRegistry.a);
      }
   }

   @EventHandler
   public void a(FMLPostInitializationEvent var1) {
      if (var1.getSide() == Side.CLIENT) {
         CommandHandler.a.a().registerCommands(null);
      }
   }
}
