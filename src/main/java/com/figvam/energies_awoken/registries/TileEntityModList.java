package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.BlockBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.TileEntityBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.BlockBreakdownMachineLevelThree;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.TileEntityBreakdownMachineLevelThree;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.TileEntityEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_three.BlockEssenceRecombinatorLevelThree;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_three.TileEntityEssenceRecombinatorLevelThree;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two.BlockEssenceRecombinatorLevelTwo;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two.TileEntityEssenceRecombinatorLevelTwo;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_three.BlockExtractorLevelThree;
import com.figvam.energies_awoken.block.extractor.extractor_level_three.TileEntityExtractorLevelThree;
import com.figvam.energies_awoken.block.extractor.extractor_level_two.BLockExtractorLevelTwo;
import com.figvam.energies_awoken.block.extractor.extractor_level_two.TileEntityExtractorLevelTwo;
import com.figvam.energies_awoken.block.splitter.splitter_level_one.BlockSplitterLevelOne;
import com.figvam.energies_awoken.block.splitter.splitter_level_one.TileEntitySplitterLevelOne;
import com.figvam.energies_awoken.block.splitter.splitter_level_three.BlockSplitterLevelThree;
import com.figvam.energies_awoken.block.splitter.splitter_level_three.TileEntitySplitterLevelThree;
import com.figvam.energies_awoken.block.splitter.splitter_level_two.BlockSplitterLevelTwo;
import com.figvam.energies_awoken.block.splitter.splitter_level_two.TileEntitySplitterLevelTwo;
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
        TILE_ENTITIES.add(TileEntityBreakdownMachineLevelThree.class);
        TILE_ENTITIES.add(TileEntityEssenceRecombinatorLevelOne.class);
        TILE_ENTITIES.add(TileEntityEssenceRecombinatorLevelTwo.class);
        TILE_ENTITIES.add(TileEntityEssenceRecombinatorLevelThree.class);
        TILE_ENTITIES.add(TileEntitySplitterLevelOne.class);
        TILE_ENTITIES.add(TileEntitySplitterLevelTwo.class);
        TILE_ENTITIES.add(TileEntitySplitterLevelThree.class);
        TILE_ENTITIES.add(TileEntityExtractorLevelOne.class);
        TILE_ENTITIES.add(TileEntityExtractorLevelTwo.class);
        TILE_ENTITIES.add(TileEntityExtractorLevelThree.class);


    }

    private static void fillBlocks(){
        //BLOCKS.add(BlockBreakdownMachine.getInstance());
        BLOCKS.add(BlockBreakdownMachineLevelOne.getInstance());
        BLOCKS.add(BlockBreakdownMachineLevelTwo.getInstance());
        BLOCKS.add(BlockBreakdownMachineLevelThree.getInstance());
        BLOCKS.add(BlockEssenceRecombinatorLevelOne.getInstance());
        BLOCKS.add(BlockEssenceRecombinatorLevelTwo.getInstance());
        BLOCKS.add(BlockEssenceRecombinatorLevelThree.getInstance());
        BLOCKS.add(BlockSplitterLevelOne.getInstance());
        BLOCKS.add(BlockSplitterLevelTwo.getInstance());
        BLOCKS.add(BlockSplitterLevelThree.getInstance());
        BLOCKS.add(BlockExtractorLevelOne.getInstance());
        BLOCKS.add(BLockExtractorLevelTwo.getInstance());
        BLOCKS.add(BlockExtractorLevelThree.getInstance());
    }





}
