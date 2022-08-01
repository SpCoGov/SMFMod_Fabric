package com.spco.spco.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class SpCoFlammableBlocks {
    public static void register() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(SpCoBlocks.EUCALYPTUS_LOG, 5, 5);
        instance.add(SpCoBlocks.EUCALYPTUS_WOOD, 5, 5);
        instance.add(SpCoBlocks.STRIPPED_EUCALYPTUS_LOG, 5, 5);
        instance.add(SpCoBlocks.STRIPPED_EUCALYPTUS_WOOD, 5, 5);
        instance.add(SpCoBlocks.EUCALYPTUS_PLANKS, 5, 20);
        instance.add(SpCoBlocks.EUCALYPTUS_LEAVES, 30, 60);
    }
}
