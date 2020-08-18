package com.figvam.energies_awoken.block.extractor.extractor_level_two;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityExtractorLevelTwo extends TileEntity {


    public TileEntityExtractorLevelTwo() {


    }

    public static TileEntityExtractorLevelTwo getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityExtractorLevelTwo) world.getTileEntity(pos);
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
