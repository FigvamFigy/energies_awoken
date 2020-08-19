package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInfernalVial extends Item {

    private static ItemInfernalVial instance = null;

    private ItemInfernalVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("infernal_vial");
        setRegistryName("infernal_vial");
    }

    public static ItemInfernalVial getInstance(){
        if(instance == null){
            instance = new ItemInfernalVial();
        }

        return instance;
    }
}
