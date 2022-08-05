package com.spco.spco.item;

import com.spco.spco.SpCo;
import com.spco.spco.block.SpCoBlocks;
import com.spco.spco.fluid.SpCoFluids;
import com.spco.spco.item.custom.CustomAxeItem;
import com.spco.spco.item.custom.CustomHoeItem;
import com.spco.spco.item.custom.CustomMusicDiscItem;
import com.spco.spco.item.custom.CustomPickaxeItem;
import com.spco.spco.item.material.EncryptedWentaoDickItem;
import com.spco.spco.item.material.SpCoArmorMaterials;
import com.spco.spco.item.material.WentaoDickItem;
import com.spco.spco.item.material.toolMaterial.EncryptedWentaoToolMaterial;
import com.spco.spco.item.material.toolMaterial.WentaoToolMaterial;
import com.spco.spco.item.tool.ParticlesSpawnerItem;
import com.spco.spco.item.tool.WentaoDickSwordItem;
import com.spco.spco.sound.SpCoSounds;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class SpCoItems {

    public static final ItemGroup SMF_GROUP = FabricItemGroupBuilder.build(new Identifier(SpCo.MOD_PATH_NAME, "smf_group"), () -> new ItemStack(SpCoItems.WENTAO_DICK));
    public static final ItemGroup SMF_GROUP_MUSIC = FabricItemGroupBuilder.build(new Identifier(SpCo.MOD_PATH_NAME, "smf_group_music"), () -> new ItemStack(SpCoItems.MP3_PLAYER));
    public static final ItemGroup SMF_GROUP_DEVELOPMENT = FabricItemGroupBuilder.build(new Identifier(SpCo.MOD_PATH_NAME, "smf_group_development"), () -> new ItemStack(SpCoItems.OSU));
    public static final Item WENTAO_DICK = new WentaoDickItem(new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));

    public static final Item ENCRYPTED_WENTAO_DICK = new EncryptedWentaoDickItem(new Item.Settings().group(SMF_GROUP));

    public static final Item SHENGSHENG_MEAT = new ShengshengMeatItem(new Item.Settings().group(SMF_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).meat().build()));
    public static final Item COOKED_SHENGSHENG_MEAT = new Item(new Item.Settings().group(SMF_GROUP).food(new FoodComponent.Builder().hunger(16).saturationModifier(1.8f).meat().build()));

    public static final ToolItem ENCRYPTED_WENTAO_DICK_SHOVEL = new ShovelItem(EncryptedWentaoToolMaterial.INSTANCE, -1.5F, -2.0F, new Item.Settings().group(SMF_GROUP));
    public static final ToolItem ENCRYPTED_WENTAO_DICK_PICKAXE = new CustomPickaxeItem(EncryptedWentaoToolMaterial.INSTANCE, -1, -1.4F, new Item.Settings().group(SMF_GROUP));

    public static final ToolItem WENTAO_DICK_PICKAXE = new CustomPickaxeItem(WentaoToolMaterial.INSTANCE, -1, -3.0F, new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem WENTAO_DICK_SHOVEL = new ShovelItem(WentaoToolMaterial.INSTANCE, -1.5F, -2.8F, new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem WENTAO_DICK_AXE = new CustomAxeItem(WentaoToolMaterial.INSTANCE, 3, -3.0F, new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem WENTAO_DICK_SWORD = new WentaoDickSwordItem(WentaoToolMaterial.INSTANCE, 2, -2.4F, new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));

    public static final ToolItem WENTAO_DICK_HOE = new CustomHoeItem(WentaoToolMaterial.INSTANCE, -2, 0.0F, new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));

    public static final MusicDiscItem DISC_THAT_GIRL = new CustomMusicDiscItem(11, SpCoSounds.MUSIC_DISC_THATGIRL, new Item.Settings().group(SMF_GROUP_MUSIC).maxCount(1).rarity(Rarity.EPIC), 175);
    public static final MusicDiscItem DISC_SMF_ANTHEM = new CustomMusicDiscItem(4, SpCoSounds.MUSIC_DISC_SMF_ANTHEM, new Item.Settings().group(SMF_GROUP_MUSIC).maxCount(1).rarity(Rarity.EPIC), 252);
    public static final MusicDiscItem DISC_DANGO = new CustomMusicDiscItem(5, SpCoSounds.MUSIC_DISC_DANGO, new Item.Settings().group(SMF_GROUP_MUSIC).maxCount(1).rarity(Rarity.EPIC), 273);
    public static final Item DUST_PYROTHEUM = new Item(new Item.Settings().group(SMF_GROUP).rarity(Rarity.RARE));
    public static final Item MP3_PLAYER = new MP3PlayerItem(new Item.Settings().group(SMF_GROUP_MUSIC).maxCount(1).rarity(Rarity.RARE));
    public static final Item SHENGSHENG_MEAT_SEED = new AliasedBlockItem(SpCoBlocks.SHENGSHENG_MEAT_CROP, new FabricItemSettings().group(SMF_GROUP));
    public static final Item BASIC_ELEMENTS = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item REDSTONE_ELEMENTS = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item ADVANCED_ELEMENTS = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item FOSHAN_ELEMENTS = new Item(new Item.Settings().group(SMF_GROUP).rarity(Rarity.EPIC));
    public static final Item RAW_TIN = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item TIN_NUGGET = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item TIN_GEAR = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item COPPER_GEAR = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item RF_COIL = new Item(new Item.Settings().group(SMF_GROUP));
    public static final Item OSU = new Item(new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item EUCALYPTUS_SIGN = new SignItem(new FabricItemSettings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON).maxCount(16), SpCoBlocks.EUCALYPTUS_SIGN, SpCoBlocks.EUCALYPTUS_WALL_SIGN);
    public static final Item PARTICLES_SPAWNER = new ParticlesSpawnerItem(new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item QIANDAOWATER_BUCKET = new BucketItem(SpCoFluids.QIANDAOWATER_STILL, new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item WENTAO_HELMET = new SpCoArmorItem(SpCoArmorMaterials.WENTAO, EquipmentSlot.HEAD, new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON));
    public static final Item WENTAO_CHESTPLATE = new ArmorItem(SpCoArmorMaterials.WENTAO, EquipmentSlot.CHEST, new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON));
    public static final Item WENTAO_LEGGINGS = new ArmorItem(SpCoArmorMaterials.WENTAO, EquipmentSlot.LEGS, new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON));
    public static final Item WENTAO_BOOTS = new ArmorItem(SpCoArmorMaterials.WENTAO, EquipmentSlot.FEET, new Item.Settings().group(SMF_GROUP_DEVELOPMENT).rarity(Rarity.UNCOMMON));
    public static final Item POOP = new Item(new Item.Settings().group(SMF_GROUP).food(new FoodComponent.Builder().hunger(0).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 100, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 50, 4), 1.0f).meat().build()));
    public static final Item SHIELD_BATT = new Item(new Item.Settings().group(SMF_GROUP).food(new FoodComponent.Builder().hunger(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 4), 1.0F)
            .build()).maxCount(6));
    public static final Item MEDICAL_BOX = new Item(new Item.Settings().group(SMF_GROUP).food(new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 3), 1.0F)
            .build()).maxCount(6));
    public static final Item PHONEIX_KIT = new Item(new Item.Settings().group(SMF_GROUP).food(new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 4), 1.0F)
            .build()).maxCount(1));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "mp3_player"), MP3_PLAYER);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_dick"), WENTAO_DICK);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "encrypted_wentao_dick"), ENCRYPTED_WENTAO_DICK);

        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "shengsheng_meat"), SHENGSHENG_MEAT);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "cooked_shengsheng_meat"), COOKED_SHENGSHENG_MEAT);

        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "encrypted_wentao_dick_pickaxe"), ENCRYPTED_WENTAO_DICK_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "encrypted_wentao_dick_shovel"), ENCRYPTED_WENTAO_DICK_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_dick_sword"), WENTAO_DICK_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_dick_pickaxe"), WENTAO_DICK_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_dick_axe"), WENTAO_DICK_AXE);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_dick_shovel"), WENTAO_DICK_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_dick_hoe"), WENTAO_DICK_HOE);

        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "music_disc_thatgirl"), DISC_THAT_GIRL);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "music_disc_smf_anthem"), DISC_SMF_ANTHEM);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "music_disc_dango"), DISC_DANGO);

        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "dust_pyrotheum"), DUST_PYROTHEUM);
        FuelRegistry.INSTANCE.add(DUST_PYROTHEUM, 24000);

        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "basic_elements"), BASIC_ELEMENTS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "redstone_elements"), REDSTONE_ELEMENTS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "advanced_elements"), ADVANCED_ELEMENTS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "foshan_elements"), FOSHAN_ELEMENTS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "raw_tin"), RAW_TIN);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "tin_nugget"), TIN_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "tin_gear"), TIN_GEAR);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "copper_gear"), COPPER_GEAR);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "rf_coil"), RF_COIL);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "osu"), OSU);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "eucalyptus_sign"), EUCALYPTUS_SIGN);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "particles_spawner"), PARTICLES_SPAWNER);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "qiandaowater_bucket"), QIANDAOWATER_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_helmet"), WENTAO_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_chestplate"), WENTAO_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_leggings"), WENTAO_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "wentao_boots"), WENTAO_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "poop"), POOP);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "shield_batt"), SHIELD_BATT);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "medical_box"), MEDICAL_BOX);
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, "phoenix_kit"), PHONEIX_KIT);

        discRegister("music_disc_arcahv", SpCoSounds.MUSIC_DISC_ARCAHV, 166);
        discRegister("music_disc_babaroque", SpCoSounds.MUSIC_DISC_BABAROQUE, 287);
        discRegister("music_disc_ddd", SpCoSounds.MUSIC_DISC_DDD, 254);
        discRegister("music_disc_diamond", SpCoSounds.MUSIC_DISC_DIAMOND, 207);
        discRegister("music_disc_girigiri", SpCoSounds.MUSIC_DISC_GIRIGIRI, 258);
        discRegister("music_disc_ld", SpCoSounds.MUSIC_DISC_LD, 261);
        discRegister("music_disc_sb", SpCoSounds.MUSIC_DISC_SB, 220);
        discRegister("music_disc_sleepwalking", SpCoSounds.MUSIC_DISC_SLEEPWALKING, 218);
        discRegister("music_disc_thesetup", SpCoSounds.MUSIC_DISC_THESETUP, 243);
        discRegister("music_disc_wjbbb", SpCoSounds.MUSIC_DISC_WJBBB, 154);
        discRegister("music_disc_wdf1op", SpCoSounds.MUSIC_DISC_WDF1OP, 222);
        discRegister("music_disc_wdf2op", SpCoSounds.MUSIC_DISC_WDF2OP, 243);
    }

    public static void discRegister(String ID, SoundEvent soundEvent, int soundLength) {
        Registry.register(Registry.ITEM, new Identifier(SpCo.MOD_PATH_NAME, ID), new CustomMusicDiscItem(13, soundEvent, new Item.Settings().group(SMF_GROUP_MUSIC).maxCount(1), soundLength));
    }


}
