package com.figvam.energies_awoken.block.extractor.extractor_level_two;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BLockExtractorLevelTwo extends Block {

    private static BLockExtractorLevelTwo instance = null;

    private BLockExtractorLevelTwo(){
        super(Material.IRON);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("extractor_level_two");
        setRegistryName("extractor_level_two");

    }

    public static BLockExtractorLevelTwo getInstance(){
        if(instance == null){
            instance = new BLockExtractorLevelTwo();
        }
        return instance;
    }



}
