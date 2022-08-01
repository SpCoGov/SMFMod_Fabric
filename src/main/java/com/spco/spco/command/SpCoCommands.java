package com.spco.spco.command;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class SpCoCommands {
    public static void register() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }
}
