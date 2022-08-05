package com.spco.spco.mixin;

import com.spco.spco.SpCo;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.InputStream;

@Mixin(MinecraftClient.class)
public abstract class MinecraftTitleMixin {


    @Inject(at = @At("HEAD"), method = "getWindowTitle", cancellable = true)
    private void getWindowsTitle(CallbackInfoReturnable<String> cir) {
        String titleBuilder =
                SpCo.MOD_NAME + " " +
                        SpCo.MOD_VERSION +
                        " | Based on " +
                        SpCo.MINECRAFT_VERSION;


        cir.setReturnValue(titleBuilder);
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setIcon(Ljava/io/InputStream;Ljava/io/InputStream;)V"))
    private void setupIcon(Window instance, InputStream icon16, InputStream icon32) {

        final InputStream stream16 = SpCo.class.getResourceAsStream("/assets/smf/icon_16x16.png");
        final InputStream stream32 = SpCo.class.getResourceAsStream("/assets/smf/icon_32x32.png");

        if (stream16 == null || stream32 == null) {
            instance.setIcon(icon16, icon32);
            return;
        }

        instance.setIcon(stream16, stream32);
    }


}