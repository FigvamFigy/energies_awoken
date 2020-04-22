package com.figvam.energies_awoken.item.itemBlock.splitter;

import com.figvam.energies_awoken.block.splitter.BlockSplitter;
import net.minecraft.item.ItemBlock;

public class ItemBlockSplitter extends ItemBlock {

    private static BlockSplitter BLOCK = BlockSplitter.getInstance();
    private static ItemBlockSplitter instance = null;

    private ItemBlockSplitter(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());

    }


    public static ItemBlockSplitter getInstance(){
        if(instance == null){
            instance = new ItemBlockSplitter();
        }
        return instance;
    }
}
