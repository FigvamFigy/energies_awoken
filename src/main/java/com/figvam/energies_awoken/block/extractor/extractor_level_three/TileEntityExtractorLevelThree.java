package com.figvam.energies_awoken.block.extractor.extractor_level_three;

import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityExtractorLevelThree extends TileEntity {

    public TileEntityExtractorLevelThree() {


    }

    public static TileEntityExtractorLevelThree getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityExtractorLevelThree) world.getTileEntity(pos);
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
