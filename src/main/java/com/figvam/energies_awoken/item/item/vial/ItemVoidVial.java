package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemVoidVial extends Item {

    private static ItemVoidVial instance = null;

    private ItemVoidVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("void_vial");
        setRegistryName("void_vial");
    }

    public static ItemVoidVial getInstance(){
        if(instance == null){
            instance = new ItemVoidVial();
        }

        return instance;
    }
}
