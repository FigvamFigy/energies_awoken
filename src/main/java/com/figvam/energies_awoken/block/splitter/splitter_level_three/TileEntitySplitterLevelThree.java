package com.figvam.energies_awoken.block.splitter.splitter_level_three;

import com.figvam.energies_awoken.block.splitter.splitter_level_one.TileEntitySplitterLevelOne;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntitySplitterLevelThree extends TileEntity {

    public TileEntitySplitterLevelThree() {


    }

    public static TileEntitySplitterLevelThree getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntitySplitterLevelThree) world.getTileEntity(pos);
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
