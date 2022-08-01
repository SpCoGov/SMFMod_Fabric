package com.spco.spco.enchantment;

import com.spco.spco.SpCo;
import com.spco.spco.enchantment.veinmining.VeinMiningEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.entity.EquipmentSlot.MAINHAND;

public class SpCoEnchantments {

    // 声明附魔：大冲特冲
    public static Enchantment MASTURBATION = new MasturbationEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{MAINHAND});
    public static Enchantment VAMPIRIC = new VampiricEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{MAINHAND});
    public static Enchantment FREEZING = new FreezingEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{MAINHAND});
    public static Enchantment FALLINDEATH = new FallInDeathEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{MAINHAND});
    public static Enchantment SUNOFSMF = new SunOfSMFEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[]{MAINHAND});
    public static Enchantment VEINMINING = new VeinMiningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[]{MAINHAND});
    public static void register() {
        // 注册附魔
        Registry.register(Registry.ENCHANTMENT, new Identifier(SpCo.MOD_PATH_NAME, "masturbation"), MASTURBATION);
        Registry.register(Registry.ENCHANTMENT, new Identifier(SpCo.MOD_PATH_NAME, "vampiric"), VAMPIRIC);
        Registry.register(Registry.ENCHANTMENT, new Identifier(SpCo.MOD_PATH_NAME, "freezing"), FREEZING);
        Registry.register(Registry.ENCHANTMENT, new Identifier(SpCo.MOD_PATH_NAME, "fall_in_death"), FALLINDEATH);
        Registry.register(Registry.ENCHANTMENT, new Identifier(SpCo.MOD_PATH_NAME, "sun_of_smf"), SUNOFSMF);
        Registry.register(Registry.ENCHANTMENT, new Identifier(SpCo.MOD_PATH_NAME, "veinmining"), VEINMINING);
    }
}
