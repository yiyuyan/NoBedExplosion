package cn.ksmcbrigade.NBE.mixin;

import net.minecraft.world.level.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DimensionType.class)
public abstract class DimensionTypeMixin {

    /**
     * @author KSmc_brigade
     * @reason Make the bed can sleep in the end and nether.
     */
    @Overwrite
    public boolean natural() {
        return true;
    }
}
