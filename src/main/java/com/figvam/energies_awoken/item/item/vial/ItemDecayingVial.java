package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDecayingVial extends Item {

    private static ItemDecayingVial instance = null;

    private ItemDecayingVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("decaying_vial");
        setRegistryName("decaying_vial");
    }

    public static ItemDecayingVial getInstance(){
        if(instance == null){
            instance = new ItemDecayingVial();
        }

        return instance;
    }
}
