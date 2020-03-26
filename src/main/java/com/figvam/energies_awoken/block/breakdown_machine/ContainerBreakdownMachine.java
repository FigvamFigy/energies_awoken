package com.figvam.energies_awoken.block.breakdown_machine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerBreakdownMachine extends Container {


    public ContainerBreakdownMachine(InventoryPlayer inventoryPlayer, TileEntityBreakdownMachine tileEntityBreakdownMachine){



        createRegularInventorySlots(inventoryPlayer);
    }

    private void createRegularInventorySlots(InventoryPlayer playerInventory){
        //Regular inventory
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }


        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));

        }
    }




    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
