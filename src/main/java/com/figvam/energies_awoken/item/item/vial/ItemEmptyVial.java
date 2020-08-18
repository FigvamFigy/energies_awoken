package com.figvam.energies_awoken.item.item.vial;

import com.figvam.energies_awoken.item.item.syringe.ItemEmptySyringe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEmptyVial extends Item {

    private static ItemEmptyVial instance = null;

    private ItemEmptyVial(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("empty_vial");
        setRegistryName("empty_vial");
    }

    public static ItemEmptyVial getInstance(){
        if(instance == null){
            instance = new ItemEmptyVial();
        }

        return instance;
    }
}
