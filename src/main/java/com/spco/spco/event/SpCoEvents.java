package com.spco.spco.event;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;

public class SpCoEvents {
    public static void register() {
        ServerPlayerEvents.COPY_FROM.register(new SpCoPlayerEventCopyFrom());
    }
}
