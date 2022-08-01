package com.spco.spco.item;

import com.spco.spco.sound.SpCoSounds;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MP3PlayerItem extends Item {
    public MP3PlayerItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("1.").append(Text.translatable("item.smf.music_disc_thatgirl.desc")));
            tooltip.add(Text.literal("2.").append(Text.translatable("item.smf.music_disc_smf_anthem.desc")));
            tooltip.add(Text.literal("3.").append(Text.translatable("item.smf.music_disc_dango.desc")));
            tooltip.add(Text.literal("4.").append(Text.translatable("item.smf.music_disc_arcahv.desc")));
            tooltip.add(Text.literal("5.").append(Text.translatable("item.smf.music_disc_babaroque.desc")));
            tooltip.add(Text.literal("6.").append(Text.translatable("item.smf.music_disc_ddd.desc")));
            tooltip.add(Text.literal("7.").append(Text.translatable("item.smf.music_disc_diamond.desc")));
            tooltip.add(Text.literal("8.").append(Text.translatable("item.smf.music_disc_girigiri.desc")));
            tooltip.add(Text.literal("9.").append(Text.translatable("item.smf.music_disc_ld.desc")));
            tooltip.add(Text.literal("10.").append(Text.translatable("item.smf.music_disc_sb.desc")));
            tooltip.add(Text.literal("11.").append(Text.translatable("item.smf.music_disc_sleepwalking.desc")));
            tooltip.add(Text.literal("12.").append(Text.translatable("item.smf.music_disc_thesetup.desc")));
            tooltip.add(Text.literal("13.").append(Text.translatable("item.smf.music_disc_wjbbb.desc")));
            tooltip.add(Text.literal("14.").append(Text.translatable("item.smf.music_disc_wdf1op.desc")));
            tooltip.add(Text.literal("15.").append(Text.translatable("item.smf.music_disc_wdf2op.desc")));
        } else {
            tooltip.add(Text.translatable("item.smf.mp3_player.songs_list.smf"));
            tooltip.add(Text.literal(""));
            tooltip.add(Text.translatable("item.smf.mp3_player.shift_tip"));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            int i = Random.createLocal().nextInt(15);
            String musicPath;
            switch (i) {
                case 0:
                    musicPath = "item.smf.music_disc_thatgirl.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_THATGIRL, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 3500);
                    break;
                case 1:
                    musicPath = "item.smf.music_disc_dango.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_DANGO, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 5460);
                    break;
                case 2:
                    musicPath = "item.smf.music_disc_smf_anthem.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_SMF_ANTHEM, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 5040);
                    break;
                case 3:
                    musicPath = "item.smf.music_disc_arcahv.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_ARCAHV, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 3320);
                    break;
                case 4:
                    musicPath = "item.smf.music_disc_babaroque.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_BABAROQUE, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 5470);
                    break;
                case 5:
                    musicPath = "item.smf.music_disc_ddd.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_DDD, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 5080);
                    break;
                case 6:
                    musicPath = "item.smf.music_disc_diamond.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_DIAMOND, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 4140);
                    break;
                case 7:
                    musicPath = "item.smf.music_disc_girigiri.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_GIRIGIRI, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 5160);
                    break;
                case 8:
                    musicPath = "item.smf.music_disc_ld.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_LD, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 5220);
                    break;
                case 9:
                    musicPath = "item.smf.music_disc_sb.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_SB, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 4400);
                    break;
                case 10:
                    musicPath = "item.smf.music_disc_sleepwalking.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_SLEEPWALKING, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 4360);
                    break;
                case 11:
                    musicPath = "item.smf.music_disc_thesetup.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_THESETUP, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 4860);
                    break;
                case 12:
                    musicPath = "item.smf.music_disc_wjbbb.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_WJBBB, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 3080);
                    break;
                case 13:
                    musicPath = "item.smf.music_disc_wdf2op.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_WDF2OP, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 4860);
                    break;
                case 14:
                    musicPath = "item.smf.music_disc_wdf1op.desc";
                    user.sendMessage(Text.translatable("item.smf.mp3_player.playing_info").append(Text.translatable(musicPath)));
                    user.playSound(SpCoSounds.MUSIC_DISC_WDF1OP, SoundCategory.MUSIC, 1F, 1F);
                    user.getItemCooldownManager().set(this, 4440);
                    break;

            }
        }
        return super.use(world, user, hand);
    }
}
