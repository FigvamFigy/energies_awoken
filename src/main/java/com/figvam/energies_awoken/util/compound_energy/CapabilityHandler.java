package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler {

    public static final ResourceLocation COMPOUND_CAP = new ResourceLocation(ModDetailReference.MOD_ID,"compound_energy");


    @SubscribeEvent
    public void attaachCapability(AttachCapabilitiesEvent<TileEntity> event){
        if(!(event.getObject() instanceof TileEntityBreakdownMachine)) return;

        event.addCapability(COMPOUND_CAP, new CompoundEnergyProvider());

    }
}
