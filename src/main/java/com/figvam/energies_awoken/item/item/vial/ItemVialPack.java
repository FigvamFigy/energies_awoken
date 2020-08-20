package com.figvam.energies_awoken.item.item.vial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemVialPack extends Item {


    private static ItemVialPack instance = null;

    private ItemVialPack(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("vial_pack");
        setRegistryName("vial_pack");
    }

    public static ItemVialPack getInstance(){
        if(instance == null){
            instance = new ItemVialPack();
        }

        return instance;
    }
}
