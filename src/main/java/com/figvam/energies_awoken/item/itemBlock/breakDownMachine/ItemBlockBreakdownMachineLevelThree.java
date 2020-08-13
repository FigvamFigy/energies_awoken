package com.figvam.energies_awoken.item.itemBlock.breakDownMachine;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.BlockBreakdownMachineLevelThree;
import net.minecraft.item.ItemBlock;

public class ItemBlockBreakdownMachineLevelThree extends ItemBlock {


    private static final BlockBreakdownMachineLevelThree BLOCK_BREAKDOWN_MACHINE_LEVEL_THREE = BlockBreakdownMachineLevelThree.getInstance();
    private static ItemBlockBreakdownMachineLevelThree instance;

    private ItemBlockBreakdownMachineLevelThree(){
        super(BLOCK_BREAKDOWN_MACHINE_LEVEL_THREE);


        setUnlocalizedName(BLOCK_BREAKDOWN_MACHINE_LEVEL_THREE.getUnlocalizedName());
        setRegistryName(BLOCK_BREAKDOWN_MACHINE_LEVEL_THREE.getRegistryName());

    }

    public static ItemBlockBreakdownMachineLevelThree getInstance(){
        if(instance == null){
            instance = new ItemBlockBreakdownMachineLevelThree();
        }
        return instance;
    }

}
