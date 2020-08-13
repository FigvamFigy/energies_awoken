package com.figvam.energies_awoken.item.itemBlock.essence_recombinator;

import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreadownMachine;
import net.minecraft.item.ItemBlock;

public class ItemBlockEssenceRecombinatorLevelOne extends ItemBlock {

    private static final BlockEssenceRecombinatorLevelOne BLOCK_ESSENCE_RECOMBINATOR_LEVEL_ONE = BlockEssenceRecombinatorLevelOne.getInstance();
    private static ItemBlockEssenceRecombinatorLevelOne instance;

    private ItemBlockEssenceRecombinatorLevelOne(){
        super(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_ONE);


        setUnlocalizedName(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_ONE.getUnlocalizedName());
        setRegistryName(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_ONE.getRegistryName());

    }

    public static ItemBlockEssenceRecombinatorLevelOne getInstance(){
        if(instance == null){
            instance = new ItemBlockEssenceRecombinatorLevelOne();
        }
        return instance;
    }

}
