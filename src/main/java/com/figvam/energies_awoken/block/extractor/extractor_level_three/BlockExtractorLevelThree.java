package com.figvam.energies_awoken.block.extractor.extractor_level_three;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockExtractorLevelThree extends Block {

    private static BlockExtractorLevelThree instance = null;

    private BlockExtractorLevelThree(){
        super(Material.IRON);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("extractor_level_three");
        setRegistryName("extractor_level_three");

    }

    public static BlockExtractorLevelThree getInstance(){
        if(instance == null){
            instance = new BlockExtractorLevelThree();
        }
        return instance;
    }
}
