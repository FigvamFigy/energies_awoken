package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import net.minecraft.nbt.*;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;

import javax.annotation.Nullable;

public class CompoundEnergyStorage implements Capability.IStorage<ICompoundEnergy> {



    @Nullable
    @Override
    public NBTBase writeNBT(Capability<ICompoundEnergy> capability, ICompoundEnergy instance, EnumFacing side) {


        NBTTagList nbtTagList = new NBTTagList();

        for(EnumCompoundEnergy energy: EnumCompoundEnergy.values()){
            NBTTagCompound compound = new NBTTagCompound();
            compound.setInteger("compound_energy",instance.getEnergy(energy));
            nbtTagList.appendTag(compound);
        }

        NBTTagCompound returnCompound = new NBTTagCompound();
        returnCompound.setTag("compound_energy_list",nbtTagList);


        return returnCompound;


        //return new NBTTagInt(instance.getEnergy(energy));


    }

    @Override
    public void readNBT(Capability<ICompoundEnergy> capability, ICompoundEnergy instance, EnumFacing side, NBTBase nbt) {

        NBTTagCompound compound = (NBTTagCompound) nbt;
        NBTTagList nbtTagList = compound.getTagList("compound_energy_list",Constants.NBT.TAG_COMPOUND);

        int index = 0;
        for(EnumCompoundEnergy energy: EnumCompoundEnergy.values()){

            instance.setEnergy(energy,(nbtTagList.getCompoundTagAt(index).getInteger("compound_energy")));

            index++;
        }


        //instance.setEnergy(EnumCompoundEnergy.FLORA,((NBTPrimitive) nbt).getInt());

    }


}
