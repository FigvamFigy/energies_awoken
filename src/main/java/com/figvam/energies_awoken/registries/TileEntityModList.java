package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
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
        TILE_ENTITIES.add(TileEntityBreakdownMachine.class);


    }

    private static void fillBlocks(){
        BLOCKS.add(BlockBreakdownMachine.getInstance());
    }





}
