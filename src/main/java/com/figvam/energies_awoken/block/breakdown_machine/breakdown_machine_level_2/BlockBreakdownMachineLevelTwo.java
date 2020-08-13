package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.BlockBreakdownMachineLevelOne;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBreakdownMachineLevelTwo extends Block {


    private static BlockBreakdownMachineLevelTwo instance = null;

    private BlockBreakdownMachineLevelTwo(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("breakdown_machine_level_two");
        setRegistryName("breakdown_machine_level_two");

    }

    public static BlockBreakdownMachineLevelTwo getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachineLevelTwo();
        }
        return instance;
    }


}
