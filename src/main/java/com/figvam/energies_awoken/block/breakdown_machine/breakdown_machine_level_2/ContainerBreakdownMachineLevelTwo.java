package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerBreakdownMachineLevelTwo extends Container {


    public ContainerBreakdownMachineLevelTwo(InventoryPlayer inventoryPlayer, TileEntityBreakdownMachineLevelTwo tileEntity) {

    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
