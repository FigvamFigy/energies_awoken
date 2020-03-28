package com.figvam.energies_awoken.proxy;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.util.GuiHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {



    public void preInit(FMLPreInitializationEvent event){
    }


    public void init(FMLInitializationEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(EnergiesAwokenMain.instance,new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent event){

    }

}


