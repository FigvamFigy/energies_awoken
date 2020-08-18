package com.figvam.energies_awoken.block.extractor.extractor_level_one;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.TileEntityEssenceRecombinatorLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerExtractorLevelOne extends Container {


    public ContainerExtractorLevelOne(InventoryPlayer inventoryPlayer, TileEntityExtractorLevelOne tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
