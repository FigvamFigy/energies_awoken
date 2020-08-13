package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBreakdownMachineLevelThree extends Block {

    private static BlockBreakdownMachineLevelThree instance = null;

    private BlockBreakdownMachineLevelThree(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("breakdown_machine_level_three");
        setRegistryName("breakdown_machine_level_three");

    }

    public static BlockBreakdownMachineLevelThree getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachineLevelThree();
        }
        return instance;
    }

}
