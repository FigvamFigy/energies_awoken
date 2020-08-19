package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDemonicVial extends Item {

    private static ItemDemonicVial instance = null;

    private ItemDemonicVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("demonic_vial");
        setRegistryName("demonic_vial");
    }

    public static ItemDemonicVial getInstance(){
        if(instance == null){
            instance = new ItemDemonicVial();
        }

        return instance;
    }
}
