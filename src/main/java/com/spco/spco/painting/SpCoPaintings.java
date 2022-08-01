package com.spco.spco.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoPaintings {

    public static void register() {
        Registry.register(Registry.PAINTING_VARIANT, new Identifier("smf", "smfflag"), new PaintingVariant(64, 32));
    }
}
