package net.digitalingot.feather.mods;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import net.digitalingot.feather.fW;
import net.digitalingot.feather.event.Events;
import net.digitalingot.feather.event.ReceiveMessageEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class AutoGG extends fW<HypixelMod.a> {
   private static final List<String> c = Arrays.asList(
      "1st Killer - ",
      "1st Place - ",
      "Winner: ",
      " - Damage Dealt - ",
      "Winning Team - ",
      "1st - ",
      "Winners: ",
      "Winner: ",
      "Winning Team: ",
      " won the game!",
      "Top Seeker: ",
      "1st Place: ",
      "Last team standing!",
      "Winner #1 (",
      "Top Survivors",
      "Winners - "
   );
   private static final Pattern d = Pattern.compile("(?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
   private static final Pattern e = Pattern.compile("Guild > (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
   private static final Pattern f = Pattern.compile("Party > (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
   private static final Pattern g = Pattern.compile("\\.get(SHOUT) (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
   private static final Pattern h = Pattern.compile("\\.get(SPECTATOR) (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
   private static final Pattern i = Pattern.compile("\\.get(TEAM) (?<rank>\\.get(.+) )?(?<player>\\S{1,16}): (?<message>.*)");
   private int j = -1;

   AutoGG(@NotNull Mod<HypixelMod.a> var1) {
      super(var1);
   }

   @Override
   public boolean b() {
      return this.a.k().k;
   }

   @Override
   public void a() {
      ReceiveMessageEvent.a.a(var1 -> {
         if (!this.g()) {
            return var1;
         } else {
            String var2 = var1.func_150260_c();
            if (var2.isEmpty()) {
               return var1;
            } else {
               if (!this.b(var2) && this.a(var2)) {
                  this.j = this.a.k().l;
               }

               return var1;
            }
         }
      });
      Events.a.a(var1 -> {
         if (this.g()) {
            if (var1 == Events.c.START) {
               EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
               if (var2 != null) {
                  if (this.j == 0) {
                     var2.func_71165_d("/ac gg");
                     this.j = -1;
                  } else if (this.j > 0) {
                     --this.j;
                  }

               }
            }
         }
      });
   }

   private boolean a(String var1) {
      return c.stream().anyMatch(var1::contains);
   }

   private boolean b(String var1) {
      return i.matcher(var1).matches()
         || e.matcher(var1).matches()
         || f.matcher(var1).matches()
         || d.matcher(var1).matches()
         || g.matcher(var1).matches()
         || h.matcher(var1).matches();
   }
}
