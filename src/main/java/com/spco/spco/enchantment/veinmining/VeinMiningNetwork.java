package com.spco.spco.enchantment.veinmining;

import com.spco.spco.SpCo;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class VeinMiningNetwork {

  public static final Identifier SEND_STATE = new Identifier(SpCo.MOD_PATH_NAME, "state");

  public static void sendState(boolean state) {
    PacketByteBuf buf = PacketByteBufs.create();
    buf.writeBoolean(state);
    ClientPlayNetworking.send(SEND_STATE, buf);
  }

  public static void handleState(MinecraftServer minecraftServer,
                                 ServerPlayerEntity serverPlayerEntity,
                                 ServerPlayNetworkHandler serverPlayNetworkHandler,
                                 PacketByteBuf packetByteBuf, PacketSender packetSender) {
    boolean flag = packetByteBuf.readBoolean();
    minecraftServer.execute(() -> {
      if (flag) {
        VeinMiningPlayers.startVeinMining(serverPlayerEntity, serverPlayerEntity.world.getTime());
      } else {
        VeinMiningPlayers.stopVeinMining(serverPlayerEntity);
      }
    });
  }
}