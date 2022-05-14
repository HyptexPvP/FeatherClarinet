package net.digitalingot.feather.mods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.feather.e;
import net.digitalingot.feather.fW;
import net.digitalingot.feather.event.ReceiveMessageEvent;
import net.digitalingot.feather.util.CurrentServer;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class AutoAccept extends fW<HypixelMod.a> {
   private static final Pattern c = Pattern.compile(
      "§m----------------------------------------------------Friend request from (?:\\[.+] )?(?<name>[a-zA-Z0-9_]{1,16})\\[ACCEPT] - \\[DENY] - \\[IGNORE].*"
   );
   private static final Pattern d = Pattern.compile("You are now friends with \\[?[a-zA-Z0-9_]{1,16}(:?] )?");
   private static final Pattern e = Pattern.compile("\\[?[a-zA-Z0-9_]{1,16}(:?] )? removed you from their friends list!");

   AutoAccept(@NotNull Mod<HypixelMod.a> var1) {
      super(var1);
   }

   @Override
   public boolean b() {
      return this.a.k().b;
   }

   @Override
   public void a() {
      ReceiveMessageEvent.a
         .a(
            var1 -> {
               if (!this.g()) {
                  return var1;
               } else if (net.digitalingot.feather.e.c().g() != CurrentServer.HYPIXEL) {
                  return var1;
               } else {
                  String var2 = var1.func_150260_c().replace("\n", "");
                  Matcher var3 = c.matcher(var2);
                  if (var3.matches()) {
                     String var4 = var3.group("name");
                     Minecraft.func_71410_x().field_71439_g.func_71165_d("/friend accept " + var4);
                     if (!this.a.k().c) {
                        return null;
                     }
                  }
      
                  return this.a.k().c
                        || !var2.equals("-----------------------------------------------------") && !d.matcher(var2).matches() && !e.matcher(var2).matches()
                     ? var1
                     : null;
               }
            }
         );
   }
}
