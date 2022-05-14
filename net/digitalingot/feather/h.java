package net.digitalingot.feather;

import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.client.ClientCommandHandler;
import org.jetbrains.annotations.NotNull;

public abstract class h extends CommandBase {
   @NotNull
   private final String a;
   @NotNull
   private final List<String> b;

   public h(@NotNull String var1, @NotNull List<String> var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public String func_71517_b() {
      return this.a;
   }

   @NotNull
   public List<String> func_71514_a() {
      return this.b;
   }

   @NotNull
   public String func_71518_a(ICommandSender var1) {
      return "";
   }

   public int func_82362_a() {
      return 0;
   }

   public void func_71515_b(ICommandSender var1, String[] var2) {
      this.a(var2);
   }

   public void a(Void var1) {
      ClientCommandHandler.instance.func_71560_a(this);
   }

   public abstract void a(@NotNull String[] var1);
}
