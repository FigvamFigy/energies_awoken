package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.BlockBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.TileEntityBreakdownMachineLevelTwo;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;

public class TileEntityModList {

    public static ArrayList<Class<? extends TileEntity>> TILE_ENTITIES;
    public static ArrayList<Block> BLOCKS;

    public TileEntityModList(){
        TILE_ENTITIES = new ArrayList<>();
        BLOCKS = new ArrayList<>();
        fillTileEntities();
        fillBlocks();

    }

    private static void fillTileEntities(){
        //TILE_ENTITIES.add(TileEntityBreakdownMachine.class);
        TILE_ENTITIES.add(TileEntityBreakdownMachineLevelOne.class);
        TILE_ENTITIES.add(TileEntityBreakdownMachineLevelTwo.class);

    }

    private static void fillBlocks(){
        //BLOCKS.add(BlockBreakdownMachine.getInstance());
        BLOCKS.add(BlockBreakdownMachineLevelOne.getInstance());
        BLOCKS.add(BlockBreakdownMachineLevelTwo.getInstance());
    }





}
