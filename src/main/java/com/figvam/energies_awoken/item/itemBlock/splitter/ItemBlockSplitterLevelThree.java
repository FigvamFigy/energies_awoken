package com.figvam.energies_awoken.item.itemBlock.splitter;

import com.figvam.energies_awoken.block.splitter.splitter_level_one.BlockSplitterLevelOne;
import com.figvam.energies_awoken.block.splitter.splitter_level_three.BlockSplitterLevelThree;
import net.minecraft.item.ItemBlock;

public class ItemBlockSplitterLevelThree extends ItemBlock {

    private static BlockSplitterLevelThree BLOCK = BlockSplitterLevelThree.getInstance();
    private static ItemBlockSplitterLevelThree instance = null;

    private ItemBlockSplitterLevelThree(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());

    }


    public static ItemBlockSplitterLevelThree getInstance(){
        if(instance == null){
            instance = new ItemBlockSplitterLevelThree();
        }
        return instance;
    }

}
