package net.digitalingot.feather.mods;

import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.feather.dB;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.ef;
import net.digitalingot.feather.eh;
import net.digitalingot.feather.ib;
import net.digitalingot.feather.il;
import net.digitalingot.feather.is;
import net.digitalingot.feather.components.Dropdown;
import net.digitalingot.feather.event.ChatEvent;
import net.digitalingot.feather.event.ReceiveMessageEvent;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.mixin.core.IMixinChatComponent;
import net.digitalingot.feather.mixin.core.IMixinTextComponent;
import net.digitalingot.feather.mixin.core.IMixinTranslatableComponent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;

@FeatherModule(
   a = ModsConfig.CHAT_OPTIONS,
   b = @dn(
   a = "Chat Options",
   b = "https://assets.feathercdn.net/game/sidebar/chat.svg",
   c = "",
   d = {},
   e = @dn.a(
   a = "Chat",
   b = @ModConfigValueAnnotation(
   a = 1
)
)
)
)
public final class ChatOption extends Mod<ChatOption.a> {
   private Minecraft a;
   private final Map<String, Integer> c = new LinkedHashMap(5);
   private Pattern d;
   private String e;
   private String f;
   private boolean g;

   @Override
   public void f() {
      this.a = Minecraft.func_71410_x();
      this.a();
      ReceiveMessageEvent.a.a(this::a);
      ChatEvent.a.a((ChatEvent)var1 -> {
         this.f = var1.toLowerCase(Locale.ROOT);
         return var1;
      });
      FeatherGUI.b.a((var1, var2, var3, var4) -> {
         if (this.a.field_71462_r == null) {
            this.b();
         }

      });
   }

   @Override
   public void i() {
      this.a();
   }

   private void a() {
      String var1 = this.a.func_110432_I().func_111285_a();
      this.d = Pattern.compile(var1, 2);
      this.e = this.a(var1);
   }

   private String a(String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(EnumChatFormatting.RESET);
      var2.append(this.b.o.toString);
      if (this.b.p) {
         var2.append(EnumChatFormatting.BOLD);
      }

      var2.append(var1);
      var2.append(EnumChatFormatting.RESET);
      return var2.toString();
   }

   private void b() {
      if (this.b.b != null && this.b.b.b()) {
         this.b.c = !this.b.c;
      }

   }

   private IChatComponent a(IChatComponent var1) {
      if (this.b.n) {
         this.g = false;
         this.b(var1);
         if (this.g) {
            this.f = null;
         }
      }

      if (this.b.k) {
         String var2 = var1.func_150260_c();
         if (var2.trim().isEmpty()) {
            return var1;
         }

         if (this.c.size() >= (this.b.l ? 1 : 5)) {
            Iterator var3 = this.c.entrySet().iterator();
            var3.next();
            var3.remove();
         }

         int var8 = this.c.size();
         int var4 = -1;

         for(Entry var6 : this.c.entrySet()) {
            --var8;
            String var7 = (String)var6.getKey();
            if (var7.equals(var2)) {
               var4 = var6.getValue();
               break;
            }
         }

         if (var4 != -1 && this.c()) {
            this.a(var8);
            this.a(var1, var4 + 1);
            this.c.remove(var2);
            this.c.put(var2, var4 + 1);
         } else {
            this.c.put(var2, 0);
         }
      }

      return var1;
   }

   private boolean b(IChatComponent var1) {
      boolean var2 = false;
      ChatStyle var3 = var1.func_150256_b();
      if (var1 instanceof ChatComponentText) {
         String var4 = this.a(((ChatComponentText)var1).func_150265_g(), var3);
         if (var4 != null) {
            ((IMixinTextComponent)var1).setText(var4);
            return true;
         }
      } else if (var1 instanceof ChatComponentTranslation) {
         Object[] var8 = ((ChatComponentTranslation)var1).func_150271_j();

         for(int var5 = 0; var5 < var8.length; ++var5) {
            Object var6 = var8[var5];
            if (var6 != var1) {
               if (var6 instanceof IChatComponent) {
                  var2 |= this.b((IChatComponent)var6);
               } else if (var6 instanceof String) {
                  String var7 = this.a((String)var6, var3);
                  if (var7 != null) {
                     var8[var5] = var7;
                     var2 = true;
                  }
               }
            }
         }

         if (var2) {
            ((IMixinTranslatableComponent)var1).setLastUpdate(-1L);
         }
      }

      for(IChatComponent var10 : var1.func_150253_a()) {
         if (var10 != var1) {
            var2 |= this.b(var10);
         }
      }

      return var2;
   }

