package com.spco.spco.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DingmingyuanBlock extends OreBlock {


    public DingmingyuanBlock(Settings settings, IntProvider experience) {
        super(settings, experience);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        //world.playSound(pos.getX(), pos.getY(), pos.getZ(), SpCoSounds.BLOCK_WACAO, SoundCategory.BLOCKS, 1F, 1F, true);
        super.onPlaced(world, pos, state, placer, itemStack);
    }

    @Override
    public boolean canMobSpawnInside() {
        return false;
    }


    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        //SpCo.LOGGER.debug("DMYBlock nothing to do.");
        super.randomTick(state, world, pos, random);
    }

}

