package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one;

import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEssenceRecombinatorLevelOne extends Block {

    private static BlockEssenceRecombinatorLevelOne instance;

    private BlockEssenceRecombinatorLevelOne(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1f);

        setUnlocalizedName("essence_recombinator_level_one");
        setRegistryName("essence_recombinator_level_one");

    }


    public static BlockEssenceRecombinatorLevelOne getInstance(){
        if(instance == null){
            instance = new BlockEssenceRecombinatorLevelOne();
        }
        return instance;
    }

}
