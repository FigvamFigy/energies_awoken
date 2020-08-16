package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.TileEntityBreakdownMachineLevelTwo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerBreakdownMachineLevelThree extends Container {


    public ContainerBreakdownMachineLevelThree(InventoryPlayer inventoryPlayer, TileEntityBreakdownMachineLevelThree tileEntity) {


    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
