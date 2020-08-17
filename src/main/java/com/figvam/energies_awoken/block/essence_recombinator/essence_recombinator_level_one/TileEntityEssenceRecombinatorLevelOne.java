package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one;

import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.TileEntityBreakdownMachineLevelThree;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityEssenceRecombinatorLevelOne extends TileEntity {

    public TileEntityEssenceRecombinatorLevelOne() {


    }

    public static TileEntityEssenceRecombinatorLevelOne getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityEssenceRecombinatorLevelOne) world.getTileEntity(pos);
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
