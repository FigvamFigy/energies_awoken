package com.figvam.energies_awoken.util.compound_energy;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class CompoundEnergyStorage implements Capability.IStorage<ICompoundEnergy> {


    @Nullable
    @Override
    public NBTBase writeNBT(Capability<ICompoundEnergy> capability, ICompoundEnergy instance, EnumFacing side) {
        return new NBTTagInt(instance.getFloraEnergy());
    }

    @Override
    public void readNBT(Capability<ICompoundEnergy> capability, ICompoundEnergy instance, EnumFacing side, NBTBase nbt) {
        instance.setFloraEnergy(((NBTPrimitive) nbt).getInt());
    }


}
