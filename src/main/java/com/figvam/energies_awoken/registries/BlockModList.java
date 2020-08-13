package com.figvam.energies_awoken.registries;


import com.figvam.energies_awoken.block.block_geode.BlockBlueGeodeOre;
import com.figvam.energies_awoken.block.block_geode.BlockPurpleGeodeOre;
import com.figvam.energies_awoken.block.block_geode.BlockRedGeodeOre;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.BlockBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.BlockBreakdownMachineLevelThree;
import com.figvam.energies_awoken.block.splitter.BlockSplitterLevelOne;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber//Used to connect to the Forge Registry thing and actually register the block
public class BlockModList {


    public static final Block[] BLOCKS = {
            //BlockBreakdownMachine.getInstance(),//Break down machine
            BlockBlueGeodeOre.getInstance(),//Blue geode
            BlockPurpleGeodeOre.getInstance(),//Purple geode
            BlockRedGeodeOre.getInstance(),
            BlockSplitterLevelOne.getInstance(),
            BlockBreakdownMachineLevelOne.getInstance(),
            BlockBreakdownMachineLevelTwo.getInstance(),
            BlockBreakdownMachineLevelThree.getInstance()
    };



}
