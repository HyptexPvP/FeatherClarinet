package net.digitalingot.feather.gui;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import net.digitalingot.feather.mods.MotionBlur;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Blur implements IResource {
   private static final String a = "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}";
   private final MotionBlur b;

   public Blur(MotionBlur var1) {
      this.b = var1;
   }

   public ResourceLocation func_177241_a() {
      return null;
   }

   @NotNull
   public InputStream func_110527_b() {
      double var1 = 0.6 + this.b.k().a / 251.0;
      return IOUtils.toInputStream(
         String.format(
            Locale.ENGLISH,
            "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}",
            var1,
            var1,
            var1
         ),
         StandardCharsets.UTF_8
      );
   }

   public boolean func_110528_c() {
      return false;
   }

   @Nullable
   public <T extends IMetadataSection> T func_110526_a(String var1) {
      return null;
   }

   public String func_177240_d() {
      return null;
   }
}
