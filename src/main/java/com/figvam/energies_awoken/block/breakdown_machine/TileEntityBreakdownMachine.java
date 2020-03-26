package com.figvam.energies_awoken.block.breakdown_machine;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityBreakdownMachine extends TileEntity {


    int count;


    //private static TileEntityBreakdownMachine instance;

    public TileEntityBreakdownMachine(){
        super();
        this.count = 0;
    }

//    public static TileEntityBreakdownMachine getInstance(){
//        if(instance == null){
//            instance = new TileEntityBreakdownMachine();
//        }
//        return instance;
//    }


    public static TileEntityBreakdownMachine getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityBreakdownMachine)world.getTileEntity(pos);
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("count",count);

        return super.writeToNBT(compound);
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        count = compound.getInteger("count");
        super.readFromNBT(compound);
    }

    public void incrementCount(){
        count++;
        markDirty();
    }


}
