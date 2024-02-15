package cn.ksmcbrigade.NBE.mixin;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BedBlock.class)
public class BedMixin {
    /**
     * @author KSmc_brigade
     * @reason Make the bed can't explosion in the end and nether.
     */
    @Overwrite
    public static boolean canSetSpawn(Level p_49489_) {
        return true;
    }
}
