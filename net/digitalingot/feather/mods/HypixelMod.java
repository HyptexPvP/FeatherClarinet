package net.digitalingot.feather.mods;

import java.util.Arrays;
import java.util.List;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.fQ;
import net.digitalingot.feather.fW;
import net.digitalingot.feather.components.IntegerRange;
import net.digitalingot.feather.components.TextLength;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.ChromaColor;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.HYPIXEL,
   b = @dn(
   a = "Hypixel",
   b = "https://assets.feathercdn.net/game/mods/hypixel.svg",
   c = "Useful mods for Hypixel",
   d = {ModsConponment.Category.HYPIXEL}
)
)
public class HypixelMod extends Mod<HypixelMod.a> {
   private final LevelHead a = new LevelHead(this);
   @NotNull
   private final List<fW<?>> c = Arrays.asList(new AutoAccept(this), new AutoTip(this), new AutoGG(this), new fQ(this), new JoinedTheLobby(this), this.a);

   @Override
   public void f() {
      for(fW var2 : this.c) {
         var2.a();
      }

   }

   @Override
   public void i() {
      for(fW var2 : this.c) {
         if (var2.b() && !var2.h()) {
            var2.d();
         }

         if (!var2.b() && var2.h()) {
            var2.e();
         }

         var2.c();
      }

   }

   @Override
   public void g() {
      for(fW var2 : this.c) {
         if (var2.b()) {
            var2.d();
         }
      }

   }

   @Override
   public void h() {
      for(fW var2 : this.c) {
         if (var2.h()) {
            var2.e();
         }
      }

   }

   @NotNull
   public LevelHead a() {
      return this.a;
   }

   public static class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Auto Friend");
      @ModConfigAnnotation(
         a = "autoFriendEnabled",
         b = "Enabled",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public boolean b;
      @ModConfigAnnotation(
         a = "friendMessages",
         b = "Show Friend Messages",
         d = @dB(
   a = "autoFriendEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public boolean c;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh d = new eh("Auto Tip");
      @ModConfigAnnotation(
         a = "autoTipEnabled",
         b = "Enabled",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean e;
      @ModConfigAnnotation(
         a = "autoTipInterval",
         b = "Interval",
         c = "900",
         d = @dB(
   a = "autoTipEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      @IntegerRange(
         b = 0,
         a = 3600
      )
      public int i;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh j = new eh("Auto GG");
      @ModConfigAnnotation(
         a = "autoGGEnabled",
         b = "Enabled",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean k;
      @ModConfigAnnotation(
         a = "autoGGDelay",
         b = "Delay",
         c = "20",
         d = @dB(
   a = "autoGGEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      @IntegerRange(
         b = 1
      )
      public int l;
      @ModConfigValueAnnotation(
         a = 30
      )
      public eh m = new eh("Anti GG");
      @ModConfigAnnotation(
         a = "antiGGEnabled",
         b = "Enabled",
         e = @ModConfigValueAnnotation(
   a = 31
)
      )
      public boolean n;
      @ModConfigValueAnnotation(
         a = 40
      )
      public eh o = new eh("Anti Lobby Join");
      @ModConfigAnnotation(
         a = "antiLobbyJoinEnabled",
         b = "Enabled",
         e = @ModConfigValueAnnotation(
   a = 41
)
      )
      public boolean p;
      @ModConfigValueAnnotation(
         a = 50
      )
      public eh q = new eh("Level Head");
      @ModConfigAnnotation(
         a = "levelHeadEnabled",
         b = "Enabled",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 51
)
      )
      public boolean r;
      @ModConfigAnnotation(
         a = "levelHeadShowSelf",
         b = "Show Self",
         d = @dB(
   a = "levelHeadEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 52
)
      )
      public boolean s = false;
      @ModConfigAnnotation(
         a = "levelHeadLevelColor",
         b = "Nametag Color",
         c = "false/255/255/0",
         d = @dB(
   a = "levelHeadEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 53
)
      )
      public ChromaColor t;
      @ModConfigValueAnnotation(
         a = 60
      )
      public eh u = new eh("LevelHead Prefix");
      @ModConfigAnnotation(
         a = "levelHeadPrefixEnabled",
         b = "Prefix",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 61
)
      )
      public boolean v;
      @ModConfigAnnotation(
         a = "levelHeadPrefixText",
         b = "Text",
         c = "Level:",
         d = @dB(
   a = "levelHeadPrefixEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 62
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String w;
      @ModConfigAnnotation(
         a = "levelHeadPrefixColor",
         b = "Color",
         c = "false/0/255/255",
         d = @dB(
   a = "levelHeadPrefixEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 63
)
      )
      public ChromaColor x;
      @ModConfigValueAnnotation(
         a = 64
      )
      public eh y = new eh("LevelHead Suffix");
      @ModConfigAnnotation(
         a = "levelHeadSuffixEnabled",
         b = "Suffix",
         e = @ModConfigValueAnnotation(
   a = 65
)
      )
      public boolean z;
      @ModConfigAnnotation(
         a = "levelHeadSuffixText",
         b = "Text",
         c = "Level",
         d = @dB(
   a = "levelHeadSuffixEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 66
)
      )
      @TextLength(
         a = 0,
         b = 32
      )
      public String A;
      @ModConfigAnnotation(
         a = "levelHeadSuffixColor",
         b = "Color",
         c = "false/0/255/255",
         d = @dB(
   a = "levelHeadSuffixEnabled"
),
         e = @ModConfigValueAnnotation(
   a = 67
)
      )
      public ChromaColor B;
   }
}
