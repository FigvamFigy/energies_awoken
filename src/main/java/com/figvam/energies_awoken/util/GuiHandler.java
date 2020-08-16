package com.figvam.energies_awoken.util;

import com.figvam.energies_awoken.block.breakdown_machine.ContainerBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.GuiBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.ContainerBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.GuiBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.ContainerBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.GuiBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.TileEntityBreakdownMachineLevelTwo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;


/**
 * This is used to handle gui suff
 *
 *
 */

public class GuiHandler implements IGuiHandler {



    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(!world.isRemote){
            switch (ID){
                case GuiIDList.BREAKDOWN_MACHINE_ID: return new ContainerBreakdownMachine(player.inventory,(TileEntityBreakdownMachine)world.getTileEntity(new BlockPos(x,y,z)));
                case GuiIDList.BREAKDOWN_MACHINE_LEVEL_ONE_ID: return new ContainerBreakdownMachineLevelOne(player.inventory,(TileEntityBreakdownMachineLevelOne)world.getTileEntity(new BlockPos(x,y,z)));
                case GuiIDList.BREAKDOWN_MACHINE_LEVEL_TWO_ID: return new ContainerBreakdownMachineLevelTwo(player.inventory,(TileEntityBreakdownMachineLevelTwo)world.getTileEntity(new BlockPos(x,y,z)));

            }
        }

        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch (ID){
            case GuiIDList.BREAKDOWN_MACHINE_ID: return new GuiBreakdownMachine(player.inventory,(TileEntityBreakdownMachine)world.getTileEntity(new BlockPos(x,y,z)));
            case GuiIDList.BREAKDOWN_MACHINE_LEVEL_ONE_ID: return new GuiBreakdownMachineLevelOne(player.inventory,(TileEntityBreakdownMachineLevelOne)world.getTileEntity(new BlockPos(x,y,z)));
            case GuiIDList.BREAKDOWN_MACHINE_LEVEL_TWO_ID:  return new GuiBreakdownMachineLevelTwo(player.inventory,(TileEntityBreakdownMachineLevelTwo)world.getTileEntity(new BlockPos(x,y,z)));
        }

        return null;
    }



}
