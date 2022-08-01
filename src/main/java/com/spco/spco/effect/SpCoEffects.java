package com.spco.spco.effect;

import com.spco.spco.SpCo;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoEffects {
    public static StatusEffect FREEZE;
    public static StatusEffect FLIGHT;

    public static void register() {
        FREEZE = Registry.register(Registry.STATUS_EFFECT, new Identifier(SpCo.MOD_PATH_NAME, "freeze"), new FreezeEffect(StatusEffectCategory.HARMFUL, 3124687));
        FLIGHT = Registry.register(Registry.STATUS_EFFECT, new Identifier(SpCo.MOD_PATH_NAME, "flight"), new FlightEffect(StatusEffectCategory.HARMFUL, 1145141));
    }
}
