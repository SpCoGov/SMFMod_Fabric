package com.spco.spco.world.feature;

import com.spco.spco.block.SpCoBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class SpCoConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> EUCALYPTUS_TREE =
            ConfiguredFeatures.register("eucalyptus_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(SpCoBlocks.EUCALYPTUS_LOG),
                    new StraightTrunkPlacer(4, 4, 1),
                    BlockStateProvider.of(SpCoBlocks.EUCALYPTUS_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> EUCALYPTUS_CHECKED =
            PlacedFeatures.register("eucalyptus_checked", EUCALYPTUS_TREE,
                    PlacedFeatures.wouldSurvive(SpCoBlocks.EUCALYPTUS_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> EUCALYPTUS_SPAWN =
            ConfiguredFeatures.register("eucalyptus_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(EUCALYPTUS_CHECKED, 0.25F)),
                            EUCALYPTUS_CHECKED));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DMY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    SpCoBlocks.DINGMINGYUAN_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    SpCoBlocks.DINGMINGYUAN_BLOCK.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DMY_ORE =
            ConfiguredFeatures.register("dmy_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DMY_ORES, 4));

    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, SpCoBlocks.TIN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, SpCoBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE =
            ConfiguredFeatures.register("tin_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TIN_ORES, 8));

    public static void registerConfiguredFeatures() {

    }
}
