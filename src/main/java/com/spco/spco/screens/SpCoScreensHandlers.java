package com.spco.spco.screens;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class SpCoScreensHandlers {
    public static ScreenHandlerType<ItemInjectorScreenHandler> ITEM_INJECTOR_SCREEN_HANDLER;
    public static ScreenHandlerType<MachinePulverizerScreenHandler> MACHINE_PULVERIZER_SCREEN_HANDLER;

    public static void register() {
        ITEM_INJECTOR_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier("smf", "item_injector"), ItemInjectorScreenHandler::new);
        MACHINE_PULVERIZER_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier("smf", "machine_pulverizer"), MachinePulverizerScreenHandler::new);
    }
}
