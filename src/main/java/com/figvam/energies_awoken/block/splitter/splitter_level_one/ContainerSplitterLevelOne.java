package com.figvam.energies_awoken.block.splitter.splitter_level_one;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two.TileEntityEssenceRecombinatorLevelTwo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerSplitterLevelOne extends Container {

    public ContainerSplitterLevelOne(InventoryPlayer inventoryPlayer, TileEntitySplitterLevelOne tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
