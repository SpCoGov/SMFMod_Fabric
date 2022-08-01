package com.spco.spco.particle;

import com.spco.spco.SpCo;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoParticles {
    public static final DefaultParticleType RIOT = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(SpCo.MOD_PATH_NAME, "riot"), RIOT);
    }
}
