package com.figvam.energies_awoken.block.breakdown_machine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerBreakdownMachine extends Container {

    private final int SLOT_INPUT = 0;
    private final int SLOT_BUCKET = 1;

    public ContainerBreakdownMachine(InventoryPlayer inventoryPlayer, TileEntityBreakdownMachine tileEntityBreakdownMachine){

        IItemHandler handler = tileEntityBreakdownMachine.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,null);

        createTileInventorySlots(handler);
        createRegularInventorySlots(inventoryPlayer);
    }


    private void createTileInventorySlots(IItemHandler handler){

        this.addSlotToContainer(new SlotItemHandler(handler,SLOT_INPUT,12,13));
        this.addSlotToContainer(new SlotItemHandler(handler,SLOT_BUCKET,12,55));

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
