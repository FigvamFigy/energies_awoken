package com.figvam.energies_awoken.item.itemBlock.extractor;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_three.BlockExtractorLevelThree;
import net.minecraft.item.ItemBlock;

public class ItemBlockExtractorLevelThree extends ItemBlock {

    private static final BlockExtractorLevelThree BLOCK_EXTRACTOR_LEVEL_THREE = BlockExtractorLevelThree.getInstance();
    private static ItemBlockExtractorLevelThree instance;

    private ItemBlockExtractorLevelThree(){
        super(BLOCK_EXTRACTOR_LEVEL_THREE);


        setUnlocalizedName(BLOCK_EXTRACTOR_LEVEL_THREE.getUnlocalizedName());
        setRegistryName(BLOCK_EXTRACTOR_LEVEL_THREE.getRegistryName());

    }

    public static ItemBlockExtractorLevelThree getInstance(){
        if(instance == null){
            instance = new ItemBlockExtractorLevelThree();
        }
        return instance;
    }
}
