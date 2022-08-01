package com.spco.spco.util;

import com.spco.spco.item.SpCoItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class SpCoTrades {
    public static void register() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 6), new ItemStack(SpCoItems.SHENGSHENG_MEAT_SEED, 3), 6, 2, 0.02F));
        });
    }
}
