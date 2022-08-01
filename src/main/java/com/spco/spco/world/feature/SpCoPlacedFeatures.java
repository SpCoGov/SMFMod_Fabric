package com.spco.spco.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class SpCoPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> EUCALYPTUS_PLACED = PlacedFeatures.register("eucalyptus_placed", SpCoConfiguredFeatures.EUCALYPTUS_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(50, 0.01F, 3)));

    public static final RegistryEntry<PlacedFeature> DMY_ORE_PLACED = PlacedFeatures.register("dmy_ore_placed", SpCoConfiguredFeatures.DMY_ORE, SpCoOreFeatures.modifiersWithCount(3, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(50))));

    public static final RegistryEntry<PlacedFeature> TIN_ORE_PLACED = PlacedFeatures.register("tin_ore_placed", SpCoConfiguredFeatures.TIN_ORE, SpCoOreFeatures.modifiersWithCount(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(120))));
}
