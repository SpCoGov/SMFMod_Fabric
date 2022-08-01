package com.spco.spco.item.tool;

import com.spco.spco.particle.SpCoParticles;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ParticlesSpawnerItem extends Item {


    public ParticlesSpawnerItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            spawnParticles(2, user, world);
        }
        return super.use(world, user, hand);
    }

    private void spawnParticles(int amount, PlayerEntity user, World world) {
        double d = (double) (1 >> 16 & 0xFF) / 255.0;
        double e = (double) (1 >> 8 & 0xFF) / 255.0;
        double f = (double) (1 >> 0 & 0xFF) / 255.0;
        for (int j = 0; j < amount; ++j) {
            world.addParticle(SpCoParticles.RIOT, user.getParticleX(0.5), user.getRandomBodyY(), user.getParticleZ(0.5), d, e, f);
        }
    }
}
