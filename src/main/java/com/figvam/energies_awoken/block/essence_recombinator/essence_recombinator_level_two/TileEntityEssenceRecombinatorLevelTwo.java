package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two;

import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.TileEntityEssenceRecombinatorLevelOne;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityEssenceRecombinatorLevelTwo extends TileEntity {

    public TileEntityEssenceRecombinatorLevelTwo() {


    }

    public static TileEntityEssenceRecombinatorLevelTwo getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityEssenceRecombinatorLevelTwo) world.getTileEntity(pos);
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
