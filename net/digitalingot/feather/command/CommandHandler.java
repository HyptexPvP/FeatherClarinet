package net.digitalingot.feather.command;

import net.digitalingot.feather.ac;
import net.digitalingot.feather.ad;

public interface CommandHandler {
   ac<CommandHandler> a = ad.a(CommandHandler.class, var0 -> var1 -> {
         for(CommandHandler var5 : var0) {
            var5.registerCommands(var1);
         }

      });

   void registerCommands(Void var1);
}
