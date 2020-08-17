package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.TileEntityEssenceRecombinatorLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerEssenceRecombinatorLevelTwo extends Container {


    public ContainerEssenceRecombinatorLevelTwo(InventoryPlayer inventoryPlayer, TileEntityEssenceRecombinatorLevelTwo tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

}
