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
        String titleBuilder = SpCo.MOD_NAME + " " +
                SpCo.MOD_VERSION +
                " | Based on " +
                SpCo.MINECRAFT_VERSION;


        cir.setReturnValue(titleBuilder);
    }
}