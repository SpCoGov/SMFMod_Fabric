package com.spco.spco.item.material.toolMaterial;

import com.spco.spco.item.SpCoItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WentaoToolMaterial implements ToolMaterial {

    public static final WentaoToolMaterial INSTANCE = new WentaoToolMaterial();

    @Override
    public int getDurability() {
        return 3569;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 10.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(SpCoItems.WENTAO_DICK);
    }
}
