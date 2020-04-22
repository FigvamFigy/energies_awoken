package com.figvam.energies_awoken.item.itemBlock.geode;

import com.figvam.energies_awoken.block.block_geode.BlockBlueGeodeOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class ItemBlockBlueGeodeOre extends ItemBlock {

    private static BlockBlueGeodeOre BLOCK = BlockBlueGeodeOre.getInstance();

    private static ItemBlockBlueGeodeOre instance = null;

    private ItemBlockBlueGeodeOre(){
        super(BLOCK);

        setUnlocalizedName(BLOCK.getUnlocalizedName());
        setRegistryName(BLOCK.getRegistryName());

    }


    public static ItemBlockBlueGeodeOre getInstance(){
        if(instance == null){
            instance = new ItemBlockBlueGeodeOre();
        }
        return instance;
    }
}
