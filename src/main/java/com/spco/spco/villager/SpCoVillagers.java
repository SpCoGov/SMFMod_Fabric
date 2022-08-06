package com.spco.spco.villager;

import com.google.common.collect.ImmutableSet;
import com.spco.spco.SpCo;
import com.spco.spco.block.SpCoBlocks;
import com.spco.spco.item.SpCoItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class SpCoVillagers {

    public static PointOfInterestType WENTAO_POI;
    public static VillagerProfession WENTAO_MASTER;

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(SpCo.MOD_PATH_NAME, name), VillagerProfessionBuilder.create().id(new Identifier(SpCo.MOD_PATH_NAME, name)).workstation(type).workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(SpCo.MOD_PATH_NAME, name), 1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void register() {
        WENTAO_POI = registerPOI("wentao_poi", SpCoBlocks.ITEM_INJECTOR);
        WENTAO_MASTER = registerProfession("wentaomaster", RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(SpCo.MOD_PATH_NAME, "wentao_poi")));
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 3),
                            new ItemStack(Items.EMERALD, 3),
                            6, 4, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.DIRT, 3),
                            3, 2, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(SpCoBlocks.SMF_BLOCK_ITEM, 64),
                            new ItemStack(Items.DIAMOND, 1),
                            10, 3, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_BLOCK, 1),
                            new ItemStack(Items.COAL, 1),
                            10, 5, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_BLOCK, 3),
                            new ItemStack(Items.DIAMOND_AXE, 3),
                            6, 5, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_AXE, 1),
                            new ItemStack(Items.DEEPSLATE_DIAMOND_ORE, 3),
                            new ItemStack(SpCoItems.ENCRYPTED_WENTAO_DICK_PICKAXE, 1),
                            5, 4, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(SpCoBlocks.SMF_BLOCK_ITEM, 5),
                            new ItemStack(Items.COBBLESTONE, 10),
                            5, 2, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 2),
                            new ItemStack(Items.DIAMOND_BLOCK, 1),
                            6, 6, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BELL, 1),
                            new ItemStack(Items.DIAMOND_BLOCK, 5),
                            new ItemStack(Items.EMERALD_BLOCK, 1),
                            6, 5, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLASS, 64),
                            new ItemStack(Items.LAVA_BUCKET, 1),
                            new ItemStack(Items.RED_SAND, 32),
                            6, 5, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_CHESTPLATE, 1),
                            new ItemStack(Items.MILK_BUCKET, 1),
                            new ItemStack(Items.GOLDEN_SHOVEL, 1),
                            2, 8, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_CHESTPLATE, 1),
                            new ItemStack(Items.COAL, 3),
                            new ItemStack(Items.NETHERITE_INGOT, 1),
                            2, 5, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_DIAMOND_ORE, 1),
                            new ItemStack(SpCoItems.REDSTONE_ELEMENTS, 6),
                            new ItemStack(Items.DIAMOND, 1),
                            5, 5, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.REDSTONE_LAMP, 5),
                            new ItemStack(Items.SLIME_BALL, 6),
                            new ItemStack(Items.REDSTONE_BLOCK, 1),
                            5, 5, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RED_SAND, 9),
                            new ItemStack(Items.FURNACE, 19),
                            new ItemStack(Items.SAND, 3),
                            10, 8, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DRIED_KELP_BLOCK, 1),
                            new ItemStack(Items.DIRT, 3),
                            10, 3, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ITEM_FRAME, 5),
                            new ItemStack(Items.LEATHER, 4),
                            10, 4, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_EMERALD_ORE, 5),
                            new ItemStack(Items.CREEPER_HEAD, 1),
                            new ItemStack(Items.NETHERITE_SCRAP, 7),
                            10, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CAKE, 1),
                            new ItemStack(Items.DIAMOND_ORE, 25),
                            new ItemStack(Items.NETHERITE_INGOT, 2),
                            10, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WITHER_SKELETON_SKULL, 3),
                            new ItemStack(Items.SOUL_SAND, 4),
                            new ItemStack(Items.NETHER_STAR, 1),
                            10, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(WENTAO_MASTER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LAVA_BUCKET, 1),
                            new ItemStack(Items.WATER_BUCKET, 1),
                            new ItemStack(Items.OBSIDIAN, 32),
                            10, 10, 0.2F)));
                });
    }
}
