package net.digitalingot.feather.voice;

import io.netty.util.AttributeKey;
import net.digitalingot.feather.gM;
import net.digitalingot.feather.util.SystemUtil;

public class VoiceURL {
   public static final AttributeKey<VoiceAuthenticator> a = AttributeKey.valueOf("control-connection");
   public static final AttributeKey<gM> b = AttributeKey.valueOf("voice-connection");
   public static final String c = SystemUtil.a("FEATHER_VOICE_IPS", "https://game-client.feathermc.com/voice-list");
   public static final int d = 5432;
   public static final String e = SystemUtil.a("FEATHER_CONTROL_SERVER", "voice.lb.feathermc.com");
   public static final int f = 5433;
   public static final int g = 3;
   public static final int h = 1;
   public static final int i = 24000;
   public static final int j = 20;
   public static final int k = 480;
   public static final int l = 960;
   public static final double m = 32.0;
   public static final double n = 16.0;
}
