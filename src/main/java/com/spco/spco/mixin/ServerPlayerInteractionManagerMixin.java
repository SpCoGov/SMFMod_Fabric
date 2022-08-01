/*
 * Copyright (c) 2020 C4
 *
 * This file is part of Vein Mining, a mod made for Minecraft.
 *
 * Vein Mining is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version.
 *
 * Vein Mining is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Vein Mining.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package com.spco.spco.mixin;

import com.spco.spco.enchantment.veinmining.logic.VeinMiningLogic;
import net.minecraft.block.BlockState;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerInteractionManager.class)
public class ServerPlayerInteractionManagerMixin {

    @Shadow
    public ServerPlayerEntity player;

    private BlockState source;

    @Inject(
            at = @At(value = "HEAD"),
            method = "tryBreakBlock(Lnet/minecraft/util/math/BlockPos;)Z")
    private void _veinmining_preHarvest(BlockPos pos, CallbackInfoReturnable<Boolean> ci) {
        source = player.world.getBlockState(pos);
    }

    @Inject(
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/item/ItemStack.postMine(Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/PlayerEntity;)V"),
            method = "tryBreakBlock(Lnet/minecraft/util/math/BlockPos;)Z")
    private void _veinmining_tryHarvest(BlockPos pos, CallbackInfoReturnable<Boolean> ci) {
        VeinMiningLogic.startVeinMining(player, pos, source);
    }
}
