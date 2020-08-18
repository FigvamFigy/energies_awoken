package com.figvam.energies_awoken.item.itemBlock.extractor;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import com.figvam.energies_awoken.item.itemBlock.essence_recombinator.ItemBlockEssenceRecombinatorLevelOne;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ItemBlockExtractorLevelOne extends ItemBlock {


    private static final BlockExtractorLevelOne BLOCK_EXTRACTOR_LEVEL_ONE = BlockExtractorLevelOne.getInstance();
    private static ItemBlockExtractorLevelOne instance;

    private ItemBlockExtractorLevelOne(){
        super(BLOCK_EXTRACTOR_LEVEL_ONE);


        setUnlocalizedName(BLOCK_EXTRACTOR_LEVEL_ONE.getUnlocalizedName());
        setRegistryName(BLOCK_EXTRACTOR_LEVEL_ONE.getRegistryName());

    }

    public static ItemBlockExtractorLevelOne getInstance(){
        if(instance == null){
            instance = new ItemBlockExtractorLevelOne();
        }
        return instance;
    }
}
