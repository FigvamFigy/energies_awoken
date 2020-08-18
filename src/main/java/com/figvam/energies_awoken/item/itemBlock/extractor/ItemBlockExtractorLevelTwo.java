package com.figvam.energies_awoken.item.itemBlock.extractor;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_two.BLockExtractorLevelTwo;
import net.minecraft.item.ItemBlock;

public class ItemBlockExtractorLevelTwo extends ItemBlock {

    private static final BLockExtractorLevelTwo BLOCK_EXTRACTOR_LEVEL_TWO = BLockExtractorLevelTwo.getInstance();
    private static ItemBlockExtractorLevelTwo instance;

    private ItemBlockExtractorLevelTwo(){
        super(BLOCK_EXTRACTOR_LEVEL_TWO);


        setUnlocalizedName(BLOCK_EXTRACTOR_LEVEL_TWO.getUnlocalizedName());
        setRegistryName(BLOCK_EXTRACTOR_LEVEL_TWO.getRegistryName());

    }

    public static ItemBlockExtractorLevelTwo getInstance(){
        if(instance == null){
            instance = new ItemBlockExtractorLevelTwo();
        }
        return instance;
    }


}
