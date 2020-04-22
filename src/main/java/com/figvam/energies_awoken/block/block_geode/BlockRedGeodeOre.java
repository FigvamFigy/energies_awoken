package com.figvam.energies_awoken.block.block_geode;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRedGeodeOre extends Block {


    private static BlockRedGeodeOre instance = null;

    private BlockRedGeodeOre(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setUnlocalizedName("red_geode_ore");
        setRegistryName("red_geode_ore");
    }

    public static BlockRedGeodeOre getInstance(){
        if(instance == null){
            instance = new BlockRedGeodeOre();
        }
        return instance;
    }
}
