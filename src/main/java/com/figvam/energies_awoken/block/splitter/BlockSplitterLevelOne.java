package com.figvam.energies_awoken.block.splitter;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSplitterLevelOne extends Block {


    private static BlockSplitterLevelOne instance = null;

    private BlockSplitterLevelOne(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2f);

        setUnlocalizedName("splitter_level_one");
        setRegistryName("splitter_level_one");
    }


    public static BlockSplitterLevelOne getInstance(){
        if(instance == null){
            instance = new BlockSplitterLevelOne();
        }
        return instance;
    }

}
