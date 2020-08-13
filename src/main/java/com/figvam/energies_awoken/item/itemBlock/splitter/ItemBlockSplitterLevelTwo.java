package com.figvam.energies_awoken.item.itemBlock.splitter;

import com.figvam.energies_awoken.block.splitter.splitter_level_one.BlockSplitterLevelOne;
import com.figvam.energies_awoken.block.splitter.splitter_level_two.BlockSplitterLevelTwo;
import net.minecraft.item.ItemBlock;

public class ItemBlockSplitterLevelTwo extends ItemBlock {


    private static BlockSplitterLevelTwo BLOCK = BlockSplitterLevelTwo.getInstance();
    private static ItemBlockSplitterLevelTwo instance = null;

    private ItemBlockSplitterLevelTwo(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());

    }


    public static ItemBlockSplitterLevelTwo getInstance(){
        if(instance == null){
            instance = new ItemBlockSplitterLevelTwo();
        }
        return instance;
    }



}
