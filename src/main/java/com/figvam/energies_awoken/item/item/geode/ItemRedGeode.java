package com.figvam.energies_awoken.item.item.geode;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRedGeode extends Item {

    private static ItemRedGeode instance = null;

    private ItemRedGeode(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);


        setUnlocalizedName("red_geode");
        setRegistryName("red_geode");

    }

    public static ItemRedGeode getInstance(){
        if(instance == null){
            instance = new ItemRedGeode();
        }

        return instance;
    }
}
