package com.spco.spco.mixin;

import com.spco.spco.SpCo;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public abstract class MinecraftTitleMixin {


    @Inject(at = @At("HEAD"), method = "getWindowTitle", cancellable = true)
    private void getWindowsTitle(CallbackInfoReturnable<String> cir) {
        final StringBuilder titleBuilder = new StringBuilder(SpCo.MOD_NAME);
        titleBuilder.append(" ");
        titleBuilder.append(SpCo.MOD_VERSION);
        titleBuilder.append(" | Based on ");
        titleBuilder.append(SpCo.MINECRAFT_VERSION);


        cir.setReturnValue(titleBuilder.toString());
    }
}