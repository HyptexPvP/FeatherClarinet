package net.digitalingot.feather.mods;

import java.io.File;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class ScreenshotUploader {
   static IChatComponent a(@NotNull File var0, @NotNull Screenshot.a var1) {
      ChatComponentText var2 = new ChatComponentText("");
      ChatComponentText var3 = new ChatComponentText("Screenshot saved");
      ChatStyle var4 = var3.func_150256_b().func_150228_d(true);
      var3.func_150255_a(var4);
      var2.func_150257_a(var3);
      if (var1.d) {
         ChatComponentText var5 = new ChatComponentText("[Open]");
         ChatStyle var6 = var5.func_150256_b()
            .func_150227_a(true)
            .func_150238_a(EnumChatFormatting.GOLD)
            .func_150241_a(new ClickEvent(Action.OPEN_FILE, var0.getAbsolutePath()))
            .func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Open")));
         var5.func_150255_a(var6);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var5);
      }

      if (var1.e) {
         ChatComponentText var7 = new ChatComponentText("[Copy]");
         ChatStyle var10 = var7.func_150256_b()
            .func_150227_a(true)
            .func_150238_a(EnumChatFormatting.BLUE)
            .func_150241_a(new ClickEvent(Action.RUN_COMMAND, "/featherscreenshot copy " + var0.getAbsolutePath()))
            .func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Copy")));
         var7.func_150255_a(var10);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var7);
      }

      if (var1.i) {
         ChatComponentText var8 = new ChatComponentText("[Upload]");
         ChatStyle var11 = var8.func_150256_b()
            .func_150227_a(true)
            .func_150238_a(EnumChatFormatting.GREEN)
            .func_150241_a(new ClickEvent(Action.RUN_COMMAND, "/featherscreenshot upload " + var0.getAbsolutePath()))
            .func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Upload & Open")));
         var8.func_150255_a(var11);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var8);
      }

      if (var1.j) {
         ChatComponentText var9 = new ChatComponentText("[Tweet]");
         ChatStyle var12 = var9.func_150256_b()
            .func_150227_a(true)
            .func_150238_a(EnumChatFormatting.AQUA)
            .func_150241_a(new ClickEvent(Action.RUN_COMMAND, "/featherscreenshot tweet " + var0.getAbsolutePath()))
            .func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Upload & Tweet")));
         var9.func_150255_a(var12);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var9);
      }

      return var2;
   }
}
