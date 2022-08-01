package com.spco.spco.item.material.toolMaterial;

import com.spco.spco.item.SpCoItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EncryptedWentaoToolMaterial implements ToolMaterial {

    public static final EncryptedWentaoToolMaterial INSTANCE = new EncryptedWentaoToolMaterial();

    @Override
    public int getDurability() {
        return 1869;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 6.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(SpCoItems.ENCRYPTED_WENTAO_DICK);
    }
}
