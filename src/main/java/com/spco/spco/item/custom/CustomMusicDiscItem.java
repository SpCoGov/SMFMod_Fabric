package com.spco.spco.item.custom;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class CustomMusicDiscItem extends MusicDiscItem {


    public CustomMusicDiscItem(int comparatorOutput, SoundEvent sound, Settings settings, int lengthInSeconds) {
        super(comparatorOutput, sound, settings, lengthInSeconds);
    }
}
