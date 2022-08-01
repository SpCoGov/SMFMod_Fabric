package com.spco.spco.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public class SunOfSMFEnchantment extends Enchantment {
    protected SunOfSMFEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 10 * level;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (!user.world.isClient) {
            int x = attacker.getBlockX();
            int y = attacker.getBlockY();
            int z = attacker.getBlockZ();
            BlockPos b2 = new BlockPos(x, y, z);
            BlockPos a2 = new BlockPos(x, y + 1, z);
            BlockPos c2 = new BlockPos(x, y - 1, z);
            BlockPos b1 = new BlockPos(x + 1, y, z);
            user.world.breakBlock(b2, true);
            user.world.breakBlock(b1, true);
        }
        super.onUserDamaged(user, attacker, level);
    }
}
