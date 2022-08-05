package com.spco.spco;

import com.spco.spco.block.SpCoBlocks;
import com.spco.spco.block.SpCoFlammableBlocks;
import com.spco.spco.block.entity.SpCoBlockEntities;
import com.spco.spco.command.SpCoCommands;
import com.spco.spco.effect.SpCoEffects;
import com.spco.spco.enchantment.SpCoEnchantments;
import com.spco.spco.enchantment.veinmining.VeinMiningNetwork;
import com.spco.spco.enchantment.veinmining.VeinMiningPlayers;
import com.spco.spco.enchantment.veinmining.logic.BlockProcessor;
import com.spco.spco.event.SpCoEvents;
import com.spco.spco.item.SpCoItems;
import com.spco.spco.painting.SpCoPaintings;
import com.spco.spco.particle.SpCoParticles;
import com.spco.spco.recipe.SpCoRecipes;
import com.spco.spco.screens.SpCoScreensHandlers;
import com.spco.spco.sound.SpCoSounds;
import com.spco.spco.util.SpCoTrades;
import com.spco.spco.world.feature.SpCoConfiguredFeatures;
import com.spco.spco.world.gen.SpCoWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.spco.spco.item.SpCoItems.SHENGSHENG_MEAT_SEED;

public class SpCo implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("SMF");
    public static final String MOD_VERSION = "1.3";
    public static final String MOD_NAME = "SMF";
    public static final String MINECRAFT_VERSION = "Minecraft 1.19.1";
    public static final String MOD_PATH_NAME = "smf";


    @Override
    public void onInitialize() {
        LOGGER.info("Registering SMF!");
        // ===============- 重要的注册方法，必须放在其他前面 -===============
        Registry.register(Registry.ITEM, new Identifier(MOD_PATH_NAME, "shengsheng_meat_seed"), SHENGSHENG_MEAT_SEED);
        SpCoConfiguredFeatures.registerConfiguredFeatures();
        // ===============- 重要的注册方法，必须放在其他前面 -===============
        SpCoSounds.register();
        SpCoItems.register();
        SpCoBlocks.registry();
        //SpCoRegistries.register();
        SpCoEnchantments.register();
        ServerLifecycleEvents.SERVER_STARTED.register(minecraftServer -> {
            BlockProcessor.rebuild();
        });
        ServerLifecycleEvents.END_DATA_PACK_RELOAD.register((minecraftServer, serverResourceManager, b) -> BlockProcessor.rebuild());
        ServerTickEvents.END_WORLD_TICK.register((world) -> VeinMiningPlayers.validate(world.getTime()));
        ServerPlayNetworking.registerGlobalReceiver(VeinMiningNetwork.SEND_STATE, VeinMiningNetwork::handleState);

        SpCoCommands.register();
        SpCoEvents.register();
        SpCoFlammableBlocks.register();
        SpCoWorldGen.generateSpCoWorldGen();
        SpCoPaintings.register();
        SpCoTrades.register();
        SpCoEffects.register();
        SpCoBlockEntities.register();
        SpCoRecipes.register();
        SpCoScreensHandlers.register();
        SpCoParticles.register();


        LOGGER.info("Done!");
    }
}

