package com.spco.spco.block.crop;

import com.spco.spco.item.SpCoItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class ShengshengMeatCrop extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 3);
    public ShengshengMeatCrop(Settings settings) {super(settings);}
    @Override
    protected ItemConvertible getSeedsItem() {return SpCoItems.SHENGSHENG_MEAT_SEED;}
    @Override
    public int getMaxAge() {return 3;}
    @Override
    public IntProperty getAgeProperty() {return AGE;}
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {builder.add(AGE);}
}
