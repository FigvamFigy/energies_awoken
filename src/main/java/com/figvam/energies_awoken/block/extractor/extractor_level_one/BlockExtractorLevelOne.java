package com.figvam.energies_awoken.block.extractor.extractor_level_one;

import com.figvam.energies_awoken.block.block_geode.BlockBlueGeodeOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockExtractorLevelOne extends Block {


    private static BlockExtractorLevelOne instance = null;

    private BlockExtractorLevelOne(){
        super(Material.IRON);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("extractor_level_one");
        setRegistryName("extractor_level_one");

    }

    public static BlockExtractorLevelOne getInstance(){
        if(instance == null){
            instance = new BlockExtractorLevelOne();
        }
        return instance;
    }


}
