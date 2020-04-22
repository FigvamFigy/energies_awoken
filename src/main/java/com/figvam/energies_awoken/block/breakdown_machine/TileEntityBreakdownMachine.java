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


    public EnumCompoundEnergy selectedCompoundEnergy;
    private ArrayList<EnumCompoundEnergy> arrayListExistingEnergy;

    public int count;
    Item currentInputItem;

    int cookTime;
    final int TOTAL_COOK_TIME = 10;


    public TileEntityBreakdownMachine(){
        super();
        this.count = 0;
        this.cookTime = 0;
        this.arrayListExistingEnergy = new ArrayList<>();

    }



    public static TileEntityBreakdownMachine getTileEntity(IBlockAccess world, BlockPos pos){
        return (TileEntityBreakdownMachine)world.getTileEntity(pos);
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        if(selectedCompoundEnergy != null){
            compound.setString("selected_compound_energy",selectedCompoundEnergy.toString());
        }

        compound.setTag("compound_energy",compoundEnergyProvider.serializeNBT());
        compound.setTag("inventory",itemStackHandler.serializeNBT());
        compound.setInteger("count",count);
        return super.writeToNBT(compound);
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        selectedCompoundEnergy = EnumCompoundEnergy.valueOf(compound.getString("selected_compound_energy"));
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
        currentInputItem = itemInput;

        if(canProcessItem(itemInput)){
            cookTime++;
        }
        else{
            cookTime = 0;
        }


        if(cookTime == TOTAL_COOK_TIME){//Converts item into compound life energy
            cookTime = 0;
            processItem();

            if(arrayListExistingEnergy.size() == 1){
                selectedCompoundEnergy = arrayListExistingEnergy.get(0);
            }
            markDirty();

        }

        if(canFillBucket() && itemStackHandler.getStackInSlot(1).getItem().equals(Items.BUCKET)){//Fills bucket
            fillBucket();
            markDirty();
        }


        ICompoundEnergy compoundEnergy = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null);
        arrayListExistingEnergy = compoundEnergy.getExistingCompoundLifeEnergy();

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

        if(selectedCompoundEnergy != null){
            ICompoundEnergy compoundEnergy = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null);
            int energy = compoundEnergy.getEnergy(selectedCompoundEnergy);

            if(energy >= 5){
                return true;
            }
        }




        return false;
    }

    public void changeSelectedCompoundEnergy(String direction){

        if(!(selectedCompoundEnergy == null)){
            int directionInt;//positive = right, negative = left

            if(direction.equals("left")){
                directionInt = -1;
            }
            else{
                directionInt = 1;
            }

            int indexOfSelected = arrayListExistingEnergy.indexOf(selectedCompoundEnergy);

            if((indexOfSelected + directionInt) == -1){//We go left and wrap to the very right
                selectedCompoundEnergy = arrayListExistingEnergy.get(arrayListExistingEnergy.size() - 1);
            }
            else if((indexOfSelected + directionInt) == arrayListExistingEnergy.size()){//We go right and wrap to the very left
                selectedCompoundEnergy = arrayListExistingEnergy.get(0);
            }
            else{
                selectedCompoundEnergy = arrayListExistingEnergy.get(indexOfSelected + directionInt);
            }

        }

        System.out.println(selectedCompoundEnergy);
        markDirty();


    }



    private void processItem(){
        if(canProcessItem(currentInputItem)){

            ItemStack newItemStack = itemStackHandler.getStackInSlot(0);
            newItemStack.setCount(itemStackHandler.getStackInSlot(0).getCount() - 1);//Removes one item from the input

            ICompoundEnergy compoundEnergy = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null);
            compoundEnergy.fillCompoundEnergyFromItem(currentInputItem);

            itemStackHandler.setStackInSlot(0,newItemStack);


            markDirty();
        }
    }


    private void fillBucket(){
        ItemStack bucketItemStack = itemStackHandler.getStackInSlot(1);
        bucketItemStack.setCount(0);//removes the empty bucket

        int energyInt = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getEnergy(selectedCompoundEnergy);
        compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).setEnergy(selectedCompoundEnergy,energyInt - 5);

        energyInt = compoundEnergyProvider.getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getEnergy(selectedCompoundEnergy);//Check the new updated energy

        //ItemStack newbucket = new ItemStack(ItemModList.ITEMS[1]);

        if(energyInt == 0){
            arrayListExistingEnergy.remove(selectedCompoundEnergy);
        }

        if(arrayListExistingEnergy.size() == 1){
            selectedCompoundEnergy = arrayListExistingEnergy.get(0);
        }
        else{
            selectedCompoundEnergy = arrayListExistingEnergy.get(arrayListExistingEnergy.size() - 1);
        }



        ItemStack newbucket;

        switch (selectedCompoundEnergy){
            case FLORA:
                newbucket = new ItemStack(ItemModList.ITEMS[1]);
                break;
            case GRASS:
                newbucket = new ItemStack(ItemModList.ITEMS[1]);
                break;
            default: newbucket = null;
        }

        itemStackHandler.setStackInSlot(1,newbucket);
    }

}
