package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.TileEntityBreakdownMachineLevelTwo;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityBreakdownMachineLevelThree extends TileEntity {



    public TileEntityBreakdownMachineLevelThree() {


    }

    public static TileEntityBreakdownMachineLevelThree getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityBreakdownMachineLevelThree) world.getTileEntity(pos);
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
