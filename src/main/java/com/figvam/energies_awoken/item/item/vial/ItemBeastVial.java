package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBeastVial extends Item {
    private static ItemBeastVial instance = null;

    private ItemBeastVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("beast_vial");
        setRegistryName("beast_vial");
    }

    public static ItemBeastVial getInstance(){
        if(instance == null){
            instance = new ItemBeastVial();
        }

        return instance;
    }
}
