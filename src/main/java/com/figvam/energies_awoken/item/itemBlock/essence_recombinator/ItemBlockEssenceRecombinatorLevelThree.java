package com.figvam.energies_awoken.item.itemBlock.essence_recombinator;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_three.BlockEssenceRecombinatorLevelThree;
import net.minecraft.item.ItemBlock;

public class ItemBlockEssenceRecombinatorLevelThree extends ItemBlock {

    private static final BlockEssenceRecombinatorLevelThree BLOCK_ESSENCE_RECOMBINATOR_LEVEL_THREE = BlockEssenceRecombinatorLevelThree.getInstance();
    private static ItemBlockEssenceRecombinatorLevelThree instance;

    private ItemBlockEssenceRecombinatorLevelThree(){
        super(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_THREE);


        setUnlocalizedName(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_THREE.getUnlocalizedName());
        setRegistryName(BLOCK_ESSENCE_RECOMBINATOR_LEVEL_THREE.getRegistryName());

    }

    public static ItemBlockEssenceRecombinatorLevelThree getInstance(){
        if(instance == null){
            instance = new ItemBlockEssenceRecombinatorLevelThree();
        }
        return instance;
    }

}
