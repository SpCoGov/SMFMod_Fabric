package com.spco.spco.mixin;

import net.minecraft.client.gui.screen.CreditsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.Reader;

@Mixin(CreditsScreen.class)
public abstract class CreditsScreenMixin extends Screen {

    @Mutable
    @Shadow
    @Final
    private static Text SEPARATOR_LINE;

    @Shadow
    protected abstract void readCredits(Reader reader);

    protected CreditsScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        SEPARATOR_LINE = Text.literal("======SMF======").formatted(Formatting.WHITE);
    }
}
