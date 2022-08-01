package com.spco.spco.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.ParticleTypes;

public class VampiricEnchantment extends Enchantment {
    public VampiricEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
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
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return true;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity entity, int level) {
        if (entity instanceof LivingEntity) {
            user.heal((float) (level * .75 - user.getRandom().nextInt(5) * .1));
            user.getWorld().addParticle(ParticleTypes.HEART, user.getX(), (Double) (user.getY() + 3), user.getZ(), 0.0, 0.0, 0.0);

        }
    }


}
