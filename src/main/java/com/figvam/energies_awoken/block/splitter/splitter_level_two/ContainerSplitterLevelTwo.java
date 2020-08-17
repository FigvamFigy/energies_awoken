package com.figvam.energies_awoken.block.splitter.splitter_level_two;

import com.figvam.energies_awoken.block.splitter.splitter_level_one.TileEntitySplitterLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerSplitterLevelTwo extends Container {

    public ContainerSplitterLevelTwo(InventoryPlayer inventoryPlayer, TileEntitySplitterLevelTwo tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
