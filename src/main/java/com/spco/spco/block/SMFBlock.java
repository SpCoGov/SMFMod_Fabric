package com.spco.spco.block;

import com.spco.spco.particle.SpCoParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class SMFBlock extends Block {
    private World world;
    private BlockPos pos;

    public SMFBlock(Settings settings) {

        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            ItemStack itemStack = player.getMainHandStack();
            if (itemStack.getItem().equals(Items.FLINT) && hit.getSide() == Direction.UP) {

                world.setBlockState(pos.up(), Blocks.FIRE.getDefaultState());
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);
    }
    private void spawnParticles(int amount) {
        double d = (double)(1 >> 16 & 0xFF) / 255.0;
        double e = (double)(1 >> 8 & 0xFF) / 255.0;
        double f = (double)(1 >> 0 & 0xFF) / 255.0;
        for (int j = 0; j < amount; ++j) {
            this.world.addParticle(SpCoParticles.RIOT, this.pos.getX(), this.pos.getY() + 2D, this.pos.getZ(), d, e, f);
        }
    }
    private void testSpawnParticles() {
        double x = this.pos.getX();
        double y = this.pos.getY();
        double z = this.pos.getZ();
        for (int i = 0; i < 360; i++) {
            if (i % 20 == 0) {
                this.world.addParticle(SpCoParticles.RIOT, x + 0.5D, y + 2D, z + 0.5D, Math.cos(i) * 0.25D, 0.15D, Math.sin(i) * 0.25D);
            }
        }

    }
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        this.world = world;
        this.pos = pos;
        testSpawnParticles();
        //spawnParticles(5);
        super.randomDisplayTick(state, world, pos, random);
    }
}
