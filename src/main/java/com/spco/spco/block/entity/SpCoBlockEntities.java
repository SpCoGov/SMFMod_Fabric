package com.spco.spco.block.entity;

import com.spco.spco.block.SpCoBlocks;
import com.spco.spco.block.entity.machine.ItemInjectorEntity;
import com.spco.spco.block.entity.machine.MachinePulverizerEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoBlockEntities {
    public static BlockEntityType<ItemInjectorEntity> ITEM_INJECTOR;
    public static BlockEntityType<MachinePulverizerEntity> MACHINE_PULVERIZER;
    public static void register() {
        ITEM_INJECTOR = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier("smf", "item_injector"),
                FabricBlockEntityTypeBuilder.create(ItemInjectorEntity::new,
                        SpCoBlocks.ITEM_INJECTOR).build(null));
        MACHINE_PULVERIZER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier("smf", "machine_pulverizer"),
                FabricBlockEntityTypeBuilder.create(MachinePulverizerEntity::new,
                        SpCoBlocks.MACHINE_PULVERIZER).build(null));
    }
}