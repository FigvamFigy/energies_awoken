package com.figvam.energies_awoken.util;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one.ItemLifeEnergyBackpackLevelOne;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyProvider;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergyProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.Sys;

public class CapabilityHandler {

    public static final ResourceLocation COMPOUND_CAP = new ResourceLocation(ModDetailReference.MOD_ID,"compound_energy");
    public static final ResourceLocation LIFE_CAP = new ResourceLocation(ModDetailReference.MOD_ID,"life_energy");

    @SubscribeEvent
    public void attachCapabilityTileEntity(AttachCapabilitiesEvent<TileEntity> event){
        if(event.getObject() instanceof TileEntityBreakdownMachineLevelOne){
            event.addCapability(LIFE_CAP,new LifeEnergyProvider());
        }

//
//        if(!(event.getObject() instanceof TileEntityBreakdownMachine)) return;
//
//        event.addCapability(COMPOUND_CAP, new CompoundEnergyProvider());

    }


    @SubscribeEvent
    public void attachCapabilityItem(AttachCapabilitiesEvent<ItemStack> event){
//        if(event.getObject().getItem() instanceof ItemLifeEnergyBackpackLevelOne){
//            event.addCapability(LIFE_CAP, new LifeEnergyProvider());
//        }

//        if(!(event.getObject().getItem() instanceof ItemLifeEnergyBackpackLevelOne)) return;
//
//
//        event.addCapability(LIFE_CAP, new LifeEnergyProvider());
    }
}
