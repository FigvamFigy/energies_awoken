package com.figvam.energies_awoken.item.itemBlock.breakDownMachine;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.BlockBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import net.minecraft.item.ItemBlock;

public class ItemBlockBreakdownMachineLevelTwo extends ItemBlock {


    private static final BlockBreakdownMachineLevelTwo BLOCK_BREAKDOWN_MACHINE_LEVEL_TWO = BlockBreakdownMachineLevelTwo.getInstance();
    private static ItemBlockBreakdownMachineLevelTwo instance;

    private ItemBlockBreakdownMachineLevelTwo(){
        super(BLOCK_BREAKDOWN_MACHINE_LEVEL_TWO);


        setUnlocalizedName(BLOCK_BREAKDOWN_MACHINE_LEVEL_TWO.getUnlocalizedName());
        setRegistryName(BLOCK_BREAKDOWN_MACHINE_LEVEL_TWO.getRegistryName());

    }

    public static ItemBlockBreakdownMachineLevelTwo getInstance(){
        if(instance == null){
            instance = new ItemBlockBreakdownMachineLevelTwo();
        }
        return instance;
    }
}
