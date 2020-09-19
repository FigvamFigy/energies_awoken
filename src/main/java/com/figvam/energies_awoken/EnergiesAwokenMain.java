package com.figvam.energies_awoken;


import com.figvam.energies_awoken.proxy.CommonProxy;
import com.figvam.energies_awoken.registries.ItemModList;
import com.figvam.energies_awoken.registries.RegistryEventHandler;
import com.figvam.energies_awoken.registries.TileEntityModList;
import com.figvam.energies_awoken.util.AcceptedItemsInBreakdown;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyStorage;
import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.ILifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergyStorage;
import com.google.common.eventbus.Subscribe;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ModDetailReference.MOD_ID, name = ModDetailReference.MOD_NAME, version = ModDetailReference.MOD_Version)
public class EnergiesAwokenMain {


    @Mod.Instance(ModDetailReference.MOD_ID)
    public static EnergiesAwokenMain instance;


    @SidedProxy(clientSide = ModDetailReference.CLIENT_PROXY_CLASS, serverSide = ModDetailReference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;




    @Subscribe
    public void onModConstruct(FMLConstructionEvent event){

        try
        {
            ClassLoader classLoader = Loader.instance().getModClassLoader();
            Side side = FMLCommonHandler.instance().getEffectiveSide();
            switch(side)
            {
                case CLIENT:
                    proxy = (CommonProxy) Class.forName(ModDetailReference.CLIENT_PROXY_CLASS, true, classLoader).newInstance();
                    break;
                case SERVER:
                    proxy = (CommonProxy) Class.forName(ModDetailReference.SERVER_PROXY_CLASS, true, classLoader).newInstance();
                    break;
            }
        }
        catch(IllegalAccessException | InstantiationException | ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }


    }


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);

        //CapabilityManager.INSTANCE.register(ILifeEnergy.class,new LifeEnergyStorage(), LifeEnergy::new);

        TileEntityModList tileEntityModList = new TileEntityModList();
        RegistryEventHandler.registerTileEntity();

        ItemCorrespondingCompoundEnergy itemCorrespondingCompoundEnergy = new ItemCorrespondingCompoundEnergy();
        ItemCorrespondingCompoundEnergy.fillHashMapFromAcceptedItems(AcceptedItemsInBreakdown.ACCEPTED_ITEMS,AcceptedItemsInBreakdown.ITEM_COMPOUND_ENERGY);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        proxy.setupClient();
//        CapabilityManager.INSTANCE.register(ILifeEnergy.class,new LifeEnergyStorage(), LifeEnergy::new);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }




}
