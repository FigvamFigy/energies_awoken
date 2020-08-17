package com.figvam.energies_awoken.block.splitter.splitter_level_one;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two.TileEntityEssenceRecombinatorLevelTwo;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntitySplitterLevelOne extends TileEntity {

    public TileEntitySplitterLevelOne() {


    }

    public static TileEntitySplitterLevelOne getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntitySplitterLevelOne) world.getTileEntity(pos);
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
