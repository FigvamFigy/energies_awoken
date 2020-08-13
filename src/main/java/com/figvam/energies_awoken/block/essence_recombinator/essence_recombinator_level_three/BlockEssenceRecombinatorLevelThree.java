package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_three;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEssenceRecombinatorLevelThree extends Block {

    private static BlockEssenceRecombinatorLevelThree instance;

    private BlockEssenceRecombinatorLevelThree(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1f);

        setUnlocalizedName("essence_recombinator_level_three");
        setRegistryName("essence_recombinator_level_three");

    }


    public static BlockEssenceRecombinatorLevelThree getInstance(){
        if(instance == null){
            instance = new BlockEssenceRecombinatorLevelThree();
        }
        return instance;
    }

}