   private String a(String var1, ChatStyle var2) {
      if (!this.g && (this.b.q || this.f == null || !ib.a(var1).toLowerCase(Locale.ROOT).contains(this.f))) {
         Matcher var3 = this.d.matcher(var1);
         boolean var4 = var3.find();
         if (!var4) {
            return null;
         } else {
            il.a var5 = il.a(var1);
            StringBuffer var6 = new StringBuffer();

            do {
               il.b var7 = var5.a(var3.end());
               String var8 = var7.a();
               if (!var7.b() && var2.func_150215_a() != null) {
                  var8 = var8 + var2.func_150215_a().toString();
               }

               var3.appendReplacement(var6, this.e + var8);
               var4 = var3.find();
            } while(var4);

            var3.appendTail(var6);
            return var6.toString();
         }
      } else {
         this.g = true;
         return null;
      }
   }

   private void a(int var1) {
      GuiNewChat var2 = this.a.field_71456_v.func_146158_b();
      int var3 = 0;
      int var4 = 0;

      for(int var5 = 0; var5 <= var1; ++var5) {
         var4 = GuiUtilRenderComponents.func_178908_a(
               ((ChatLine)((IMixinChatComponent)var2).getAllMessages().get(var5)).func_151461_a(),
               MathHelper.func_76141_d((float)var2.func_146228_f() / var2.func_146244_h()),
               this.a.field_71466_p,
               false,
               false
            )
            .size();
         var3 += var4;
      }

      ((IMixinChatComponent)var2).getAllMessages().remove(var1);
      ((IMixinChatComponent)var2).getTrimmedMessages().subList(var3 - var4, var3).clear();
   }

   private boolean c() {
      return !((IMixinChatComponent)this.a.field_71456_v.func_146158_b()).getAllMessages().isEmpty();
   }

   private void a(IChatComponent var1, int var2) {
      var1.func_150258_a(" [" + var2 + "]");
   }

   public static final class a extends HUD {
      @ModConfigValueAnnotation(
         a = 0
      )
      public eh a = new eh("Chat Settings");
      @ModConfigAnnotation(
         a = "keyToggleChat",
         b = "Toggle Chat",
         c = "0",
         e = @ModConfigValueAnnotation(
   a = 1
)
      )
      public is b;
      @ModConfigAnnotation(
         a = "chatHidden",
         b = "Chat Hidden",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = -10
)
      )
      public transient boolean c;
      @ModConfigAnnotation(
         a = "unlimitedScrollback",
         b = "Unlimited Scrollback",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 2
)
      )
      public boolean d;
      @ModConfigAnnotation(
         a = "backgroundColor",
         b = "Background Color",
         c = "0/0/0/128",
         e = @ModConfigValueAnnotation(
   a = 4
)
      )
      public Color e;
      @ModConfigAnnotation(
         a = "textShadow",
         b = "Text Shadow",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 5
)
      )
      public boolean i;
      @ModConfigValueAnnotation(
         a = 10
      )
      public eh j = new eh("Stack Messages");
      @ModConfigAnnotation(
         a = "stackMessages",
         b = "Stack Repeated Messages",
         c = "true",
         e = @ModConfigValueAnnotation(
   a = 11
)
      )
      public boolean k;
      @ModConfigAnnotation(
         a = "consecutiveMessagesOnly",
         b = "Consecutive Messages Only",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 12
)
      )
      public boolean l;
      @ModConfigValueAnnotation(
         a = 20
      )
      public eh m = new eh("Mentions");
      @ModConfigAnnotation(
         a = "mentionHighlight",
         b = "Highlight",
         c = "false",
         e = @ModConfigValueAnnotation(
   a = 21
)
      )
      public boolean n;
      @ModConfigAnnotation(
         a = "mentionColor",
         b = "Color",
         c = "green",
         d = @dB(
   a = "mentionHighlight"
),
         e = @ModConfigValueAnnotation(
   a = 22
)
      )
      @Dropdown
      public ef o;
      @ModConfigAnnotation(
         a = "mentionBold",
         b = "Bold",
         c = "false",
         d = @dB(
   a = "mentionHighlight"
),
         e = @ModConfigValueAnnotation(
   a = 23
)
      )
      public boolean p;
      @ModConfigAnnotation(
         a = "mentionOwnMessage",
         b = "Own Messages",
         c = "false",
         d = @dB(
   a = "mentionHighlight"
),
         e = @ModConfigValueAnnotation(
   a = 24
)
      )
      public boolean q;

      @Override
      public boolean j() {
         return true;
      }
   }
}
