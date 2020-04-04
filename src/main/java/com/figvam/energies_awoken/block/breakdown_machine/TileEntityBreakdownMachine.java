package com.figvam.energies_awoken.block.breakdown_machine;

import com.figvam.energies_awoken.registries.ItemModList;
import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;

import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyProvider;
import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import java.util.ArrayList;

public class TileEntityBreakdownMachine extends TileEntity implements ITickable {

    private ItemStackHandler itemStackHandler = new ItemStackHandler(2);
    public CompoundEnergyProvider compoundEnergyProvider = new CompoundEnergyProvider();



    public int count;
    Item currentItem;


    int cookTime;


    public TileEntityBreakdownMachine(){
        super();
        this.count = 0;
        this.cookTime = 0;

    }



    public static TileEntityBreakdownMachine getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityBreakdownMachine)world.getTileEntity(pos);
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {

        compound.setTag("compound_energy",compoundEnergyProvider.serializeNBT());
        compound.setTag("inventory",itemStackHandler.serializeNBT());
        compound.setInteger("count",count);
        return super.writeToNBT(compound);
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        System.out.println();
        compoundEnergyProvider.deserializeNBT(compound.getCompoundTag("compound_energy"));
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

        if(canProcessItem(itemInput)){
            cookTime++;
        }

        if(cookTime == 20){
            cookTime = 0;
            if(canProcessItem(itemInput)){
                currentItem = itemInput;

                ItemStack newItemStack = itemStackHandler.getStackInSlot(0);
                newItemStack.setCount(itemStackHandler.getStackInSlot(0).getCount() - 1);

                ICompoundEnergy compoundEnergy = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null);
                compoundEnergy.fillCompoundEnergyFromItem(itemInput);

                itemStackHandler.setStackInSlot(0,newItemStack);

                markDirty();

                System.out.println("FLORA: " + compoundEnergy.getEnergy(EnumCompoundEnergy.FLORA));
                System.out.println("GRASS: " + compoundEnergy.getEnergy(EnumCompoundEnergy.GRASS));
            }
        }


        //if(!this.world.isRemote){

        if(canFillBucket() && itemStackHandler.getStackInSlot(1).getItem().equals(Items.BUCKET)){

            ItemStack bucketItemStack = itemStackHandler.getStackInSlot(1);
            bucketItemStack.setCount(0);

            int energyInt = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getEnergy(EnumCompoundEnergy.FLORA);
            compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).setEnergy(EnumCompoundEnergy.FLORA,energyInt - 5);
            System.out.println("Remove bucket");

            ItemStack floraBucket = new ItemStack(ItemModList.ITEMS[1]);

            itemStackHandler.setStackInSlot(1,floraBucket);

        }
        //}




    }



    private boolean canProcessItem(Item itemInput){


        if(ItemCorrespondingCompoundEnergy.isItemInHashMap(itemInput)){
            return true;
        }

        return false;
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        NBTTagCompound tag = super.getUpdateTag();
        this.writeToNBT(tag);
        return tag;

    }


    private boolean canFillBucket(){
        ArrayList<EnumCompoundEnergy> arrayListExistingCompoundEnergy = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).
                getExistingCompoundLifeEnergy();


        for(EnumCompoundEnergy energy: arrayListExistingCompoundEnergy){
            int energyInt = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getEnergy(energy);
            if(energyInt > 4){
                return true;
            }


        }

        return false;
    }
}
