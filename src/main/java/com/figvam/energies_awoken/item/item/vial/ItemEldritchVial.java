package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEldritchVial extends Item {

    private static ItemEldritchVial instance = null;

    private ItemEldritchVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("eldritch_vial");
        setRegistryName("eldritch_vial");
    }

    public static ItemEldritchVial getInstance(){
        if(instance == null){
            instance = new ItemEldritchVial();
        }

        return instance;
    }
}
