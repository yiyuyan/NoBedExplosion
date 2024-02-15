package cn.ksmcbrigade.NBE;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("nbe")
public class NoBedExplosion {

    public NoBedExplosion() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
