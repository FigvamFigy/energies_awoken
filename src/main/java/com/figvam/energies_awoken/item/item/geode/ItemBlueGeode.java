package com.figvam.energies_awoken.item.item.geode;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlueGeode extends Item {


    private static ItemBlueGeode instance = null;

    private ItemBlueGeode(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);


        setUnlocalizedName("blue_geode");
        setRegistryName("blue_geode");

    }

    public static ItemBlueGeode getInstance(){
        if(instance == null){
            instance = new ItemBlueGeode();
        }

        return instance;
    }
}
