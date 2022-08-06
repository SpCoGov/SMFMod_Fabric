package com.spco.spco.recipe;

import com.spco.spco.SpCo;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpCoRecipes {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(SpCo.MOD_PATH_NAME, ItemInjectorRecipe.Serializer.ID), ItemInjectorRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(SpCo.MOD_PATH_NAME, ItemInjectorRecipe.Type.ID), ItemInjectorRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(SpCo.MOD_PATH_NAME, MachinePulverizerRecipe.Serializer.ID), MachinePulverizerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(SpCo.MOD_PATH_NAME, MachinePulverizerRecipe.Type.ID), MachinePulverizerRecipe.Type.INSTANCE);
    }
}
