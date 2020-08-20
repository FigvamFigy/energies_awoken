package com.figvam.energies_awoken.item.item.life_energy_backpack;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLifeEnergyBackpackLevelTwo extends Item {

    private static ItemLifeEnergyBackpackLevelTwo instance = null;

    private ItemLifeEnergyBackpackLevelTwo(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("life_energy_backpack_level_two");
        setRegistryName("life_energy_backpack_level_two");
    }

    public static ItemLifeEnergyBackpackLevelTwo getInstance(){
        if(instance == null){
            instance = new ItemLifeEnergyBackpackLevelTwo();
        }

        return instance;
    }
}
