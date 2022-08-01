package com.spco.spco.enchantment.veinmining;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class VeinMiningKey {

    private static final KeyBinding key =
            new KeyBinding("key.smf.activate.desc", InputUtil.UNKNOWN_KEY.getCode(),
                    "key.smf.category");

    public static KeyBinding get() {
        return key;
    }
}