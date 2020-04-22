package com.figvam.energies_awoken.block.block_geode;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlueGeodeOre extends Block {


    private static BlockBlueGeodeOre instance = null;

    private BlockBlueGeodeOre(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("blue_geode_ore");
        setRegistryName("blue_geode_ore");

    }


    public static BlockBlueGeodeOre getInstance(){
        if(instance == null){
            instance = new BlockBlueGeodeOre();
        }
        return instance;
    }

}
