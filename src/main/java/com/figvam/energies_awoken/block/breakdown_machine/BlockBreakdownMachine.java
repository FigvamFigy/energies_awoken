package com.figvam.energies_awoken.block.breakdown_machine;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBreakdownMachine extends Block {

    private static BlockBreakdownMachine instance;

    private BlockBreakdownMachine(){
        super(Material.ROCK);
    }


    public static BlockBreakdownMachine getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachine();
        }
        return instance;
    }


}
