package net.digitalingot.feather.mods;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dr;
import net.digitalingot.feather.e;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.components.Dropdown;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.event.ReceiveMessageEvent;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.CurrentServer;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.OOF_MOD,
   b = @dn(
   a = "Oof Mod",
   b = "https://assets.feathercdn.net/game/mods/oofmod.svg",
   c = "Plays a kill sound",
   d = {ModsConponment.Category.HYPIXEL}
)
)
public class OofMod extends Mod<OofMod.a> {
   private static final File a = new File(Minecraft.func_71410_x().field_71412_D, "feather/misc/oofmod");
   private static List<String> c;
   private Clip d;
   private String e;
   private Pattern f;
   private Pattern g;

   @Override
   public void f() {
      this.d();
      ReceiveMessageEvent.a.a(var1 -> {
         if (!this.m()) {
            return var1;
         } else if (net.digitalingot.feather.e.c().g() != CurrentServer.HYPIXEL) {
            return var1;
         } else {
            if (!Minecraft.func_71410_x().func_110432_I().func_111285_a().equals(this.e)) {
               this.d();
            }

            String var2 = var1.func_150260_c();
            Matcher var3 = this.f.matcher(var2);
            String[] var4 = var2.split(" ");
            Matcher var5 = this.g.matcher(var4.length > 0 ? var4[0] : var2.trim());
            if (var5.matches() && var3.find()) {
               String var6 = var3.group(1);
               if (!var6.equals(this.e)) {
                  this.o();
               }
            }

            return var1;
         }
      });
      this.e();
   }

   @Override
   public void i() {
      this.e();
      if (this.d != null) {
         this.d.close();
      }

      try {
         AudioInputStream var1 = AudioSystem.getAudioInputStream(new File(a, this.b.a));
         this.d = AudioSystem.getClip();
         this.d.open(var1);
         FloatControl var2 = (FloatControl)this.d.getControl(Type.MASTER_GAIN);
         var2.setValue((float)this.b.b - 30.0F);
      } catch (Exception var3) {
         this.d = null;
         var3.printStackTrace();
      }

   }

   @NotNull
   private static List<String> c() {
      String[] var0 = a.list();
      if (var0 == null) {
         return new ArrayList(Collections.singletonList("oof.wav"));
      } else {
         List var1 = (List)Arrays.stream(var0).filter(var0x -> var0x.endsWith(".wav")).collect(Collectors.toList());
         if (!var1.contains("oof.wav")) {
            var1.add("oof.wav");
         }

         return var1;
      }
   }

   public boolean a() {
      return !new HashSet(c()).equals(new HashSet(c));
   }

   private void d() {
      this.e = Minecraft.func_71410_x().func_110432_I().func_111285_a();
      String var1 = "(\\w{1,16}).+ (by|of|to|for|with) (" + this.e + ")";
      String var2 = "^[a-zA-Z0-9_-]{3,16}$";
      this.f = Pattern.compile(var1);
      this.g = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
   }

   private void e() {
      File var1 = new File(a, "oof.wav");
      if (!var1.exists()) {
         a.mkdirs();
         hP.c("assets/feather/sounds/oof.wav").a(hP.a(var1).b_());
      }

   }

   private void o() {
      if (this.d != null) {
         this.d.setFramePosition(0);
         this.d.start();
      }

   }

   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "selectedSound",
         b = "Selected Sound",
         c = "oof.wav",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      @dr(
         a = "sounds"
      )
      @Dropdown
      public String a;
      @ModConfigAnnotation(
         a = "volume",
         b = "Volume",
         c = "10",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      @IntegerRange(
         a = 30
      )
      public int b;

      @dr(
         a = "sounds"
      )
      public static List<String> a() {
         List var0 = OofMod.c();
         OofMod.c = var0;
         return var0;
      }
   }
}
