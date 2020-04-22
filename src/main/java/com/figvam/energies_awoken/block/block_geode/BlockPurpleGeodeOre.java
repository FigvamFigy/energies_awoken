package com.figvam.energies_awoken.block.block_geode;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockPurpleGeodeOre extends Block {


    private static BlockPurpleGeodeOre instance = null;

    private BlockPurpleGeodeOre(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setUnlocalizedName("purple_geode_ore");
        setRegistryName("purple_geode_ore");

    }


    public static BlockPurpleGeodeOre getInstance(){
        if(instance == null){
            instance = new BlockPurpleGeodeOre();
        }
        return instance;
    }
}
