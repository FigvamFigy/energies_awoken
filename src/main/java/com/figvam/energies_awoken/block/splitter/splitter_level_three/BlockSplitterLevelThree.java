package com.figvam.energies_awoken.block.splitter.splitter_level_three;

import com.figvam.energies_awoken.block.splitter.splitter_level_two.BlockSplitterLevelTwo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSplitterLevelThree extends Block {

    private static BlockSplitterLevelThree instance = null;

    private BlockSplitterLevelThree(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2f);

        setUnlocalizedName("splitter_level_three");
        setRegistryName("splitter_level_three");
    }


    public static BlockSplitterLevelThree getInstance(){
        if(instance == null){
            instance = new BlockSplitterLevelThree();
        }
        return instance;
    }

}
