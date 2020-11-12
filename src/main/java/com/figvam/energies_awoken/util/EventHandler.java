package com.figvam.energies_awoken.util;

import com.figvam.energies_awoken.ModDetails;
import com.figvam.energies_awoken.common.item.backpack.ItemLifeEnergyBackpack;
import com.figvam.energies_awoken.common.registries.Registry;
import com.figvam.energies_awoken.util.capability.life_energy.LifeEnergyProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {


    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<ItemStack> event) {
        if(event.getObject().getItem() instanceof ItemLifeEnergyBackpack){
            event.addCapability(LifeEnergyProvider.RESOURCE_LOCATION_LIFE_ENERGY_CAP,new LifeEnergyProvider());
        }

    }

}
