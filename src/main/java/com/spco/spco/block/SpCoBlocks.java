package com.spco.spco.block;

import com.spco.spco.SpCo;
import com.spco.spco.block.crop.ShengshengMeatCrop;
import com.spco.spco.block.custom.CustomFluidBlock;
import com.spco.spco.block.custom.CustomSaplingBlock;
import com.spco.spco.block.entity.SpCoSignTypes;
import com.spco.spco.fluid.SpCoFluids;
import com.spco.spco.sound.SpCoBlockSoundGroups;
import com.spco.spco.world.feature.tree.JacarandaSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

import static com.spco.spco.item.SpCoItems.SMF_GROUP;
import static com.spco.spco.item.SpCoItems.SMF_GROUP_DEVELOPMENT;

public class SpCoBlocks {
    public static final Block SMF_BLOCK = new SMFBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(4F));
    public static final Item SMF_BLOCK_ITEM = new BlockItem(SMF_BLOCK, new Item.Settings().group(SMF_GROUP));
    public static final Block DINGMINGYUAN_BLOCK = new DingmingyuanBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().luminance(3).sounds(SpCoBlockSoundGroups.DMY_BLOCK).strength(3.0F, 3.0F), UniformIntProvider.create(3, 7));
    public static final Item DINGMINGYUAN_BLOCK_ITEM = new BlockItem(DINGMINGYUAN_BLOCK, new Item.Settings().group(SMF_GROUP));
    public static final Block RED_LAMP_BLOCK = new RedLampBlock(FabricBlockSettings.of(Material.METAL).strength(0.3f).luminance(state -> state.get(RedLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS));
    public static final Item RED_LAMP_BLOCK_ITEM = new BlockItem(RED_LAMP_BLOCK, new Item.Settings().group(SMF_GROUP));
    public static final Block SHENGSHENG_MEAT_CROP = new ShengshengMeatCrop(FabricBlockSettings.copy(Blocks.WHEAT));
    public static final Block EUCALYPTUS_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));
    public static final Item EUCALYPTUS_LOG_ITEM = new BlockItem(EUCALYPTUS_LOG, new Item.Settings().group(SMF_GROUP));
    public static final Block EUCALYPTUS_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));
    public static final Item EUCALYPTUS_WOOD_ITEM = new BlockItem(EUCALYPTUS_WOOD, new Item.Settings().group(SMF_GROUP));
    public static final Block STRIPPED_EUCALYPTUS_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));
    public static final Item STRIPPED_EUCALYPTUS_LOG_ITEM = new BlockItem(STRIPPED_EUCALYPTUS_LOG, new Item.Settings().group(SMF_GROUP));
    public static final Block STRIPPED_EUCALYPTUS_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));
    public static final Item STRIPPED_EUCALYPTUS_WOOD_ITEM = new BlockItem(STRIPPED_EUCALYPTUS_WOOD, new Item.Settings().group(SMF_GROUP));
    public static final Block EUCALYPTUS_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));
    public static final Item EUCALYPTUS_PLANKS_ITEM = new BlockItem(EUCALYPTUS_PLANKS, new Item.Settings().group(SMF_GROUP));
    public static final Block EUCALYPTUS_LEAVES = registryBlock("eucalyptus_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).strength(0.2F).sounds(BlockSoundGroup.GRASS).nonOpaque()), SMF_GROUP);
    public static final Block EUCALYPTUS_SAPLING = registryBlock("eucalyptus_sapling", new CustomSaplingBlock(new JacarandaSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.GRASS)), SMF_GROUP);
    public static final Block ITEM_INJECTOR = registryBlock("item_injector", new ItemInjectorBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F)), SMF_GROUP);
    public static final Block MACHINE_FRAME = registryBlock("machine_frame", new MachineFrameBlock(FabricBlockSettings.of(Material.METAL)), SMF_GROUP);
    public static final Block TIN_ORE = registryBlock("tin_ore", new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), SMF_GROUP);
    public static final Block DEEPSLATE_TIN_ORE = registryBlock("deepslate_tin_ore", new OreBlock(AbstractBlock.Settings.copy(TIN_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)), SMF_GROUP);
    public static final Block TIN_BLOCK = registryBlock("tin_block", new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)), SMF_GROUP);
    public static final Block MACHINE_PULVERIZER = registryBlock("machine_pulverizer", new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)), SMF_GROUP_DEVELOPMENT);
    public static final Block EUCALYPTUS_WALL_SIGN = registryBlockWithoutItem("eucalyptus_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), SpCoSignTypes.EUCALYPTUS));
    public static final Block EUCALYPTUS_SIGN = registryBlockWithoutItem("eucalyptus_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), SpCoSignTypes.EUCALYPTUS));
    public static final Block FFFFFF_BLOCK = registryBlock("ffffff_block", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)), SMF_GROUP_DEVELOPMENT);
    public static final Block C000000_BLOCK = registryBlock("000000_block", new Block(FabricBlockSettings.copy(Blocks.BEDROCK)), SMF_GROUP_DEVELOPMENT);
    public static final Block QIANDAOWATER_FLUID_BLOCK = new CustomFluidBlock(SpCoFluids.QIANDAOWATER_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing());
    public static final Block RAW_TIN_BLOCK = registryBlock("raw_tin_block", new Block(FabricBlockSettings.copy(Blocks.RAW_IRON_BLOCK)), SMF_GROUP);
    public static void registry() {
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "smf_block"), SMF_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "smf_block"), SMF_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "dmy_block"), DINGMINGYUAN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "dmy_block"), DINGMINGYUAN_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "red_lamp"), RED_LAMP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "red_lamp"), RED_LAMP_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "shengsheng_meat"), SHENGSHENG_MEAT_CROP);

        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_log"), EUCALYPTUS_LOG);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_log"), EUCALYPTUS_LOG_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_wood"), EUCALYPTUS_WOOD);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_wood"), EUCALYPTUS_WOOD_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "stripped_eucalyptus_log"), STRIPPED_EUCALYPTUS_LOG);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "stripped_eucalyptus_log"), STRIPPED_EUCALYPTUS_LOG_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "stripped_eucalyptus_wood"), STRIPPED_EUCALYPTUS_WOOD);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "stripped_eucalyptus_wood"), STRIPPED_EUCALYPTUS_WOOD_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_planks"), EUCALYPTUS_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_planks"), EUCALYPTUS_PLANKS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, "qiandaowater_fluid_block"), QIANDAOWATER_FLUID_BLOCK);

        registryStrippables();
    }

    private static void registryStrippables() {
        StrippableBlockRegistry.register(EUCALYPTUS_LOG, STRIPPED_EUCALYPTUS_LOG);
        StrippableBlockRegistry.register(EUCALYPTUS_WOOD, STRIPPED_EUCALYPTUS_WOOD);
    }
    private static Block registryBlock(String path, Block block, ItemGroup itemGroup) {
        Item item;
        if (itemGroup == SMF_GROUP_DEVELOPMENT) {
            item = new BlockItem(block, new Item.Settings().group(itemGroup).rarity(Rarity.UNCOMMON));
        } else {
            item = new BlockItem(block, new Item.Settings().group(itemGroup));
        }
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, path), item);
        return Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, path), block);
    }


    private static Block registryBlockWithoutItem(String path, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(SpCo.MOD_PATH_NAME, path), block);
    }

}
