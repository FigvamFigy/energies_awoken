package com.figvam.energies_awoken.item.item.life_energy_backpack;

import com.figvam.energies_awoken.item.item.vial.ItemAquaVial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLifeEnergyBackpackLevelOne extends Item {


    private static ItemLifeEnergyBackpackLevelOne instance = null;

    private ItemLifeEnergyBackpackLevelOne(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("life_energy_backpack_level_one");
        setRegistryName("life_energy_backpack_level_one");
    }

    public static ItemLifeEnergyBackpackLevelOne getInstance(){
        if(instance == null){
            instance = new ItemLifeEnergyBackpackLevelOne();
        }

        return instance;
    }
}
