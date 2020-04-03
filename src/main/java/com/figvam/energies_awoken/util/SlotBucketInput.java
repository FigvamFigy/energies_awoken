package com.figvam.energies_awoken.util;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class SlotBucketInput extends SlotItemHandler {


    public SlotBucketInput(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }


    @Override
    public boolean isItemValid(@Nonnull ItemStack stack) {
        if(stack.getItem().equals(Items.BUCKET)){
            return true;
        }

        return false;
        //return super.isItemValid(stack);
    }
}
