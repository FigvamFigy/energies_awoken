package com.figvam.energies_awoken.block.splitter;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSplitter extends Block {


    private static BlockSplitter instance = null;

    private BlockSplitter(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2f);

        setUnlocalizedName("splitter");
        setRegistryName("splitter");
    }


    public static BlockSplitter getInstance(){
        if(instance == null){
            instance = new BlockSplitter();
        }
        return instance;
    }

}
