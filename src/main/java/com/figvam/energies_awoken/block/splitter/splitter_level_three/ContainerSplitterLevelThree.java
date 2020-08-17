package com.figvam.energies_awoken.block.splitter.splitter_level_three;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerSplitterLevelThree extends Container {

    public ContainerSplitterLevelThree(InventoryPlayer inventoryPlayer, TileEntitySplitterLevelThree tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
