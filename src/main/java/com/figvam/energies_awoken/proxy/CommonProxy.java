package com.figvam.energies_awoken.proxy;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.events.ForgeEventHandler;
import com.figvam.energies_awoken.util.CapabilityHandler;
import com.figvam.energies_awoken.util.GuiHandler;

import com.figvam.energies_awoken.util.compound_energy.CompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyStorage;
import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.ILifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergyStorage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {


    public void setupClient() {}


    public void preInit(FMLPreInitializationEvent event){
        CapabilityManager.INSTANCE.register(ICompoundEnergy.class,new CompoundEnergyStorage(),CompoundEnergy::new);
        CapabilityManager.INSTANCE.register(ILifeEnergy.class,new LifeEnergyStorage(), LifeEnergy::new);
        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());

        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }


    public void init(FMLInitializationEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(EnergiesAwokenMain.instance,new GuiHandler());

        //CapabilityManager.INSTANCE.register(ICompoundEnergy.class,new CompoundEnergyStorage(),CompoundEnergy::new);
//        CapabilityManager.INSTANCE.register(ILifeEnergy.class,new LifeEnergyStorage(), LifeEnergy::new);

       // MinecraftForge.EVENT_BUS.register(new CapabilityHandler());

        //CapabilityManager.INSTANCE.register(ICompoundEnergy.class,new CompoundEnergyStorage(),CompoundEnergy.class);
    }

    public void postInit(FMLPostInitializationEvent event){

    }

}


