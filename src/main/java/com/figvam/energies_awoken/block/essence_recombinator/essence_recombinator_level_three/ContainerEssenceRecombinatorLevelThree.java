package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_three;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.TileEntityEssenceRecombinatorLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerEssenceRecombinatorLevelThree extends Container {



    public ContainerEssenceRecombinatorLevelThree(InventoryPlayer inventoryPlayer, TileEntityEssenceRecombinatorLevelThree tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
