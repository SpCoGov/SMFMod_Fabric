package com.spco.spco.screens;


import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class SpCoScreens extends Screen {
    private final Screen screen;


    public SpCoScreens(Screen screen) {
        super(Text.literal("海绵山更新日志"));

        this.screen = screen;
    }

    private void renderBackground() {

    }

    @Override
    protected void init() {

        this.addDrawableChild(new ButtonWidget(0, 0, 100, 20, Text.literal("返回"), (button) -> MinecraftClient.getInstance().setScreen(screen)));
        this.addDrawableChild(new ButtonWidget(0, 20, 100, 20, Text.literal("加载"), (button) -> this.renderBackground()));
        super.init();
    }
}
