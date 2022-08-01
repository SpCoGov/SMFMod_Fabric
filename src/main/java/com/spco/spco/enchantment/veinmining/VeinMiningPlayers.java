package com.spco.spco.enchantment.veinmining;

import net.minecraft.entity.player.PlayerEntity;

import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class VeinMiningPlayers {
    private static final long DIFF = 20;
    private static final Map<UUID, Long> players = new ConcurrentHashMap<>();

    public static void validate(long worldTime) {
        Iterator<Map.Entry<UUID, Long>> entries = players.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry<UUID, Long> entry = entries.next();
            long lastTime = entry.getValue();

            if (worldTime - lastTime > DIFF || lastTime > worldTime) {
                entries.remove();
            }
        }
    }

    public static boolean canVeinMine(PlayerEntity player) {
        return players.containsKey(player.getUuid());
    }

    public static void startVeinMining(PlayerEntity player, long time) {
        players.put(player.getUuid(), time);
    }

    public static void stopVeinMining(PlayerEntity player) {
        players.remove(player.getUuid());
    }
}
