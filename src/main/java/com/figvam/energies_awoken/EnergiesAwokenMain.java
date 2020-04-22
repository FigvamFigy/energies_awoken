package com.figvam.energies_awoken;


import com.figvam.energies_awoken.proxy.CommonProxy;
import com.figvam.energies_awoken.registries.RegistryEventHandler;
import com.figvam.energies_awoken.registries.TileEntityModList;
import com.figvam.energies_awoken.util.AcceptedItemsInBreakdown;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyStorage;
import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModDetailReference.MOD_ID, name = ModDetailReference.MOD_NAME, version = ModDetailReference.MOD_Version)
public class EnergiesAwokenMain {


    @Mod.Instance(ModDetailReference.MOD_ID)
    public static EnergiesAwokenMain instance;


    @SidedProxy(clientSide = ModDetailReference.CLIENT_PROXY_CLASS, serverSide = ModDetailReference.SERVER_PROXY_CLASS)
    public static CommonProxy commonProxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        TileEntityModList tileEntityModList = new TileEntityModList();
        RegistryEventHandler.registerTileEntity();
        ItemCorrespondingCompoundEnergy itemCorrespondingCompoundEnergy = new ItemCorrespondingCompoundEnergy();

        ItemCorrespondingCompoundEnergy.fillHashMapFromAcceptedItems(AcceptedItemsInBreakdown.ACCEPTED_ITEMS,AcceptedItemsInBreakdown.ITEM_COMPOUND_ENERGY);

        //CapabilityManager.INSTANCE.register(ICompoundEnergy.class, new CompoundEnergyStorage(), CompoundEnergy::new);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        commonProxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }




}
