package com.figvam.energies_awoken.item.itemBlock.breakDownMachine;

import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import net.minecraft.item.ItemBlock;

public class ItemBlockBreadownMachine extends ItemBlock {


    private static final BlockBreakdownMachine BLOCK_BREAKDOWN_MACHINE = BlockBreakdownMachine.getInstance();
    private static ItemBlockBreadownMachine instance;

    private ItemBlockBreadownMachine(){
        super(BLOCK_BREAKDOWN_MACHINE);


        setUnlocalizedName(BLOCK_BREAKDOWN_MACHINE.getUnlocalizedName());
        setRegistryName(BLOCK_BREAKDOWN_MACHINE.getRegistryName());

    }

    public static ItemBlockBreadownMachine getInstance(){
        if(instance == null){
            instance = new ItemBlockBreadownMachine();
        }
        return instance;
    }


}
