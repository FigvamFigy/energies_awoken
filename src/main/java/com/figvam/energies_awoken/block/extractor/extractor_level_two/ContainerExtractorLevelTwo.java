package com.figvam.energies_awoken.block.extractor.extractor_level_two;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerExtractorLevelTwo extends Container {

    public ContainerExtractorLevelTwo(InventoryPlayer inventoryPlayer, TileEntityExtractorLevelTwo tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

}
