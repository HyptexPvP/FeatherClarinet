package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import net.minecraft.util.ResourceLocation;

public class v extends TypeAdapter<ResourceLocation> {
   public void a(JsonWriter var1, ResourceLocation var2) {
      throw new IOException("operation unsupported");
   }

   public ResourceLocation a(JsonReader var1) {
      String var2 = var1.nextString();
      return new ResourceLocation(var2);
   }
}
