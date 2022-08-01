package com.spco.spco.sound;

import com.spco.spco.SpCo;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoSounds {
    public static final SoundEvent MUSIC_DISC_THATGIRL = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.thatgirl"));
    public static final SoundEvent MUSIC_DISC_SMF_ANTHEM = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.smf_anthem"));
    public static final SoundEvent MUSIC_DISC_DANGO = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.dango"));
    public static final SoundEvent BLOCK_WACAO = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "block.smf.wacao"));

    public static final SoundEvent MUSIC_DISC_ARCAHV = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.arcahv"));
    public static final SoundEvent MUSIC_DISC_BABAROQUE = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.babaroque"));
    public static final SoundEvent MUSIC_DISC_DDD = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.ddd"));
    public static final SoundEvent MUSIC_DISC_DIAMOND = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.diamond"));
    public static final SoundEvent MUSIC_DISC_GIRIGIRI = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.girigiri"));
    public static final SoundEvent MUSIC_DISC_LD = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.ld"));
    public static final SoundEvent MUSIC_DISC_SB = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.sb"));
    public static final SoundEvent MUSIC_DISC_SLEEPWALKING = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.sleepwalking"));
    public static final SoundEvent MUSIC_DISC_THESETUP = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.thesetup"));
    public static final SoundEvent MUSIC_DISC_WDF1OP = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.wdf1op"));
    public static final SoundEvent MUSIC_DISC_WDF2OP = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.wdf2op"));
    public static final SoundEvent MUSIC_DISC_WJBBB = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "music_disc.smf.wjbbb"));
    public static final SoundEvent MISC_LIGHTNING_HAIMIAN = new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, "misc.smf.lightning_haimian"));


    public static void register() {
        Registry.register(Registry.SOUND_EVENT, SpCo.MOD_PATH_NAME + ":music_disc.smf.thatgirl", MUSIC_DISC_THATGIRL);
        Registry.register(Registry.SOUND_EVENT, SpCo.MOD_PATH_NAME + ":music_disc.smf.smf_anthem", MUSIC_DISC_SMF_ANTHEM);
        Registry.register(Registry.SOUND_EVENT, SpCo.MOD_PATH_NAME + ":music_disc.smf.dango", MUSIC_DISC_DANGO);
        Registry.register(Registry.SOUND_EVENT, SpCo.MOD_PATH_NAME + ":block.smf.wacao", BLOCK_WACAO);

        soundsRegister("music_disc.smf.arcahv");
        soundsRegister("music_disc.smf.babaroque");
        soundsRegister("music_disc.smf.ddd");
        soundsRegister("music_disc.smf.diamond");
        soundsRegister("music_disc.smf.girigiri");
        soundsRegister("music_disc.smf.ld");
        soundsRegister("music_disc.smf.sb");
        soundsRegister("music_disc.smf.sleepwalking");
        soundsRegister("music_disc.smf.thesetup");
        soundsRegister("music_disc.smf.wdf1op");
        soundsRegister("music_disc.smf.wdf2op");
        soundsRegister("music_disc.smf.wjbbb");
    }

    private static void soundsRegister(String ID) {
        Registry.register(Registry.SOUND_EVENT, SpCo.MOD_PATH_NAME + ":" + ID, new SoundEvent(new Identifier(SpCo.MOD_PATH_NAME, ID)));
    }
}
