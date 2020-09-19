package com.figvam.energies_awoken.util.custom_capabilities.life_energy;

import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.util.Constants;

import javax.annotation.Nullable;

public class LifeEnergyStorage implements Capability.IStorage<ILifeEnergy> {


    @Nullable
    @Override
    public NBTBase writeNBT(Capability<ILifeEnergy> capability, ILifeEnergy instance, EnumFacing side) {

        NBTTagList nbtTagListEnergyToValue = new NBTTagList();

        for(EnumLifeEnergy energy: EnumLifeEnergy.values()){
            NBTTagCompound compound = new NBTTagCompound();
            compound.setInteger(energy.toString(),instance.getEnergyValue(energy));//Names the compound to the Enum and sets its value from getEnergyValue()
            nbtTagListEnergyToValue.appendTag(compound);
        }

        NBTTagCompound returnCompound = new NBTTagCompound();
        returnCompound.setTag("life_energy_list",nbtTagListEnergyToValue);

        return returnCompound;
    }

    @Override
    public void readNBT(Capability<ILifeEnergy> capability, ILifeEnergy instance, EnumFacing side, NBTBase nbt) {

        NBTTagCompound compound = (NBTTagCompound) nbt;
        NBTTagList nbtTagListEnergyToValue = compound.getTagList("life_energy_list", Constants.NBT.TAG_COMPOUND);

        int index = 0;
        for(EnumLifeEnergy energy: EnumLifeEnergy.values()){
            instance.setValueToEnergy(energy,nbtTagListEnergyToValue.getCompoundTagAt(index).getByte(energy.toString()));
            index++;
        }

    }
}
