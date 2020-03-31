package com.figvam.energies_awoken.block.breakdown_machine;

import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;

import com.figvam.energies_awoken.util.compound_energy.CompoundManaProvider;
import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityBreakdownMachine extends TileEntity implements ITickable {

    private ItemStackHandler itemStackHandler = new ItemStackHandler(1);
    private CompoundManaProvider compoundManaProvider = new CompoundManaProvider();



    int count;


    int tick;
    int cookTime;


    //private static TileEntityBreakdownMachine instance;

    public TileEntityBreakdownMachine(){
        super();
        this.count = 0;
        this.tick = 0;
        this.cookTime = 0;

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

        compound.setTag("inventory",itemStackHandler.serializeNBT());
        compound.setInteger("count",count);
        return super.writeToNBT(compound);
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {

        itemStackHandler.deserializeNBT(compound.getCompoundTag("inventory"));
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


    @Override
    public void update() {


        Item itemInput = itemStackHandler.getStackInSlot(0).getItem();

        if(tick == 20){
            tick = 0;
        }
        else {
            tick++;
        }
        if(canProcessItem(itemInput)){
            cookTime++;
        }


        if(cookTime == 20){
            cookTime = 0;
            if(canProcessItem(itemInput)){
                ItemStack newItemStack = itemStackHandler.getStackInSlot(0);
                newItemStack.setCount(itemStackHandler.getStackInSlot(0).getCount() - 1);

                ICompoundEnergy compoundEnergy = compoundManaProvider.getCapability(CompoundManaProvider.COMPOUND_ENERGY_CAPABILITY,null);
                compoundEnergy.fillCompoundEnergyFromItem(itemInput);

                itemStackHandler.setStackInSlot(0,newItemStack);
                System.out.println("Proccessed " + cookTime);
                System.out.println("Flora " + compoundEnergy.getFloraEnergy());

                markDirty();
            }

        }


    }



    private boolean canProcessItem(Item itemInput){


        if(ItemCorrespondingCompoundEnergy.isItemInHashMap(itemInput)){
            return true;
        }

        return false;
    }
}
