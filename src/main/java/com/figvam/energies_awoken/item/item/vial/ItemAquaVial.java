package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAquaVial extends Item {

    private static ItemAquaVial instance = null;

    private ItemAquaVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("aqua_vial");
        setRegistryName("aqua_vial");
    }

    public static ItemAquaVial getInstance(){
        if(instance == null){
            instance = new ItemAquaVial();
        }

        return instance;
    }
}
