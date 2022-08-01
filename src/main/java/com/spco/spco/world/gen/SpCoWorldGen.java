package com.spco.spco.world.gen;

public class SpCoWorldGen {
    public static void generateSpCoWorldGen() {
        // ===============- 重要的注册方法，必须放在其他前面 -===============
        SpCoOreGeneration.generateOres();
        // ===============- 重要的注册方法，必须放在其他前面 -===============

        SpCoTreeGeneration.generateTrees();
    }
}
