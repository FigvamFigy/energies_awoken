package com.figvam.energies_awoken.block.breakdown_machine;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityBreakdownMachine extends TileEntity {

    private ItemStackHandler itemStackHandler = new ItemStackHandler(1);

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

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return (T) this.itemStackHandler;
        }
        return super.getCapability(capability, facing);
    }


}
