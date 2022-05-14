package net.digitalingot.feather.mods;

import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.FloatControl;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dr;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.dw;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.fq;
import net.digitalingot.feather.gG;
import net.digitalingot.feather.gT;
import net.digitalingot.feather.gw;
import net.digitalingot.feather.hf;
import net.digitalingot.feather.is;
import net.digitalingot.feather.components.DoubleRange;
import net.digitalingot.feather.components.Dropdown;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.CoreAPI;
import net.digitalingot.feather.voice.AudioPlayer;
import net.digitalingot.feather.voice.FeatherPlayback;
import net.digitalingot.feather.voice.Voice;
import org.jetbrains.annotations.Nullable;

@FeatherModule(
   a = ModsConfig.VOICE,
   b = @dn(
   a = "Voice",
   b = "https://assets.feathercdn.net/game/mods/voice.svg",
   c = "",
   d = {}
)
)
public class VoiceMod extends Mod<VoiceMod.a> {
   @Nullable
   private Voice a;

   @Override
   public void g() {
      CoreMod var1 = e.c().b().b(CoreMod.class);
      if (var1.b() != null) {
         CoreAPI var2 = var1.b().getCoreAPI();
         String var3 = var2.c();
         if (var3 != null) {
            fq var4 = var1.a();
            if (var4 != null) {
               hf var5 = var4.c().a();
               gw var6 = new gw(this);
               AudioPlayer var7 = new AudioPlayer(this.b.j, this.b.m);
               this.a = Voice.initVoice(var2, var5, var6, var7);
            }
         }
      }
   }

   @Override
   public void h() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }

   }

   @Override
   public void i() {
      if (this.a != null) {
         FeatherPlayback var1 = this.a.m();
         if (var1 != null) {
            FloatControl var2 = var1.getFloatControl();
            if (var2 != null) {
               var2.setValue((float)(this.b.o * 40.0 / 100.0 - 35.0));
            }
         }

         gG var3 = this.a.l();
         if (var3 != null) {
            var3.a();
         }

      }
   }

   @Nullable
   public Voice a() {
      return this.a;
   }

   @dt(
      a = true
   )
   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("General");
      @ModConfigAnnotation(
         a = "receiveMode",
         b = "Receive Mode",
         c = "everyone",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public VoiceMod.a.a b;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh c = new eh("Key Settings");
      @ModConfigAnnotation(
         a = "keyProximityPTT",
         b = "Proximity - Push to Talk",
         c = "86",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public is d;
      @ModConfigAnnotation(
         a = "keyPartyPTT",
         b = "Party - Push to Talk",
         c = "80",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public is e;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh i = new eh("Capture");
      @ModConfigAnnotation(
         a = "microphone",
         b = "Device",
         c = "Default",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      @Dropdown
      @dr(
         a = "microphones"
      )
      public String j;
      @ModConfigAnnotation(
         a = "microphoneAmplification",
         b = "Amplification",
         c = "1.0",
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      @DoubleRange
      public double k;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh l = new eh("Playback");
      @ModConfigAnnotation(
         a = "speaker",
         b = "Device",
         c = "Default",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      @Dropdown
      @dr(
         a = "speakers"
      )
      public String m;
      @ModConfigAnnotation(
         a = "speakerAmplification",
         b = "Amplification",
         c = "1.0",
         e = @ModConfigValueAnnotation(
   a = 32
)
      )
      @DoubleRange
      public double n;
      @ModConfigAnnotation(
         a = "maxVolume",
         b = "Max Volume",
         c = "80",
         e = @ModConfigValueAnnotation(
   a = 33
)
      )
      @DoubleRange(
         b = 10.0,
         a = 100.0
      )
      public double o;

      @dr(
         a = "microphones"
      )
      public static List<String> a() {
         ArrayList var0 = new ArrayList();
         var0.add("Default");
         var0.addAll(AudioPlayer.getTargetLine());
         return var0;
      }

      @dr(
         a = "speakers"
      )
      public static List<String> b() {
         ArrayList var0 = new ArrayList();
         var0.add("Default");
         var0.addAll(AudioPlayer.getSourceLines());
         return var0;
      }

      public static enum a {
         @dw(
            a = "everyone",
            b = "Everyone"
         )
         EVERYONE,
         @dw(
            a = "partyOnly",
            b = "Party Only"
         )
         PARTY_ONLY;

         public gT.a toCapnProto() {
            switch(this) {
               case EVERYONE:
                  return gT.a.EVERYONE;
               case PARTY_ONLY:
                  return gT.a.PARTY_ONLY;
               default:
                  throw new IllegalArgumentException();
            }
         }
      }
   }
}
