package com.figvam.energies_awoken.common.item.backpack;

import com.figvam.energies_awoken.common.registries.Registry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

public class ContainerBackpack extends Container {

    private PlayerInventory playerInventory;

    //client, container type registration
    public ContainerBackpack(int id, PlayerInventory playerInventory) {
        this(id,playerInventory,null);

    }

    //server
    public ContainerBackpack(int id, PlayerInventory playerInventory, PacketBuffer packetBuffer ) {
        super(Registry.BACKPACK.get(), id);

        this.playerInventory = playerInventory;

        for(int k = 0; k < 3; ++k) {
            for(int i1 = 0; i1 < 9; ++i1) {
                this.addSlot(new Slot(playerInventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
            }
        }

        for(int l = 0; l < 9; ++l) {
            this.addSlot(new Slot(playerInventory, l, 8 + l * 18, 142));
        }

    }


    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }


}
