package com.figvam.energies_awoken.util;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.network.PacketBuffer;

public class CustomContainerType <T extends Container> extends net.minecraftforge.registries.ForgeRegistryEntry<ContainerType<?>> implements net.minecraftforge.common.extensions.IForgeContainerType<T>{

    //ContainerTypepublic static final ContainerType<WorkbenchContainer> CRAFTING = register("crafting", WorkbenchContainer::new);


    public CustomContainerType() {
    }

    @Override
    public T create(int windowId, PlayerInventory playerInv, PacketBuffer extraData) {
        return null;
    }


}
