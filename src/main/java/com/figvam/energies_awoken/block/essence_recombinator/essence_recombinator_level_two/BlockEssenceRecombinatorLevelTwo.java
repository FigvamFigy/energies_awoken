package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEssenceRecombinatorLevelTwo extends Block {

    private static BlockEssenceRecombinatorLevelTwo instance;

    private BlockEssenceRecombinatorLevelTwo(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1f);

        setUnlocalizedName("essence_recombinator_level_two");
        setRegistryName("essence_recombinator_level_two");

    }


    public static BlockEssenceRecombinatorLevelTwo getInstance(){
        if(instance == null){
            instance = new BlockEssenceRecombinatorLevelTwo();
        }
        return instance;
    }
}
