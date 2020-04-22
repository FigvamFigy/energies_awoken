package com.figvam.energies_awoken.item.item.geode;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPurpleGeode extends Item {

    private static ItemPurpleGeode instance = null;

    private ItemPurpleGeode(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);


        setUnlocalizedName("purple_geode");
        setRegistryName("purple_geode");

    }

    public static ItemPurpleGeode getInstance(){
        if(instance == null){
            instance = new ItemPurpleGeode();
        }

        return instance;
    }

}
