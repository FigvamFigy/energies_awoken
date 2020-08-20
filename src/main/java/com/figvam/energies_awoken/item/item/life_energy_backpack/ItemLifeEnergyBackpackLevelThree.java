package com.figvam.energies_awoken.item.item.life_energy_backpack;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLifeEnergyBackpackLevelThree extends Item {


    private static ItemLifeEnergyBackpackLevelThree instance = null;

    private ItemLifeEnergyBackpackLevelThree(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("life_energy_backpack_level_three");
        setRegistryName("life_energy_backpack_level_three");
    }

    public static ItemLifeEnergyBackpackLevelThree getInstance(){
        if(instance == null){
            instance = new ItemLifeEnergyBackpackLevelThree();
        }

        return instance;
    }
}
