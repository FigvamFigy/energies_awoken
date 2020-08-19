package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLightVial extends Item {

    private static ItemLightVial instance = null;

    private ItemLightVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("light_vial");
        setRegistryName("light_vial");
    }

    public static ItemLightVial getInstance(){
        if(instance == null){
            instance = new ItemLightVial();
        }

        return instance;
    }
}
