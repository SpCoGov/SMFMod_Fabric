package com.spco.spco.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {

    @Mutable
    @Shadow
    @Final
    public static Text COPYRIGHT;

    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        COPYRIGHT = Text.literal("Copyright 海绵山操你妈™科技有限公司. Do not distribute!");
        //this.addDrawableChild(new ButtonWidget(0, 0, 100, 20, Text.literal("海绵山更新日志"), (button) -> {MinecraftClient.getInstance().setScreen(new SpCoScreens(this));}));
        //SpCo.LOGGER.info("海绵山Mixin注入成功!");

    }
}