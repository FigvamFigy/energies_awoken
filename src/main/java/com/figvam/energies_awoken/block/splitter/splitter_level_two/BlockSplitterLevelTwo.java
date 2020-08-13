package com.figvam.energies_awoken.block.splitter.splitter_level_two;

import com.figvam.energies_awoken.block.splitter.splitter_level_one.BlockSplitterLevelOne;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSplitterLevelTwo extends Block {

    private static BlockSplitterLevelTwo instance = null;

    private BlockSplitterLevelTwo(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2f);

        setUnlocalizedName("splitter_level_two");
        setRegistryName("splitter_level_two");
    }


    public static BlockSplitterLevelTwo getInstance(){
        if(instance == null){
            instance = new BlockSplitterLevelTwo();
        }
        return instance;
    }

}
