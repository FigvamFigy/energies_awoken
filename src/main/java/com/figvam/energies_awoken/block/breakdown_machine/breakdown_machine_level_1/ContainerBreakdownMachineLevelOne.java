package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1;

import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerBreakdownMachineLevelOne extends Container {


    public ContainerBreakdownMachineLevelOne(InventoryPlayer inventoryPlayer, TileEntityBreakdownMachineLevelOne tileEntity) {

    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
