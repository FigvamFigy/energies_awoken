package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityBreakdownMachineLevelTwo extends TileEntity {


    public TileEntityBreakdownMachineLevelTwo() {


    }

    public static TileEntityBreakdownMachineLevelTwo getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityBreakdownMachineLevelTwo) world.getTileEntity(pos);
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        return super.writeToNBT(compound);
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
    }


}
