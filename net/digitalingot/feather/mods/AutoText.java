package net.digitalingot.feather.mods;

import com.google.common.reflect.TypeToken;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import net.digitalingot.feather.dn;
import net.digitalingot.feather.dt;
import net.digitalingot.feather.dy;
import net.digitalingot.feather.e;
import net.digitalingot.feather.eO;
import net.digitalingot.feather.eR;
import net.digitalingot.feather.eS;
import net.digitalingot.feather.hP;
import net.digitalingot.feather.is;
import net.digitalingot.feather.browser.Browser;
import net.digitalingot.feather.browserEvent.DeleteMacro;
import net.digitalingot.feather.event.BrowserEvents;
import net.digitalingot.feather.event.SelectEvent;
import net.digitalingot.feather.gui.BrowserUtils;
import net.digitalingot.feather.gui.FeatherGUI;
import net.digitalingot.feather.gui.HUD;
import net.digitalingot.feather.util.Macro;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@FeatherModule(
   a = ModsConfig.AUTO_TEXT,
   b = @dn(
   a = "Auto Text",
   b = "https://assets.feathercdn.net/game/mods/autotext.svg",
   c = "",
   d = {}
)
)
public class AutoText extends Mod<AutoText.a> {
   private File a;
   @NotNull
   private final Set<eO> c = new LinkedHashSet();

   @Override
   public void f() {
      Browser var1 = e.c().a();
      var1.a(BrowserEvents.CREATE_UPDATE_MACRO, new Macro(this));
      var1.a(BrowserEvents.DELETE_MACRO, new DeleteMacro(this));
      FeatherGUI.b.a((var1x, var2, var3, var4) -> {
         if (this.m()) {
            if (Minecraft.func_71410_x().field_71441_e != null) {
               if (Minecraft.func_71410_x().field_71415_G) {
                  if (this.b.a.b()) {
                     BrowserUtils.INSTANCE.show();
                     eS.a();
                  } else {
                     for(eO var6 : this.c) {
                        if (var6.d().b()) {
                           var6.a();
                        }
                     }

                  }
               }
            }
         }
      });
      SelectEvent.a.a(var0 -> {
         if (var0.equals("autoText")) {
            BrowserUtils.INSTANCE.show();
            eS.a();
         }

      });
   }

   @Override
   public void g() {
      this.a = new File(e.c().e(), "autotext.json");
      if (this.a.exists()) {
         Set var1 = hP.a(this.a).a((new TypeToken<LinkedHashSet<eO>>() {
         }).getType());
         this.c.addAll(var1);
      }

      eR.a(this.c);
   }

   @Override
   public void h() {
      this.c.clear();
   }

   public void a(@NotNull eO var1) {
      this.c.remove(var1);
      this.c.add(var1);
      this.b();
   }

   public void b(@NotNull eO var1) {
      this.c.remove(var1);
      this.b();
   }

   private void b() {
      this.a.getParentFile().mkdirs();
      hP.a(this.a).b_().a(this.c);
   }

   @NotNull
   public Set<eO> a() {
      return this.c;
   }

   @dt(
      b = @dy(
   a = "autoText",
   b = "AutoText",
   c = "https://assets.feathercdn.net/game/hudselection/autotext.svg",
   d = 1
)
   )
   public static class a extends HUD {
      @ModConfigAnnotation(
         a = "keyOpenGui",
         b = "AutoText Editor",
         c = "77",
         e = @ModConfigValueAnnotation(
   a = 0
)
      )
      public is a;
   }
}
