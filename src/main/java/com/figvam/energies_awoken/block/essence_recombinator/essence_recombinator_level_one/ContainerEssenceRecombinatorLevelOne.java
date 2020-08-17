package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.TileEntityBreakdownMachineLevelThree;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerEssenceRecombinatorLevelOne extends Container {


    public ContainerEssenceRecombinatorLevelOne(InventoryPlayer inventoryPlayer, TileEntityEssenceRecombinatorLevelOne tileEntity) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
