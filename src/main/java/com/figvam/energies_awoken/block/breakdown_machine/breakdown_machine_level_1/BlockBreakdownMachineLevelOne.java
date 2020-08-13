package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBreakdownMachineLevelOne extends Block {

    private static BlockBreakdownMachineLevelOne instance = null;

    private BlockBreakdownMachineLevelOne(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("breakdown_machine_level_one");
        setRegistryName("breakdown_machine_level_one");

    }

    public static BlockBreakdownMachineLevelOne getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachineLevelOne();
        }
        return instance;
    }


}
