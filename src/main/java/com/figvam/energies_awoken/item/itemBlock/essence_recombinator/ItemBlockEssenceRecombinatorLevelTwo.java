package com.figvam.energies_awoken.item.itemBlock.essence_recombinator;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two.BlockEssenceRecombinatorLevelTwo;
import net.minecraft.item.ItemBlock;

public class ItemBlockEssenceRecombinatorLevelTwo extends ItemBlock {


    private static final BlockEssenceRecombinatorLevelTwo BLOCK_ESSENCE_RECOMBINATOR_LEVEL_TWO = BlockEssenceRecombinatorLevelTwo.getInstance();
    private static ItemBlockEssenceRecombinatorLevelTwo instance;

    private ItemBlockEssenceRecombinatorLevelTwo(){
        super(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_TWO);


        setUnlocalizedName(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_TWO.getUnlocalizedName());
        setRegistryName(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_TWO.getRegistryName());

    }

    public static ItemBlockEssenceRecombinatorLevelTwo getInstance(){
        if(instance == null){
            instance = new ItemBlockEssenceRecombinatorLevelTwo();
        }
        return instance;
    }
}
