package com.figvam.energies_awoken.item.itemBlock.splitter;

import com.figvam.energies_awoken.block.splitter.BlockSplitterLevelOne;
import net.minecraft.item.ItemBlock;

public class ItemBlockSplitterLevelOne extends ItemBlock {

    private static BlockSplitterLevelOne BLOCK = BlockSplitterLevelOne.getInstance();
    private static ItemBlockSplitterLevelOne instance = null;

    private ItemBlockSplitterLevelOne(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());

    }


    public static ItemBlockSplitterLevelOne getInstance(){
        if(instance == null){
            instance = new ItemBlockSplitterLevelOne();
        }
        return instance;
    }
}
