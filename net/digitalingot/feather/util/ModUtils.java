package net.digitalingot.feather.util;

import java.util.List;
import java.util.stream.Collectors;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;

public class ModUtils {
   public static List<String> a() {
      return (List<String>)Loader.instance().getIndexedModList().values().stream().map(ModContainer::getModId).collect(Collectors.toList());
   }
}
