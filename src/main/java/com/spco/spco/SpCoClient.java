package com.spco.spco;

import com.spco.spco.block.SpCoBlocks;
import com.spco.spco.enchantment.veinmining.VeinMiningKey;
import com.spco.spco.enchantment.veinmining.VeinMiningNetwork;
import com.spco.spco.fluid.SpCoFluids;
import com.spco.spco.particle.RiotParticle;
import com.spco.spco.particle.SpCoParticles;
import com.spco.spco.screens.ItemInjectorScreen;
import com.spco.spco.screens.SpCoScreensHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.world.ClientWorld;

public class SpCoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(SpCoBlocks.SHENGSHENG_MEAT_CROP, RenderLayer.getCutout());


        BlockRenderLayerMap.INSTANCE.putBlock(SpCoBlocks.EUCALYPTUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SpCoBlocks.EUCALYPTUS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SpCoBlocks.MACHINE_FRAME, RenderLayer.getCutout());

        ScreenRegistry.register(SpCoScreensHandlers.ITEM_INJECTOR_SCREEN_HANDLER, ItemInjectorScreen::new);
        ParticleFactoryRegistry.getInstance().register(SpCoParticles.RIOT, RiotParticle.Factory::new);

        FluidRenderHandlerRegistry.INSTANCE.register(SpCoFluids.QIANDAOWATER_STILL, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x46adff));

        FluidRenderHandlerRegistry.INSTANCE.register(SpCoFluids.QIANDAOWATER_FLOWING, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x46adff));

        KeyBindingHelper.registerKeyBinding(VeinMiningKey.get());
        ClientTickEvents.END_CLIENT_TICK.register((client) -> {
            ClientWorld world = client.world;
            ClientPlayerEntity player = client.player;

            if (world != null && player != null && world.getTime() % 5 == 0) {
                boolean enabled;
                enabled = VeinMiningKey.get().isPressed();
                VeinMiningNetwork.sendState(enabled);
            }
        });
    }
}
