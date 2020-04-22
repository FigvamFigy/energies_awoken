package com.figvam.energies_awoken.item.item.solid_base_life_energy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGroundingLifeEnergy extends Item {


    private static ItemGroundingLifeEnergy instance;

    private ItemGroundingLifeEnergy(){
        super();
        setCreativeTab(CreativeTabs.MATERIALS);


        setUnlocalizedName("grounding_life_energy");
        setRegistryName("grounding_life_energy");
    }

    public static ItemGroundingLifeEnergy getInstance(){
        if(instance == null){
            instance = new ItemGroundingLifeEnergy();
        }
        return instance;
    }

}
