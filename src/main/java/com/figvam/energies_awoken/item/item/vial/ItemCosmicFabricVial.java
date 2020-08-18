package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCosmicFabricVial extends Item {

    private static ItemCosmicFabricVial instance = null;

    private ItemCosmicFabricVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("cosmic_fabric_vial");
        setRegistryName("cosmic_fabric_vial");
    }

    public static ItemCosmicFabricVial getInstance(){
        if(instance == null){
            instance = new ItemCosmicFabricVial();
        }

        return instance;
    }
}
