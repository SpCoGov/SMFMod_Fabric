package com.spco.spco.fluid;

import com.spco.spco.SpCo;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoFluids {
    public static final FlowableFluid QIANDAOWATER_STILL = register("qiandaowater_still", new QiandaoWaterFluid.Still());
    public static final FlowableFluid QIANDAOWATER_FLOWING = register("qiandaowater_flowing", new QiandaoWaterFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(SpCo.MOD_PATH_NAME, name), flowableFluid);
    }

}
