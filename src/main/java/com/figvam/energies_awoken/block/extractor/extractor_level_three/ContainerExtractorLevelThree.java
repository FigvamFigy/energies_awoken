package com.figvam.energies_awoken.block.extractor.extractor_level_three;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerExtractorLevelThree extends Container {

    public ContainerExtractorLevelThree(InventoryPlayer inventoryPlayer, TileEntityExtractorLevelThree tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
