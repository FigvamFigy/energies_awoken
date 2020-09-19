package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityBreakdownMachineLevelOne extends TileEntity {


    public TileEntityBreakdownMachineLevelOne() {


    }

    public static TileEntityBreakdownMachineLevelOne getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityBreakdownMachineLevelOne) world.getTileEntity(pos);
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
