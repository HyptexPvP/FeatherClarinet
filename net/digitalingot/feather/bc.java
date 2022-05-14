package net.digitalingot.feather;

public enum bc {
   @dw(
      a = "ultra",
      b = "Ultra"
   )
   ULTRA(1.0F),
   @dw(
      a = "high",
      b = "High"
   )
   HIGH(0.85F),
   @dw(
      a = "medium",
      b = "Medium"
   )
   MEDIUM(0.75F),
   @dw(
      a = "low",
      b = "Low"
   )
   LOW(0.6F);

   private final float scale;

   private bc(float var3) {
      this.scale = var3;
   }

   public float getScale() {
      return this.scale;
   }
}
