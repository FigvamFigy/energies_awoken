package com.figvam.energies_awoken.item.itemBlock.geode;

import com.figvam.energies_awoken.block.block_geode.BlockPurpleGeodeOre;
import net.minecraft.item.ItemBlock;

public class ItemBlockPurpleGeodeOre extends ItemBlock {

    private static BlockPurpleGeodeOre BLOCK = BlockPurpleGeodeOre.getInstance();
    private static ItemBlockPurpleGeodeOre instance = null;


    private ItemBlockPurpleGeodeOre(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());
    }

    public static ItemBlockPurpleGeodeOre getInstance(){
        if(instance == null){
            instance = new ItemBlockPurpleGeodeOre();
        }
        return instance;
    }

}
