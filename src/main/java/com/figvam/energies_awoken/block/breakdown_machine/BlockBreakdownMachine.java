package com.figvam.energies_awoken.block.breakdown_machine;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBreakdownMachine extends Block {

    private static BlockBreakdownMachine instance;

    private BlockBreakdownMachine(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setUnlocalizedName("breakdown_machine");
        setRegistryName("breakdown_machine");

    }


    public static BlockBreakdownMachine getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachine();
        }
        return instance;
    }


}
