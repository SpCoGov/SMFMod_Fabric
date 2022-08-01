package com.spco.spco.enchantment.veinmining;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class VeinMiningEnchantment extends Enchantment {

    public VeinMiningEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinPower(int level) {return 15;}

    @Override
    public boolean isTreasure() {return true;}

}
