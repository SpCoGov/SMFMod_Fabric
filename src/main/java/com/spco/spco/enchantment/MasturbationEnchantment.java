package com.spco.spco.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MasturbationEnchantment extends Enchantment {
    public MasturbationEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public int getMinPower(int level) {
        return 15;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof HostileEntity) {
            World world = user.world;
            BlockPos position = target.getBlockPos();
            // 记录玩家fireTick
            int fireTicks = user.getFireTicks();
            // 给予玩家无敌、防火效果
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 15, 10, false, false));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 15, 10, false, false));
            for (int i = 0; i < level; i++) {
                spawnLightningBolt((ServerWorld) world, position);
            }
            user.setFireTicks(fireTicks);
        }
        super.onTargetDamaged(user, target, level);
    }

    private void spawnLightningBolt(ServerWorld world, BlockPos position) {
        EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position, SpawnReason.TRIGGERED, true, true);
    }
}
