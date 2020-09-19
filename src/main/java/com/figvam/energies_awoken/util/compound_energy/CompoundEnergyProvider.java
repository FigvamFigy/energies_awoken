package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CompoundEnergyProvider implements ICapabilitySerializable<NBTTagCompound> {

    @CapabilityInject(ICompoundEnergy.class)
    public static final Capability<ICompoundEnergy> COMPOUND_ENERGY_CAPABILITY = null;

    private ICompoundEnergy instance = COMPOUND_ENERGY_CAPABILITY.getDefaultInstance();


    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == COMPOUND_ENERGY_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == COMPOUND_ENERGY_CAPABILITY ? COMPOUND_ENERGY_CAPABILITY.<T>cast(this.instance) : null;
    }

//    @Override
//    public NBTBase serializeNBT() {
//        return COMPOUND_ENERGY_CAPABILITY.getStorage().writeNBT(COMPOUND_ENERGY_CAPABILITY,this.instance,null);
//    }
//
//    @Override
//    public void deserializeNBT(NBTBase nbt) {
//
//
//        //COMPOUND_ENERGY_CAPABILITY.getStorage().readNBT(COMPOUND_ENERGY_CAPABILITY,this.instance,null,nbt);
//    }


    @Override
    public NBTTagCompound serializeNBT() {

//        NBTTagList nbtTagList = new NBTTagList();
//
//        for(EnumCompoundEnergy energy: EnumCompoundEnergy.values()){
//            NBTTagCompound compound = new NBTTagCompound();
//
//            NBTTagCompound test = (NBTTagCompound) COMPOUND_ENERGY_CAPABILITY.getStorage().writeNBT(COMPOUND_ENERGY_CAPABILITY,this.instance,null);
//
//
//            //compound.setInteger("compound_energy",instance.getEnergy(energy));
//
//            nbtTagList.appendTag(compound);
//        }
//
//        NBTTagCompound returnCompound = new NBTTagCompound();
//        returnCompound.setTag("compound_energy_list",nbtTagList);
//
//
//        return returnCompound;

        return (NBTTagCompound) COMPOUND_ENERGY_CAPABILITY.getStorage().writeNBT(COMPOUND_ENERGY_CAPABILITY, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        COMPOUND_ENERGY_CAPABILITY.getStorage().readNBT(COMPOUND_ENERGY_CAPABILITY, this.instance, null, nbt);


    }
}
