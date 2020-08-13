package com.figvam.energies_awoken.item.itemBlock.breakDownMachine;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.BlockBreakdownMachineLevelOne;
import net.minecraft.item.ItemBlock;

public class ItemBlockBreakdownMachineLevelOne extends ItemBlock {


    private static final BlockBreakdownMachineLevelOne BLOCK_BREAKDOWN_MACHINE_LEVEL_ONE = BlockBreakdownMachineLevelOne.getInstance();
    private static ItemBlockBreakdownMachineLevelOne instance;

    private ItemBlockBreakdownMachineLevelOne(){
        super(BLOCK_BREAKDOWN_MACHINE_LEVEL_ONE);


        setUnlocalizedName(BLOCK_BREAKDOWN_MACHINE_LEVEL_ONE.getUnlocalizedName());
        setRegistryName(BLOCK_BREAKDOWN_MACHINE_LEVEL_ONE.getRegistryName());

    }

    public static ItemBlockBreakdownMachineLevelOne getInstance(){
        if(instance == null){
            instance = new ItemBlockBreakdownMachineLevelOne();
        }
        return instance;
    }

}
