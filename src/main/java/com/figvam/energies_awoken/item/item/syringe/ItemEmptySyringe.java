package com.figvam.energies_awoken.item.item.syringe;

import com.figvam.energies_awoken.item.item.geode.ItemBlueGeode;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEmptySyringe extends Item {

    private static ItemEmptySyringe instance = null;

    private ItemEmptySyringe(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("empty_syringe");
        setRegistryName("empty_syringe");
    }

    public static ItemEmptySyringe getInstance(){
        if(instance == null){
            instance = new ItemEmptySyringe();
        }

        return instance;
    }
}
