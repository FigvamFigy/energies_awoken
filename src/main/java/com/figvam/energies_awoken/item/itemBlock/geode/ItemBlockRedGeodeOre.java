package com.figvam.energies_awoken.item.itemBlock.geode;

import com.figvam.energies_awoken.block.block_geode.BlockRedGeodeOre;
import net.minecraft.item.ItemBlock;

public class ItemBlockRedGeodeOre extends ItemBlock {

    private static BlockRedGeodeOre BLOCK = BlockRedGeodeOre.getInstance();
    private static ItemBlockRedGeodeOre instance = null;


    private ItemBlockRedGeodeOre(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());
    }


    public static ItemBlockRedGeodeOre getInstance(){
        if(instance == null){
            instance = new ItemBlockRedGeodeOre();
        }
        return instance;
    }
}
